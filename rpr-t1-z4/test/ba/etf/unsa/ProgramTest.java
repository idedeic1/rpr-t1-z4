package ba.etf.unsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void main() {
        Student s = new Student("Hamo", 17555, "Jazvin");
        assertAll("Test konstruktora klase Student",
                () -> assertEquals(17555, s.broj_indeksa),
                () -> assertEquals("Hamo", s.ime),
                () -> assertEquals("Jazvin", s.prezime)
        );
    }
}