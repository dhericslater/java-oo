package academy.slater.javacore.Gassociacao.test;

import academy.slater.javacore.Gassociacao.dominio.Jogador;
import academy.slater.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {

	public static void main(String[] args) {
		//Associação Unidirecional
		Jogador jogador1 = new Jogador("Slater");
		Time time = new Time("Corinthians");
		
		jogador1.setTime(time);
		jogador1.imprime();
		
	}

}
