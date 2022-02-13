package academy.slater.javacore.Gassociacao.test;

import academy.slater.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

	public static void main(String[] args) {

		Jogador jogador1 = new Jogador("Fenomeno");
		Jogador jogador2 = new Jogador("CR7");
		Jogador jogador3 = new Jogador("Messi");
		Jogador[] jogadores = new Jogador[] {jogador1, jogador2, jogador3};
		for(Jogador jogador : jogadores) {
			jogador.imprime();
		}
		
	}
}
