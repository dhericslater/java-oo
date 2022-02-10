package academy.slater.javacore.Csobrecargametodos.test;

import academy.slater.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {

	public static void main(String[] args) {

		Anime anime = new Anime();
		anime.init("Dragon Ball GT", "TV", 155, "Ação");
		anime.imprime();
	}

}
