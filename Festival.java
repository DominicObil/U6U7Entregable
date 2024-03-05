package pormi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pormi.Artista.EstiloMusical;



public class Festival implements Serializable {

	public String nombreFestival;
	public String codPostal;
	Map<EstiloMusical, ArrayList<Artista>> mapa_festival;
	ArrayList<Artista> artistasEstilo;

	
	public static int Artistotal=0;
	
	
	
	Festival(String nombreFestival, String codPostal) { 
		
		
		
		this.nombreFestival = nombreFestival;
		this.codPostal = codPostal;
		
		
		mapa_festival = new HashMap<>();
	
	}
	   
	public void inscribeArtista(Artista artista) {
	    EstiloMusical estiloMusical = artista.estiloMusical;
	    
	    if (!mapa_festival.containsKey(estiloMusical)) {
	        mapa_festival.put(estiloMusical, new ArrayList<>());
	    }
	   
	    ArrayList<Artista> artistasEstilo = mapa_festival.get(estiloMusical);
	    artistasEstilo.add(artista);
	    mapa_festival.put(estiloMusical, artistasEstilo);
	   
	  
	}

	public int cuantosInscritos() {
        int totalInscritos = 0;
        for (ArrayList<Artista> listaArtistas : mapa_festival.values()) {
            totalInscritos += listaArtistas.size();
        }
        return totalInscritos;
    }
	
	  public void artistasByCache(EstiloMusical estiloMusical) {
	        ArrayList<Artista> artistasEstilo = mapa_festival.get(estiloMusical);
	        if (artistasEstilo != null && !artistasEstilo.isEmpty()) {
	            Collections.sort(artistasEstilo, (a1, a2) -> Double.compare(a2.cache, a1.cache));
	            for (Artista artista : artistasEstilo) {
	                System.out.println("Artista: " + artista.estiloMusical + ", Caché: " + artista.cache);
	            }
	        } else {
	            System.out.println("No hay artistas inscritos en el estilo musical '" + estiloMusical + "'.");
	        }
	    }
	  public void artistasInscritos() {
	        for (ArrayList<Artista> listaArtistas : mapa_festival.values()) {
	            Collections.sort(listaArtistas);
	            for (Artista artista : listaArtistas) {
	                System.out.println("Artista: " + artista.nombreArtistico);
	            }
	        }
	    }
	  public void cargarArtistas() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("artistas.dat"))) {
	            Object obj = ois.readObject();
	            if (obj instanceof Map) {
	                mapa_festival = (Map<EstiloMusical, ArrayList<Artista>>) obj;
	                System.out.println("Artistas cargados exitosamente desde artistas.dat");
	            } else {
	                System.out.println("El archivo artistas.dat no contiene un mapa de artistas válido.");
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error al cargar los artistas desde artistas.dat: " + e.getMessage());
	        }
	    }
	    public void guardarArtistas() {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("artistas.dat"))) {
	            oos.writeObject(mapa_festival);
	            System.out.println("Artistas guardados exitosamente en artistas.dat");
	        } catch (IOException e) {
	            System.out.println("Error al guardar los artistas en artistas.dat: " + e.getMessage());
	        }
	    }
	
	 

}