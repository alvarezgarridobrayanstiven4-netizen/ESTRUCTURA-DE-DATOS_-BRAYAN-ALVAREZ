//5. El Inspector de Eficiencia (Duelo de Métodos) Algoritmos obligatorios: Selección vs Inserción Contexto:
//  Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para un caso 
// específico. Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados.
//  El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original). 
// Lógica de Conteo: i. En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones). 
// ii. En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno. 
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo
//  Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado. 
// Instrucciones de entrega: Cada ejercicio debe estar en su propio archivo .java dentro de la carpeta src . 
// Los nombres de las clases deben ser descriptivos (ej: Ejercicio1Podio.java ). 
// Incluir un encabezado con el nombre del estudiante y la explicación del algoritmo usado.

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] datos = new int[6];

        System.out.println("Ingrese 6 números:");

        for (int i = 0; i < 6; i++) {
            datos[i] = sc.nextInt();
        }

        int[] copia = datos.clone();

        int swaps = 0;
        int movimientos = 0;

        for (int i = 0; i < datos.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < datos.length; j++) {
                if (datos[j] < datos[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = datos[i];
                datos[i] = datos[min];
                datos[min] = temp;
                swaps++;
            }
        }

        for (int i = 1; i < copia.length; i++) {

            int clave = copia[i];
            int j = i - 1;

            while (j >= 0 && copia[j] > clave) {
                copia[j + 1] = copia[j];
                j--;
                movimientos++;
            }

            copia[j + 1] = clave;
        }

        System.out.println("\nIntercambios en Selección: " + swaps);
        System.out.println("Movimientos en Inserción: " + movimientos);

        sc.close();
    }
}