package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_nome" , length = 200, nullable = false)
	private String nome;
	
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public Long getid() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public Double getpreco() {
		return preco;
	}
	
	public void SetPreco(Double preco) {
		this.preco = preco;
	}
		
	
}
