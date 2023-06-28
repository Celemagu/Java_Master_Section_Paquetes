package com.cmateus.app.jardin;

import com.cmateus.app.hogar.Persona;

public class Perro {
	
	 protected String nombre;
	 protected String raza;
	 
	 String jugar(Persona persona) {
		 return persona.lanzarPelota();
	 }
}
