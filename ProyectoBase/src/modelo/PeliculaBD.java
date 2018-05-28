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
	
	// M�todos p�blicos
	
	/**
	 * Recibimos por par�metro el t�tulo de la pel�cula buscada, as� como un objeto ConexionBD
	 * Recibimos adem�s un JLabel y 2 JTextField donde mostraremos los datos los datos de la pel�cula en caso de que exista
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param tit T�tulo de la pel�cula a buscar
	 * @param titulo JLabel donde mostraremos el t�tulo de la pel�cula
	 * @param sinopsis JTextField donde mostraremos la sinopsis de la pel�cula
	 * @param valmedia JTextField donde mostraremos la valoraci�n media de la pel�cula buscada
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
	 * M�todo que recibe por par�metro todos los datos necesarios para crear un Review que sea una pelicula.
	 * Al ser pelicula "hija" de Review esta combinado en el controlador con insertarReview.
	 * 
	 * @param idReview N�mero identificativo del Review que se convertir� en pel�cula
	 * @param director Nombre del director de la pel�cula
	 * @param productora Nombre de la productora de la pel�cula
	 * @param duracion Duraci�n de la pel�cula, en minutos
	 * @param idGen N�mero identificativo del g�nero al que pertenece la pel�cula
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
	 * M�todo para mostrar los datos de la pel�cula seleccionada, recibimos su id por par�metro para
	 * buscarlo en la base de datos y acceder al resto de datos
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param idReview N�mero identificativo del Review que buscaremos
	 * @param j1 JTextfield donde mostraremos el t�tulo de la pel�cula
	 * @param j2 JTextfield donde mostraremos la valoraci�n de la pel�cula
	 * @param j3 JTextfield donde mostraremos el director de la pel�cula
	 * @param j4 JTextfield donde mostraremos la productora de la pel�cula
	 * @param j5 JTextfield donde mostraremos la duraci�n de la pel�cula
	 * @param jarea JTextArea donde mostraremos la sinopsis de la pel�cula
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
	 * M�todo para realizar un "update" en nuestra BD, recibimos todos los posibles datos que hayan sido cambiados,
	 * y realiazamos el update
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param idReview N�mero identificativo del Review que se actualizar�
	 * @param director Informaci�n actualizada sobre el director
	 * @param duracion Informaci�n actualizada sobre la duraci�n
	 * @param productora Informaci�n actualizada sobre la productora
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


