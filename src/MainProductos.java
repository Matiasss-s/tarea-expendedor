public class MainProductos {
    public static void main(String[] args) {
        Producto p1 = new CocaCola();
        Producto p2 = new Sprite();
        Producto p3 = new Fanta();
        Producto p4 = new Snickers();
        Producto p5 = new Super8();

        System.out.println(p1.getTipo() + " Precio: " + p1.getPrecio());
        System.out.println(p2.getTipo() + " Precio: " + p2.getPrecio());
        System.out.println(p3.getTipo() + " Precio: " + p3.getPrecio());
        System.out.println(p4.getTipo() + " Precio: " + p4.getPrecio());
        System.out.println(p5.getTipo() + " Precio: " + p5.getPrecio());
    }
}
