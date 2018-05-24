package modelo;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import Vista.Pantalla_Usuario;

public class comentarioBD {
	Calendar fecha=Calendar.getInstance();
	Calendar calendario = new GregorianCalendar();
	private static Statement state;
	
	public comentarioBD()
	{
		this.state=null;
	}
	
	public String crearComentario(String idComentario, Calendar fecha, String hora, String texto, int valoracion, int idUser, int idReview, ConexionBD conbd1)
	{
		ResultSet rs1;
		try
		{
			state=conbd1.getConexion().createStatement();
			String sql1="INSERT INTO Comentario (idComentario, Texto, Valoracion, idUser, idReview) values ('"+idComentario+"','"+texto+"', '"+valoracion+"', '"+idUser+"', '"+idReview+"')";
		}
		catch (SQLException sql1)
		{
			sql1.printStackTrace();
			return null;
		}
		return texto;
	}
	
	public void MostrarComentariosUsuario(String idUser, ConexionBD conbd2, JTextArea text)
	{
		ResultSet rs2;
		try
		{
			state=conbd2.getConexion().createStatement();
			String sql2="Select Texto from Comentario where idUser='"+idUser+"'";
			
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
