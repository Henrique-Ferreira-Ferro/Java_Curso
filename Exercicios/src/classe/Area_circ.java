package classe;

public class Area_circ {
	
	double raio;
	final static double pi = 3.14;
	
	Area_circ(double raioInicial){
		
		raio = raioInicial;
		
	}
	
	double area() {
		return Math.pow(raio, 2) * pi;
	}
	
	static double area(double raio) {
		return pi * raio * raio;
	}
}
