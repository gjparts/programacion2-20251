package com.mycompany._captura13;

import java.util.Random; //clase para generar numeros al azar
public class App {
    public static void main(String[] args) {
        //generar numeros al azar entre 7 y 112
        //instanciar un nuevo objeto de clase Random
        Random r = new Random();
        //generar el numero:
        //r.nextInt(MAXIMO-MINIMO+1)+MINIMO
        int n = r.nextInt(112-7+1)+7;
        System.out.println(n);
        
        /*Hacer un programa que genere un numero al azar entre 3 y 8
        y dependiendo del numero generado nos imprima un color, estos pueden ser:
        3 = verde, 4 = azul, 5 = rojo, 6 = blanco, 7 = negro, 8 = amarillo
        La evaluacion de colores hacerla utilizando una estructura switch*/
        n = r.nextInt(8-3+1)+3;
        System.out.print(n+" = ");
        switch(n){
            case 3: System.out.println("verde"); break;
            case 4: System.out.println("azul"); break;
            case 5: System.out.println("rojo"); break;
            case 6: System.out.println("blanco"); break;
            case 7: System.out.println("negro"); break;
            case 8: System.out.println("amarillo"); break;
        }
        //el caso default es opcional, no se ocupa en todos los escenarios.
    }
}
