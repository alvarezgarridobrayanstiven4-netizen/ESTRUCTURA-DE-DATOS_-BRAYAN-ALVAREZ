//2. Historial de Comandos de Terminal

//Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando anterior; flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

//- *La Clase Comando (Nodo):* Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio 
// (String — el path desde donde se ejecutó).
//- *El Problema:* El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" mueve el 
// cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el comando actual 
// (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
//- *Reto:* Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, 
// navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo 
// con el cursor marcado.

public class Historial {
    Comando cursor;

    
    public void agregar(String texto, boolean exitoso, String dir) {
        Comando nuevo = new Comando(texto, exitoso, dir);

        if (cursor == null) {
            cursor = nuevo;
        } else {
            Comando ultimo = cursor.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cursor;
            cursor.anterior = nuevo;
        }
    }

    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
    }

    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente;
        }
    }

   
    public void mostrarCursor() {
        if (cursor != null) {
            System.out.println("Cursor en: " + cursor.texto +
                               " | Dir: " + cursor.directorio +
                               " | Exitoso: " + cursor.exitoso);
        }
    }

    public void eliminarActual() {
        if (cursor == null) return;

        if (cursor.siguiente == cursor) {
            cursor = null;
            return;
        }

        Comando anterior = cursor.anterior;
        Comando siguiente = cursor.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        cursor = siguiente; 
    }

  
    public void mostrarHistorial() {
        if (cursor == null) return;

        Comando temp = cursor;
        do {
            if (temp == cursor) {
                System.out.println("👉 [" + temp.texto + "]");
            } else {
                System.out.println("   " + temp.texto);
            }
            temp = temp.siguiente;
        } while (temp != cursor);
    }
}