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
	public int insertarPelicula(ConexionBD cbd,int idReview, String titulo, String director, String productora, String duracion, int idGen)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT idReview FROM review WHERE titulo='"+titulo+"'";
			
			rs=state.executeQuery(sql);
			
			if (rs.next())
			{
				return 0;
			}
			else
			{
				sql="INSERT INTO serie (idReview, director, productora, duracion, idGen) VALUES ('"+idReview+"', '"+titulo+"', '"+director+"', '"+productora+", '"+duracion+"', '"+idGen+"')";
				state.executeUpdate(sql);
				
				return 1;
			}
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return 0;
		}
	}
	
public String insertarPelis(int idReview, String director, String productora, int duracion, int idGen, ConexionBD conbd8, String texto) {
		
		ResultSet rs8;
			try
			{
				state=conbd8.getConexion().createStatement();
				String sql1="INSERT INTO  (idReview, idUser, Titulo, Sinopsis, Valmedia) values ('"+idReview+"','"+director+"', '"+productora+"', '"+duracion+"', '"+idGen+"')";
			}
			catch (SQLException sql1)
			{
				sql1.printStackTrace();
				return null;
			}
			return texto;
		}
}


