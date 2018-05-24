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
		this.ubd.datosUser(cbd, 1, alias, nombre, apell, email, genero);
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
	public void buscarComentario(String id, JTextArea jarea)
	{
		this.conectar();
		this.comenbd.MostrarComentariosUsuario(id, this.cbd, jarea);
		this.desconectar();
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
	public void insertarPelicula(String Titulo, String Sinopsis, String director, String productora, int duracion, int idGen)
	{
		int idReview;
		
		this.conectar();
		idReview=this.rbd.insertarReview(this.user.getIdUser(), Titulo, Sinopsis, cbd);
		this.pelibd.insertarPelis(idReview, director, productora, duracion, idGen, cbd);
		this.desconectar();
	}
	
	public void insertarSerie(String titulo, String sinopsis, int temporadas, int duracion, String productora, int idGen)
	{
		int idReview;
		
		this.conectar();
		idReview=this.rbd.insertarReview(this.user.getIdUser(), titulo, sinopsis, cbd);
		this.seriebd.insertarSerie(idReview, temporadas, productora, duracion, idGen, cbd);
		this.desconectar();
	}
	
	public void buscarReview(String tit, JLabel j1, JTextField j2, JTextField j3) 
	{
		this.conectar();
		rbd.buscarReview(cbd, tit, j1, j2, j3);
		this.desconectar();
	}
	
	
	
	//Métodos para buscar reviews?
	public void buscarPelicula(String tit, JLabel j1, JTextField j2, JTextField j3) 
	{
		this.conectar();
		this.pelibd.buscarPelicula(cbd, tit, j1, j2, j3);
		this.desconectar();
	}
	
	public void buscarSerie(String tit, JLabel j1, JTextField j2, JTextField j3) 
	{
		this.conectar();
		this.seriebd.buscarSerie(cbd, tit, j1, j2, j3);
		this.desconectar();
	}
}
