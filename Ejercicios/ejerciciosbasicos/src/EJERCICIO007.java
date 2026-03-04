//### Ejercicio 7 — Arreglo compartido (inventario)
//Pide al usuario 4 precios para llenar un arreglo `precios[]`.
//Crea `preciosAuditoria = precios` (misma referencia).
//Pide al usuario el índice y el nuevo precio para hacer una corrección desde `preciosAuditoria`.
//Muestra ambos arreglos y verifica que el cambio se refleja en los dos.

//**Datos de entrada:** `double` × 4 precios, `int` índice, `double` nuevo precio
import java.util.Scanner;

public class EJERCICIO007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        double[] precios = new double[4];

        System.out.println("Ingrese 4 precios:");

        for (int i = 0; i < precios.length; i++) {
            System.out.print("Precio " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

     
        double[] preciosAuditoria = precios;

      
        System.out.print("\nIngrese el índice a corregir (0 a 3): ");
        int indice = sc.nextInt();

        System.out.print("Ingrese el nuevo precio: ");
        double nuevoPrecio = sc.nextDouble();

        preciosAuditoria[indice] = nuevoPrecio;

       
        System.out.println("\n=== Arreglo original (precios) ===");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Índice " + i + ": " + precios[i]);
        }

        System.out.println("\n=== Arreglo auditoría (preciosAuditoria) ===");
        for (int i = 0; i < preciosAuditoria.length; i++) {
            System.out.println("Índice " + i + ": " + preciosAuditoria[i]);
        }

        System.out.println("\nExplicación:");
        System.out.println("Los arreglos en Java se manejan por REFERENCIA.");
        System.out.println("Al hacer preciosAuditoria = precios;");
        System.out.println("Ambos apuntan al mismo espacio en memoria.");
        System.out.println("Por eso, el cambio se refleja en los dos.");

        sc.close();
    }
}
