//### Ejercicio 15 — Árbol de decisiones (no lineal)
//Construye el siguiente árbol de decisiones para clasificar un número ingresado:

//```
//          ¿Número > 0?
//          /           \
//        Sí             No
//   ¿Par o Impar?    ¿Es cero?
//   /         \       /     \
//  Par        Impar  Sí      No
//                  (Cero) (Negativo)
//```

//Pide al usuario un número entero. Navega el árbol para clasificarlo como:
//**Par positivo**, **Impar positivo**, **Cero** o **Negativo**.

//> Implementa el árbol con nodos que tengan `String descripcion` e hijos izquierdo/derecho.

import java.util.Scanner;

class Nodo {
    String descripcion;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(String descripcion) {
        this.descripcion = descripcion;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class EJERCICIO15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        Nodo raiz = new Nodo("¿Número > 0?");
        raiz.izquierdo = new Nodo("¿Par o Impar?");
        raiz.derecho = new Nodo("¿Es cero?");

        raiz.izquierdo.izquierdo = new Nodo("Par positivo");
        raiz.izquierdo.derecho = new Nodo("Impar positivo");

        raiz.derecho.izquierdo = new Nodo("Cero");
        raiz.derecho.derecho = new Nodo("Negativo");

     
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        Nodo actual = raiz;

        
        if (numero > 0) {
            actual = actual.izquierdo;

            if (numero % 2 == 0) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }

        } else {
            actual = actual.derecho;

            if (numero == 0) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }

        
        System.out.println("\nClasificación: " + actual.descripcion);

        sc.close();
    }
}