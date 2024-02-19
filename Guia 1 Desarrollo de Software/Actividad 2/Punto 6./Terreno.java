import java.util.Scanner;

public class Terreno {
    
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

   
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        return ladoA + ladoB + ladoC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el lado A del terreno: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese el lado B del terreno: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese el lado C del terreno: ");
        double ladoC = scanner.nextDouble();

       
        double baseTriangulo = ladoA;
        double alturaTriangulo = ladoB;
        double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);

       
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        
        System.out.println("El área del terreno es: " + areaTriangulo);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);

        scanner.close();
    }
}

