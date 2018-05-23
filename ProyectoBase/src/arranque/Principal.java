package arranque;

import modelo.*;
import Vista.Login;
import Vista.Pantalla_Usuario;
import Vista.Pantalla_Registro;
import Vista.Pantalla_Pelicula;
import Vista.Pantalla_Pelicula_Admin;
import controlador.Controlador;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Controlador c1=new Controlador();
		c1.primeraConex();
		c1.desconectar();
		
		Pantalla_Usuario pu=new Pantalla_Usuario(c1);
		pu.setVisible(true);
	}

}
