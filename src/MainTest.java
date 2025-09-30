import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testLetraNota() {
        assertEquals("A", Main.letraNota(10));
        assertEquals("A", Main.letraNota(9));
        assertEquals("B", Main.letraNota(8));
        assertEquals("B", Main.letraNota(7));
        assertEquals("C", Main.letraNota(6));
        assertEquals("D", Main.letraNota(4));
        assertEquals("F", Main.letraNota(2));
        assertEquals("F", Main.letraNota(0));
    }

    @Test
    void testEsPar() {
        assertTrue(Main.esPar(16));
        assertFalse(Main.esPar(7));
        assertTrue(Main.esPar(8));
        assertTrue(Main.esPar(2));
        assertTrue(Main.esPar(0));
        assertFalse(Main.esPar(3));
        assertFalse(Main.esPar(-5));
    }

    @Test
    void testFactorial() {
        assertEquals(1, Main.factorial(1));
        assertEquals(2, Main.factorial(2));
        assertEquals(6, Main.factorial(3));
        assertEquals(24, Main.factorial(4));
        assertEquals(120, Main.factorial(5));
    }

    @Test
    void testContarPositivos() {
        assertEquals(6, Main.contarPositivos(new int[]{1, 2, 3}));
        assertEquals(0, Main.contarPositivos(new int[]{-1, -2, -3}));
        assertEquals(5, Main.contarPositivos(new int[]{-1, 5, -3}));
        assertEquals(0, Main.contarPositivos(new int[]{})); // array vacío
    }

    @Test
    void testNotaMaxima() {
        assertEquals(9.5, Main.notaMaxima(new double[]{5.5, 9.5, 7.0}));
        assertEquals(10.0, Main.notaMaxima(new double[]{10.0}));
        assertEquals(8, Main.notaMaxima(new double[]{8,7,4.4,5.5}));
    }
}