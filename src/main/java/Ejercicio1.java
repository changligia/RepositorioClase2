package com.company;

//Ejercicio1
public class Ejercicio1 {
    public static void main(String[] args) {
        ext1Item1();
        //ext1Item2();
    }

    //E1.1
    static void ext1Item1() {
        String precioZapatillas = "200";
        String precioMedias = "100";
        String precioMochila = "100";

        System.out.println("E1.1--------------->");
        System.out.println(precioZapatillas);
        System.out.println(precioMedias);
        System.out.println(precioMochila);

        int suma = (Integer.parseInt(precioZapatillas) + Integer.parseInt(precioMedias) +
                Integer.parseInt(precioMochila));

        System.out.println("Suma es igual a: " + suma);
    }

    //E1.2
    static void ext1Item2() {
        int a = 15;
        double b = 23.59;
        double c = 983;

        System.out.println("E1.2--------------->");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("La Concatenación es: " + String.valueOf(a) + String.valueOf(b) +
                String.valueOf(c));
    }
}

