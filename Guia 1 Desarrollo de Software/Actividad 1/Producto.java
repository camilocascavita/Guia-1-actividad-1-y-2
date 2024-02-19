
public class Producto {
    int edad=15;
    char par='#';
    String nombre= "FastRB";
    double precio=15.50;
    boolean valor=true;
   
    public static void main(String[] args) {
        Producto x = new Producto();
        System.out.println("edad: " + x.edad);
        System.out.println("caracter" + x.par);
        System.out.println("Nombre: " + x.nombre);
        System.out.println("el precio es: " + x.precio);
        System.out.println("el valor es" + x.valor);
    }
}