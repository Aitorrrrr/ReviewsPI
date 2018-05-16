package modelo;

import java.util.Calendar;


public class comentario {

	private int idComentario;
	private Calendar fecha;
	private int hora;
	private String texto;
	private int valoracion;
	private Review idReview;
	private Usuario idUser;
	
	public comentario(int idComentario, Calendar fecha, Calendar hora, String texto, int valoracion, Review idReview, Usuario idUser)
	{
		
		this.idComentario=idComentario;
		this.fecha=Calendar.getInstance();
		this.hora=Calendar.HOUR_OF_DAY;
		this.texto=texto;
		this.valoracion=valoracion;
		this.idReview=idReview;
		this.idUser=idUser;
		
	}

	public int getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
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
