package modelo;

import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReviewBD {
	
	private Statement state;
	
	public ReviewBD()
	{
	
	}
	
	public void buscarReview(ConexionBD cbd, String tit, JLabel titulo, JTextField sinopsis, JTextField valmedia)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT r.Titulo, r.Sinopsis, r.ValMedia FROM review r INNER JOIN comentario c ON c.idReview=r.idReview WHERE Titulo='"+tit+"'";
			
			
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

public String insertarReview(int idReview, int idUser, String Titulo, String Sinopsis, int valoracion, String texto, ConexionBD conbd8) {
		
		ResultSet rs8;
			try
			{
				state=conbd8.getConexion().createStatement();
				String sql1="INSERT INTO review (idReview, idUser, Titulo, Sinopsis, Valmedia) values ('"+idReview+"','"+idUser+"', '"+Titulo+"', '"+Sinopsis+"', '"+valoracion+"')";
			}
			catch (SQLException sql1)
			{
				sql1.printStackTrace();
				return null;
			}
			return texto;
		}

}
