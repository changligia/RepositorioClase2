import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //ex4Item1();
        //ex4Item2();
        ex4Item3();
    }

    //E4.1
    static void ex4Item1() {
        int a; //definimos la variable a leer
        int i; //definimos el iterador
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero:");
        a = scanner.nextInt();

        scanner.close();

        for (i = 0; i < a; i++) {
            if (i % 3 == 0) {
                System.out.println(" i: " + i);
            }
        }
    }

    //E4.2
    static void ex4Item2() {
        int a; //definimos la variable a leer
        int i; //definimos el iterador
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero:");
        a = scanner.nextInt();
        scanner.close();

        for (i = 0; i < a; i++) {
            if (i % 5 == 0) {
                System.out.println(" i: " + i);
            }
        }
    }

    //E4.3
    static void ex4Item3() {
        int a; //definimos la variable a leer
        int i; //definimos el iterador
        int j = 0; //definimos varible j para determinar si un numero es primo o no
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero:");
        a = scanner.nextInt();

        scanner.close();

        for (i = 0; i <= a; i++) {
            if (a % 1 != 2) {
                j++;
            }
        }
        if (j > 2){
            System.out.println("Si es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}
