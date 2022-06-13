import java.util.Scanner;

//Ejercicio2
public class Ejercicio2 {
    public static void main(String[] args) {
        //ex2Item1();
        ex2Item2();
    }

    //E2.1
    static void ex2Item1() {
        int numero1;
        int numero2;
        int numero3;

        System.out.print("Dime el numero 1: ");
        Scanner scanner = new Scanner(System.in);
        numero1 = scanner.nextInt();
        System.out.print("Ahora Dime el numero 2: ");
        numero2 = scanner.nextInt();
        System.out.print("Ahora Dime el numero 3: ");
        numero3 = scanner.nextInt();
        scanner.close();

        System.out.println("La suma de los 3 numeros es: " + sumar3Numeros(numero1, numero2, numero3));

        System.out.println("La multiplicación de los 3 numeros es: " + multiplicar3Numeros(numero1, numero2, numero3));

        System.out.println("La Concatenación de los 3 numeros es: " + concatenar3Numeros(numero1, numero2, numero3));
    }
    //E2.2
    static void ex2Item2() {
        int edad;
        double peso;
        String palabraA;
        String palabraB;

        System.out.print("Ingresa tu edad: ");
        Scanner scanner = new Scanner(System.in);
        edad = scanner.nextInt();
        System.out.print("Ingresa tu peso: ");
        peso = scanner.nextDouble();
        System.out.print("Ingresa una palabra: ");
        scanner.nextLine();
        palabraA = scanner.next();
        System.out.print("Ingresa otra palabra: ");
        scanner.nextLine();
        palabraB = scanner.next();
        scanner.close();

        mostrarResultados (edad, peso, palabraA, palabraB);
        compararStrings(palabraA, palabraB);
        concatenarStrings(palabraA, palabraB);
    }

    //Metodo Sumar
    static int sumar3Numeros(int x, int y, int z) {
        return x + y + z;
    }

    //Metodo Multiplicar
    static int multiplicar3Numeros(int x, int y, int z) {
        return x * y * z;
    }

    //Metodo Concatenar
    static String concatenar3Numeros(int x, int y, int z) {
        return String.valueOf(x) + String.valueOf(y) + String.valueOf(z);
    }

    //Metodo MostrarResultados
    static void mostrarResultados (int a, double b, String c, String d){
        System.out.println("Tu edad es " + a + "," + " tu estatura es "  + b +
                "," + " la primera palabra es " + c + " y la segunda palabra es " + d);
    }

    //Metodo CompararStrings
    static void compararStrings (String c, String d){
        if (c.equals(d)) {
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras son diferentes");
        }
    }

    //Metodo ConcatenarStrings
    static String concatenarStrings (String c, String d){
        System.out.println("La concatenacion de las palabras es: " + c + d);
        return  c + d;
    }
}
