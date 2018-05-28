package modelo;

public class Review {

	// Atributos
	
	/**
	 * Número identificativo del review
	 */
	private int idReview;
	
	/**
	 * Número identificativo del usuario que creó el Review
	 */
	private Usuario idUser;
	
	/** 
	 * Título del Review
	 */
	private String Titulo;
	
	/**
	 * Sinopsis del review
	 */
	private String sinopsis;
	
	// Contructores
	
	/**
	 * Contructor por defecto para crear objetos Review
	 */
	public Review()
	{
		
	}
	
	/**
	 * Constructor parametrizado para crear objetos Review, y usarlos durante la ejecución como información
	 * 
	 * @param id
	 * @param tit
	 */
	public Review(int id, String tit)
	{
		this.idReview=id;
		this.Titulo=tit;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getIdReview() {
		return idReview;
	}

	public void setIdReview(int idReview) {
		this.idReview = idReview;
	}

	public Usuario getIdUser() {
		return idUser;
	}

	public void setIdUser(Usuario idUser) {
		this.idUser = idUser;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
}
