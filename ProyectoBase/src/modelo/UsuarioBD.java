package modelo;

import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JTextField;

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
	
	public void datosUser(ConexionBD cbd, int id, JTextField alias, JTextField nombre, JTextField apell, JTextField email, JComboBox genero)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT Alias, Nombre, Apellido, Email, esVaron FROM usuario WHERE idUser='"+id+"';";
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			alias.setText(rs.getString(1));
			nombre.setText(rs.getString(2));
			apell.setText(rs.getString(3));
			email.setText(rs.getString(4));
			genero.setSelectedItem((genero(rs.getBoolean(5))));
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	private String genero(boolean genero)
	{
		if (genero)
		{
			return "Hombre";
		}
		else
		{
			return "Mujer";
		}
	}
	
	public void actualizarAlias(ConexionBD cbd, int id, String alias)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Alias='"+alias+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public void actualizarNombre(ConexionBD cbd, int id, String nombre)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Nombre='"+nombre+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public void actualizarApellido(ConexionBD cbd, int id, String apell)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Apellido='"+apell+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public void actualizarEmail(ConexionBD cbd, int id, String email)
	{
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET Email='"+email+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public void actualizarGenero(ConexionBD cbd, int id, boolean genero)
	{
		int gen=convertirGenero(genero);
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="UPDATE usuario SET esVaron='"+gen+"' WHERE idUser='"+id+"';";
			
			state.executeUpdate(sql);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	private int convertirGenero(boolean genero)
	{
		if (genero)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
