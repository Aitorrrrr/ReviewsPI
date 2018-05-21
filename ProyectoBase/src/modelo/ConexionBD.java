package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class ConexionBD {

static final String CONTROLADOR_MYSQL="com.mysql.jdbc.Driver";
	
	private String host;
	private String bbdd;
	private String user;
	private String pass;
	private String url;
	
	private Connection conexion;
	
	public ConexionBD (String host, String bbdd, String user, String pw)
	{
		this.host=host;
		this.bbdd=bbdd;
		this.user=user;
		this.pass=pw;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd;
		this.conexion=null;
	}
	
	public void cargarDriver()
	{
		try
		{
			Class.forName(CONTROLADOR_MYSQL);
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
	
	public Connection getConexion()
	{
		return this.conexion;
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
	
	public void conectarAD()
	{
		Hashtable <String, String> env=new Hashtable<String, String>();
		
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.PROVIDER_URL, "ldap://10.2.72.74");
		
		env.put(Context.SECURITY_PRINCIPAL, "userpi@proyint.com");
		env.put(Context.SECURITY_CREDENTIALS, "Proyecto1");
		
		DirContext ctx;
		
		try
		{
			ctx=new InitialDirContext(env);
			System.out.println("Autenticado en Windows Server");
			ctx.close();
		}
		catch (NamingException ne)
		{
			System.out.println("Autenticación fallida");
		}
	}
}
