package com.mycompany._for_anidado;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Estructura de repetecion anidada (nested)
        Es una estructura dentro de otra estructura, se usan para ejecutar
        iteraciones secundarias por cada iteracion primaria.
        ejemplo:
        Hacer un programa que pida al usuario digitar el ancho y alto
        de un rectangulo como numeros enteros.
        El programa debera imprimir un rectangulo relleno de asteriscos segun
        el ancho y alto proporcionados.*/
        Scanner s = new Scanner(System.in);
        int ancho, alto;
        System.out.print("Alto: ");
        alto = s.nextInt();
        System.out.print("Ancho: ");
        ancho = s.nextInt();
        
        //lineas: alto
        for( int i = 1; i <= alto; i++ ){
            //columnas: ancho
            for( int j = 1; j <= ancho; j++ ){
                System.out.print("*");
            }
            System.out.println(""); //pasar a linea siguiente
        }
    }
}
