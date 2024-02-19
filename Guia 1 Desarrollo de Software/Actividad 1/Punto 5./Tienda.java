import java.util.Date;

public class Tienda{
    
    private String nombreTienda;
    private String direccion;
    private String telefono;

    
    public Tienda(String nombreTienda, String direccion, String telefono) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
    static class Producto {
        
        private int codigo;
        private String nombre;
        private String tipoProducto;
        private Date fechaExpiracion;
        private String fabricante;
        private int cantidadInventario;
        private double precioUnitario;

        
        public Producto(int codigo, String nombre, String tipoProducto, Date fechaExpiracion, String fabricante,
                int cantidadInventario, double precioUnitario) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.tipoProducto = tipoProducto;
            this.fechaExpiracion = fechaExpiracion;
            this.fabricante = fabricante;
            this.cantidadInventario = cantidadInventario;
            this.precioUnitario = precioUnitario;
        }

        
        public void mostrarInformacion() {
            System.out.println("Código: " + codigo);
            System.out.println("Nombre: " + nombre);
            System.out.println("Tipo de producto: " + tipoProducto);
            System.out.println("Fecha de expiración: " + fechaExpiracion);
            System.out.println("Fabricante: " + fabricante);
            System.out.println("Cantidad en inventario: " + cantidadInventario);
            System.out.println("Precio unitario: " + precioUnitario);
        }
    }

   
    public static void main(String[] args) {
        
        Tienda tienda = new Tienda("Mi Tienda", "Calle Principal 123", "123-456-7890");

        
        Tienda.Producto producto1 = new Tienda.Producto(1, "Leche", "LÁCTEO", new Date(), "Fabricante A", 100, 2.5);
        Tienda.Producto producto2 = new Tienda.Producto(2, "Carne", "CÁRNICO", new Date(), "Fabricante B", 50, 5.75);
        Tienda.Producto producto3 = new Tienda.Producto(3, "Manzana", "FRUTA", new Date(), "Fabricante C", 200, 1.0);
        Tienda.Producto producto4 = new Tienda.Producto(4, "Frijoles", "ENLATADO", new Date(), "Fabricante D", 75, 1.25);
        
        
        System.out.println("Información del producto 1:");
        producto1.mostrarInformacion();
        System.out.println("\nInformación del producto 2:");
        producto2.mostrarInformacion();
        System.out.println("\nInformación del producto 3:");
        producto3.mostrarInformacion();
        System.out.println("\nInformación del producto 4:");
        producto4.mostrarInformacion();
    }
}
