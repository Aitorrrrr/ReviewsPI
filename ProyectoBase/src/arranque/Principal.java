package arranque;

import modelo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConexionBD cbd=new ConexionBD("localhost", "pint", "root", "");
		
		UsuarioBD ubd=new UsuarioBD();
		
		cbd.cargarDriver();
		
		cbd.conectar();
		if (ubd.insertarUser(cbd, "Yoyoyo", "Nombre1", "Apell1", "20000121")==1)
		{
			System.out.println("Usuario insertado");
		}
		else
		{
			System.out.println("Alias en uso");
		}
		cbd.desconectar();
	}

}
