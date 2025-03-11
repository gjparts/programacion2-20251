package com.mycompany._string06;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //Arreglo de String
        //forma 1: sin valores de inicio
        String arreglo1[] = new String[4];
        //forma 2: prellenado
        String colores[] = {"Rojo","Verde","Azul","Amarillo","Negro","Blanco"};
        /*Para el arreglo de colores.
        Hacer un programa que pregunte un color, el programa debera
        buscar dicho color dentro del arreglo de colores.
        Si el color es encontrado mostrar la posicion en donde se encuentra
        la primer coincidencia.
        Si el color no es encontrado entonces mostrar un mensaje indicadolo.
        -> ignore mayusculas/minusculas durante la busqueda.*/
        Scanner s = new Scanner(System.in);
        String buscar;
        System.out.print("Digite un color a buscar: ");
        buscar = s.nextLine();
        //hacer la busqueda
        boolean encontrado = false; //variable bandera (flag)
        for (int i = 0; i < colores.length; i++) {
            if( colores[i].toLowerCase().equals(buscar.toLowerCase()) == true ){
                System.out.println("Encontrado en la posicion "+i);
                encontrado = true;
                break; //deja de recorrer
            }
        }
        //se termino la busqueda
        if( encontrado == false ) System.out.println("No se encontro el color.");
        /*imprimir cada color del arreglo llamado colores pero colocando un asterisco
        entre cada caracter de cada color. Imprima un color por renglon.
        sin afectar al arreglo original.*/
        for( int i = 0; i < colores.length; i++ ){
            //de cada color recorrer caracter por caracter
            for( int j = 0; j < colores[i].length(); j++ ){
                System.out.print( colores[i].charAt(j)+"*" );
            }
            //salto de linea
            System.out.println();
        }
    }
}
