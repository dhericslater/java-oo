package academy.slater.javacore.Dconstrutores.test;

import academy.slater.javacore.Dconstrutores.dominio.Series;


public class SeriesTest01 {

	public static void main(String[] args) {

		//Instancia o Objeto já com os valores inseridos  
		Series desenho = new Series("Cavaleiros do Zodíaco", "Comédia", 114, "Baseado em fatos reais", "WarnerBros");
		desenho.imprime();
		System.out.println("================");
		
		//Escolhe e Modifica atributos do objeto que já vem com valores Default!
		Series desenho2 = new Series();
		desenho2.setNome("Todo Mundo Odeia o Chris!");
		desenho2.setTipo("Comédia");
		desenho2.setEpisodios(255);
		desenho2.setGenero("Diversão Extrema");
		desenho2.setEstudio("ÉPIRATA.FILMES");
		desenho2.imprime();
	}

}
