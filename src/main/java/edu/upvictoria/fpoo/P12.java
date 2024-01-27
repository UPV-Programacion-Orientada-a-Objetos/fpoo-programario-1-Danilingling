package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12 {
    public static void IP12() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la altura:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Ingrese la base:");
        Lectura = buffer.readLine();
        double l = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P12.A(a,l));
    }

    public static double A(double a,double b) {
        return (a*b)/2;
    }
}