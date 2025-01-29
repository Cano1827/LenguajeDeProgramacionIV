import java.util.Scanner; //Se importa la referencia java.util.Scanner que permite instanciar la clase Scanner pra ingresar datos por telado

//Clase - Objeto
public class Main { //Iniciando la clase llamada Main la cual permite interactuar con la consola

    //Metodo procedimiento
    public static void main(String[] args) { // Entra el metodo Main el cual esta encapsulado dentro de nuestra clase Main
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc= new Scanner (System.in); //Creacion de un onjeto
        System.out.println ("Ingresa 3 datos numerico y al ultimo obten el resultado de la multiplicacion"); // Impresion de un texto en pantalla
        System.out.print ("Ingresa el primer dato: "); // Impresion de un texto en pantalla
        int dato1 = sc.nextInt(); //Se crea el valor de tipo entero y se esta almacenando un dato creado por teclado

        System.out.print ("Ingresa el segundo dato: "); // Impresion de un texto en pantalla
        int dato2 = sc.nextInt(); //Se crea el valor de tipo entero y se esta almacenando un dato creado por teclado

        System.out.print ("Ingresa el tercer dato: "); // Impresion de un texto en pantalla
        int dato3 = sc.nextInt(); //Se crea el valor de tipo entero y se esta almacenando un dato creado por teclado

        System.out.print("El resultado de la operacion es: " + dato1*dato2*dato3); // Impresion de un texto en pantalla y imprime el valor de la operacion

    }
}