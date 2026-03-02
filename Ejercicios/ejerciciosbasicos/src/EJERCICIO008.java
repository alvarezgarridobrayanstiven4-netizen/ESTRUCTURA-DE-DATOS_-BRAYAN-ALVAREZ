//### Ejercicio 8 — Copia real vs referencia
//Pide al usuario 3 calificaciones para llenar `notas[]`.
//Crea una **copia real** en `notasRespaldo[]` copiando elemento por elemento.
//Modifica `notas[0]` con un valor que el usuario ingrese.
//Muestra ambos arreglos y verifica que `notasRespaldo` **no cambió**.

//**Datos de entrada:** `double` × 3 notas, `double` nuevo valor para notas[0]

//**Salida esperada:**
//```
//notas[0]         = 4.5  ← cambió
//notasRespaldo[0] = 3.2  ← no cambió, es una copia independiente

import java.util.Scanner;

public class EJERCICIO8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        double[] notas = new double[3];

        System.out.println("Ingrese 3 notas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + i + ": ");
            notas[i] = sc.nextDouble();
        }

        
        double[] notasRespaldo = new double[3];

        for (int i = 0; i < notas.length; i++) {
            notasRespaldo[i] = notas[i];
        }

        
        System.out.print("\nIngrese nuevo valor para notas[0]: ");
        notas[0] = sc.nextDouble();

  
        System.out.println("\nResultados:");
        System.out.println("notas[0]         = " + notas[0] + "  ← cambió");
        System.out.println("notasRespaldo[0] = " + notasRespaldo[0] + "  ← no cambió, es una copia independiente");

        System.out.println("\nExplicación:");
        System.out.println("Aquí sí se creó un nuevo arreglo en memoria.");
        System.out.println("Se copiaron los valores uno por uno.");
        System.out.println("Por eso, al modificar notas[], no afecta notasRespaldo[].");

        sc.close();
    }
}
