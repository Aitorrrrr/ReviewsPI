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

	// Atributos
	
	/**
	 * Constante en la que definimos el controlador Mysql
	 */
	static final String CONTROLADOR_MYSQL="com.mysql.jdbc.Driver";
	
	/**
	 * Host donde se aloja la BD, máquina en AWS en nuestro caso
	 */
	private String host;
	
	/**
	 * Nombre de la BD a la que conectaremos, "pint" en nuestro caso"
	 */
	private String bbdd;
	
	/**
	 * Identificacion del usuario que conectara a la BD, "proyecto" en nuestro caso
	 */
	private String user;
	
	/**
	 * Contraseña del usuario que conectara a la BD
	 */
	private String pass;
	
	/**
	 * URL que en la que formaremos la sentencia necesaria juntando host y bbdd
	 * para crear la conexión
	 */
	private String url;
	
	/**
	 * Objeto de la clase Connection, lo usamos para conectar a la BD
	 */
	private Connection conexion;
	
	
	// Constructores
	
	/**
	 * Constructor parametrizado con todo lo necesario para inicializar los atributos base de la clase
	 * 
	 * @param host
	 * @param bbdd
	 * @param user
	 * @param pw
	 */
	public ConexionBD (String host, String bbdd, String user, String pw)
	{
		this.host=host;
		this.bbdd=bbdd;
		this.user=user;
		this.pass=pw;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd;
		this.conexion=null;
	}
	
	// Métodos públicos
	
	/**
	 * Método para cargar el driver mysql con la constante CONTROLADOR_MYSQL
	 */
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
	
	/**
	 * Método para intentar realizar una conexión a la BD
	 * 
	 * @return Devuelve un boolean, true si la conexión se realiza con éxito, false en caso contrario
	 */
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
	
	/**
	 * Método para cerrar la conexión a la BD
	 */
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
	
	/**
	 * Método para realizar la conexión del administrador, se constrasta con nuestro Active Directory,
	 * recibimos por parámetros los datos de dicho administrador, nombre de usuario y contraseña
	 * 
	 * @param user Nombre del usuario
	 * @param pw Contraseña del usuario 
	 * @return Devuelve un boolean, true si la conexión se realiza con éxito, false en caso contrario
	 */
	public boolean conectarAD(String user, String pw)
	{
		Hashtable <String, String> env=new Hashtable<String, String>();
		
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.PROVIDER_URL, "ldap://10.2.72.74");
		
		env.put(Context.SECURITY_PRINCIPAL, user+"@proyint.com");
		env.put(Context.SECURITY_CREDENTIALS, pw);
		
		DirContext ctx;
		
		try
		{
			ctx=new InitialDirContext(env);
			System.out.println("Autenticado en Windows Server");
			ctx.close();
			return true;
		}
		catch (NamingException ne)
		{
			System.out.println("Autenticación fallida");
			return false;
		}
	}
	
	public Connection getConexion()
	{
		return this.conexion;
	}
}
