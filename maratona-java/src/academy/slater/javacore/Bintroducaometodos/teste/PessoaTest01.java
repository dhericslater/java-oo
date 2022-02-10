package academy.slater.javacore.Bintroducaometodos.teste;

import academy.slater.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Dheric Slater");
		pessoa.setIdade(21);
		
		pessoa.imprime();
		
	}

}
