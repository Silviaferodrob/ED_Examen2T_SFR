package biblioteca;

/**
 * Clase que representa un libro con título, autor y año de publicación
 *
 * @author silviafernandez
 * @version 5.3.2025
 *
 */
public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Título del libro
     */
    private String titulo;
    /**
     * Autor del libro
     */
    private String autor;
    /**
     * Año de publicación del libro
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método
    /**
     * Constructor de la clase Libro
     * @param titulo título del libro
     * @param autor autor del libro
     * @param anioPublicacion año de publicación del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    /**
     * Obtiene el título del libro
     * @return el título del libro
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Establece el título del libro
     * @param titulo nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Obtiene el autor del libro
     * @return el autor del libro
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Establece el autor del libro
     * @param autor nuevo autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Obtiene el año de publicación del libro
     * @return el año de publicación del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    /**
     * Establece el año de publicación del libro.
     * @param anioPublicacion nuevo año de publicación del libro.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
