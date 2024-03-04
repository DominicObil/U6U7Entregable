package u6u7.entregable;

import java.io.Serializable;

public class Musico implements Serializable{
	public String nombreArtistico;
	public int edad;
   
	
	
	public Musico(String nombreArtistico, int edad){ 
		this.nombreArtistico = nombreArtistico; 
		this.edad = edad; }



	public String getNombreArtistico() {
		return nombreArtistico;
	}



	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}

}
