import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a;
        int b1;
        int b2;
        int b3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero de 3 digitos: ");
        a = scanner.nextInt();

        scanner.close();

        System.out.print("El numero al revés es: ");
        b3 = a % 10;
        System.out.print(b3);
        b2 = (a % 100) / 10;
        System.out.print(b2);
        b1 = a % 1000 / 100;
        System.out.print(b1);
    }
}