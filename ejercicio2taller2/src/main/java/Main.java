import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {

        ArrayList<ProductoMusical> productos = new ArrayList<>();

        // Canciones
        Cancion c1 = new Cancion("Song 1", "Artista A", 1.5);
        Cancion c2 = new Cancion("Song 2", "Artista B", 2.0);
        Cancion c3 = new Cancion("Song 3", "Artista C", 1.8);

        // Álbumes
        Album album1 = new Album("Album X", "Artista A", 10.0);
        album1.agregarCancion(c1);
        album1.agregarCancion(c2);

        Album album2 = new Album("Album Y", "Artista B", 12.0);
        album2.agregarCancion(c3);

        // Agregar a la lista
        productos.add(c1);
        productos.add(c2);
        productos.add(c3);
        productos.add(album1);
        productos.add(album2);

        // Filtrar descargables
        System.out.println("Productos descargables:");
        for (ProductoMusical p : productos) {
            if (p instanceof Descargable) {
                System.out.println("- " + p.getTitulo());
            }
        }
    }
}
