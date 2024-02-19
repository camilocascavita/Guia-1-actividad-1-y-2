import java.util.Scanner;

public class EdificioUniversidad {

   
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones por piso del edificio: ");
        int salonesPorPiso = scanner.nextInt();

        
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);

       
        int numeroPisos = calcularNumeroPisos(numeroSalones, salonesPorPiso);

       
        System.out.println("El número de salones del nuevo edificio es: " + numeroSalones);
        System.out.println("El número de pisos del nuevo edificio es: " + numeroPisos);

        scanner.close();
    }
}

