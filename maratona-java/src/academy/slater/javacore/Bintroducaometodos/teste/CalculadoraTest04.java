package academy.slater.javacore.Bintroducaometodos.teste;

import academy.slater.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		
		int num1 = 40;
		int num2 = 26;
		
		calculadora.alteraDoisValores(4, 7);
		System.out.println("========================");
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
	}

}
