package modelo;
import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PeliculaBD {
	
	// Atributos
	
	/**
	 * Statement para poder lanzar consultas sql
	 */
	private Statement state;
	
	// Constructor
	
	/**
	 * Constructor por defecto para la clase PeliculaBD
	 */
	public PeliculaBD()
	{
		this.state=null;
	}
	
	// Métodos públicos
	
	/**
	 * Recibimos por parámetro el título de la película buscada, así como un objeto ConexionBD
	 * Recibimos además un JLabel y 2 JTextField donde mostraremos los datos los datos de la película en caso de que exista
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param tit Título de la película a buscar
	 * @param titulo JLabel donde mostraremos el título de la película
	 * @param sinopsis JTextField donde mostraremos la sinopsis de la película
	 * @param valmedia JTextField donde mostraremos la valoración media de la película buscada
	 * @return
	 */
	public boolean buscarPelicula(ConexionBD cbd, String tit, JLabel titulo, JTextField sinopsis, JTextField valmedia)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT r.Titulo, r.Sinopsis, r.ValMedia FROM review r INNER JOIN pelicula p ON r.idReview=p.idReview WHERE Titulo='"+tit+"'";
			
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			titulo.setText(rs.getString(1));
			sinopsis.setText(rs.getString(2));
			valmedia.setText(rs.getString(3));
			
			return true;
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Método que recibe por parámetro todos los datos necesarios para crear un Review que sea una pelicula.
	 * Al ser pelicula "hija" de Review esta combinado en el controlador con insertarReview.
	 * 
	 * @param idReview Número identificativo del Review que se convertirá en película
	 * @param director Nombre del director de la película
	 * @param productora Nombre de la productora de la película
	 * @param duracion Duración de la película, en minutos
	 * @param idGen Número identificativo del género al que pertenece la película
	 * @param conbd8 Objeto de la clase ConexionBD para conectar con la BD
	 * @return
	 */
	public boolean insertarPelis(int idReview, String director, String productora, int duracion, int idGen, ConexionBD conbd8) 
	{
		try
		{
			state=conbd8.getConexion().createStatement();
			String sql1="INSERT INTO pelicula (idReview, director, productora, duracion, idGen) values ('"+idReview+"','"+director+"', '"+productora+"', '"+duracion+"', '"+idGen+"')";
				
			state.executeUpdate(sql1);
			return true;
		}
		catch (SQLException sql1)
		{
			sql1.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Método para mostrar los datos de la película seleccionada, recibimos su id por parámetro para
	 * buscarlo en la base de datos y acceder al resto de datos
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param idReview Número identificativo del Review que buscaremos
	 * @param j1 JTextfield donde mostraremos el título de la película
	 * @param j2 JTextfield donde mostraremos la valoración de la película
	 * @param j3 JTextfield donde mostraremos el director de la película
	 * @param j4 JTextfield donde mostraremos la productora de la película
	 * @param j5 JTextfield donde mostraremos la duración de la película
	 * @param jarea JTextArea donde mostraremos la sinopsis de la película
	 */
	public void datosPelicula(ConexionBD cbd, int idReview, JTextField j1,  JTextField j2,  JTextField j3,  JTextField j4,  JTextField j5, JTextArea jarea)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT * FROM review r INNER JOIN pelicula p ON r.idReview=p.idReview WHERE p.idReview='"+idReview+"';";
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			j1.setText(rs.getString(3));
			jarea.setText(rs.getString(4));
			
			String valoracion=""+rs.getDouble(5);
			j2.setText(valoracion);
			
			j3.setText(rs.getString(7));
			j5.setText(rs.getString(8));
			
			String duracion=""+rs.getInt(9);
			j4.setText(duracion);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * Método para realizar un "update" en nuestra BD, recibimos todos los posibles datos que hayan sido cambiados,
	 * y realiazamos el update
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param idReview Número identificativo del Review que se actualizará
	 * @param director Información actualizada sobre el director
	 * @param duracion Información actualizada sobre la duración
	 * @param productora Información actualizada sobre la productora
	 */
	public void actualizarPelicula(ConexionBD cbd, int idReview, String director, int duracion, String productora)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE pelicula SET director='"+director+"', productora='"+productora+"', duracion='"+duracion+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
}


