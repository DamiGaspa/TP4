import BACKEND.Participante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticipanteTest {

    @Test
    void participanteValido() {
        Participante p = new Participante("Juan", "1234-567890", "China");
        assertTrue(p.esValido());
    }

    @Test
    void nombreVacioDebeFallar() {
        Participante p = new Participante("", "1234-567890", "China");
        assertFalse(p.esValido());
        assertEquals("Debe cargar un nombre", p.mensajeDeError());
    }

    @Test
    void telefonoInvalidoDebeFallar() {
        Participante p = new Participante("Juan", "1234567890", "China");
        assertFalse(p.esValido());
        assertEquals("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN", p.mensajeDeError());
    }

    @Test
    void regionInvalidaDebeFallar() {
        Participante p = new Participante("Juan", "1234-567890", "Latam");
        assertFalse(p.esValido());
        assertEquals("Region desconocida. Las conocidas son: China, US, Europa", p.mensajeDeError());
    }
}
