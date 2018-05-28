package modelo;

public class genero {

	// Atríbutos
	
	/**
	 * Número identificativo del genero
	 */
	private int idGen;
	
	/**
	 * Nombre textual del género, por ej. "Acción"
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
