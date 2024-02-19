import java.util.Scanner;

public class AreasCirculares {
    
    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * radio * radio;
        return area;
    }

    
    public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeno) {
        double areaGrande = calcularAreaCirculo(radioGrande);
        double areaPequeno = calcularAreaCirculo(radioPequeno);
        double areaCorona = areaGrande - areaPequeno;
        return areaCorona;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el radio del círculo grande (R): ");
        double radioGrande = scanner.nextDouble();

        System.out.print("Ingrese el radio del círculo pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

       
        double areaCorona = calcularAreaCoronaCircular(radioGrande, radioPequeno);

        
        System.out.println("El área de la corona circular es: " + areaCorona);

        scanner.close();
    }
}

