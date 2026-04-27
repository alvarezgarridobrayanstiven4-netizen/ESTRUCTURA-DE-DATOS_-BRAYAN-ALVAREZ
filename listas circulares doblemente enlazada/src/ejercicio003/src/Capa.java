public class Capa {
    String nombre;
    boolean visible;
    String tipo;
    Capa siguiente;
    Capa anterior;

    public Capa(String nombre, boolean visible, String tipo) {
        this.nombre = nombre;
        this.visible = visible;
        this.tipo = tipo;
        this.siguiente = this;
        this.anterior = this;
    }
}