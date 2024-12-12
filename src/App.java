public class App {
    public static void main(String[] args) {
        try {
            metodoLanzaExcepcion();
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static void metodoLanzaExcepcion() throws Exception {
        throw new Exception("Excepción lanzada desde el método.");
    }
}
