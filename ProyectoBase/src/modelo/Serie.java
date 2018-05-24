package modelo;

public class Serie extends Review {


	private String temporadas;
	private String dura_cap;
	private String productora;
	private genero idGen;
	
	
	public Serie(int idReview, String temporadas,String dura_cap,String productora, genero idGen)
	{
		
		super();
		this.temporadas=temporadas;
		this.dura_cap=dura_cap;
		this.productora=productora;
		this.idGen=idGen;
		
		
		
	}

	public String getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(String temporadas) {
		this.temporadas = temporadas;
	}

	public String getDura_cap() {
		return dura_cap;
	}

	public void setDura_cap(String dura_cap) {
		this.dura_cap = dura_cap;
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
