package com.mycompany._string05;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       /*Leer un String y luego lo van a imprimir;
        pero dejando tres espacios entre cada caracter
        sin afectar al String original.

        ->  Tambien van a imprimir cuantas veces
            esta la letra a dentro del String leido,
            ignorando mayusc./minusc.*/ 
       Scanner s = new Scanner(System.in);
       String str;
       int contador = 0;
       System.out.print("Digite un String: ");
       str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print( str.charAt(i)+"   " );
            if( str.toUpperCase().charAt(i) == 'A' ) contador++;
            //if( str.charAt(i) == 'A' || str.charAt(i) == 'a' ) contador++;
        }
        System.out.println("\nLa letra a se encontro: "+contador+" veces.");
    }
}
