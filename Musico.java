package pormi;

import java.io.Serializable;

public class Musico implements Serializable {
	
	public String nombreArtistico;
	public int edad;
	
	Musico(String nombreArtistico , int edad){
		
		this.nombreArtistico= nombreArtistico;
		this.edad = edad;
	
	}
	
	
}
