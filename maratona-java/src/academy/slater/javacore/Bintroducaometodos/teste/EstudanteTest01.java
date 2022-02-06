package academy.slater.javacore.Bintroducaometodos.teste;

import academy.slater.javacore.Bintroducaometodos.dominio.Estudante;
import academy.slater.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {

	public static void main(String[] args) {

		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImprimeEstudante imprime = new ImprimeEstudante();
		
		estudante01.nome = "Evelyn";
		estudante01.idade = 19;
		estudante01.sexo = 'F';
		
		estudante02.nome = "Gabriel";
		estudante02.idade = 11;
		estudante02.sexo = 'M';
		
		imprime.imprime(estudante01);
		imprime.imprime(estudante02);
		
	}

}
