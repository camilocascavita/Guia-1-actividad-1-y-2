import java.util.Scanner;

public class DiaSiguiente {

    
    public static String obtenerDiaSiguiente(String dia) {
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        
        int indice = -1;
        for (int i = 0; i < diasSemana.length; i++) {
            if (diasSemana[i].equalsIgnoreCase(dia)) {
                indice = i;
                break;
            }
        }

      
        if (indice != -1) {
           
            int indiceSiguiente = (indice + 1) % diasSemana.length;
            return diasSemana[indiceSiguiente];
        } else {
            return "Día no válido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre de un día: ");
        String dia = scanner.nextLine();

        
        String diaSiguiente = obtenerDiaSiguiente(dia);

       
        System.out.println("El día siguiente a " + dia + " es " + diaSiguiente);

        scanner.close();
    }
}

