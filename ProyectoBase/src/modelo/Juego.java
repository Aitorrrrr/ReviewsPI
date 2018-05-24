package modelo;

public class Juego extends Review {

	private String Productora;
	private int num_jug;
	private generoJuego idGen;
	
	
	
	
	public Juego(int idReview, String Productora, int num_jug, generoJuego idGen)
	{
		
		super();
		this.Productora=Productora;
		this.num_jug=num_jug;
		this.idGen=idGen;
		
	}




	public String getProductora() {
		return Productora;
	}




	public void setProductora(String productora) {
		Productora = productora;
	}




	public int getNum_jug() {
		return num_jug;
	}




	public void setNum_jug(int num_jug) {
		this.num_jug = num_jug;
	}




	public generoJuego getIdGen() {
		return idGen;
	}




	public void setIdGen(generoJuego idGen) {
		this.idGen = idGen;
	}





	
}
