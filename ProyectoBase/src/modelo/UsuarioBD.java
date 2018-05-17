package modelo;

import java.sql.*;

public class UsuarioBD {

	private CallableStatement st;
	private Statement state;
	
	public UsuarioBD()
	{
		
	}
	
	public int insertarUser(ConexionBD cbd, String alias, String contra, String nombre, String apellido, String email, String fecha)
	{
		
		try
		{
			st=cbd.getConexion().prepareCall("{CALL InsertarUser(?, ?, ?, ?, ?, ?, ?)}");
			
			st.setString(1, alias);
			st.setString(2, contra);
			st.setString(3, nombre);
			st.setString(4, apellido);
			st.setString(5, email);
			st.setString(6, fecha);
			
			st.registerOutParameter(7, java.sql.Types.INTEGER);
			
			st.execute();
			
			int insertado=st.getInt(7);
			
			return insertado;
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return 0;
		}
	}
	
	public int insertarUserV2(ConexionBD cbd, String alias, String nombre, String apellido, String fecha)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT Nombre FROM usuario WHERE Alias='"+alias+"'";
			
			rs=state.executeQuery(sql);
			
			if (rs.next())
			{
				return 0;
			}
			else
			{
				sql="INSERT INTO usuario (Alias, Nombre, Apellido, Fecha_Inscrip) VALUES ('"+alias+"', '"+nombre+"', '"+apellido+"', '"+fecha+"')";
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
	
	public boolean loginUser(ConexionBD cbd, String alias, String contra)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT Alias FROM usuario WHERE (Alias='"+alias+"' && Contrasenia='"+contra+"')";
			
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
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			return false;
		}
	}
}
