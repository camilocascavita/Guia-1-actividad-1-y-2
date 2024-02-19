import java.util.Scanner;

public class Paseo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número de sillas en un bus: ");
        int sillasPorBus = scanner.nextInt();

        
        System.out.print("Ingrese el número de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();

        System.out.print("Ingrese el número de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();

        
        int totalSillas = estudiantesGordos * 2 + estudiantesFlacos;

        
        int busesNecesarios = (int) Math.ceil((double) totalSillas / sillasPorBus);

        
        System.out.println("Se necesitan alquilar " + busesNecesarios + " buses para llevar a todos los estudiantes.");
        
        scanner.close();
    }
}
