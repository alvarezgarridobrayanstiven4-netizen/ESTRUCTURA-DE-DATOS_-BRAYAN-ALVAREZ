public class App {
    public static void main(String[] args) {

        Galeria galeria = new Galeria();

        
        galeria.agregar("Foto 1", "2024-01-01");
        galeria.agregar("Foto 2", "2024-01-02");
        galeria.agregar("Foto 3", "2024-01-03");
        galeria.agregar("Foto 4", "2024-01-04");
        galeria.agregar("Foto 5", "2024-01-05");

        
        galeria.siguiente();
        galeria.siguiente();

        galeria.toggleFavorita();

      
        galeria.anterior();

        galeria.eliminarActual();

        galeria.mostrarGaleria();
    }
}