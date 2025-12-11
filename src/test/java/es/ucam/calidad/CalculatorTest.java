package es.ucam.calidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("La suma de 2 + 3 debe ser 5")
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 debería ser 5");
    }

    @Test
    @DisplayName("La multiplicación de 3 * 4 debe ser 12")
    void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);
        assertEquals(12, result, "3 * 4 debería ser 12");
    }

    @Test
    @DisplayName("La resta de 10 - 3 debe ser 7")
    void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 3);
        assertEquals(7, result, "10 - 3 debería ser 7");
    }

    @Test
    @DisplayName("La división 10 / 2 debe ser 5")
    void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result, "10 / 2 debería ser 5");
    }

    @Test
    @DisplayName("La división por cero debe lanzar excepción")
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
                "Dividir por cero debería lanzar ArithmeticException");
    }
}
