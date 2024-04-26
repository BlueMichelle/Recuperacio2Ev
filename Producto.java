class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

class CarritoCompra {
    private ArrayList<Producto> productos;
    private double total;

    public CarritoCompra() {
        productos = new ArrayList<>();
        total = 0.0;
    }

    // Resto de la lógica del carrito...
}

public class Tienda {
    public static void main(String[] args) {
        CarritoCompra carrito = new CarritoCompra();
        Producto leche = new Producto("Leche", 2.5, 1);
        Producto pan = new Producto("Pan", 1.0, 2);
        Producto huevos = new Producto("Huevos", 3.0, 1);

        carrito.agregarProducto(leche);
        carrito.agregarProducto(pan);
        carrito.agregarProducto(huevos);

        carrito.mostrarProductos();
    }
}
