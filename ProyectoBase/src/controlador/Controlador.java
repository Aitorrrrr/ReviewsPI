package controlador;

import java.sql.SQLException;

import modelo.*;

public class Controlador {

	private ConexionBD cbd;
	private UsuarioBD ubd;
	
	public Controlador()
	{
		this.ubd=new UsuarioBD();
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
	
	public boolean primeraConex(String nombre, String pw)
	{
		this.cbd=new ConexionBD("52.15.36.253", "pint", "proyecto", "proyecto1");
		this.cbd.cargarDriver();
		return this.cbd.conectar();
	}
	
	public boolean loginUser(String alias, String pw)
	{
		this.conectar();
		boolean correcto=this.ubd.loginUser(cbd, alias, pw);
		this.desconectar();
		
		return correcto;
	}
}
