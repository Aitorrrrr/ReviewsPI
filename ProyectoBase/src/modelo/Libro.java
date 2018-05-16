package modelo;

public class Libro extends Review{

	private String autor;
	private String editorial;
	private int paginas;
	private genero idGen;
	
	public Libro(int idReview, String autor,String editorial,int paginas,genero idGen)
	{
		super(idReview);
		this.autor=autor;
		this.editorial=editorial;
		this.paginas=paginas;
		this.idGen=idGen;
		
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public genero getIdGen() {
		return idGen;
	}

	public void setIdGen(genero idGen) {
		this.idGen = idGen;
	}
	
	
}
