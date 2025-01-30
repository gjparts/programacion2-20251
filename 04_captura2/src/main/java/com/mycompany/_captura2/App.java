/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura2;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        //instanciar un objeto de clase Scanner para capturar datos
        Scanner lector = new Scanner(System.in);
        double a,b,c,d;
        System.out.print("a: ");
        a = lector.nextDouble();
        System.out.print("b: ");
        b = lector.nextDouble();
        System.out.print("c: ");
        c = lector.nextDouble();
        System.out.print("d: ");
        d = lector.nextDouble();
        //procesamiento
        //forma 1: necesitamos guardar el resultado en una variable
        //porque quiza lo necesitamos a futuro
        //tambien se puede hacer por partes, una variable para cada
        //calculo de la operacion
        double numerador = Math.pow(a, 2)-b;
        double denominador = c+Math.pow(d, 3);
        double resultado = Math.sqrt( numerador/denominador );
        System.out.println("Resultado: "+resultado);
        //forma 2: hacer el calculo al momento de imprimir
        //porque no necesitamos el resultado a futuro
        System.out.println("Resultado: "+( Math.sqrt( (Math.pow(a, 2)-b)/(c+Math.pow(d, 3)) ) ));
        //forma 3, 4, 5, etc. la que Ustedes crean conveniente.
    }
}
