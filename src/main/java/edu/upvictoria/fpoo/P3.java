package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3 {
    public static void IP3() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la base:");
        Lectura = buffer.readLine();
        double base = Double.parseDouble(Lectura);
        System.out.println("Ingrese la altura:");
        Lectura = buffer.readLine();
        double altura = Double.parseDouble(Lectura);
        System.out.println("El resultado es: "+ P3.Area(base,altura));
    }

    public static double Area(double a, double b) {
        return a * b;
    }
}
