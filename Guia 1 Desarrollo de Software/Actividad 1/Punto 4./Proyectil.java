public class Proyectil {
    private double velocidad;
    private double angulo;

    
    public Proyectil(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }

    
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    
    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    
    public double calcularDistancia() {
        double anguloEnRadianes = Math.toRadians(angulo);
        double distancia = Math.pow(velocidad, 2) * Math.sin(2 * anguloEnRadianes) / 9.8;
        return distancia;
    }

   
    public static void main(String[] args) {
        
        Proyectil proyectil = new Proyectil(50.0, 45.0); // Velocidad de 50 m/s, ángulo de 45 grados
        
        
        double distanciaRecorrida = proyectil.calcularDistancia();
        System.out.println("La distancia recorrida por el proyectil es: " + distanciaRecorrida + " metros.");
    }
}
