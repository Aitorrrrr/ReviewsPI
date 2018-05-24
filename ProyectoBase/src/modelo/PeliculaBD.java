package modelo;
import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class PeliculaBD {
	
	private Statement state;
	
	public PeliculaBD()
	{
	
	}
	
	public void buscarPelicula(ConexionBD cbd, String tit, JLabel titulo, JTextField sinopsis, JTextField valmedia)
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
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public void insertarPelis(int idReview, String director, String productora, int duracion, int idGen, ConexionBD conbd8) {
		
		ResultSet rs8;
			try
			{
				state=conbd8.getConexion().createStatement();
				String sql1="INSERT INTO pelicula (idReview, director, productora, duracion, idGen) values ('"+idReview+"','"+director+"', '"+productora+"', '"+duracion+"', '"+idGen+"')";
				
				state.executeUpdate(sql1);
			}
			catch (SQLException sql1)
			{
				sql1.printStackTrace();
			}
		}
}


