//3. Editor de Capas (Diseño Gráfico)

//Los editores gráficos organizan el diseño en capas. El usuario navega a la capa superior (siguiente) o inferior (anterior)
//  y puede ocultar o mostrar cada capa. La estructura es circular: después de la capa más alta vuelve a la más baja.

//- *La Clase Capa (Nodo):* Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
//- *El Problema:* El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario puede moverse entre capas, 
// alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
//- *Reto:* Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). 
// mostrarCapas() imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible. Simula: crea 4 capas, 
// activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final.

public class EditorCapas {
    Capa capaActiva;

    public void agregar(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);

        if (capaActiva == null) {
            capaActiva = nueva;
        } else {
            Capa ultima = capaActiva.anterior;

            ultima.siguiente = nueva;
            nueva.anterior = ultima;

            nueva.siguiente = capaActiva;
            capaActiva.anterior = nueva;
        }
    }

   
    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

   
    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }

    
    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.visible = !capaActiva.visible;
        }
    }

    public void eliminarActiva() {
        if (capaActiva == null) return;

       
        if (capaActiva.siguiente == capaActiva) {
            capaActiva = null;
            return;
        }

        Capa anterior = capaActiva.anterior;
        Capa siguiente = capaActiva.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        capaActiva = siguiente; 
    }

  
    public void mostrarCapas() {
        if (capaActiva == null) return;

        Capa temp = capaActiva;
        do {
            String marca = (temp == capaActiva) ? "[✓]" : "[ ]";
            String vis = temp.visible ? "Visible" : "Oculta";

            System.out.println(marca + " " + temp.nombre +
                               " | Tipo: " + temp.tipo +
                               " | " + vis);

            temp = temp.siguiente;
        } while (temp != capaActiva);
    }
}