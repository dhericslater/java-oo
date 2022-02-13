package academy.slater.javacore.Eblocosinicializacao.test;
	
import academy.slater.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {

	public static void main(String[] args) {
		Anime anime = new Anime("Caveleiros");

		for (int episodio : anime.getEpisodios()) {
			System.out.print(episodio + " ");
		}
	}
}

