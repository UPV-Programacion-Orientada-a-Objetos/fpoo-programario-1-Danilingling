package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P23 {
    public static void IP23() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese el total a pagar");
        Lectura = buffer.readLine();
        double total = Double.parseDouble(Lectura);

        System.out.println("El precio con descuento es: " + P23.Descuento(total));
        System.out.println("El precio con descuento + IVA es: " + P23.IVA(P23.Descuento(total)));

    }
    public static double Descuento(double a) {
        double descuento =  a * .20;
        return a - descuento;
    }

    public static double IVA(double a) {
        double IVA =  a * .16;
        return IVA + a;
    }
}