package com.example.ex1;

public class MainCalc {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		try {
			
			System.out.println("10 / 2 = "+cal.div(10, 2));
			System.out.println("10 / 0 = "+cal.div(10, 0));
			
		}
		catch  (ArithmeticException ex) {
			System.err.println("Erreur de calcul : "+ex.getMessage());
			
		}
		finally {
				System.out.println("Fin de calcul.");
		}
		
	

	}

}
