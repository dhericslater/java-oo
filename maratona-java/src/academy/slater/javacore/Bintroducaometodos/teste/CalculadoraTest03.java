package academy.slater.javacore.Bintroducaometodos.teste;

import academy.slater.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		double result = calculadora.divideDoisNumeros(4, 0);
		System.out.println(result);
		
		calculadora.imprimeDivisaoDeDoisNumeros(7, 2);
		System.out.println("========================");
		

	}

}
