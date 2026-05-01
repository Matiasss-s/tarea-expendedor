import java.util.ArrayList;
import java.util.Collections;
/**
 * Clase principal que ejecuta pruebas automatizadas sobre el sistema de la máquina expendedora.
 * Demuestra compras exitosas, manejo de excepciones y ordenamiento de monedas.
 */
public class Maintotal {
    /**
     * Método ejecutable principal con los casos de prueba.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Expendedora exp = new Expendedora(1);

        // 1. Probar todos los productos (Compras exitosas)
        try {
            Comprador c1 = new Comprador(new Moneda1000(), TipoProducto.COCACOLA, exp);
            System.out.println("Comprado: " + c1.getProducto() + ", Vuelto: " + c1.getVuelto());

            Comprador c2 = new Comprador(new Moneda1000(), TipoProducto.SPRITE, exp);
            System.out.println("Comprado: " + c2.getProducto() + ", Vuelto: " + c2.getVuelto());

            Comprador c3 = new Comprador(new Moneda1000(), TipoProducto.FANTA, exp);
            System.out.println("Comprado: " + c3.getProducto() + ", Vuelto: " + c3.getVuelto());

            Comprador c4 = new Comprador(new Moneda500(), TipoProducto.SNICKERS, exp);
            System.out.println("Comprado: " + c4.getProducto() + ", Vuelto: " + c4.getVuelto());

            Comprador c5 = new Comprador(new Moneda500(), TipoProducto.SUPER8, exp);
            System.out.println("Comprado: " + c5.getProducto() + ", Vuelto: " + c5.getVuelto());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Probando Excepciones ---");

        // 2. Probar Excepciones
        try {
            Comprador err1 = new Comprador(null, TipoProducto.COCACOLA, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());

        }

        try {
            Comprador err2 = new Comprador(new Moneda100(), TipoProducto.SNICKERS, exp);
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());

        }

        try {
            Comprador err3 = new Comprador(new Moneda1000(), TipoProducto.COCACOLA, exp);
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());

        }


        System.out.println("\n--- Ordenando Monedas ---");

        ArrayList<Moneda> listaMonedas = new ArrayList<>();
        listaMonedas.add(new Moneda500());
        listaMonedas.add(new Moneda100());
        listaMonedas.add(new Moneda1000());

        System.out.println("Antes: " + listaMonedas);
        Collections.sort(listaMonedas);
        System.out.println("Despues: " + listaMonedas);
    }
}