//4. Control de Acceso (Gimnasio) Un gimnasio tiene una lista de códigos de acceso 
// de los socios que pagaron la mensualidad. La lista está **ordenada de menor a mayor**. 
// - **El Problema:** Cuando un socio digita su código, 
// el sistema debe validar si el código está en la lista de "pagos al día". 
// Si no está, se le niega la entrada.
//  - **Algoritmo a usar:** **Búsqueda Binaria**. 
// Es eficiente para buscar códigos numéricos en una lista que ya está organizada.



import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] codigos = {111, 222, 333, 444, 555}; 

        System.out.print("Ingrese su código de acceso: ");
        int codigoIngresado = sc.nextInt();

        int inicio = 0;
        int fin = codigos.length - 1;
        boolean permitido = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (codigos[medio] == codigoIngresado) {
                permitido = true;
                break;
            } else if (codigoIngresado < codigos[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        if (permitido) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        sc.close();
    }
}

