package modelo;

import java.util.Calendar;

public class Usuario {
	private int idUser;
	private String Alias;
	private String Nombre;
	private String  Apellido;
	private Calendar fecha_inscrip;	
	
	public Usuario() {
		
	}
	
	public Usuario(int idUser, String Alias, String Nombre, String  Apellido, Calendar fecha_inscrip) {
		this.idUser=idUser;
		this.Alias=Alias;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.fecha_inscrip=Calendar.getInstance();
	}
	
	public Usuario(int idUser, String Alias, Calendar fecha_inscrip) {
		this.idUser=idUser;
		this.Alias=Alias;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.fecha_inscrip=Calendar.getInstance();
	}
	
	public Usuario(int idUser, String Alias, String Nombre, Calendar fecha_inscrip) {
		this.idUser=idUser;
		this.Alias=Alias;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.fecha_inscrip=Calendar.getInstance();
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getAlias() {
		return Alias;
	}

	public void setAlias(String alias) {
		Alias = alias;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Calendar getFecha_inscrip() {
		return fecha_inscrip;
	}

	public void setFecha_inscrip(Calendar fecha_inscrip) {
		this.fecha_inscrip = fecha_inscrip;
	}
	
	
	
	
	
}
