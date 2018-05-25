package modelo;
import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PeliculaBD {
	
	private Statement state;
	
	public PeliculaBD()
	{
	
	}
	
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


