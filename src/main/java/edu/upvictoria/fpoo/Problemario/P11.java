package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11 {
    public static void IP11() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la area:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Ingrese la Longitud:");
        Lectura = buffer.readLine();
        double l = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P11.A(a,l));
    }

    public static double A(double a,double b) {
        return a*b;
    }
}