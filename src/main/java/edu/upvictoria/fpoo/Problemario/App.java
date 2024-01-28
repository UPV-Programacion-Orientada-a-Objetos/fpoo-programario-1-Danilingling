package edu.upvictoria.fpoo.Problemario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        boolean a = true;
        boolean b = true;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            while(a) {
                System.out.println("Bienvenido al Programario de 2230422");
                System.out.println("Ingrese el paquete del repositorio:");
                System.out.println(" 1.Algoritmos");
                System.out.println(" 2.Estructuras Selectivas");
                System.out.println(" 3.Estructuras Repetitivas");
                System.out.println(" 4.Arreglos");
                System.out.println(" 5.Terminar App");
                String Lectura = buffer.readLine();
                int paquete = Integer.parseInt(Lectura);
                switch (paquete) {
                    case 1:
                        b = true;

                        while(b) {
                            System.out.println("Ingrese el ejercicio a elegir: ");
                            System.out.println(" 1.Suma");
                            System.out.println(" 2.Examenes");
                            System.out.println(" 3.Area de rectangulo");
                            System.out.println(" 4.Area de circuferencia");
                            System.out.println(" 5.Terrenos");
                            System.out.println(" 6.Area de forma de helado");
                            System.out.println(" 7.Galones a litros");
                            System.out.println(" 8.Distancia entre dos puntos");
                            System.out.println(" 9.Sueldo Semanal");
                            System.out.println(" 10.Prendas de vestir");
                            System.out.println(" 11.Conagua");
                            System.out.println(" 12.Area de triangulo");
                            System.out.println(" 13.Empresa importadora");
                            System.out.println(" 14.Contrato de personal");
                            System.out.println(" 15.Estacionamiento");
                            System.out.println(" 16.Pinturas");
                            System.out.println(" 17.Hipotenusa de un triangulo");
                            System.out.println(" 18.Autobuses");
                            System.out.println(" 19.Bicicleta");
                            System.out.println(" 20.Llamada telefonica");
                            System.out.println(" 21.Conagua pt.2");
                            System.out.println(" 22.CLS");
                            System.out.println(" 23.IVA");
                            System.out.println(" 24.Ahorro");
                            System.out.println(" 25.Empleados");
                            System.out.println(" 26.Regresar al Menu");
                            Lectura = buffer.readLine();
                            int ejercicio = Integer.parseInt(Lectura);
                            switch (ejercicio) {
                                case 1:
                                    P1.IP1();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 2:
                                    P2.IP2();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                case 3:
                                    P3.IP3();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 4:
                                    P4.IP4();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 5:
                                    P5.IP5();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 6:
                                    P6.IP6();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 7:
                                    P7.IP7();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 8:
                                    P8.IP8();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 9:
                                    P9.IP9();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 10:
                                    P10.IP10();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 11:
                                    P11.IP11();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 12:
                                    P12.IP12();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 13:
                                    P13.IP13();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 14:
                                    P14.IP14();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 15:
                                    P15.IP15();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 16:
                                    P16.IP16();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 17:
                                    P17.IP17();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 18:
                                    P18.IP18();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 19:
                                    P19.IP19();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 20:
                                    P20.IP20();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 21:
                                    P21.IP21();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 22:
                                    P22.IP22();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 23:
                                    P23.IP23();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 24:
                                    P24.IP24();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                case 25:
                                    P25.IP25();
                                    System.out.println(" ");
                                    Thread.sleep(2000L);
                                    break;
                                default:
                                    if (ejercicio == 26) {
                                        b = false;
                                    }
                                    break;
                            }
                        }
                    case 2:
                    case 3:
                    case 4:
                    default:
                        break;
                    case 5:
                        a = false;
                        System.out.println("Gracias por su visita <3 ");
                }
            }

            return;
        }
    }
}
