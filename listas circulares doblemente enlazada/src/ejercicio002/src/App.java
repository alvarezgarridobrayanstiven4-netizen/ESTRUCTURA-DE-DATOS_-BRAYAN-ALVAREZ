public class App {
    public static void main(String[] args) {

        Historial h = new Historial();

        
        h.agregar("ls", true, "/home");
        h.agregar("cd documentos", true, "/home");
        h.agregar("mkdir prueba", true, "/home/documentos");
        h.agregar("rm archivo.txt", false, "/home/documentos");
        h.agregar("pwd", true, "/home/documentos");

       
        h.arriba();
        h.arriba();
        h.arriba();

      
        h.eliminarActual();

        h.abajo();

        h.mostrarHistorial();
    }
}