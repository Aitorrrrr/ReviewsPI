package modelo;

import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class SerieBD {
	
	private Statement state;
	
	public SerieBD()
	{
	
	}
	
	public void buscarSerie(ConexionBD cbd, String tit, JLabel titulo, JTextField sinopsis, JTextField valmedia)
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
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public void insertarSerie(int idReview, int temporadas, String productora, int duracion, int idGen, ConexionBD conbd8) {
		
		ResultSet rs;
		
		try
		{
			state=conbd8.getConexion().createStatement();
			
			String sql="INSERT INTO serie (idReview, temporadas, dura_cap, productora, idGen) values ('"+idReview+"','"+temporadas+"', '"+duracion+"', '"+productora+"', '"+idGen+"')";
				
			state.executeUpdate(sql);
		}
		catch (SQLException sql1)
		{
				sql1.printStackTrace();
		}
	}
}
