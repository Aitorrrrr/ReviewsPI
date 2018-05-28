package modelo;

import java.util.Calendar;

public class Usuario {
	
	// Atributos
	
	/**
	 * Número identificativo del usuario
	 */
	private int idUser;
	
	/**
	 * Alias del usuario dentro de la aplicación
	 */
	private String Alias;
	
	/**
	 * Nombre real del usuario (Campo opcional)
	 */
	private String Nombre;
	
	/**
	 * Apellido real del usuario (Campo opcional)
	 */
	private String  Apellido;
	
	/**
	 * True en caso de que lo sea, false en caso contrario (Otorga la capacidad de crear reviews)
	 */
	private boolean esAvanzado;
	
	
	// Constructores
	
	/**
	 * Contructor por defecto
	 */
	public Usuario() {
		
	}
	
	/**
	 * Constructor parametrizado para guardar los datos del usuario que "loguea" en la aplicación
	 * 
	 * @param idUser
	 * @param Alias
	 * @param Nombre
	 * @param Apellido
	 */
	public Usuario(int idUser, String Alias, String Nombre, String  Apellido) {
		this.idUser=idUser;
		this.Alias=Alias;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
	}
	
	public boolean isEsAvanzado() {
		return esAvanzado;
	}

	public void setEsAvanzado(boolean esAvanzado) {
		this.esAvanzado = esAvanzado;
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
