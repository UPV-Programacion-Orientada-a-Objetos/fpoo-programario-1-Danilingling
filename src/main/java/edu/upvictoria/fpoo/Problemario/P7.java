package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7 {
    public static void IP7() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese los galones:");
        Lectura = buffer.readLine();
        double gal = Double.parseDouble(Lectura);
        System.out.println("El resultado es: " + P7.A(gal));
    }

    public static double A(double a) {
        return a * 3.785;
    }
}
