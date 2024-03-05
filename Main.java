package pormi;

import pormi.Artista.EstiloMusical;

public class Main {
    public static void main(String[] args) {
    	Festival festival = new Festival("Sevilla Festival", "654");
        Manager m1 = new Manager("Jaime", "6565656565");
        Artista a1 = new Artista("el grupo", EstiloMusical.INDIE, m1, 10000);
        Artista a2 = new Artista("aaaa", EstiloMusical.INDIE, m1, 10001);
        Artista a3 = new Artista("sssss", EstiloMusical.INDIE, m1, 1021002);
        Artista a4 = new Artista("juan", EstiloMusical.INDIE, m1, 105644);

        Musico mu1 = new Musico("Pedro", 35);
        Musico mu2 = new Musico("Pedrito", 33);
        Musico mu3 = new Musico("Pedrin", 31);
        a1.addMusico(mu1);
        a1.addMusico(mu2);
        a1.addMusico(mu3);
        
        
        
        
        a1.imprimeMusicos();
        
        
        festival.inscribeArtista(a1);  
        festival.inscribeArtista(a4);
        festival.inscribeArtista(a2);
        festival.inscribeArtista(a3);
        System.out.println("---------------------------------------------------------");
        int cantidadInscritos = festival.cuantosInscritos();
        System.out.println("Cantidad de artistas inscritos en el festival: " + cantidadInscritos);
        
        
        System.out.println("---------------------------------------------------------");
        
        festival.artistasByCache(EstiloMusical.INDIE);
        
        
        System.out.println("---------------------------------------------------------");
        
        festival.artistasInscritos();



        System.out.println("---------------------------------------------------------");
        
        
        festival.guardarArtistas();
        festival.cargarArtistas();
   
        
    }
    
    
    
    
        
        
    
}
