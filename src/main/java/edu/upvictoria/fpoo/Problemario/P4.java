package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4 {
    public static void IP4() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el radio:");
        Lectura = buffer.readLine();
        double radio = Double.parseDouble(Lectura);
        System.out.println("El resultado es: " + P4.Area_c(radio));
    }

    public static double Area_c(double a) {
        return (Math.PI)*(Math.pow(a,2));
    }
}
