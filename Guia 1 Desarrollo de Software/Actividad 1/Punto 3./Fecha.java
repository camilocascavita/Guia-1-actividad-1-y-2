public class Fecha {
    private int año;
    private int mes;
    private int dia;

    
    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    
    public void mostrarFecha() {
        System.out.println("Fecha actual: " + dia + "/" + mes + "/" + año);
    }

    
    public static void main(String[] args) {
        
        Fecha fecha = new Fecha(2024, 2, 17);
        
        fecha.mostrarFecha();
    }
}
