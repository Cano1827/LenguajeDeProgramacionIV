import java.util.Scanner; //Se importa la referencia java.util.Scanner en donde nos permitira usar la clase Scanner para ingresar datos mediante el teclado
public class Main { // Clase
    public static void main(String[] args) {  // Iniciando la clase llamada Main la cual nos permite interactuar con la consola
        Scanner sc = new Scanner (System.in);  // Creacion de la clase
        System.out.print ("\n1- Realizar una multiplicacion \n2- Realizar una suma \n3- Realizar una resta \n4- Realizar una división \nTeclea una opcion para realizar una de las siguentes opciones:  "); //Impresion en la pantalla de del texto
        int opcion = sc.nextInt(); // Guardamos el valor de la variable ingresada

        if (opcion == 1) { // En este bloque se puso la condicion de que si el numero es 1 la operacion a realizar seria la multiplicacion despues se creo una variable x para almacenar el valor entero ingresado y una variable y para igual despues almacenar su valor dado despues al finalizar se da la multiplicacion de ambos numeros
            System.out.print("Dame un valor para x= ");
            int x = sc.nextInt();
            System.out.print("Dame un valor para y= ");
            int y = sc.nextInt();
            System.out.print("El resultado de la multiplicacion es: " + (x * y));
        }
        else if (opcion == 2){ // En este bloque se puso la condicion de que si el numero es 2 la operacion a realizar seria la suma despues se creo una variable x para almacenar el valor entero ingresado y una variable y para igual despues almacenar su valor dado despues al finalizar se da la suma de ambos numeros
            System.out.print("Dame un valor para x= ");
            int x = sc.nextInt();
            System.out.print("Dame un valor para y= ");
            int y = sc.nextInt();
            System.out.print("El resultado de la suma es: " + (x + y));
        }
        else if (opcion == 3){ // En este bloque se puso la condicion de que si el numero es 3 la operacion a realizar seria la resta despues se creo una variable x para almacenar el valor entero ingresado y una variable y para igual despues almacenar su valor dado despues al finalizar se da la resta de ambos numeros
            System.out.print("Dame un valor para x= ");
            int x = sc.nextInt();
            System.out.print("Dame un valor para y= ");
            int y = sc.nextInt();
            System.out.print("El resultado de la resta es: " + (x - y));
        }
        else if (opcion == 4){ // En este bloque se puso la condicion de que si el numero es 4 la operacion a realizar seria la division despues se creo una variable x para almacenar el valor entero ingresado y una variable y para igual despues almacenar su valor dado despues al finalizar se da la division de ambos numeros
            System.out.print("Dame un valor para x= ");
            int x = sc.nextInt();
            System.out.print("Dame un valor para y= ");
            int y = sc.nextInt();
            System.out.print("El resultado de la división es: " + (x / y));
        }
    }
}
