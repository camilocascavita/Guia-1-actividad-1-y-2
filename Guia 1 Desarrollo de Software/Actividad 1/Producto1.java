import java.util.Date;

public class Producto1 {
    private int codigo;
    private String nombre;
    private TipoProducto tipo;
    private Date fechaExpiracion;
    private String fabricante;
    private int cantidadInventario;
    private double precioUnitario;

    public Producto1(int codigo, String nombre, TipoProducto tipo, Date fechaExpiracion, String fabricante, int cantidadInventario, double precioUnitario){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.fabricante = fabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", fechaExpiracion=" + fechaExpiracion +
                ", fabricante='" + fabricante + '\'' +
                ", cantidadInventario=" + cantidadInventario +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}

