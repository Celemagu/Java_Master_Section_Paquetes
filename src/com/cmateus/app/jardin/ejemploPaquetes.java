package com.cmateus.app.jardin;

//import  com.cmateus.app.hogar.Persona;
//import com.cmateus.app.hogar.Gato;
import com.cmateus.app.hogar.*; //el * trae todas las clases del paquete importado
//import static com.cmateus.app.hogar.Persona.saludar; // importar metodo
import static com.cmateus.app.hogar.Persona.*;//el * trae todas los metodos, atributos y constantes del paquete importado
//import static com.cmateus.app.hogar.ColorPelo.CAFE; // trae el valor de un enum
import static com.cmateus.app.hogar.ColorPelo.*;//el * trae todas las variables del enum importado
public class ejemploPaquetes {

	public static void main(String[] args) {
		//com.cmateus.app.hogar.Persona p = new com.cmateus.app.hogar.Persona();// nombrando toda la ruta
		Persona p =new Persona();// usando la opcion import
		p.setNombre("Cesar");
		p.setApellido("Mateus");
		p.setColorpelo(CAFE);
		System.out.println(p.getNombre());
		Perro perro = new Perro();
		perro.nombre="Tobby";
		perro.raza= "Bulldog";
		
		String jugando = perro.jugar(p);
		System.out.println("Jugando = " + jugando);
		
		String saludo = saludar();
		System.out.println("saludo = " + saludo);
		
		String generoHombre = GENERO_MASCULINO;
		String generoMujer = GENERO_FEMENINO;
;		
	}

}
