package B2;


import javax.swing.*;
import java.util.Scanner;

public class IngresoPorConsola {
    public static void main(String[] args) {
        final String usuarioCorrecto = "mmg";
        final String passCorrecto = "1234";
        Scanner scanner = new Scanner(System.in);


        // Leer un entero
        System.out.print("Ingresa un número entero: ");
        int numeroEntero = scanner.nextInt();
        System.out.println("Número entero ingresado: " + numeroEntero);

        // Leer un número de punto flotante
        System.out.print("Ingresa un número de punto flotante: ");
        double numeroFlotante = scanner.nextDouble();
        System.out.println("Número de punto flotante ingresado: " + numeroFlotante);

        // Leer una cadena
        scanner.nextLine(); // Consumir el salto de línea pendiente después del número flotante
        System.out.print("Ingresa una Usuario: ");
        String usser = scanner.nextLine();
        System.out.print("Ingresa una Contrasena: ");
        String pass = scanner.nextLine();




        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }

}
