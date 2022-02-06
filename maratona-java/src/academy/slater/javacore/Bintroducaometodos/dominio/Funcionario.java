package academy.slater.javacore.Bintroducaometodos.dominio;

public class Funcionario {
	String nome = "Dhéric Slater";
	int idade = 18;
	double[] salario = {2420, 3300, 2940};
	
	public void imprimeDados() {
		System.out.println("===================");
		
		System.out.println(this.nome);
		System.out.println(this.idade);
		for(int i = 0; i < salario.length; i++) {
			System.out.println(salario[i]);
		}
	}
	
	public void imprimeMediaSalario() {
		double soma = 0;
		for(int i = 0; i < salario.length; i++) {
			double pega =+ salario[i];
			soma = pega + soma;
			}
		System.out.println(soma/salario.length);
		
	}
	
}
