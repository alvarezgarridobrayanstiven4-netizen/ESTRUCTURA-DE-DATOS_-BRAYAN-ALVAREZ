//### Ejercicio 13 — Buscar en lista (lineal)
//Pide al usuario 5 nombres de empleados para llenar un arreglo.
//Luego pide el nombre que desea buscar.
//Recorre el arreglo y muestra si el empleado fue encontrado y en qué posición.

//**Datos de entrada:** `String` × 5 nombres, `String` nombre a buscar

//**Salida esperada:**
//```
//"María" encontrada en la posición 2.
//```

import java.util.Scanner;

public class EJERCICIO13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[5];

        
        System.out.println("Ingrese 5 nombres de empleados:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
        }

        
        System.out.print("\nIngrese el nombre a buscar: ");
        String buscar = sc.nextLine();

        boolean encontrado = false;
        int posicion = -1;

      
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

      
        if (encontrado) {
            System.out.println("\"" + buscar + "\" encontrada en la posición " + posicion + ".");
        } else {
            System.out.println("Empleado no encontrado en la lista.");
        }

        sc.close();
    }
}
