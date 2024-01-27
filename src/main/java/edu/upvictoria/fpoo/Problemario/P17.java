package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P17 {
    public static void IP17() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el Cateto Adyacente:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);
        System.out.println("Ingrese el Cateto Opuesto:");
        Lectura = buffer.readLine();
        double b = Double.parseDouble(Lectura);


        System.out.println("El resultado es: " + P17.A(a,b));
    }
    public static double A(double a,double b) {
        return Math.sqrt(a + b);
    }
}
