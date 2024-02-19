import java.util.Scanner;

public class OperacionesAritmeticas {

    
    public static double calcularOperacion(double num1, double num2, String operador) {
        double resultado = 0;

        
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            case "%":
                resultado = num1 % num2;
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Error: Operador no válido.");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();

       
        double resultado = calcularOperacion(num1, num2, operador);

        
        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}

