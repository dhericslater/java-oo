package academy.slater.javacore.Gassociacao.test;

import academy.slater.javacore.Gassociacao.dominio.Jogador;
import academy.slater.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {

	public static void main(String[] args) {

		Jogador jogador = new Jogador("Rafael");
		Time time = new Time("Corinthians");
		Jogador[] jogadores = {jogador};
		
		jogador.setTime(time);		
		time.setJogadores(jogadores);
		
		System.out.println("===== JOGADOR =====");
		
		jogador.imprime();
		
		System.out.println("===== TIME =====");
		
		time.imprime();
			
	}

}
