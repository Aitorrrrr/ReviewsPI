package modelo;

import java.sql.*;

public class ConexionDB {

	static final String CONTROLADOR_SQL="com.mysql.jdbc.Driver";
	
	private String host;
	private String bbdd;
	private String user;
	private String pass;
	private String url;
	
	private Connection conexion;
	
	public ConexionDB(String host, String bbdd, String user, String pass)
	{
		this.host=host;
		this.bbdd=bbdd;
		this.user=user;
		this.pass=pass;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd;
		this.conexion=null;
	}
	
	public void cargarDriver()
	{
		try
		{
			Class.forName(CONTROLADOR_SQL);
		}
		catch (ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
			System.out.println("Cuidado con el driver, ejem");
		}
	}
	
	public boolean conectar()
	{
		try
		{
			this.conexion=DriverManager.getConnection(this.url, this.user, this.pass);
			return true;
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			System.out.println("Cuidado con la bbdd/user/pw, ejem");
			return false;
		}
	}
	
	public void desconectar()
	{
		try
		{
			this.conexion.close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
}
