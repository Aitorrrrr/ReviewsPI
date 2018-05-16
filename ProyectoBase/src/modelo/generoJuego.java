package modelo;

public class generoJuego {

	private int idGen;
	private String Nombre;
	
	public generoJuego()
	{
		
		
		
	}
	
	public generoJuego(int idGen, String Nombre)
	{
		this.idGen=idGen;
		this.Nombre=Nombre;
		
		
	}

	public int getIdGen() {
		return idGen;
	}

	public void setIdGen(int idGen) {
		this.idGen = idGen;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
}
