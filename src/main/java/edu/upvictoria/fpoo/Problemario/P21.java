package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P21 {
    public static void IP21() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("El costo por metro cubico es de 50 pesos");

        System.out.println("Ingrese los metros cubicos utilizados");
        Lectura = buffer.readLine();
        double minutos = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P21.A(minutos));
    }
    public static double A(double a) {
        return (a*50);
    }
}
