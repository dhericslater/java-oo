package academy.slater.javacore.Fmodificadorestatico.dominio;

public class Anime {
	private String nome;
	private static int[] episodios;
	// 0 - Bloco de inicializa��o � executado quando a JVM carregar classe
	// 1 - Alocando espa�o em mem�ria pro objeto
	// 2 - Cada atributo de classe � criado e inicializado com valores default ou que for passada
	// 3 - Bloco de inicializa��o � executado
	// 4 - Construtor � executado	
	
	static {
		System.out.println("Dentro do bloco de inicializa��o estatico 1");
		episodios = new int[150];
		for(int i = 0; i < episodios.length; i++ ) { episodios[i] = i + 1; }
	}
	static {
		System.out.println("Dentro do bloco de inicializa��o estatico 2");
	}
	static {
		System.out.println("Dentro do bloco de inicializa��o estatico 3");
	}
	{
		System.out.println("Dentro do bloco de inicializa��o nao estatico");
	}
	
	public Anime(String nome) { this.nome = nome; }
	
	public Anime() {

		for (int episodio : Anime.episodios) {
			System.out.print(episodio + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return nome;	
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}


}
