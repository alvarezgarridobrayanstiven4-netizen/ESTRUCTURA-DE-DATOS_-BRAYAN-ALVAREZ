import java.util.Scanner;

public class parcialE1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] pesos = new int[7];

       
        for (int i = 0; i < 7; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (pesos[i] < pesos[j]) {
                    int aux = pesos[i];
                    pesos[i] = pesos[j];
                    pesos[j] = aux;
                }
            }
        }

       
        System.out.println("\n------- Pesos -------");
        System.out.print("[");

        for (int i = 0; i < pesos.length; i++) {
            System.out.print(pesos[i]);
            if (i < pesos.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        
        System.out.print("\n\nPeso a buscar: ");
        int buscar = sc.nextInt();
        boolean existe = false;

        for (int i = 0; i < 7; i++) {
            if (pesos[i] == buscar) {
                System.out.println("Encontrado en posición: " + i);
                existe = true;
            }
        }

        if (!existe) {
            System.out.println("No encontrado");
        }

       
        System.out.println("Peso máximo: " + pesos[0]);

        sc.close();
    }
}