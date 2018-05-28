package modelo;

public class Pelicula extends Review {

	// Atributos
	
	/**
	 * Nombre del director que dirigi� la pel�cula
	 */
	private String director;
	
	/**
	 * Nombre de la empresa que produjo la pel�cula
	 */
	private String productora;
	
	/**
	 * Duraci�n, en minutos, de la pel�cula
	 */
	private int duracion;
	
	/**
	 * N�mero identificativo del g�nero al que pertenece la pel�cula
	 */
	private genero idGen;
	
	// Constructor
	
	/**
	 * Constructor parametrizado para inicializar un objeto Pel�cula
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
