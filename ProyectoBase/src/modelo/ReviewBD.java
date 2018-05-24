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
}
