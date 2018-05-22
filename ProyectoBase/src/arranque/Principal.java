package arranque;

import modelo.*;
import Vista.Login;
import controlador.Controlador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Controlador c1=new Controlador();
		
		c1.primeraConex();
		
		c1.getConexion().conectarAD("userpi", "Proyecto1");
		
		c1.desconectar();
		
		c1.conectar();
	}

}
