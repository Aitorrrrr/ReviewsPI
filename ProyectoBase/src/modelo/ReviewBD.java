package modelo;

import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReviewBD {
	
	// Atributos
	
	/**
	 * Statement para poder lanzar consultas sql
	 */
	private Statement state;
	
	// Contructor
	
	/**
	 * Constructor por defecto para crear objetos ReviewBD
	 */
	public ReviewBD()
	{
	
	}
	
	// M�todos p�blicos
	
	/**
	 * Recibimos por par�metro el t�tulo del Review a buscar en la BD
	 * 
	 * @param cbd Objeto ConexionBD para reliazar la conexi�n a la BD
	 * @param tit T�tulo del review que buscaremos en la BD
	 * @param titulo JLabel donde mostraremos el tit�lo del Review
	 * @param sinopsis JTextfield donde mostraremos la sinopsis del Review
	 * @param valmedia JTextField donde mostraremos la valoraci�n media del Review
	 * @return Devolvemos un boolean, true en caso de existir alguna coincidencia en la BD, false en caso de que no se haya encontrado ning�n review con ese t�tulo
	 */
	public boolean buscarReview(ConexionBD cbd, String tit, JLabel titulo, JTextField sinopsis, JTextField valmedia)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT Titulo, Sinopsis, ValMedia FROM review WHERE Titulo='"+tit+"'";
			
			
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
	 * M�todo para saber el n�mero de Reviews con ese mismo t�tulo (M�todo en desuso...)
	 * 
	 * @param cbd Objeto ConexionBD para reliazar la conexi�n a la BD
	 * @param tit T�tulo a buscar en la BD
	 * @return
	 */
	public int numeroReviews(ConexionBD cbd, String tit)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT COUNT(idReview) FROM review WHERE Titulo='"+tit+"';";
			
			rs=state.executeQuery(sql);
			
			return rs.getInt(1);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return 0;
		}
	}

	/**
	 * M�todo que recibe por par�metro los campos necesarios para crear un Review.
	 * Lo combinamos con el m�todo de sus hijas para poder definir si es una pel�cula o una serie
	 * 
	 * @param idUser N�mero identificativo del usuario que crea el Review
	 * @param Titulo Titulo del review a crear
	 * @param Sinopsis Sinopsis del review a crear
	 * @param conbd8 Objeto ConexionBD para reliazar la conexi�n a la BD
	 * @return Devolvemos un int, que es el id del Review para poder pasarselo al m�todo de las hijas, y as� continuar con la creaci�n del Review
	 */
	public int insertarReview(int idUser, String Titulo, String Sinopsis, ConexionBD conbd8) 
	{
		ResultSet rs;
		
		try
		{
			state=conbd8.getConexion().createStatement();
			String sql1="INSERT INTO review (idUser, Titulo, Sinopsis) values ('"+idUser+"', '"+Titulo+"', '"+Sinopsis+"')";
				
			state.executeUpdate(sql1);
				
			sql1="SELECT idReview FROM review WHERE Titulo='"+Titulo+"' && idUser='"+idUser+"'";
				
			rs=state.executeQuery(sql1);
				
			rs.next();
				
			return rs.getInt(1);
		}
		catch (SQLException sql1)
		{
			sql1.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * M�todo para obtener el id de un Review (Creo que esta en desuso)
	 * 
	 * @param cbd Objeto ConexionBD para reliazar la conexi�n a la BD
	 * @param titulo T�tulo del Review del cual deseamos su n�mero identificativo
	 * @return
	 */
	public int idReview(ConexionBD cbd, String titulo)
	{
		ResultSet rs;
		
		try
		{			
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT idReview FROM review WHERE Titulo='"+titulo+"'";
				
			rs=state.executeQuery(sql);
				
			rs.next();
				
			return rs.getInt(1);
		}
		catch (SQLException sql1)
		{
			sql1.printStackTrace();
			return -1;
		}
	}
	
	/**
	 * M�todo para saber el tipo de Review, como s�lo tenemos 2 (Pel�cula y serie) no me he complicado demasiado...
	 * Busco una pel�cula, sino hay coincidencias es una serie...
	 * 
	 * @param cbd Objeto ConexionBD para reliazar la conexi�n a la BD
	 * @param titulo Titulo del Review del que queremos saber el tipo
	 * @return Devuelvemos un boolean, true si es pel�cula, false en caso de ser una serie
	 */
	public boolean tipoReview(ConexionBD cbd, String titulo)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT p.idReview FROM pelicula p INNER JOIN review r ON p.idReview=r.idReview WHERE r.Titulo='"+titulo+"';";
			
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
		catch (SQLException sql)
		{
			sql.printStackTrace();
			return false;
		}
	}
	
	public boolean borrarReview(ConexionBD cbd, int id)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="DELETE FROM review WHERE idReview='"+id+"';";
			
			state.executeUpdate(sql);
			
			return true;
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return false;
		}
	}
}
