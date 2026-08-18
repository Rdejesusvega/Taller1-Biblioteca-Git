abstract class ProductoMusical {
    protected String titulo;
    protected String artista;
    protected double precio;

    public ProductoMusical(String titulo, String artista, double precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getPrecio() {
        return precio;
    }
}