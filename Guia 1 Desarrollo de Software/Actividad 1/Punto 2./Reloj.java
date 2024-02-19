public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos(){
        return minutos;
    }

    public int getSegundos(){
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void mostrarHora (){
        System.out.println("Hora Actual: " + horas + ":" + minutos + ":" + segundos);
    } 
}
