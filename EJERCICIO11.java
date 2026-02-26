//## Tema 3 — Estructuras lineales y no lineales

//### Ejercicio 11 — Lista de pasajeros (lineal)
//Pide al usuario cuántos pasajeros tiene un vuelo (máximo 8). Luego pide el nombre de cada uno.
//Muestra la lista numerada con número de asiento y nombre.
//Al final, indica cuántos asientos quedan disponibles sobre el total de 8.

//**Datos de entrada:** `int` cantidad, `String` nombres

import java.util.Scanner;

public class EJERCICIO11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TOTAL_ASIENTOS = 8;

        System.out.print("¿Cuántos pasajeros tiene el vuelo? (máximo 8): ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        if (cantidad > TOTAL_ASIENTOS) {
            System.out.println("No se pueden registrar más de 8 pasajeros.");
            cantidad = TOTAL_ASIENTOS;
        }

        String[] pasajeros = new String[cantidad];

        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del pasajero " + (i + 1) + ": ");
            pasajeros[i] = sc.nextLine();
        }

        
        System.out.println("\n===== Lista de Pasajeros =====");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Asiento " + (i + 1) + " → " + pasajeros[i]);
        }

        
        int disponibles = TOTAL_ASIENTOS - cantidad;

        System.out.println("\nAsientos disponibles: " + disponibles + " de " + TOTAL_ASIENTOS);

        sc.close();
    }
}