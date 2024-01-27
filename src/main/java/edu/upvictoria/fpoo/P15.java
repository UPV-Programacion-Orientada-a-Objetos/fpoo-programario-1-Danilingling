package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15 {
    public static void IP15() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("El cobro es de 20 por hora:");
        System.out.println("Ingrese las horas en el estacionamiento:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Su cobro es: " + P15.A(a));
    }
    public static double A(double a) {
        return a * 20;
    }
}
