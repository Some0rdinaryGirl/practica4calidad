package es.ucam.calidad;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        int sum = calculator.add(a, b);
        int product = calculator.multiply(a, b);

        System.out.println("Suma de " + a + " + " + b + " = " + sum);
        System.out.println("Producto de " + a + " * " + b + " = " + product);
    }
}
