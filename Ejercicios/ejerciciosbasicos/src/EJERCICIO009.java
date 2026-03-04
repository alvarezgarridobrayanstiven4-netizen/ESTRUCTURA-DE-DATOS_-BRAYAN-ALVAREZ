//### Ejercicio 9 — String inmutable
//Pide al usuario su nombre. Asigna `alias = nombre`. Pide un nuevo alias.
//Muestra que `nombre` no cambió y explica la inmutabilidad de `String` con un mensaje en consola.

//**Datos de entrada:** `String` nombre, `String` nuevo alias

import java.util.Scanner;

public class EJERCICIO009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        
        String alias = nombre;

        System.out.print("Ingrese un nuevo alias: ");
        alias = sc.nextLine();

       
        System.out.println("\nResultado:");
        System.out.println("nombre = " + nombre + "  ← no cambió");
        System.out.println("alias  = " + alias + "  ← cambió");

        System.out.println("\nExplicación:");
        System.out.println("En Java, los objetos String son INMUTABLES.");
        System.out.println("Cuando hicimos alias = nombre, ambos apuntaban al mismo texto.");
        System.out.println("Pero al cambiar alias, Java creó un nuevo objeto String.");
        System.out.println("Por eso nombre no se modificó.");

        sc.close();
    }
}
