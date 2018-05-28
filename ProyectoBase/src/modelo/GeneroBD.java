package modelo;

import java.sql.ResultSet;

import javax.swing.JCheckBox;

import java.sql.*;

public class GeneroBD {

	// Atributos
	
	/**
	 * Statement para poder lanzar consultas sql
	 */
	private Statement state;
	
	// Constructores
	
	/**
	 * Constructor por defecto para inicializar un objeto GeneroBD
	 */
	public GeneroBD()
	{
		this.state=null;
	}
	
	// M�todos p�blicos
	
	/**
	 * M�todo para mostrar los g�neros disponibles, recibimos un objeto ConexionBD para realizar la conexi�n a la BD,
	 * as� como 4 JCheckBox donde introduciremos los nombres de los g�neros disponibles. (En realidad el m�todo esta 
	 * en desuso por que tuvimos que traducir la aplicaci�n al ingl�s)
	 * 
	 * @param cbd Objeto ConexionBD para reliazar la conexi�n a la BD
	 * @param j1 Primer Checkbox, definiremos su nombre con el de un g�nero
	 * @param j2 Segundo Checkbox, definiremos su nombre con el de un g�nero
	 * @param j3 Tercer Checkbox, definiremos su nombre con el de un g�nero
	 * @param j4 Cuarto Checkbox, definiremos su nombre con el de un g�nero
	 */
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
	
	/**
	 * M�todo para buscar el id del genero introducido
	 * 
	 * @param cbd Objeto ConexionBD para reliazar la conexi�n a la BD
	 * @param nomGen String con el nombre del genero que se ha introducido
	 * @return Devuelve un entero que es la identificaci�n del g�nero buscado
	 */
	public int buscarGeneros(ConexionBD cbd, String nomGen)
	{
		ResultSet rs;
		
		try
		{
			state=cbd.getConexion().createStatement();
			
			String sql="SELECT idGen FROM genero WHERE Nombre='"+nomGen+"';";
			
			rs=state.executeQuery(sql);
			
			rs.next();
			
			return rs.getInt(1);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
			
			return 0;
		}
	}
}
