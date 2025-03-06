package com.mycompany._string03;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Hace un programa que pida un entero y luego
        pida un String, el programa va a imprimir dicho
        String la cantidad de veces segun el numero entero.

        Ejemplo:
        Digite numero de repeticiones: 5
        Digite String a imprimir: Gato
        Gato
        Gato
        Gato
        Gato
        Gato*/
        int veces;
        String mensaje;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite numero de repeticiones: ");
        veces = s.nextInt();
        
        /*En la consola o terminal, cuando se viene de leer un numero
        almacenado en una variable de tipo primitivo y luego se
        quiere leer un String entonces el programa crashea porque
        se llena el buffer de entrada. Para solucionarlo, antes de leer
        el String, si se viene de leer un numero pues se ejecuta un
        nextLine() sin asignar a ninguna variable:*/
        s.nextLine();
        
        System.out.print("Digite String a imprimir: ");
        mensaje = s.nextLine();
        for (int i = 1; i <= veces; i++)
            System.out.println(mensaje);
    }
}
