package modelo;

import java.sql.*;

public class UsuarioBD {

	private Statement st;
	
	public UsuarioBD()
	{
	}
	
	public int insertarUser(ConexionBD cbd, String alias, String nombre, String apellido, String fecha)
	{
		ResultSet rs;
		
		try
		{
			st=cbd.getConexion().createStatement();
			
			String sql="SELECT InsercionUser('"+alias+"', '"+nombre+"', '"+apellido+"', '"+fecha+"')";
			
			rs=st.executeQuery(sql);
			
			return rs.getInt(1);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			
			return 0;
		}
		
	}
	
	/**
	 * try
		{
			st=cbd.getConexion().prepareCall("{SELECT InsercionUser(?, ?, ?, ?);}");
			st.execute();
			
			int salida=st.getInt("err1");
			
			return salida;
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return 0;
		}
	 */
}
