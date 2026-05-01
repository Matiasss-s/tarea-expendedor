import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Expendedora exp = new Expendedora(2);

        while (true) {
            System.out.println("\n=== MÁQUINA EXPENDEDORA ===");
            System.out.println("1) CocaCola ($500)");
            System.out.println("2) Sprite ($500)");
            System.out.println("3) Fanta ($500)");
            System.out.println("4) Snickers ($300)");
            System.out.println("5) Super8 ($300)");
            System.out.println("0) Salir");
            System.out.print("Seleccione producto: ");

            int seleccion = sc.nextInt();

            if (seleccion == 0) {
                System.out.println("Cerrando sistema...");
                break;
            }

            TipoProducto tipo = null;
            switch (seleccion) {
                case 1: tipo = TipoProducto.COCACOLA; break;
                case 2: tipo = TipoProducto.SPRITE; break;
                case 3: tipo = TipoProducto.FANTA; break;
                case 4: tipo = TipoProducto.SNICKERS; break;
                case 5: tipo = TipoProducto.SUPER8; break;
                default:
                    System.out.println("Selección no válida.");
                    continue;
            }

            System.out.print("Ingrese valor de moneda (100, 500, 1000) o 0 para nula: ");
            int valor = sc.nextInt();

            Moneda m = null;
            if (valor == 100) m = new Moneda100();
            else if (valor == 500) m = new Moneda500();
            else if (valor == 1000) m = new Moneda1000();

            Comprador comp = new Comprador(m, tipo, exp);

            if (comp.getProducto() != null) {
                System.out.println("Compra exitosa.");
            }
            System.out.println("Vuelto entregado: $" + comp.getVuelto());
        }
    }
}