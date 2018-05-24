package controlador;

import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.*;

public class Controlador {

	private ConexionBD cbd;
	private UsuarioBD ubd;
	private ReviewBD rbd;
	private comentarioBD comenbd;
	
	public Controlador()
	{
		this.ubd=new UsuarioBD();
		this.rbd=new ReviewBD();
		this.comenbd=new comentarioBD();
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
	
	public void buscarReview(String tit, JLabel j1, JTextField j3) {
		this.conectar();
		rbd.buscarReview(cbd, tit, j1, j3);
		this.desconectar();
	}
	
	public void MostrarComentariosUsuario(String id, JTextArea jarea)
	{
		this.conectar();
		this.comenbd.MostrarComentariosUsuario(id, this.cbd, jarea);
		this.desconectar();
	}
	
	public void MostrarNombreUsuario(String id, JTextField nombre)
	{
		this.conectar();
		this.comenbd.MostrarNombreUsuario(id, this.cbd, nombre);
		this.desconectar();
	}
	
	public void MostrarEmail(String id, JTextField email)
	{
		this.conectar();
		this.comenbd.MostrarEmail(id, this.cbd, email);
		this.desconectar();
	}
	
	public void MostrarFechaNacimiento(String id, JTextField fechaNacimiento)
	{
		this.conectar();
		this.comenbd.mostrarFechaNacimiento(id, this.cbd, fechaNacimiento);
		this.desconectar();
	}
	
	public void mostrarNombreApellidos(String id, JTextField nombreApellido)
	{
		this.conectar();
		this.comenbd.mostrarNombreApellidos(id, this.cbd, nombreApellido);
		this.desconectar();
	}
	
	public void Genero(String id, JTextField genero)
	{
		this.conectar();
		this.comenbd.Genero(id, this.cbd, genero);
		this.desconectar();
	}
}
