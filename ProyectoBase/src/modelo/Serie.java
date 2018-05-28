package modelo;

public class Serie extends Review {

	// Atributos
	
	/**
	 * N�mero de temporadas que posee la serie
	 */
	private int temporadas;
	
	/**
	 * Duraci�n media de un cap�tulo, en minutos
	 */
	private int duracionCapitulo;
	
	/**
	 * Empresa que produjo la serie
	 */
	private String productora;
	
	/**
	 * N�mero identificativo del g�nero al que pertenece la serie
	 */
	private genero idGen;
	
	// Constructor
	
	/**
	 * Constructor parametrizado para la creaci�n de un objeto Serie
	 * 
	 * @param idReview
	 * @param temporadas
	 * @param dura_cap
	 * @param productora
	 * @param idGen
	 */
	public Serie(int idReview, int temporadas,int dura_cap,String productora, genero idGen)
	{
		
		super();
		this.temporadas=temporadas;
		this.duracionCapitulo=dura_cap;
		this.productora=productora;
		this.idGen=idGen;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getDura_cap() {
		return duracionCapitulo;
	}

	public void setDura_cap(int dura_cap) {
		this.duracionCapitulo = dura_cap;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public genero getIdGen() {
		return idGen;
	}

	public void setIdGen(genero idGen) {
		this.idGen = idGen;
	}
	
	
}
