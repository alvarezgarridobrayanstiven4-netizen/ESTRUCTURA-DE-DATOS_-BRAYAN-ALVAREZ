//4. Galería de Fotos

//Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente, 
// volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde 
// la siguiente sin interrupciones.

//- *La Clase Foto (Nodo):* Debe contener titulo (String), fecha (String) y esFavorita (boolean).
//- *El Problema:* La galería mantiene un puntero actual a la foto que se está viendo. 
// Navegar con "siguiente" o "anterior" mueve ese puntero. Marcar como favorita simplemente alterna el 
// campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y mueve actual a la siguiente.
//- *Reto:* Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). 
// mostrarGaleria() recorre todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. 
// Simula: carga 5 fotos, avanza dos veces, marca la actual como favorita, retrocede una, elimina esa foto 
// y muestra el estado final de la galería.


public class Galeria {
    Foto actual;

    
    public void agregar(String titulo, String fecha) {
        Foto nueva = new Foto(titulo, fecha);

        if (actual == null) {
            actual = nueva;
        } else {
            Foto ultima = actual.anterior;

            ultima.siguiente = nueva;
            nueva.anterior = ultima;

            nueva.siguiente = actual;
            actual.anterior = nueva;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }

  
    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
        }
    }

   
    public void toggleFavorita() {
        if (actual != null) {
            actual.esFavorita = !actual.esFavorita;
        }
    }

    public void eliminarActual() {
        if (actual == null) return;

      
        if (actual.siguiente == actual) {
            actual = null;
            return;
        }

        Foto anterior = actual.anterior;
        Foto siguiente = actual.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        actual = siguiente;
    }

   
    public void mostrarGaleria() {
        if (actual == null) return;

        Foto temp = actual;
        do {
            String marcaActual = (temp == actual) ? "[▶]" : "   ";
            String favorita = temp.esFavorita ? "[★]" : "[ ]";

            System.out.println(marcaActual + " " + favorita + " " +
                               temp.titulo + " | " + temp.fecha);

            temp = temp.siguiente;
        } while (temp != actual);
    }
}