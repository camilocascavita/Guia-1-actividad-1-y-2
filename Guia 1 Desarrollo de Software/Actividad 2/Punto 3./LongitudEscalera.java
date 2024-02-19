import java.lang.Math;

public class LongitudEscalera {
    public static double calcularLongitudEscalera(double altura, double angulo) {
       
        double anguloEnRadianes = Math.toRadians(angulo);

       
        double longitudEscalera = altura / Math.sin(anguloEnRadianes);

        return longitudEscalera;
    }

    public static void main(String[] args) {
        
        double altura = 5.0; // Altura de la escalera
        double angulo = 45.0; // Ángulo de inclinación en grados

       
        double longitud = calcularLongitudEscalera(altura, angulo);

        
        System.out.println("La longitud de la escalera es: " + longitud);
    }
}

