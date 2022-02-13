package academy.slater.javacore.Fmodificadorestatico.test;

import academy.slater.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 299);
		Carro c2 = new Carro("Audi", 260);
		Carro c3 = new Carro("Volkswagem", 255);
		Carro c4 = new Carro("Kia", 110);
		
		Carro.setVelocidadeLimite(230);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
		c4.imprime();	
	}
}
