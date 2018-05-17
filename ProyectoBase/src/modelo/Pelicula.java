package modelo;

public class Pelicula extends Review {

	private String director;
	private String productora;
	private int duracion;
	private genero idGen;
	
	public Pelicula(int idReview, String director, String productora, int duracion, genero idGen)
	{
		super(idReview);
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
