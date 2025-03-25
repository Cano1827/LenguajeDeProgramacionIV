import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Multiplicación \n2. Suma \n3. Resta \n4. División \nIngrese selección de operación deseada: ");
        String option = sc.nextLine();
        switch (option) {
            // En este caso si el usuario elige la olcion de Multiplicacion el usuario almacenara dos valores en dos variables diferentes en un sc.nextInt y despues dara el resultado de la multiplicacion
            case "Multiplicacion":
                System.out.print("Dame un valor para x= ");
                int x = sc.nextInt();
                System.out.print("Dame un valor para y= ");
                int y = sc.nextInt();
                System.out.print("El resultado de la multiplicacion es: " + (x * y));
                break;
            // En este caso si el usuario elige la olcion de Suma el usuario almacenara dos valores en dos variables diferentes en un sc.nextInt y despues dara el resultado de la suma
            case "Suma":
                System.out.print("Dame un valor para x= ");
                int a = sc.nextInt();
                System.out.print("Dame un valor para y= ");
                int b = sc.nextInt();
                System.out.print("El resultado de la suma es: " + (a + b));
                break;
            // En este caso si el usuario elige la olcion de Resta el usuario almacenara dos valores en dos variables diferentes en un sc.nextInt y despues dara el resultado de la resta
            case "Resta":
                System.out.print("Dame un valor para x= ");
                int c = sc.nextInt();
                System.out.print("Dame un valor para y= ");
                int d = sc.nextInt();
                System.out.print("El resultado de la resta es: " + (c - d));
                break;
            // En este caso si el usuario elige la olcion de Division el usuario almacenara dos valores en dos variables diferentes en un sc.nextInt y despues dara el resultado de la division
            case "Division":
                System.out.print("Dame un valor para x= ");
                int e = sc.nextInt();
                System.out.print("Dame un valor para y= ");
                int f = sc.nextInt();
                System.out.print("El resultado de la división es: " + (e / f));
                break;
        }
    }
}