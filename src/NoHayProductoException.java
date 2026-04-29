public class NoHayProductoException extends Exception {
    public NoHayProductoException() {
        super("Error: No quedan unidades de este producto.");
    }
}