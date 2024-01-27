package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14 {
    public static void IP14() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese su anio de nacimiento:");
        Lectura = buffer.readLine();
        int a = Integer.parseInt(Lectura);

        System.out.println("Su edad es: " + P14.A(a));
    }

    public static int A(int a) {
        return 2024-a;
    }
}