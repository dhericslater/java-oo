package academy.slater.javacore.Dconstrutores.test;

import academy.slater.javacore.Dconstrutores.dominio.Series;


public class SeriesTest01 {

	public static void main(String[] args) {

		//Instancia o Objeto j� com os valores inseridos  
		Series desenho = new Series("Cavaleiros do Zod�aco", "Com�dia", 114, "Baseado em fatos reais", "WarnerBros");
		desenho.imprime();
		System.out.println("================");
		
		//Escolhe e Modifica atributos do objeto que j� vem com valores Default!
		Series desenho2 = new Series();
		desenho2.setNome("Todo Mundo Odeia o Chris!");
		desenho2.setTipo("Com�dia");
		desenho2.setEpisodios(255);
		desenho2.setGenero("Divers�o Extrema");
		desenho2.setEstudio("�PIRATA.FILMES");
		desenho2.imprime();
	}

}
