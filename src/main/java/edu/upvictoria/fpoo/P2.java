package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P2 {
    public static void IP2() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la primera calificacion:");
        Lectura = buffer.readLine();
        double c1 = Double.parseDouble(Lectura);

        System.out.println("Ingrese la primera calificacion:");
        Lectura = buffer.readLine();
        double c2 = Double.parseDouble(Lectura);

        System.out.println("Ingrese la primera calificacion:");
        Lectura = buffer.readLine();
        double c3 = Double.parseDouble(Lectura);

        System.out.println("Ingrese la primera calificacion:");
        Lectura = buffer.readLine();
        double c4 = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + Calificar(c1,c2,c3,c4));
    }
    
    public static double Calificar(double a, double b, double c, double d){
        return (a + b + c + d)/4;
    }
    
}
