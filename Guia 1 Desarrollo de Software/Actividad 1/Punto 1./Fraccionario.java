public class Fraccionario {
    private int numerador;
    private int denominador;
    

public Fraccionario (int numerador, int denominador) {
    this.numerador = numerador;
    if (denominador !=0) {
        this.denominador = denominador; 
    } else {
        System.out.println("el denominador tiene que ser diferente de cero, se le asignara un valor por defecto 1");
        this.denominador = 1;
    }
}

public int getNumerador () {
    return numerador;
}

public void setNumerador(int numerador){
    this. numerador = numerador;
}

public void setDenominador(int denominador){
    if (denominador != 0){
        this.denominador = denominador;
    } else {
        System.err.println("El denominador tiene que ser un numero diferente de cero, no se realizara un cambio");
    }
}

public String toString (){
    return numerador + "/" + denominador;
}

public double valorDecimal (){
    return (double) numerador / denominador;
}

public void simplificar() {
    int mcd = calcularMCD(numerador, denominador);
    numerador /= mcd;
    denominador /= mcd;
}

private int calcularMCD(int a, int b){
    while (b != 0) {
        int temp = b;
        b = a% b;
        a = temp;
    }
    return a;
        
    }
} 
