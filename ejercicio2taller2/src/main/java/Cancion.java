class Cancion extends ProductoMusical implements Reproducible, Descargable {

    public Cancion(String titulo, String artista, double precio) {
        super(titulo, artista, precio);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción: " + titulo + " - " + artista);
    }

    @Override
    public void descargar(double velocidadMbps) {
        System.out.println("Descargando '" + titulo + "' a " + velocidadMbps + " Mbps");
    }
}

