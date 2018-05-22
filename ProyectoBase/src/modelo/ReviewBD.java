package modelo;

import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReviewBD {
	
	private Statement state;
	
	public ReviewBD()
	{
	
	}
	
	public void buscarReview(ConexionBD cbd, String tit, JLabel j1, JTextField j3)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT r.Titulo, c.texto FROM review r INNER JOIN comentario c ON c.idReview=r.idReview WHERE Titulo='"+tit+"'";
			
			
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
}
