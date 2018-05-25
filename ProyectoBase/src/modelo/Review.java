package modelo;

public class Review {

	private int idReview;
	private Usuario idUser;
	private String Titulo;
	private String sinopsis;
	
	public Review()
	{
		
	}
	
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
