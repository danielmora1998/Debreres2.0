package Atributosymetodos;

// Nombre : Mora Gonzalez kevin daniel

import static Atributosymetodos.Fibonasi.Fibonacci;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("ingresa el valor de los numeors totales que desea mostrar");
        int numero = sc.nextInt();
        
        for(int i =0;i<numero;i++){
        
            System.out.println(Fibonacci(i)+"");
        }
        
        Fibonasi op1 = new Fibonasi();
        
        op1.Fibonacci(numero);
       
        
    }
    
}
