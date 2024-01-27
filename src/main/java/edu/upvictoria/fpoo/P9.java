package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9 {
    public static void IP9() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese las horas que trabaja por semana:");
        Lectura = buffer.readLine();
        double horas = Double.parseDouble(Lectura);

        System.out.println("Ingrese el pago por hora:");
        Lectura = buffer.readLine();
        double pago = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P9.A(horas,pago));
    }

    public static double A(double a,double b) {
        return a*b;
    }
}