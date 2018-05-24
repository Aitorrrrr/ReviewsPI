package modelo;

import java.sql.ResultSet;

import javax.swing.JCheckBox;

import java.sql.*;

public class GeneroBD {

	private Statement state;
	
	public GeneroBD()
	{
		this.state=null;
	}
	
	public void ponerGeneros(ConexionBD cbd, JCheckBox j1,  JCheckBox j2, JCheckBox j3,  JCheckBox j4)
	{
		ResultSet rs;
		
		try
		{
			this.state=cbd.getConexion().createStatement();
			
			String sql="SELECT * FROM genero;";
			
			rs=state.executeQuery(sql);
			
			while (rs.next())
			{
				switch (rs.getInt(1))
				{
					case 1:
						j1.setText(rs.getString(2));
						
					case 2:
						j2.setText(rs.getString(2));
						
					case 3:
						j3.setText(rs.getString(2));
						
					case 4:
						j4.setText(rs.getString(2));
				}
			}
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
}
