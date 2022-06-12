package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //ex3Item1 ();
        ex3Item2 ();
    }

    //E3.1
    static void ex3Item1 (){
        String a;
        String b;
        String c;
        String d;
        String e;
        String concatenar = ""; //así se inicializa los strings

        System.out.print("Ingresar string1: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.next();
        System.out.print("Ingresar string2: ");
        b = scanner.next();
        System.out.print("Ingresar string3: ");
        c = scanner.next();
        System.out.print("Ingresar string4: ");
        d = scanner.next();
        System.out.print("Ingresar string5: ");
        e = scanner.next();
        scanner.close();

        List<String> listaStrings = new ArrayList<>(); //Declaro la lista de strings
        listaStrings.add(a);
        listaStrings.add(b);
        listaStrings.add(c);
        listaStrings.add(d);
        listaStrings.add(e);

        for (String elemento: listaStrings) { //For each sirve para recorrer los elementos de la lista
            concatenar = concatenar + elemento;
        }

        System.out.println("La concatenacion de la lista es: " + concatenar);
        System.out.println("El tamaño de la lista es: " + listaStrings.size() + -1);
    }

    //E3.2
    static void ex3Item2 (){
        double a;
        double b;
        double c;
        double d;
        double suma = 0;

        System.out.print("Ingresar double1: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.print("Ingresar double2: ");
        b = scanner.nextDouble();
        System.out.print("Ingresar double3: ");
        c = scanner.nextDouble();
        System.out.print("Ingresar double4: ");
        d = scanner.nextDouble();
        scanner.close();

        List<Double> listaDouble = new ArrayList<>(); //Declaro la lista de double
        listaDouble.add(a);
        listaDouble.add(b);
        listaDouble.add(c);
        listaDouble.add(d);

        for (double elemento: listaDouble) { //For each sirve para recorrer los elementos de la lista
            suma = elemento + suma;
        }

        System.out.println("La Suma de la lista es: " + suma);
        System.out.println("El tamaño de la lista es: " + listaDouble.size() + -1);
    }
}
