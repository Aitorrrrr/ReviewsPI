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
	public int insertarSerie(ConexionBD cbd,int idReview, String titulo, String temporadas, String dura_cap, String productora, int idGen)
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
				sql="INSERT INTO serie (idReview, temporadas, dura_cap, productora, idGen) VALUES ('"+idReview+"', '"+titulo+"', '"+temporadas+"', '"+dura_cap+", '"+productora+"', '"+idGen+"')";
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
