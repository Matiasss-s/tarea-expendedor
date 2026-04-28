public class Bebida {
    /**
     * Clase abstracta que da molde a bebida
     */
    public abstract class Bebida extends Producto{

        public Bebida(TipoProducto tipo){
            super(tipo);
        }
    }
}
