package modelo;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import Vista.Pantalla_Usuario;

public class comentarioBD {

	private static Statement state;
	
	public comentarioBD()
	{
		this.state=null;
	}
	
	public boolean crearComentario(String texto, int valoracion, int idUser, int idReview, ConexionBD conbd1)
	{
		try
		{
			state=conbd1.getConexion().createStatement();
			String sql="INSERT INTO Comentario (Texto, Valoracion, idUser, idReview) values ('"+texto+"', '"+valoracion+"', '"+idUser+"', '"+idReview+"')";
			
			state.executeUpdate(sql);
			
			return true;
		}
		catch (SQLException sql1)
		{
			sql1.printStackTrace();
			return false;
		}
	}
	
	public void MostrarComentarios(int idReview, ConexionBD conbd2, JTextArea text)
	{
		ResultSet rs2;
		try
		{
			state=conbd2.getConexion().createStatement();
			String sql2="Select Texto from Comentario where idReview='"+idReview+"'";
			
			rs2=state.executeQuery(sql2);
			
			while (rs2.next())
			{
				text.setText(text.getText()+rs2.getString(1)+"\n\n");
			}
		}
		catch (SQLException sql2)
		{
			sql2.printStackTrace();
		}
	}
	
	public void mostrarComentariosUser(int id, ConexionBD cbd, JTextArea text)
	{
		ResultSet rs2;
		try
		{
			state=cbd.getConexion().createStatement();
			String sql2="Select Texto from Comentario where idUser='"+id+"'";
			
			rs2=state.executeQuery(sql2);
			
			while (rs2.next())
			{
				text.setText(text.getText()+rs2.getString(1)+"\n\n");
			}
		}
		catch (SQLException sql2)
		{
			sql2.printStackTrace();
		}
		
	}
}
