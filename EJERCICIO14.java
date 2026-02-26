//### Ejercicio 14 — Ventas por sucursal (lineal)
//Pide las ventas mensuales de 5 sucursales de una cadena de tiendas.
//Muestra:
//- La sucursal con mayor venta
//- La sucursal con menor venta
//- El total de ventas de la cadena
//- El porcentaje que representa cada sucursal del total

//**Datos de entrada:** `String` nombre de sucursal + `double` venta × 5

import java.util.Scanner;

public class EJERCICIO14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] sucursales = new String[5];
        double[] ventas = new double[5];

        double totalVentas = 0;

      
        System.out.println("Ingrese el nombre y venta mensual de 5 sucursales:");

        for (int i = 0; i < 5; i++) {
            System.out.print("\nNombre de la sucursal " + (i + 1) + ": ");
            sucursales[i] = sc.nextLine();

            System.out.print("Venta mensual de " + sucursales[i] + ": ");
            ventas[i] = sc.nextDouble();
            sc.nextLine(); 

            totalVentas += ventas[i];
        }

        
        int indiceMayor = 0;
        int indiceMenor = 0;

        for (int i = 1; i < 5; i++) {
            if (ventas[i] > ventas[indiceMayor]) {
                indiceMayor = i;
            }
            if (ventas[i] < ventas[indiceMenor]) {
                indiceMenor = i;
            }
        }

        
        System.out.println("\n===== Resultados =====");

        System.out.println("Sucursal con mayor venta: " 
                + sucursales[indiceMayor] 
                + " ($" + ventas[indiceMayor] + ")");

        System.out.println("Sucursal con menor venta: " 
                + sucursales[indiceMenor] 
                + " ($" + ventas[indiceMenor] + ")");

        System.out.printf("Total de ventas de la cadena: $%.2f\n", totalVentas);

        System.out.println("\nPorcentaje que representa cada sucursal:");

        for (int i = 0; i < 5; i++) {
            double porcentaje = (ventas[i] / totalVentas) * 100;
            System.out.printf("%s: %.2f%%\n", sucursales[i], porcentaje);
        }

        sc.close();
    }
}