//## Tema 2 — Variables por referencia

//### Ejercicio 6 — Demostración por valor
//Pide al usuario dos números enteros `a` y `b`. Asigna `b = a`, luego pide un nuevo valor para `b`.
//Imprime `a` y `b` después del cambio y explica con un mensaje en consola por qué `a` no cambió.

//**Datos de entrada:** `int` a, `int` b (dos veces)

//**Salida esperada:**
//```
//a = 10  ← no cambió, se pasó por VALOR
//b = 99  ← esta sí cambió

import java.util.Scanner;

public class EJERCICIO006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el valor inicial de b: ");
        int b = sc.nextInt();

       
        b = a;

       
        System.out.print("Ingrese un nuevo valor para b: ");
        b = sc.nextInt();

       
        System.out.println("\na = " + a + "  ← no cambió, se pasó por VALOR");
        System.out.println("b = " + b + "  ← esta sí cambió");

        System.out.println("\nExplicación:");
        System.out.println("En Java, los tipos primitivos como int se pasan por VALOR.");
        System.out.println("Esto significa que cuando hicimos b = a, se copió el valor de a en b.");
        System.out.println("Luego, al cambiar b, no afecta a porque son variables independientes.");

        sc.close();
    }
}
