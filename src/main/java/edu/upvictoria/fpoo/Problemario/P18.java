package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P18 {
    public static void IP18() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("El costo de kilometros es de $100:");
        System.out.println("Ingrese los kilometros a navegar:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P18.A(a));
    }
    public static double A(double a) {
        return Math.sqrt(a * 100);
    }
}
