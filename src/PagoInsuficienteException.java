public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException() {
        super("Error: El dinero entregado no es suficiente.");
    }
}