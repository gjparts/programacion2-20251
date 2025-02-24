package com.mycompany._control_flujo_break;
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        /*Hacer una estructura while infinita dicha estructura
        se rompe solo si adivina el numero secreto.
        El numero secreto sera un numero entero al azar
        entre 1 y 6 dicho numero va a cambiar en cada iteracion.
        RETO: usar al menos una instruccion break.
        Al finalizar el programa felicitar al jugador.*/
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n, azar; //variables banderas
        while(true){
            azar = r.nextInt(6-1+1)+1;
            System.out.print("Adivine un numero entre 1 y 6: ");
            n = s.nextInt();
            if( n == azar ) break;
        }
        System.out.println("Felicidades has escapado.");
    }
}
