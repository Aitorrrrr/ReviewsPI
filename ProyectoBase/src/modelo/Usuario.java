package modelo;

import java.util.Calendar;

public class Usuario {
	private int idUser;
	private String Alias;
	private String Nombre;
	private String  Apellido;
	
	public Usuario() {
		
	}
	
	public Usuario(int idUser, String Alias, String Nombre, String  Apellido) {
		this.idUser=idUser;
		this.Alias=Alias;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
	}
	
	public Usuario(int idUser, String Alias) {
		this.idUser=idUser;
		this.Alias=Alias;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
	}
	
	public Usuario(int idUser, String Alias, String Nombre) {
		this.idUser=idUser;
		this.Alias=Alias;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
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
}
