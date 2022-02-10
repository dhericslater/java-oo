package academy.slater.javacore.Bintroducaometodos.teste;

import academy.slater.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTestExer01 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Slater");
		funcionario.setIdade(22);
		funcionario.setSalarios(new double[]{1900, 2200, 3450});
		
		funcionario.imprimeDados();

	}

}
	