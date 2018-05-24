package modelo;

import java.util.Locale;
import java.util.ResourceBundle;

public class Idioma {

	 private String language;
	 private String country;
	 private static Locale currentLocale;
	 private static ResourceBundle messages;
	 private static boolean eng=false;
	 private static boolean esp=false;
	 
     public static void langIng()
     {

         eng=true;
     }
     
     public void langEsp()
     {

         esp=true;
     }
     
   public String traduz(String palabra) {
	   
	   currentLocale = new Locale("en", "US");
       messages = ResourceBundle.getBundle("assets\\idiomas\\MessagesBundle",currentLocale);
	   
	   if (this.eng==true)
	   {
	         currentLocale = new Locale("en", "US");
	         messages = ResourceBundle.getBundle("assets\\idiomas\\MessagesBundle",currentLocale);
	   }
	   else if (this.esp==true)
	   {
	         currentLocale = new Locale("es", "ES");
	         messages = ResourceBundle.getBundle("assets\\idiomas\\MessagesBundle",currentLocale);
	   }
	   
	   	String asdf="";
	   	asdf=messages.getString(palabra);
	
    	 return asdf;
  
     }


	
}

