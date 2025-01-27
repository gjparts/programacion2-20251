/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._variables;

/**
 *
 * @author Gerardo
 */
public class App {

    public static void main(String[] args) {
        /*Variable: es un espacio temporal del almacenamiento en la memoria.
        Toda variable tiene un tipo de dato, los tipos de dato se agrupan en:
        1) tipos de dato primitivos: son los que viene definidos en el compilador
                                     del lenguaje.
                                     Ejemplos: int, double, float, boolean, long, char
        2) tipos de dato compuestos: estan formados de elementos con tipos de dato
                                     primitivos.
                                     Ejemplos: String, Scanner, Random, JFrame, JList
        CONSIDERACIONES A LA HORA DE NOMBRAR VARIABLES:
        1) Su nombre no debe comenzar con numero
        2) No debe de llevar espacios en blanco en el nombre
        3) No utilice simbolos reservados, tampoco se recomienda usar eñes o tildes
        4) No usar palabras reservadas del lenguaje donde se encuentran (for, if, while...)
        5) Dos variables no pueden tener el mismo nombre dentro del mismo ambito (scope).
        6) en lenguajes basados en C++ debe respetar las mayusculas y minusculas usadas
           al nombrar variables.
        */
        int a; //declarar variable sin inicializar
        //IMPORTANTE: no se puede usar una variable sin inicializar
        //System.out.println(a);
        //declarsr variable inicializada:
        int b = 8;
        System.out.println(b);
        
        //declarar variables del mismo tipo
        int cifra1 = 6, cifra2 = 1, cifra3 = 777;
        System.out.println(cifra2);
        double abc = 5.6753454, xyz = 7.2;
        System.out.println(abc);
        System.out.println(xyz);
        
        //las variables float necesita colocarse una f al final de su valor
        float algo = 9.8f;
        System.out.println(algo);
    }
}
