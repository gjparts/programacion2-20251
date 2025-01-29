/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura1;

/**
 *
 * @author Gerardo
 */
//importacion de clases
import java.util.Scanner; //clase para poder capturar datos desde un origen
public class App {

    public static void main(String[] args) {
        //instanciar un nuevo objeto de clase Scanner
        //System.in indica que el origen de captura de datos sera la consola del sistema
        Scanner x = new Scanner(System.in);
        //programa que suma dos numeros
        //declarar las variables
        int num1, num2;
        //leer la informacion
        System.out.print("Digite el primer entero: ");
        num1 = x.nextInt();
        System.out.print("Digite el segundo entero: ");
        num2 = x.nextInt();
        System.out.println("La suma de ambos numeros es "+(num1+num2));
    }
}
