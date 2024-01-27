package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P19 {
    public static void IP19() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la longitud del recorrido");
        Lectura = buffer.readLine();
        double recorrido = Double.parseDouble(Lectura);

        System.out.println("Ingrese su velocidad constante");
        Lectura = buffer.readLine();
        double velocidad = Double.parseDouble(Lectura);


        System.out.println("El resultado es: " + P19.A(recorrido,velocidad));
    }
    public static double A(double a, double b) {
        return (a/b);
    }
}
