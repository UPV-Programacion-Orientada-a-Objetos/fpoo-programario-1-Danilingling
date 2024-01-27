package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10 {
    public static void IP10() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese las pulgadas de tela:");
        Lectura = buffer.readLine();
        double pulgadas = Double.parseDouble(Lectura);


        System.out.println("El resultado es: " + P10.A(pulgadas));
    }

    public static double A(double a) {
        return a*.0254;
    }
}
