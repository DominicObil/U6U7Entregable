package u6u7.entregable;

public class Main {
    public static void main(String[] args) {
  
        Festival festival = new Festival("Festival de muscia gines", "41960");
        Manager m1 = new Manager("Javier ", "123456789");
        Artista a1 = new Artista("Juan ", "INDIE", 1000, m1);
        a1.addMusico(new Musico("1", 30));
        a1.addMusico(new Musico("2", 25));

        try {
            festival.inscribeArtista("INDIE", a1);
         
        } catch (Exception e) {
        	e.printStackTrace();
        
        }
        festival.guardarArtistas();
        festival.cargarArtistas();
    }
}