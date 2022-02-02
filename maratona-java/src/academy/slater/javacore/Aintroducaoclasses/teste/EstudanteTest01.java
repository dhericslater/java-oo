package academy.slater.javacore.Aintroducaoclasses.teste;

import academy.slater.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		estudante.nome = "Dheric" ;
		estudante.idade = 22;
		estudante.sexo = 'M';
		
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
	}

}
