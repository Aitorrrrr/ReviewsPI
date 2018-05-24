package arranque;

import modelo.*;
import Vista.*;
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
		
		CrearReview cr1=new CrearReview(c1);
		cr1.setVisible(true);
	}

}
