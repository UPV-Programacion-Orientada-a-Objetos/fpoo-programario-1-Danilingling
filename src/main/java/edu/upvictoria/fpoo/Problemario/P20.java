package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P20 {
    public static void IP20() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("El costo por minuto es de 50 centavos");

        System.out.println("Ingrese los minutos que duro en llamada");
        Lectura = buffer.readLine();
        double minutos = Double.parseDouble(Lectura);

        System.out.println("El resultado es: " + P20.Ala(minutos));
    }
    public static double Ala(double a) {
        return (a*.50);
    }
}
