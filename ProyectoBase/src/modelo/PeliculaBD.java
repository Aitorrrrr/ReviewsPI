package modelo;

import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class PeliculaBD {
	
	private Statement state;
	
	public PeliculaBD()
	{
	
	}
	
	public void buscarPelicula(ConexionBD cbd, String tit, JLabel j1, JTextField j3)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT r.Titulo, c.texto FROM review r INNER JOIN comentario c ON c.idReview=r.idReview INNER JOIN pelicula p ON r.idReview=p.idReview WHERE Titulo='"+tit+"'";
			
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			j1.setText(rs.getString(1));
			j3.setText(rs.getString(2));
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
}


