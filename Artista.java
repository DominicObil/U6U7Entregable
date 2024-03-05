package pormi;

import java.io.Serializable;
import java.util.ArrayList;



public class Artista implements Comparable, Serializable{

    public String nombreArtistico;
    public enum EstiloMusical {
        ROCK, INDIE, POP
    }
    public EstiloMusical estiloMusical;
    
    public double cache;
    public Manager Manager;
     ArrayList<Musico> musicos;

    public Artista(String nombreArtistico, EstiloMusical estiloMusical, Manager manager,double cache) {
        this.nombreArtistico = nombreArtistico;
        this.estiloMusical = estiloMusical;
        this.cache = cache;
        this.musicos = new ArrayList<>();
    }


public void addMusico(Musico musico) {
	
	musicos.add(musico);
}



public void delMusico(Musico musico) {
	
	musicos.remove(musico);
}

public void imprimeMusicos() {

		  System.out.println("Componentes de "+ nombreArtistico+" : ");
	        for (Musico m : musicos) {
	            System.out.println(m.nombreArtistico + "------"+m.edad);
	        }
	    
}


public String getNombreArtistico() {
	return nombreArtistico;
}


public void setNombreArtistico(String nombreArtistico) {
	this.nombreArtistico = nombreArtistico;
}


public EstiloMusical getEstiloMusical() {
	return estiloMusical;
}


public void setEstiloMusical(EstiloMusical estiloMusical) {
	this.estiloMusical = estiloMusical;
}


public double getCache() {
	return cache;
}


public void setCache(double cache) {
	this.cache = cache;
}


public Manager getManager() {
	return Manager;
}


public void setManager(Manager manager) {
	Manager = manager;
}


public ArrayList<Musico> getMusicos() {
	return musicos;
}


public void setMusicos(ArrayList<Musico> musicos) {
	this.musicos = musicos;
}



@Override
public int compareTo(Object o) {
	Artista e= (Artista) o ;

	return this.nombreArtistico.compareTo(e.nombreArtistico);
}





	
	





}