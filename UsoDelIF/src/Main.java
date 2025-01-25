import java.util.Scanner; //Se importa la referencia java.util.Scanner en donde nos permitira usar la clase Scanner para ingresar datos mediante el teclado
public class Main { // Clase
    public static void main(String[] args) {  // Iniciando la clase llamada Main la cual nos permite interactuar con la consola
        Scanner sc = new Scanner (System.in);  // Creacion de la clase
        System.out.print ("Ingresa un numero entero:"); //Impresion en la pantalla de del texto
        int entero = sc.nextInt(); // Guardamos el valor de la variable ingresada

        if (entero == 10) { // Creamos la condicion la cual se debe de cumplir
            System.out.print("El numero es igual a 10"); // Impresion en la pantalla de del texto si la condicion se cumple
        }
        else if (entero < 10){ // Creamos la condicion la cual se debe de cumplir
            System.out.print("El numero es menor a 10"); // Impresion en la pantalla de del texto si la condicion se cumple
        }
        else { //Condicion restante por default si las otras condiciones no se cumplen
            System.out.print("El numero es mayor a 10"); // Impresion en la pantalla de del texto si la condicion se cumple
        }


    }
}