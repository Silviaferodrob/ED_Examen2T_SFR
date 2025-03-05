package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("Cómo sobrevivir al caos de entornos", "Silvia Fernandez", 2025);
    }

    @Test
    void getTitulo() {
        assertEquals("Cómo sobrevivir al caos de entornos", libro.getTitulo(), "El título debería ser Cómo sobrevivir al caos");
    }

    @Test
    void setTitulo() {
        libro.setTitulo("La vida en una fp");
        assertEquals("La vida en una fp", libro.getTitulo(), "El título debería cambiar correctamente");
    }

    @Test
    void getAutor() {
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
    }

    @Test
    void setAnioPublicacion() {
    }
}