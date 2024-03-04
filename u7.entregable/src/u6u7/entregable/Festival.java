package u6u7.entregable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Festival implements Serializable {

	
	public String nombreEvento;
	public String codPostal;
	




	HashMap<String, Set<Artista>> mapa_festival = new HashMap<>();
 
    
    
 Festival(String nombreEvento, String codPostal) {
	        this.nombreEvento = nombreEvento;
	        this.codPostal = codPostal;
	        this.mapa_festival = new HashMap<>();

 }
public void inscribeArtista(String estilo, Artista artista) throws Exception {
    if (!mapa_festival.containsKey(estilo)) {
        throw new Exception("Estilo incorrecto");
    }
    mapa_festival.put(estilo, (Set<Artista>) artista);
    
    
    guardarArtistas();

}

public int cuantosInscritos() {
    int Inscritos = 0;
    for (Set<Artista> artistas : mapa_festival.values()) {
    	Inscritos += artistas.size();
    }
    return Inscritos;
}

public void artistasByCache(String estilo) {
	
	
}

public void artistasInscritos() {
	ArrayList<Artista> inscripcionArtista = new ArrayList<>();
    for (Set<Artista> artistas : mapa_festival.values()) {
    	inscripcionArtista.addAll(artistas);
    }
    
}

public void cargarArtistas() {
    try {
        FileInputStream fichero = new FileInputStream("artistas.dat");
        ObjectInputStream objecfich = new ObjectInputStream(fichero);
        Festival festival = (Festival) objecfich.readObject();
        objecfich.close();
        fichero.close();
        System.out.println("Artistas cargados ");
    } catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
    }
    

}

public void guardarArtistas() {
    try {
        FileOutputStream fichero = new FileOutputStream("artistas.dat");
        ObjectOutputStream objecfich = new ObjectOutputStream(fichero);
        objecfich.writeObject(this);
        objecfich.close();
        fichero.close();
        System.out.println(" guardado de artistas.dat");
    } catch (IOException e) {
    	
		e.printStackTrace();
    }
}
}



	

