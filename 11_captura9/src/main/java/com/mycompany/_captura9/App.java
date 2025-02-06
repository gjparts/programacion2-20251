/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura9;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Haga un programa que pregunte al usuario por su salario mensual y su antigüedad en años
        El programa le dira cuanto es el bono obtenido, este se calcula de
        la siguiente forma:
        multiplicar el salario mensual por un porcentaje de acuerdo a su antigüedad en años
        el porcentaje sale de esta tabla:

        Antigüedad    	 		% bono
        menos de 5 años	 		10%
        de 5 a menos de 10 años		15%
        de 10 a menos de 20 años	20%
        20 años o mas			25%*/
        Scanner s = new Scanner(System.in);
        float salario, antig, porcentaje = 0;
        System.out.println("Salario Mensual: ");
        salario = s.nextFloat();
        System.out.println("Anios de antiguedad: ");
        antig = s.nextFloat();
        //establecer el porcentaje de bono
        if( antig < 5 ) porcentaje = 0.10f;
        if( antig >= 5 && antig < 10 ) porcentaje = 0.15f;
        if( antig >= 10 && antig < 20 ) porcentaje = 0.20f;
        if( antig >= 20 ) porcentaje = 0.25f;
        //calculo del bono
        float bono = salario*porcentaje;
        System.out.println("El bono es: "+bono);
    }
}
