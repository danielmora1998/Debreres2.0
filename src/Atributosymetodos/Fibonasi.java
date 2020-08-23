package Atributosymetodos;

// Nombre; Mora Gonzalez Kevin Daniel

public class Fibonasi {

    

    public static int Fibonacci(int n) {

        if (n > 1) {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("ingresa una numero mayor a 1");
            return -1;
        }
    }
}
