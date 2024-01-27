package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16 {
    public static void IP16() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("El cobro es de 20 por m^2:");
        System.out.println("Ingrese los m^2 que desea pintar");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Su cobro es: " + P16.A(a));
    }
    public static double A(double a) {
        return a * 20;
    }
}
