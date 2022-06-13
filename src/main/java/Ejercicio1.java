package com.company;

//Ejercicio1
public class Ejercicio1 {
    public static void main(String[] args) {
        ext1Item1();
        //ext1Item2();
    }

    //E1.1
    static void ext1Item1() {
        var precioZapatillas = "522";
        var precioMedias = "321";
        var precioMochila = "111";

        System.out.println("E1.1--------------->");
        System.out.println(precioZapatillas);
        System.out.println(precioMedias);
        System.out.println(precioMochila);

        var suma = (Integer.parseInt(precioZapatillas) + Integer.parseInt(precioMedias) +
                Integer.parseInt(precioMochila));

        System.out.println("El total es JIJIJIJI: " + suma);
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

