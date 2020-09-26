package application;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Metodos podem ter o mesmo nome, porem têm de ter parâmetros diferentes
		System.out.println("Method Overloading: "); 
		System.out.println("Soma com 2 inteiros (6+3): " + soma(6, 3));
		System.out.println("Soma com 3 inteiros (2+3+9): " + soma(2, 3, 9));
		System.out.println("Soma com 2 doubles (1.5+9.2): " + soma(1.5, 9.2));
		System.out.println("Soma com 2 doubles (4.1+12.01+5.2): " + soma(4.1, 12.01, 5.2));
		

	}
	
	private static int soma(int n1, int n2) {
		return n1 + n2;
	}
	
	private static int soma(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	private static double soma(double n1, double n2) {
		return n1 + n2;
	}
	private static double soma(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}

}
