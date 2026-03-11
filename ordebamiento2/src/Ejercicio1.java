//1. El Podio de la Competencia Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort) Contexto: 
// Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron 
// las medallas. Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron 
// (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor. Lógica de Selección: 
// El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio. 
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, 
// mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de corredores: ");
        int n = sc.nextInt();

        double[] t = new double[n];

        for(int i=0;i<n;i++){
            System.out.print("Tiempo corredor "+(i+1)+": ");
            t[i]=sc.nextDouble();
        }

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++)
                if(t[j]<t[min]) min=j;

            double aux=t[i];
            t[i]=t[min];
            t[min]=aux;
        }

        System.out.println("\nOrdenados:");
        for(double x:t) System.out.print(x+" ");

        if(n>=3){
            System.out.println("\nOro: "+t[0]);
            System.out.println("Plata: "+t[1]);
            System.out.println("Bronce: "+t[2]);
        }
    }
}