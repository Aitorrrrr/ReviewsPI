package modelo;

import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReviewBD {
	
	private Statement state;
	
	public ReviewBD()
	{
	
	}
	
	public boolean buscarReview(ConexionBD cbd, String tit, JLabel titulo, JTextField sinopsis, JTextField valmedia)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT r.Titulo, r.Sinopsis, r.ValMedia FROM review r INNER JOIN comentario c ON c.idReview=r.idReview WHERE Titulo='"+tit+"'";
			
			
			rs=state.executeQuery(sql);
			
			if (rs.next())
			{
				rs.next();
				titulo.setText(rs.getString(1));
				sinopsis.setText(rs.getString(2));
				valmedia.setText(rs.getString(3));
				
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
	
	public void mostrarComentarios(ConexionBD cbd1, JTextField comentarios, String idReview)
	{
		ResultSet rs;
		try
		{
			state=cbd1.getConexion().createStatement();
			String sql="Select texto from comentario where idReview='"+idReview+"'";
			rs=state.executeQuery(sql);
			while (rs.next())
			{
				comentarios.setText(comentarios.getText()+rs.getString(1)+"\n\n");
			}
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}

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
}
