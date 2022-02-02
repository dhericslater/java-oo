package academy.slater.javacore.Aintroducaoclasses.teste;

import academy.slater.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {

	public static void main(String[] args) {

		Carro carro1 = new Carro();

		carro1.nome = "Honda";
		carro1.modelo = "Civic";
		carro1.ano = 2010;

		Carro carro2 = new Carro();

		carro2.nome = "Toyota";
		carro2.modelo = "Corolla";
		carro2.ano = 2012;
		
		System.out.println(carro1.nome);
		System.out.println(carro1.modelo);
		System.out.println(carro1.ano);
		
		System.out.println("=========================");
		
		System.out.println(carro2.nome);
		System.out.println(carro2.modelo);
		System.out.println(carro2.ano);

	}

}
