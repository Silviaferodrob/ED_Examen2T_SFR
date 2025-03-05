package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Biblioteca biblioteca;
    Libro libro;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro = new Libro("El arte de que todo sea una mierda", "Silvia Fernandez", 2025);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro), "El libro debería agregarse correctamente en la biblioteca");
        assertEquals(1, biblioteca.getLibros().size(), "La biblioteca debería contener 1 libro");
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(libro), "El libro debería eliminarse correctamente de la biblioteca");
        assertEquals(0, biblioteca.getLibros().size(), "La biblioteca debería estar vacía");
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro);
        assertEquals(libro, biblioteca.encuentraLibroPorTitulo("El arte de que todo sea una mierda"), "Debería encontrar el libro por su título");
        assertNull(biblioteca.encuentraLibroPorTitulo("Este libro no existe"), "Debería devolver null si el libro no existe");
    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(new Libro("Otra obra de mierda", "Silvia Fernandez", 2026));

        List<Libro> librosAutor = biblioteca.encuentraLibrosPorAutor("Silvia Fernandez");
        assertEquals(2, librosAutor.size(), "Debería encontrar 2 libros del mismo autor");

        librosAutor = biblioteca.encuentraLibrosPorAutor("Autor Desconocido");
        assertTrue(librosAutor == null || librosAutor.isEmpty(), "Debería devolver una lista vacía si no hay libros de ese autor");
    }
}