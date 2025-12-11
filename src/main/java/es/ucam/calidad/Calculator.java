package es.ucam.calidad;

//Pequeño cambio para disparar el CI
//Segundo pequeño cambio para disparar el CI

/**
 * Clase de ejemplo para la práctica de Integración Continua.
 * Proporciona operaciones básicas de cálculo.
 */
public class Calculator {

    /**
     * Suma dos números enteros.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return suma de a y b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return producto de a y b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return resultado de a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Divide dos números enteros.
     * Si b es 0, lanza una ArithmeticException.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado de a / b
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
