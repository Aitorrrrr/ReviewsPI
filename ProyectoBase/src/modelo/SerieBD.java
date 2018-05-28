package modelo;

import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SerieBD {
	
	// Atributos
	
	/**
	 * Statement para poder lanzar consultas sql
	 */
	private Statement state;
	
	// Constructor
	
	/**
	 * Constructor por defecto para inicializar un objeto de la clase SerieBD
	 */
	public SerieBD()
	{
	
	}
	
	// M�todos p�blicos
	
	/**
	 * Recibimos por par�metro el t�tulo de la serie buscada, as� como un objeto ConexionBD
	 * Recibimos adem�s un JLabel y 2 JTextField donde mostraremos los datos los datos de la serie en caso de que exista
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param tit Titulo de la serie a buscar en la BD
	 * @param titulo JLabel donde mostraremos el titulo de la serie
	 * @param sinopsis JTextField donde mostraremos la sinopsis de la serie buscada
	 * @param valmedia JTextfield donde mostraremos la valoraci�n media del usuario
	 * @return Nos devuelve un boolean, true en caso de haber coincidencias, false en caso de no existir dicho titulo en la BD
	 */
	public boolean buscarSerie(ConexionBD cbd, String tit, JLabel titulo, JTextField sinopsis, JTextField valmedia)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT r.Titulo, r.Sinopsis, r.ValMedia FROM review r INNER JOIN serie s ON r.idReview=s.idReview WHERE Titulo='"+tit+"'";
			
			
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
	 * M�todo que recibe todo lo necesario para la inserci�n de una serie en la BD
	 * Lo combinamos con el de su "madre" para poder hacer la inserci�n de forma correcta
	 * 
	 * @param idReview N�mero identificativo del Review que se convertir� en serie
	 * @param temporadas N�mero de temporadas que posee la serie
	 * @param productora Productora de la serie
	 * @param duracion Duraci�n media, en minutos, de un capitulo
	 * @param idGen N�mero identificativo del g�nero al que pertenece la serie
	 * @param conbd8 Objeto de la clase ConexionBD para conectar con la BD
	 * @return
	 */
	public boolean insertarSerie(int idReview, int temporadas, String productora, int duracion, int idGen, ConexionBD conbd8) 
	{
		try
		{
			state=conbd8.getConexion().createStatement();
			
			String sql="INSERT INTO serie (idReview, temporadas, dura_cap, productora, idGen) values ('"+idReview+"','"+temporadas+"', '"+duracion+"', '"+productora+"', '"+idGen+"')";
				
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
	 * M�todo que recibe el id del Review, as� como diferentes JTextField y un JTextArea para mostrar los datos de la serie
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param idReview N�mero identificativo del Review a buscar
	 * @param j1 JTextField donde mostraremos el t�tulo del Review buscado
	 * @param j2 JTextField donde mostraremos la valoraci�n de la serie
	 * @param j3 JTextField donde mostraremos el n�mero de temporadas de la serie
	 * @param j4 JTextField donde mostraremos donde mostraremos la duraci�n media de un capitulo
	 * @param j5 JTextField donde mostraremos donde mostraremos la productora de la serie
	 * @param jarea JTextArea donde mostraremos la sinopsis de la serie
	 */
	public void datosSerie(ConexionBD cbd, int idReview, JTextField j1,  JTextField j2,  JTextField j3,  JTextField j4,  JTextField j5, JTextArea jarea)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT * FROM review r INNER JOIN serie s ON s.idReview=r.idReview WHERE s.idReview='"+idReview+"';";
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			j1.setText(rs.getString(3));
			jarea.setText(rs.getString(4));
			
			String valoracion=""+rs.getDouble(5);
			j2.setText(valoracion);
			
			String temporadas=""+rs.getInt(7);
			j3.setText(temporadas);
			
			j5.setText(rs.getString(9));
			
			String duracion=""+rs.getInt(8);
			j4.setText(duracion);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	/**
	 * M�todo que recibe todo lo necesario para realizar un update en la tabla Serie de la BD
	 * 
	 * @param cbd Objeto de la clase ConexionBD para conectar con la BD
	 * @param idReview N�mero identificativo del Review a actualizar
	 * @param temporadas Datos actualizados del n�mero de temporadas
	 * @param duracion Datos actualizados de la duraci�n media de un capitulo
	 * @param productora Datos actualizados de la productora de la serie
	 */
	public void actualizarSerie(ConexionBD cbd, int idReview, int temporadas, int duracion, String productora)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE pelicula SET temporadas='"+temporadas+"', productora='"+productora+"', dura_cap='"+duracion+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
}
