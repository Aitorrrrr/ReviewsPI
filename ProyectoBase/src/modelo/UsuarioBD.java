package modelo;

import java.sql.*;

public class UsuarioBD {

	private CallableStatement st;
	private Statement state;
	
	public UsuarioBD()
	{
		
	}
	
	public int insertarUser(ConexionBD cbd, String alias, String nombre, String apellido, String fecha)
	{
		
		try
		{
			st=cbd.getConexion().prepareCall("{CALL InsertarUser(?, ?, ?, ?, ?)}");
			
			st.setString(1, alias);
			st.setString(2, nombre);
			st.setString(3, apellido);
			st.setString(4, fecha);
			
			st.registerOutParameter(5, java.sql.Types.INTEGER);
			
			st.execute();
			
			int insertado=st.getInt(5);
			
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
}
