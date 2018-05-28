package modelo;

public class genero {

	// Atr�butos
	
	/**
	 * N�mero identificativo del genero
	 */
	private int idGen;
	
	/**
	 * Nombre textual del g�nero, por ej. "Acci�n"
	 */
	private String nombre;
	
	// Constructores
	
	/** 
	 * Constructor por defecto
	 */
	public genero()
	{
		
	}

	public int getIdGen() {
		return idGen;
	}

	public void setIdGen(int idGen) {
		this.idGen = idGen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
