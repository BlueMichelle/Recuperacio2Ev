import java.util.ArrayList;

public class CarritoCompra {
    private ArrayList<Producto> productos;
    private double total;

    public CarritoCompra() {
        productos = new ArrayList<>();
        total = 0.0;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio() * producto.getCantidad();
        System.out.println(producto.getNombre() + " añadido al carrito. Cantidad: " + producto.getCantidad() + ". Precio total: $" + producto.getPrecio() * producto.getCantidad());
    }

    public void showProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto producto : productos) {
                System.out.println("- " + producto.getNombre() + " (Cantidad: " + producto.getCantidad() + ")");
            }
            System.out.println("Total: $" + total);
        }
    }

    public void clearCarrito() {
        productos.clear();
        total = 0.0;
        System.out.println("Carrito vaciado.");
    }
}

public class Tienda {
    public static void main(String[] args) {
        CarritoCompra carrito = new CarritoCompra();
        Producto leche = new Producto("Leche", 2.5, 1);
        Producto pan = new Producto("Pan", 1.0, 2);
        Producto huevos = new Producto("Huevos", 3.0, 1);
        carrito.addProducto(leche);
        carrito.addProducto(pan);
        carrito.addProducto(huevos);
        carrito.showProductos();
        
        carrito.clearCarrito();
        carrito.showProductos();
    }
}
