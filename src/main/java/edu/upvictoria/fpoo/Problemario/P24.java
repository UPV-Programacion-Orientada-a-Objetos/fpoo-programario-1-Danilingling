package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P24 {
    public static void IP24() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese su salario por semana");
        Lectura = buffer.readLine();
        double total = Double.parseDouble(Lectura);

        System.out.println("El pago al final de 12 meses es: " + P24.Salario(total));

    }
    public static double Salario(double a) {
        double total=  a * .15;
        return total * 48;
    }
}