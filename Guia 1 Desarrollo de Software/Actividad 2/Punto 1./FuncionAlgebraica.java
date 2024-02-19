public class FuncionAlgebraica {

    public static double calcularFuncion(double x, double y) {
        double resultado = x*x + 2*x*y + y*y;
        return resultado;
    }

    
    public static void main(String[] args) {
        
        double x = 3.0;
        double y = 4.0;
        double valorFuncion = calcularFuncion(x, y);
        System.out.println("El valor de la función f(" + x + ", " + y + ") es: " + valorFuncion);
    }
}
