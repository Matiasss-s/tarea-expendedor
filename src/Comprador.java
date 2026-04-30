/**
 * Clase que representa al comprador, el mismo intenta comprar y recibir vuelto de la Expendedora.
 */
public class Comprador {

    private Producto producto;
    private int vuelto;

    /**
     * Constructor del comprador.
     * Intenta omprar un producto con la moneda que se le dfa.
     * En caso de error, usamos exceptions y se mostrará el consola.
     * @param m moneda con la que paga
     * @param tipo es el tipo de producto que elige el comprador
     * @param expendedora maquina expendedora
     */
    public Comprador(Moneda m, TipoProducto tipo, Expendedora expendedora){
        this.producto = null;
        this.vuelto = 0;

        try{ // Con este try vamos a intentar comprar el producto
            producto = expendedora.comprarProd(m, tipo);
        } catch (PagoIncorrectoException e){
            System.out.println("Pago incorrecto");
        } catch (PagoInsuficienteException e){
            System.out.println("Pago Insuficiente");
        } catch (NoHayProductoException e){
            System.out.println("No hay producto disponible");
        }

        // Recupera todo el vuelto
        Moneda monedaVuelto;

        while ((monedaVuelto = expendedora.getVuelto()) != null){
            vuelto =  vuelto + monedaVuelto.getValor();
        }
    }

    /**
     * Retorna el produto que se compro
     * Si la compra es fallida, retorna null
     * @return producto o null
     */
    public Producto getProducto(){
        return producto;
    }

    /**
     * Retorna el vuelto total
     * @return vuelto en entero
     */
    public int getVuelto(){
        return vuelto;
    }
}
