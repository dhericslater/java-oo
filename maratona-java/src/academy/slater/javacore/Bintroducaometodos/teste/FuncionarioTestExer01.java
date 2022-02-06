package academy.slater.javacore.Bintroducaometodos.teste;

import academy.slater.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTestExer01 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.imprimeDados();
		
		System.out.println("-----------------------------");
		
		funcionario.imprimeMediaSalario();

	}

}
