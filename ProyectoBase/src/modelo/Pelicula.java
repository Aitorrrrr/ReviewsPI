package modelo;

public class Pelicula extends Review {

	// Atributos
	
	/**
	 * Nombre del director que dirigió la película
	 */
	private String director;
	
	/**
	 * Nombre de la empresa que produjo la película
	 */
	private String productora;
	
	/**
	 * Duración, en minutos, de la película
	 */
	private int duracion;
	
	/**
	 * Número identificativo del género al que pertenece la película
	 */
	private genero idGen;
	
	// Constructor
	
	/**
	 * Constructor parametrizado para inicializar un objeto Película
	 * 
	 * @param idReview
	 * @param director
	 * @param productora
	 * @param duracion
	 * @param idGen
	 */
	public Pelicula(int idReview, String director, String productora, int duracion, genero idGen)
	{
		super();
		this.director=director;
		this.productora=productora;
		this.duracion=duracion;
		this.idGen=idGen;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public genero getIdGen() {
		return idGen;
	}

	public void setIdGen(genero idGen) {
		this.idGen = idGen;
	}
	
	
}
