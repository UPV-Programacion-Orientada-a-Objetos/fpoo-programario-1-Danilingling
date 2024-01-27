package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5 {
    public static void IP5() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la altura a:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Ingrese la base b:");
        Lectura = buffer.readLine();
        double b = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P5.Area_rara(a,b));
    }

    public static double Area_rara(double a, double b) {
        double c = a/2, triangulo = ((a-c)*b)/2, rectangulo = (b*c);


        return (rectangulo+triangulo);
    }
}
