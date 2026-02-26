//### Ejercicio 12 — Registro de temperaturas (lineal)
//Pide al usuario las temperaturas máximas de los 7 días de la semana.
//Calcula e imprime:
//- El promedio semanal
//- El día más caluroso (índice 0 = lunes)
//- El día más frío
//- Qué días estuvieron por encima del promedio

//**Datos de entrada:** `double` × 7 temperaturas

import java.util.Scanner;

public class EJERCICIO12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        double suma = 0;

        
        System.out.println("Ingrese las temperaturas máximas de la semana:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(dias[i] + ": ");
            temperaturas[i] = sc.nextDouble();
            suma += temperaturas[i];
        }

        
        double promedio = suma / temperaturas.length;

        
        int indiceCalor = 0;
        int indiceFrio = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[indiceCalor]) {
                indiceCalor = i;
            }
            if (temperaturas[i] < temperaturas[indiceFrio]) {
                indiceFrio = i;
            }
        }

       
        System.out.printf("\nPromedio semanal: %.2f°C\n", promedio);
        System.out.println("Día más caluroso: " + dias[indiceCalor] + " (" + temperaturas[indiceCalor] + "°C)");
        System.out.println("Día más frío: " + dias[indiceFrio] + " (" + temperaturas[indiceFrio] + "°C)");

        System.out.println("\nDías por encima del promedio:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > promedio) {
                System.out.println(dias[i] + " (" + temperaturas[i] + "°C)");
            }
        }

        sc.close();
    }
}