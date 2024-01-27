package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6 {
    public static void IP6() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el radio:");
        Lectura = buffer.readLine();
        double r = Double.parseDouble(Lectura);

        System.out.println("Ingrese la altura:");
        Lectura = buffer.readLine();
        double h = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P6.Area_rara(r,h));
    }
    public static double Area_rara(double a, double b) {
        double dos_triangulo = (a*b), mitad_circulo = (Math.PI*(Math.pow(a,2))/2);
        return (dos_triangulo+mitad_circulo);
    }
}
