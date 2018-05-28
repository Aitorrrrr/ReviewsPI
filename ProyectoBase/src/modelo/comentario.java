package modelo;

import java.util.Calendar;


public class comentario {

	// Atributos
	
	/**
	 * Número identificativo del comentario
	 */
	private int idComentario;
	
	/**
	 * El texto que deja el usuario como comentario
	 */
	private String texto;
	
	/**
	 * La valoración que le da el usuario al review donde escribe el comentario
	 */
	private int valoracion;
	
	/**
	 * Número identificativo del review donde se ubica el comentario
	 */
	private Review idReview;
	
	/**
	 * Número identificativo del usuario que escribe el comentario
	 */
	private Usuario idUser;
	
	//Constructores
	
	/**
	 * Contructor parametrizado para inicializar un objeto Comentario
	 * 
	 * @param idComentario
	 * @param texto
	 * @param valoracion
	 * @param idReview
	 * @param idUser
	 */
	public comentario(int idComentario, String texto, int valoracion, Review idReview, Usuario idUser)
	{
		
		this.idComentario=idComentario;
		this.texto=texto;
		this.valoracion=valoracion;
		this.idReview=idReview;
		this.idUser=idUser;
	}

	// Getters/Setters
	
	public int getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Review getIdReview() {
		return idReview;
	}

	public void setIdReview(Review idReview) {
		this.idReview = idReview;
	}

	public Usuario getIdUser() {
		return idUser;
	}

	public void setIdUser(Usuario idUser) {
		this.idUser = idUser;
	}
	
	
}
