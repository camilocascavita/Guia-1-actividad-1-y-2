import java.util.Scanner;

public class GastosPedro {
    
    public static double calcularGastoArriendo(double sueldo) {
        double porcentajeArriendo = 0.4;
        return sueldo * porcentajeArriendo;
    }

    
    public static double calcularGastoComida(double sueldo) {
        double porcentajeComida = 0.15;
        return sueldo * porcentajeComida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

       
        double gastoArriendo = calcularGastoArriendo(sueldo);

        
        double gastoComida = calcularGastoComida(sueldo);

        
        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        
        System.out.println("El gasto en arriendo es: " + gastoArriendo);
        System.out.println("El gasto en comida es: " + gastoComida);
        System.out.println("El dinero restante es: " + dineroRestante);

        scanner.close();
    }
}



