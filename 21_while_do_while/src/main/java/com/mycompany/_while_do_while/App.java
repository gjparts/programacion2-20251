package com.mycompany._while_do_while;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Hacer un programa que lea N cantidad de numeros positivos.
        La lectura de numeros terminara cuando se lea un numero negativo.
        Una vez concluida la lectura de numeros mostraremos la suma de los
        numeros positivos capturados. (resolver usando while o do-while)*/
        Scanner s = new Scanner(System.in);
        System.out.println("usando while:");
        int n = 0; //variable de control
        int suma = 0; //variable acumulador
        while( n >= 0 ){
            System.out.print("Digite numero entero positivo: ");
            n = s.nextInt();
            if( n >= 0 ) suma += n; //solo sumamos positivos
        }
        System.out.println("La suma de los numeros es: "+suma);
        
        System.out.println("usando do-while:");
        int x;
        int sumatoria = 0;
        do{
            System.out.print("Digite numero entero positivo: ");
            x = s.nextInt();
            if( x >= 0 ) sumatoria += x; //solo sumamos positivos
        }while( x >= 0 );
        System.out.println("La suma de los numeros es: "+sumatoria);
    }
}
