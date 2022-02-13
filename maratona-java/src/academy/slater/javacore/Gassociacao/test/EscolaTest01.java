package academy.slater.javacore.Gassociacao.test;

import academy.slater.javacore.Gassociacao.dominio.Escola;
import academy.slater.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
//Associaçao bidirecional
	public static void main(String[] args) {
		Professor professor1 = new Professor("Dheric Slater");
		Professor professor2 = new Professor("Yoshi");
		Professor[] professores = {professor1, professor2};
		Escola escola = new Escola("Nagazaki", professores);
		
		escola.imprime();
	}

}
