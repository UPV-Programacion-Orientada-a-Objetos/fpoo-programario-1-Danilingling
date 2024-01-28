package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P25 {
    public static void IP25() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese su gasto diario en hotel");
        Lectura = buffer.readLine();
        double hotel = Double.parseDouble(Lectura);

        System.out.println("Ingrese su gasto diario en comida");
        Lectura = buffer.readLine();
        double comida = Double.parseDouble(Lectura);

        System.out.println("Ingrese el total de dias que estara en monterrey");
        Lectura = buffer.readLine();
        double viaje = Double.parseDouble(Lectura);

        System.out.println("El cheque sera de: " + P25.Cheque(hotel,comida,viaje));
        System.out.println("De comida sera: " + P25.Comida(comida,viaje));
        System.out.println("De hotel sera: " + P25.Comida(hotel,viaje));
        System.out.println("De otros gastos sera: " + P25.Otros(viaje));

    }
    public static double Cheque(double a,double b,double c) {
        return (a+b+100)*c;
    }

    public static double Comida(double a,double b) {
        return a*b;
    }
    public static double Hotel(double a,double b) {
        return a*b;
    }

    public static double Otros(double a) {
        return a*100;
    }
}