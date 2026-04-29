public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException() {
        super("Error: El pago es nulo o inválido.");
    }
}