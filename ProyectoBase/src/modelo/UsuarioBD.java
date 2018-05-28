package modelo;

import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class UsuarioBD {

	// Atributos
	
	/**
	 * Statement especial capaz de ejecutar rutinas almacenadas dentro de la BD
	 */
	private CallableStatement st;
	
	/**
	 * Statement para poder lanzar consultas sql
	 */
	private Statement state;
	
	// Constructor
	
	/**
	 * Constructor por defecto para inicializar un objeto UsuarioBD
	 */
	public UsuarioBD()
	{
		
	}
	
	// Métodos públicos
	
	/**
	 * Método que usa una rutina almacenada, recibe todo lo necesario para la inserción de un usuario y crea la consulta
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param alias Alias del nuevo usuario
	 * @param contra Constraseña del nuevo usuario
	 * @param nombre Nombre real del nuevo usuario (opcional)
	 * @param apellido Apellido real del nuevo usuario (opcional)
	 * @param email Email del nuevo usuario
	 * @param fecha Fecha de nacimiento del nuevo usuario
	 * @return Nos devuelve un número entero, que es a su vez el único parámetro de salida de la rutina almacenada, 1 en caso de una inserción correcta, 0 en caso de que ya exista ese alias en la BD
	 */
	public int insertarUser(ConexionBD cbd, String alias, String contra, String nombre, String apellido, String email, String fecha)
	{
		
		try
		{
			st=cbd.getConexion().prepareCall("{CALL InsertarUser(?, ?, ?, ?, ?, ?, ?)}");
			
			st.setString(1, alias);
			st.setString(2, contra);
			st.setString(3, nombre);
			st.setString(4, apellido);
			st.setString(5, email);
			st.setString(6, fecha);
			
			st.registerOutParameter(7, java.sql.Types.INTEGER);
			
			st.execute();
			
			return st.getInt(7);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return -1;
		}
	}
	
	/**
	 * Método alternativo para la inserción de usuarios, recibe todo lo necesario para ello.
	 * Primero buscamos si existe el alias, y luego los introducimos en caso de no encontrar coincidencias
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param alias Alias del nuevo usuario
	 * @param nombre Nombre del nuevo usuario (Opcional)
	 * @param apellido Apellido real del nuevo usuario (Opcional)
	 * @param fecha Fecha de nacimiento (Opcional)
	 * @return Devuelve un entero, 0 en caso de que el alias ya exista, 1 en caso de una inserción correcta, -1 en caso de una excepción SQL
	 */
	public int insertarUserV2(ConexionBD cbd, String alias, String nombre, String apellido, String fecha)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT Nombre FROM usuario WHERE Alias='"+alias+"'";
			
			rs=state.executeQuery(sql);
			
			if (rs.next())
			{
				return 0;
			}
			else
			{
				sql="INSERT INTO usuario (Alias, Nombre, Apellido, Fecha_Inscrip) VALUES ('"+alias+"', '"+nombre+"', '"+apellido+"', '"+fecha+"')";
				state.executeUpdate(sql);
				
				return 1;
			}
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return -1;
		}
	}
	
	/**
	 * Método con el que buscamos que coincidencias en la BD para el alias y contraseña introducidos
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param alias Alias introducido por el usuario
	 * @param contra Contraseña introducida por el usuario
	 * @return
	 */
	public boolean loginUser(ConexionBD cbd, String alias, String contra)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT Alias FROM usuario WHERE (Alias='"+alias+"' && Contrasenia='"+contra+"')";
			
			rs=state.executeQuery(sql);
			
			if (rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Método para obtener los datos del usuario, recibimos su id por parámetro, así como los JTextField y 1 JComboBox donde mostraremos sus datos
	 * La razón del comboBox a la hora de mostrar un dato, es que el perfil nos sirve para mostrar los datos así como para actualizarlos
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param id Número identificativo del usuario que buscaremos en la BD, el usuario que ha "logueado"
	 * @param alias JTextField donde mostraremos el alias del usuario "logueado"
	 * @param nombre JTextField donde mostraremos el nombre del usuario "logueado"
	 * @param apell JTextField donde mostraremos el apellido del usuario "logueado"
	 * @param email JTextField donde mostraremos el email del usuario "logueado"
	 * @param genero JComboBox donde mostraremos el género del usuario, así como el resto de opciones
	 */
	public void datosUser(ConexionBD cbd, int id, JTextField alias, JTextField nombre, JTextField apell, JTextField email, JComboBox genero)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT Alias, Nombre, Apellido, Email, esVaron FROM usuario WHERE idUser='"+id+"';";
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			alias.setText(rs.getString(1));
			nombre.setText(rs.getString(2));
			apell.setText(rs.getString(3));
			email.setText(rs.getString(4));
			genero.setSelectedItem((genero(rs.getBoolean(5))));
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * El genero en en la BD es un boolean, aquí la traducción (Probablemente es desuso, no lo sé seguro)
	 * 
	 * @param genero boolean obtenido del campo género
	 * @return Devuelve un String, "Hombre" en caso de ser true, "Mujer" en caso contrario
	 */
	private String genero(boolean genero)
	{
		if (genero)
		{
			return "Hombre";
		}
		else
		{
			return "Mujer";
		}
	}
	
	/**
	 * Método para actualizar el alias del usuario "logueado"
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param id Número identificativo del usuario que buscaremos en la BD, el usuario que ha "logueado"
	 * @param alias Alias actualizado del usuario
	 */
	public void actualizarAlias(ConexionBD cbd, int id, String alias)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Alias='"+alias+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * Método para actualizar el nombre real del usuario "logueado"
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param id Número identificativo del usuario que buscaremos en la BD, el usuario que ha "logueado"
	 * @param nombre Nombre actualizado del usuario
	 */
	public void actualizarNombre(ConexionBD cbd, int id, String nombre)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Nombre='"+nombre+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * Método para actualizar el apellido real del usuario "logueado"
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param id Número identificativo del usuario que buscaremos en la BD, el usuario que ha "logueado"
	 * @param apell Apellido actualizado del usuario
	 */
	public void actualizarApellido(ConexionBD cbd, int id, String apell)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Apellido='"+apell+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * Método para actualizar el email del usuario "logueado"
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param id Número identificativo del usuario que buscaremos en la BD, el usuario que ha "logueado"
	 * @param email Email actualizado del usuario
	 */
	public void actualizarEmail(ConexionBD cbd, int id, String email)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Email='"+email+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * Método para actualizar el género del usuario "logueado"
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param id Número identificativo del usuario que buscaremos en la BD, el usuario que ha "logueado"
	 * @param genero Género actualizado del usuario
	 */
	public void actualizarGenero(ConexionBD cbd, int id, boolean genero)
	{
		int gen=convertirGenero(genero);
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET esVaron='"+gen+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * Método para traducir el género (En desuso)
	 * Recibe un boolean lo traduce a un entero
	 * 
	 * @param genero Boolean con el género recibidio
	 * @return Devuelve un entero, 1 en caso de ser hombre, 0 en caso contrario
	 */
	private int convertirGenero(boolean genero)
	{
		if (genero)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Método que recibe un alias (String) por parámetro, y con él busca el id del usuario ligado a ese alias
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param alias alias a buscar en la BD
	 * @return Devuelve un entero que es o bien un entero >0 en caso de haberse encontrado o un -1 en caso de no existir
	 */
	public int obteneridUser(ConexionBD cbd, String alias)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT idUser FROM usuario WHERE Alias='"+alias+"';";
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			return rs.getInt(1);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return -1;
		}
	}
}
