package arranque;

import modelo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConexionBD cbd=new ConexionBD("localhost", "pint", "root", "");
		
		UsuarioBD ubd=new UsuarioBD();
		
		ubd.insertarUser(cbd, "Homer", "Nombre1", "Apell1", "20000121");
	}

}
