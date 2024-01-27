package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8 {
    public static void IP8() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese los galones:");
        Lectura = buffer.readLine();
        double x1 = Double.parseDouble(Lectura);

        System.out.println("Ingrese los galones:");
        Lectura = buffer.readLine();
        double y1 = Double.parseDouble(Lectura);

        System.out.println("Ingrese los galones:");
        Lectura = buffer.readLine();
        double x2 = Double.parseDouble(Lectura);

        System.out.println("Ingrese los galones:");
        Lectura = buffer.readLine();
        double y2 = Double.parseDouble(Lectura);
        System.out.println("El resultado es: " + P8.A(x1,y1,x2,y2));
    }

    public static double A(double a,double b, double c, double d) {
        return Math.sqrt(Math.pow(c-a,2) + Math.pow(d - b,2)) ;
    }
}