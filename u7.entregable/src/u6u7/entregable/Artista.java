package u6u7.entregable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





class Artista implements Comparable, Serializable {
	public String nombreArtistico; 
	public String estilo;// enum
	public double cache; 
	public Manager manager; 
    List<Musico> musicos; 
	
public Artista(String nombreArtistico, String estilo, double cache, Manager manager) { 
		this.nombreArtistico = nombreArtistico;
	    this.estilo = estilo;
	    this.cache = cache;
	    this.manager = manager; 
	    this.musicos = new ArrayList<>(); 
	    } 




public String getNombreArtistico() {
	return nombreArtistico;
}


public void setNombreArtistico(String nombreArtistico) {
	this.nombreArtistico = nombreArtistico;
}


public String getEstilo() {
	return estilo;
}


public void setEstilo(String estilo) {
	this.estilo = estilo;
}


public double getCache() {
	return cache;
}


public void setCache(double cache) {
	this.cache = cache;
}


public Manager getManager() {
	return manager;
}


public void setManager(Manager manager) {
	this.manager = manager;
}


public List<Musico> getMusicos() {
	return musicos;
}


public void setMusicos(List<Musico> musicos) {
	this.musicos = musicos;
}

// metodo añade musico si es necesario
public void addMusico(Musico musico) {
	musicos.add(musico); 
		}

// metodo para borrar musico
public void delMusico(Musico musico) {
	musicos.remove(musico); 
		}


// metodo para imprimir musico con iterator
public void imprimirMusicos() {

	Iterator<Musico> musico = musicos.iterator();
    
	  while (musico.hasNext()) {
		  Musico obj = (Musico) musico.next();
	    System.out.println("Autor : " +obj.getNombreArtistico()+", Libro: "+ obj.getEdad());
	    
	  }

}


@Override
public int compareTo(Object o) {
	Artista e= (Artista) o ;

	return this.nombreArtistico.compareTo(e.nombreArtistico);
}










}
