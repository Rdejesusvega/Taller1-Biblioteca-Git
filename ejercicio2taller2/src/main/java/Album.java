import java.util.ArrayList;

class Album extends ProductoMusical implements Reproducible {

    private final ArrayList<Cancion> canciones;

    public Album(String titulo, String artista, double precio) {
        super(titulo, artista, precio);
        canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo álbum: " + titulo);
        for (Cancion c : canciones) {
            c.reproducir();
        }
    }
}

