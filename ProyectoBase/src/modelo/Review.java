package modelo;

public class Review {

	private int idReview;
	private String Autor;
	private Usuario idUser;
	private String Titulo;
	private double ValMedia;
	

	
	public Review(int idReview)
	{
		
		
		this.idReview=idReview;
		this.Autor=Autor;
		this.idUser=idUser;
		this.Titulo=Titulo;
		this.ValMedia=ValMedia;
		
		
		
	}

	public int getIdReview() {
		return idReview;
	}

	public void setIdReview(int idReview) {
		this.idReview = idReview;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
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

	public double getValMedia() {
		return ValMedia;
	}

	public void setValMedia(double valMedia) {
		ValMedia = valMedia;
	}
	
	
	
	
	
	
}
