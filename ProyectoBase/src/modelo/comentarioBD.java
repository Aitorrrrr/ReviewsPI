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
	
	public void MostrarNombreUsuario(String idUser, ConexionBD conbd3, JTextField nombre)
	{
		ResultSet rs3;
		try
		{
			state=conbd3.getConexion().createStatement();
			String sql3="Select Alias from Usuario where idUser='"+idUser+"'";
			rs3=state.executeQuery(sql3);
			while (rs3.next())
			{
				nombre.setText(rs3.getString(1));
			}
		}
		
		catch (SQLException sql3)
		{
			sql3.printStackTrace();
		}
	}
	
	public void MostrarEmail(String idUser, ConexionBD conbd4, JTextField email)
	{
		ResultSet rs4;
		try
		{
			state=conbd4.getConexion().createStatement();
			String sql4="Select Email from Usuario where idUser='"+idUser+"'";
			rs4=state.executeQuery(sql4);
			while (rs4.next())
			{
				email.setText(rs4.getString(1));
			}
		}
		
		catch (SQLException sql4)
		{
			sql4.printStackTrace();
		}
	}
	
	public void mostrarFechaNacimiento(String idUser, ConexionBD conbd5, JTextField fechaNacimiento)
	{
		ResultSet rs5;
		try
		{
			state=conbd5.getConexion().createStatement();
			String sql5="Select Fecha_Nacim from Usuario where idUser='"+idUser+"'";
			rs5=state.executeQuery(sql5);
			while (rs5.next())
			{
				fechaNacimiento.setText(rs5.getString(1));
			}
		}
		catch (SQLException sql5)
		{
			sql5.printStackTrace();
		}
	}
	
	public void mostrarNombreApellidos(String idUser, ConexionBD conbd6, JTextField Nombre)
	{
		ResultSet rs6;
		try
		{
			state=conbd6.getConexion().createStatement();
			String sql6="Select Nombre, Apellido from Usuario where idUser='"+idUser+"'";
			rs6=state.executeQuery(sql6);
			while (rs6.next())
			{
				Nombre.setText(rs6.getString(1));
				Nombre.setText(Nombre.getText()+" "+rs6.getString(2));
			}
		
			
		}
		catch (SQLException sql6)
		{
			sql6.printStackTrace();
		}
	}
	
	public void Genero(String idUser, ConexionBD conbd7, JTextField Genero)
	{
		ResultSet rs7;
		try
		{
			state=conbd7.getConexion().createStatement();
			String sql7="Select esVaron from Usuario where idUser='"+idUser+"'";
			rs7=state.executeQuery(sql7);
			
			while (rs7.next())
			{
				Genero.setText(rs7.getString(1));
			}
			
			if (Genero.getText().equals("0"))
			{
				Genero.setText("Hombre");
			}
			else
			{
				Genero.setText("Mujer");
			}
			
		}
		catch (SQLException sql7)
		{
			sql7.printStackTrace();
		}
	}
	
}
