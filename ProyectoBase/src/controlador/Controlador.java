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
<<<<<<< HEAD
	private SerieBD sbd;
	private Pelicula pbd;
	
=======
	private GeneroBD gbd;
	private PeliculaBD pelibd;
	private SerieBD seriebd;
>>>>>>> origin/master
	
	public Controlador()
	{
		this.ubd=new UsuarioBD();
		this.rbd=new ReviewBD();
		this.comenbd=new comentarioBD();
		this.gbd=new GeneroBD();
	}
	
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
	
	public boolean loginUser(String alias, String pw)
	{
		this.conectar();
		boolean correcto=this.ubd.loginUser(cbd, alias, pw);
		this.desconectar();
		
		return correcto;
	}
	
	public UsuarioBD getUser() {
		return this.ubd;
	}
	
	public ConexionBD getConexion() {
		return this.cbd;
	}
	
	public void buscarComentario(String id, JTextArea jarea)
	{
		this.conectar();
		this.comenbd.MostrarComentariosUsuario(id, this.cbd, jarea);
		this.desconectar();
	}
	
	public void ponerGeneros(JCheckBox j1, JCheckBox j2, JCheckBox j3, JCheckBox j4)
	{
		this.conectar();
		this.gbd.ponerGeneros(cbd, j1, j2, j3, j4);
		this.desconectar();
	}
	
	public void buscarReview(String tit, JLabel j1, JTextField j2, JTextField j3) 
	{
		this.conectar();
		rbd.buscarReview(cbd, tit, j1, j2, j3);
		this.desconectar();
	}
	
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
	
	public void datosUser(JTextField alias, JTextField nombre, JTextField apell, JTextField email, JComboBox genero)
	{
		this.conectar();
		this.ubd.datosUser(cbd, 1, alias, nombre, apell, email, genero);
		this.desconectar();
	}
	
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
	
	public void insertarReview(ConexionBD cbd,int idReview, String autor, int idUser, String Titulo, double Valmedia)
	{
		this.conectar();
		this.comenbd.insertarReview(idReview, this.cbd, autor,idUser,Titulo,Valmedia);
		this.desconectar();
	}
	
	
}
