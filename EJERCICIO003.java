//### Ejercicio 3 — Promedio de notas
//Pide al usuario su nombre y 4 notas de un curso. Calcula el promedio y determina si aprobó (promedio >= 3.0).

//**Datos de entrada:**
//- `String` nombre
//- `double` nota1, nota2, nota3, nota4

//**Salida esperada:**
//```
//Estudiante: Carlos
//Promedio  : 3.45
//Estado    : APROBADO
//```

//> **Pista:** usa una variable `boolean aprobado = promedio >= 3.0;` para el estado.

import java.util.Scanner;

public class EJERCICIO3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Ingrese la nota 4: ");
        double nota4 = sc.nextDouble();

       
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        boolean aprobado = promedio >= 3.0;

        
        System.out.println("\nEstudiante: " + nombre);
        System.out.printf("Promedio  : %.2f\n", promedio);

        if (aprobado) {
            System.out.println("Estado    : APROBADO");
        } else {
            System.out.println("Estado    : REPROBADO");
        }

        sc.close();
    }
}


