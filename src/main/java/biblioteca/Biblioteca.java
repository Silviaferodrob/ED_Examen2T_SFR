package biblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una Biblioteca con una colecion de Libros
 * Permite agregar, eliminar y buscar libros por titulo y por autor
 *
 * @see Libro
 * @author silviafernandez
 * @version 5.3.2025
 *
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista de libros disponibles en la biblioteca
     */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**
     * Constructor por defecto de la biblioteca vacia sin libros
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * Constructor que permite inicializar la biblioteca con una lista de libros
     * @param libros lista de libros con la que se inicializa la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    /**
     * Agrega un libro a la biblioteca
     * @param libro el libro a agregar
     * @return {@code true} si el libro se ha agregado correctamente, {@code false} en caso contrario
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    /**
     * Elimina un libro de la biblioteca
     * @param libro El libro a eliminar
     * @return {@code true} si el libro se ha eliminado correctamente, {@code false} en caso contrario
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método
    /**
     * Devuelve la lista de libros disponibles en la biblioteca
     * @return lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Busca un libro en la biblioteca por su título
     * @param titulo El título del libro a buscar
     * @return el libro encontrado, o {@code null} si no existe
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    /**
     * @deprecated metodo obsoleto. Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     * @param autor el autor del libro a buscar
     * @return el primer libro encontrado del autor, o {@code null} si no hay ninguno
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Busca todos los libros de un autor en la biblioteca.
     * @param autor El autor de los libros a buscar.
     * @return Lista de libros del autor, o una lista vacía si no se encuentra ninguno.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
