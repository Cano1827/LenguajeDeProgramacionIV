import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            try{
                Scanner sc = new Scanner(System.in);

                Calculadora _calculadora = new Calculadora();

                System.out.print ("\n1- Realizar una Suma \n2- Realizar una Resta \n3- Realizar una Multiplicacion \n4- Realizar una división \n5- Sacar un Perimetro \n6- Sacar una Circunferencia \n7- Sacar un Radio \nTeclea una opcion para realizar una de las siguentes opciones:  ");
                int opcion = sc.nextInt();
                double valorA;
                double valorB;
                double valorC;
            if (opcion == 1) {
                System.out.print("Ingresa el primer valor: ");
                valorA = sc.nextDouble();
                System.out.print("Ingresa el segundo valor: ");
                valorB = sc.nextDouble();
                System.out.print("El resultado de la suma es igual a: " + _calculadora.Suma(valorA, valorB));
            }
            else if (opcion == 2) {
                System.out.print("Ingresa el primer valor: ");
                valorA = sc.nextDouble();
                System.out.print("Ingresa el segundo valor: ");
                valorB = sc.nextDouble();
                System.out.print("El resultado de la resta es igual a: " + _calculadora.Resta(valorA, valorB));
            }
            else if (opcion == 3) {
                System.out.print("Ingresa el primer valor: ");
                valorA = sc.nextDouble();
                System.out.print("Ingresa el segundo valor: ");
                valorB = sc.nextDouble();
                System.out.print("El resultado de la multiplicacion es igual a: " + _calculadora.Multiplicacion(valorA, valorB));
            }
            else if (opcion == 4) {
                System.out.print("Ingresa el primer valor: ");
                valorA = sc.nextDouble();
                System.out.print("Ingresa el segundo valor: ");
                valorB = sc.nextDouble();
                System.out.print("El resultado de la Division es igual a: " + _calculadora.Division(valorA, valorB));
            }
            else if (opcion == 5) {
                System.out.print("Ingresa el primer valor: ");
                valorA = sc.nextDouble();
                System.out.print("Ingresa el segundo valor: ");
                valorB = sc.nextDouble();
                System.out.print("Ingresa el tercer valor: ");
                valorC = sc.nextDouble();
                System.out.print("El resultado del Perimetro es igual a: " + _calculadora.Perimetro(valorA, valorB, valorC));
            }
            else if (opcion == 6) {
                System.out.print("Ingresa el primer valor: ");
                valorA = sc.nextDouble();
                System.out.print("El resultado de la Circunferencia es igual a: " + _calculadora.Circunferencia(valorA));
            }
            else if (opcion == 7) {
                System.out.print("Ingresa el primer valor: ");
                valorA = sc.nextDouble();
                System.out.print("El resultado del Radio es igual a: " + _calculadora.Radio(valorA));
            }
            else {
                System.out.print("Opcion no Valida ");
            }
            } catch (Exception e) {
                System.out.println (e.getMessage());
                }
            }
        }

