package controlador;

import java.sql.SQLException;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.*;

public class Controlador {

	private ConexionBD cbd;
	
	private UsuarioBD ubd;
	private ReviewBD rbd;
	private comentarioBD comenbd;
	private GeneroBD gbd;
	private PeliculaBD pelibd;
	private SerieBD seriebd;
	
	private Usuario user;
	private Review review;
	
	public Controlador()
	{
		this.ubd=new UsuarioBD();
		this.rbd=new ReviewBD();
		this.comenbd=new comentarioBD();
		this.gbd=new GeneroBD();
		this.pelibd=new PeliculaBD();
		this.seriebd=new SerieBD();
	}
	
	/**
	 * Guardamos datos del User que loguea en la aplicación
	 * 
	 * @param id 
	 * @param Alias
	 */
	public void userLogged(int id, String Alias)
	{
		this.user=new Usuario(id, Alias);
	}
	
	public void reviewBuscado(int id, String tit)
	{
		this.review=new Review (id, tit);
	}
	
	//Métodos para manejar la conexión
	public boolean conectar()
	{
		if (this.cbd.conectar())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void desconectar()
	{
		try
		{
			this.cbd.getConexion().close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public boolean primeraConex()
	{
		this.cbd=new ConexionBD("52.15.36.253", "pint", "proyecto", "proyecto1");
		this.cbd.cargarDriver();
		
		if (this.conectar())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public ConexionBD getConexion() {
		return this.cbd;
	}
	
	
	
	//Métodos para manejar UsuarioBD
	public boolean loginUser(String alias, String pw)
	{
		this.conectar();
		boolean correcto=this.ubd.loginUser(cbd, alias, pw);
		this.desconectar();
		
		return correcto;
	}
	
	public void datosUser(JTextField alias, JTextField nombre, JTextField apell, JTextField email, JComboBox genero)
	{
		this.conectar();
		this.ubd.datosUser(cbd, this.user.getIdUser(), alias, nombre, apell, email, genero);
		this.desconectar();
	}
	
	public UsuarioBD getUser() {
		return this.ubd;
	}
	
	public int obtenerIdUser(String alias)
	{
		int idUser;
		
		this.conectar();
		idUser=this.ubd.obteneridUser(cbd, alias);
		this.desconectar();
		
		return idUser;
	}
	
	//Actualizaciones UsuarioBD
	public void actualizarAlias(String alias)
	{
		this.conectar();
		this.ubd.actualizarAlias(cbd, 1, alias);
		this.desconectar();
	}
	
	public void actualizarNombre(String nombre)
	{
		this.conectar();
		this.ubd.actualizarNombre(cbd, 1, nombre);
		this.desconectar();
	}
	
	public void actualizarApellido(String apellido)
	{
		this.conectar();
		this.ubd.actualizarApellido(cbd, 1, apellido);
		this.desconectar();
	}
	
	public void actualizarEmail(String email)
	{
		this.conectar();
		this.ubd.actualizarEmail(cbd, 1, email);
		this.desconectar();
	}
	
	public void actualizarGenero(boolean genero)
	{
		this.conectar();
		this.ubd.actualizarGenero(cbd, 1, genero);
		this.desconectar();
	}
	
	
	
	//Métodos para manejar ComentarioBD
	public void mostrarComentarios(JTextArea jarea)
	{
		this.conectar();
		this.comenbd.MostrarComentarios(this.review.getIdReview(), this.cbd, jarea);
		this.desconectar();
	}
	
	public void mostrarComentariosUser(JTextArea jarea)
	{
		this.conectar();
		this.comenbd.mostrarComentariosUser(this.user.getIdUser(), this.cbd, jarea);
		this.desconectar();
	}
	
	public boolean crearComentario(String texto, int valoracion)
	{
		boolean correcto;
		
		this.conectar();
		correcto=this.comenbd.crearComentario(texto, valoracion, this.user.getIdUser(), this.review.getIdReview(), cbd);
		this.desconectar();
		
		return correcto;
	}
	
	public int buscarGenero(String nomGen)
	{
		int id;
		
		this.conectar();
		id=this.gbd.buscarGeneros(cbd, nomGen);
		this.desconectar();
		
		return id;
	}

	public void ponerGeneros(JCheckBox j1, JCheckBox j2, JCheckBox j3, JCheckBox j4)
	{
		this.conectar();
		this.gbd.ponerGeneros(cbd, j1, j2, j3, j4);
		this.desconectar();
	}
	
	//Métodos para manejar Reviews BD
	public boolean tipoReview(String titulo)
	{
		boolean tipo;
		
		this.conectar();
		tipo=this.rbd.tipoReview(cbd, titulo);
		this.desconectar();
		
		return tipo;
	}
	
	public int idReview(String titulo)
	{
		int idReview;
		
		this.conectar();
		idReview=this.rbd.idReview(cbd, titulo);
		this.desconectar();
		
		return idReview;
	}
	
	public boolean insertarPelicula(String Titulo, String Sinopsis, String director, String productora, int duracion, int idGen)
	{
		int idReview;
		boolean correcto;
		
		this.conectar();
		idReview=this.rbd.insertarReview(this.user.getIdUser(), Titulo, Sinopsis, cbd);
		correcto=this.pelibd.insertarPelis(idReview, director, productora, duracion, idGen, cbd);
		this.desconectar();
		
		return correcto;
	}
	
	public boolean insertarSerie(String titulo, String sinopsis, int temporadas, int duracion, String productora, int idGen)
	{
		int idReview;
		boolean correcto;
		
		this.conectar();
		idReview=this.rbd.insertarReview(this.user.getIdUser(), titulo, sinopsis, cbd);
		correcto=this.seriebd.insertarSerie(idReview, temporadas, productora, duracion, idGen, cbd);
		this.desconectar();
		
		return correcto;
	}
	
	public boolean buscarReview(String tit, JLabel j1, JTextField j2, JTextField j3) 
	{
		boolean correcto;
		
		this.conectar();
		correcto=rbd.buscarReview(cbd, tit, j1, j2, j3);
		this.desconectar();
		
		return correcto;
	}
	
	public boolean buscarPelicula(String tit, JLabel j1, JTextField j2, JTextField j3) 
	{
		boolean correcto;
		
		this.conectar();
		correcto=this.pelibd.buscarPelicula(cbd, tit, j1, j2, j3);
		this.desconectar();
		
		return correcto;
	}
	
	public boolean buscarSerie(String tit, JLabel j1, JTextField j2, JTextField j3) 
	{
		boolean correcto;
		
		this.conectar();
		correcto=this.seriebd.buscarSerie(cbd, tit, j1, j2, j3);
		this.desconectar();
		
		return correcto;
	}
	
	public void datosPelicula(JTextField j1,  JTextField j2,  JTextField j3,  JTextField j4,  JTextField j5, JTextArea jarea)
	{
		this.conectar();
		this.pelibd.datosPelicula(cbd, this.review.getIdReview(), j1, j2, j3, j4, j5, jarea);
		this.desconectar();
	}
	
	public void datosSerie(JTextField j1,  JTextField j2,  JTextField j3,  JTextField j4,  JTextField j5, JTextArea jarea)
	{
		this.conectar();
		this.seriebd.datosSerie(cbd, this.review.getIdReview(), j1, j2, j3, j4, j5, jarea);
		this.desconectar();
	}
	
	public void actualizarPelicula(String director, int duracion, String productora)
	{
		this.conectar();
		this.pelibd.actualizarPelicula(cbd, this.review.getIdReview(), director, duracion, productora);
		this.desconectar();
	}
	
	public void actualizarSerie(int temporadas, int duracion, String productora)
	{
		this.conectar();
		this.seriebd.actualizarSerie(cbd, this.review.getIdReview(), temporadas, duracion, productora);
		this.desconectar();
	}
	
	public Usuario getUserLogged()
	{
		return this.user;
	}
	
	public Review getReview()
	{
		return this.review;
	}
	
	public boolean esAvanzado()
	{
		boolean avanzado;
		
		this.conectar();
		avanzado=this.ubd.esAvanzado(cbd, this.user.getIdUser());
		this.desconectar();
		
		return avanzado;
	}
	
	public int numComentarios()
	{
		int numComentarios;
		
		this.conectar();
		numComentarios=this.comenbd.contarComentarios(this.user.getIdUser(), cbd);
		this.desconectar();
		
		return numComentarios;
	}
	
	public int insertarUserV2(String alias, String nombre, String apell, String email, String pw)
	{
		int bueno;
		
		this.conectar();
		bueno=this.ubd.insertarUserV2(cbd, alias, pw, nombre, apell, email);
		this.desconectar();
		
		return bueno;
	}
	
	public boolean borrarSerie()
	{
		boolean ok;
		
		this.conectar();
		ok=this.comenbd.borrarComentarios(cbd, this.review.getIdReview());
		ok=this.seriebd.borrarSerie(cbd, this.review.getIdReview());
		ok=this.rbd.borrarReview(cbd, this.review.getIdReview());
		this.desconectar();

		return ok;
	}
	
	public boolean borrarPelicula()
	{
		boolean ok;
		
		this.conectar();
		ok=this.comenbd.borrarComentarios(cbd, this.review.getIdReview());
		ok=this.pelibd.borrarPelicula(cbd, this.review.getIdReview());
		ok=this.rbd.borrarReview(cbd, this.review.getIdReview());
		this.desconectar();

		return ok;
	}
}
