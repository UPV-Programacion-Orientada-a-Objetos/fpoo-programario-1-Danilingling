package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
    public static void IP1() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el primer numero:");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);
        System.out.println("Ingrese el segundo numero:");
        Lectura = buffer.readLine();
        double num2 = Double.parseDouble(Lectura);
        System.out.println("El resultado es: "+ P1.Sumar(num1,num2));
    }

    public static double Sumar(double a, double b) {
        return a + b;
    }

}

