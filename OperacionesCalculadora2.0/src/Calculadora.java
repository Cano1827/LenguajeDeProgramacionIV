import static java.lang.Math.PI;

public class Calculadora {
    public double resultado;
    public double valorA;
    public double valorB;
    public double Perimetro;
    public double Circunferencia;
    public double Radio;

    public double Suma(double _valorA, double _valorB){
        valorA = _valorA;
        valorB = _valorB;
        return resultado = valorA + valorB;
    }
    public double Resta(double _valorA, double _valorB){
        valorA = _valorA;
        valorB = _valorB;
        return resultado = valorA - valorB;
    }
    public double Multiplicacion(double _valorA, double _valorB){
        valorA = _valorA;
        valorB = _valorB;
        return resultado = valorA * valorB;
    }
    public double Division(double _valorA, double _valorB){
        valorA = _valorA;
        valorB = _valorB;
        return resultado = valorA / valorB;
    }
    public double Perimetro(double _valorA, double _valorB, double _valorC){
        return Perimetro = _valorA + _valorB + _valorC;
    }
    public double Circunferencia(double _valorA){
        return Circunferencia = _valorA * PI;
    }
    public double Radio(double _valorA){
        return Radio = _valorA / 2;
    }
}

