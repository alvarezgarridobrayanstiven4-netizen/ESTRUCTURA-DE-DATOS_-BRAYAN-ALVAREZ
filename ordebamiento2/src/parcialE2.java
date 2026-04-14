import java.util.Scanner;

class Producto {
    int sku;
    String nombre;
    int stock;

    public Producto(int sku, String nombre, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.stock = stock;
    }
}

public class parcialE2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[5];

   
        for (int i = 0; i < 5; i++) {
            System.out.println("\nProducto " + (i + 1));

            System.out.print("SKU: ");
            int sku = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Stock: ");
            int stock = sc.nextInt();

            productos[i] = new Producto(sku, nombre, stock);
        }

      
        for (int i = 1; i < productos.length; i++) {
            Producto actual = productos[i];
            int j = i - 1;

            while (j >= 0 && productos[j].sku > actual.sku) {
                productos[j + 1] = productos[j];
                j--;
            }
            productos[j + 1] = actual;
        }
    
        System.out.println("\n-------------------------- PRODUCTOS POR SKU --------------------------");
        for (Producto p : productos) {
            System.out.print("SKU " + p.sku + ": " + p.nombre + " | ");
        }

        System.out.print("\n\nIngrese SKU a buscar: ");
        int buscar = sc.nextInt();

        int inicio = 0, fin = productos.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (productos[medio].sku == buscar) {
                System.out.println("Producto: " + productos[medio].nombre +
                                   " | Stock: " + productos[medio].stock);
                encontrado = true;
                break;
            } else if (buscar < productos[medio].sku) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado");
        }

        int totalStock = 0;
        for (Producto p : productos) {
            totalStock += p.stock;
        }

        System.out.println("\nTotal de unidades en stock: " + totalStock);

        sc.close();
    }
}