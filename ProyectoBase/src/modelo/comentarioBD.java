package modelo;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import Vista.Pantalla_Usuario;

public class comentarioBD {

	// Atributos
	
	/**
	 * Statement para poder lanzar consultas sql
	 */
	private static Statement state;
	
	// Constructores
	
	/**
	 * Constructor por defecto para inicializar un objeto ComentarioBD
	 */
	public comentarioBD()
	{
		this.state=null;
	}
	
	// M�todos p�blicos
	
	/**
	 * M�todo que recibe por par�metro todos los campos necesarios para crear un comentario.
	 * Los introduce en un string con forma de consulta sql, y la lanzamos con el statement.
	 * 
	 * @param texto Texto del que se compone el comentario
	 * @param valoracion Valoraci�n que da el usuario al Review
	 * @param idUser N�mero identificativo del usuario que crea el comentario
	 * @param idReview N�mero identificativo del Review donde se crea el comentario
	 * @param conbd1 Objeto de la clase ConexionBD para conectar con la BD
	 * @return
	 */
	public boolean crearComentario(String texto, int valoracion, int idUser, int idReview, ConexionBD conbd1)
	{
		try
		{
			state=conbd1.getConexion().createStatement();
			String sql="INSERT INTO Comentario (Texto, Valoracion, idUser, idReview) values ('"+texto+"', '"+valoracion+"', '"+idUser+"', '"+idReview+"')";
			
			state.executeUpdate(sql);
			
			return true;
		}
		catch (SQLException sql1)
		{
			sql1.printStackTrace();
			return false;
		}
	}
	
	/**
	 * M�todo que recibe el n�mero identificativo del Review en el que nos encontramos en este momento
	 * as� como un JTextArea en el que introduciremos los comentarios que encontremos dentro del Review
	 * 
	 * @param idReview N�mero identificativo del Review actual
	 * @param conbd2 Objeto ConexionBD para conectar con la BD
	 * @param text Objeto JTextArea donde introduciremos los comentarios
	 */
	public void MostrarComentarios(int idReview, ConexionBD conbd2, JTextArea text)
	{
		ResultSet rs2;
		try
		{
			state=conbd2.getConexion().createStatement();
			String sql2="Select Texto from Comentario where idReview='"+idReview+"'";
			
			rs2=state.executeQuery(sql2);
			
			while (rs2.next())
			{
				text.setText(text.getText()+rs2.getString(1)+"\n\n");
			}
		}
		catch (SQLException sql2)
		{
			sql2.printStackTrace();
		}
	}
	
	/**
	 * Recibe el id del usuario, as� como un JTextArea donde introduciremos los comentarios escritos por dicho usuario
	 * Lo usamos para mostrar dichos comentarios en el perfil del usuario
	 * 
	 * @param id N�mero identificativo del usuario
	 * @param cbd Objeto ConexionBD para conectar con la BD
	 * @param text Objeto JTextArea donde introduciremos los comentarios
	 */
	public void mostrarComentariosUser(int id, ConexionBD cbd, JTextArea text)
	{
		ResultSet rs2;
		try
		{
			state=cbd.getConexion().createStatement();
			String sql2="Select Texto from Comentario where idUser='"+id+"'";
			
			rs2=state.executeQuery(sql2);
			
			while (rs2.next())
			{
				text.setText(text.getText()+rs2.getString(1)+"\n\n");
			}
		}
		catch (SQLException sql2)
		{
			sql2.printStackTrace();
		}
		
	}
}
