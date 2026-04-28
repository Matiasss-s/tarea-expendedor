/**
 * Enum que representa los tipos de productos disponibles con su precio.
 */
public enum TipoProducto {

    Cocacola(500),
    Sprite(500),
    Fanta(500),
    Super8(300),
    Snickers(300),

    private int precio;

    /**
     * Constructor del enum
     * @param precio precio del producto.
     */
    TipoProducto(int precio){
        this.precio = precio;
    }
    /**
     * Retorna el precio del producto
     * @return precio en entero
     */
    public int getPrecio(){
        return precio;
    }
}
