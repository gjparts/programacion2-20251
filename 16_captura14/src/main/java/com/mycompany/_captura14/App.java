package com.mycompany._captura14;
public class App {

    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        //forma 1: 10 iteraciones
        for( int i = 1; i <= 10; i++ )
            System.out.println(i);
        //forma 2: 10 iteraciones
        for( int i = 0; i < 10; i++ )
            System.out.println(i+1);
        
        //2) imprimir los numeros del 0 al 50 de dos en dos
        //26 iteraciones
        System.out.println("**************************");
        for( int i = 0; i <= 50; i+=2 )
            System.out.println(i);
        //26 iteraciones
        System.out.println("**************************");
        for( int i = 0; i <= 50; i = i+2 )
            System.out.println(i);
        //26 iteraciones (raro y no recomendado)
        System.out.println("**************************");
        for( int i = 0; i <= 25; i++ )
            System.out.println(i+i);
        //51 iteraciones (raro; pero a veces toca)
        //algoritmo de recorrido por fuerza bruta
        //se hace todo el recorrido; pero solo se presenta lo solicitado
        System.out.println("**************************");
        for( int i = 0; i <= 50; i++ )
            if( i%2 == 0 )
                System.out.println(i);
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco
        //forma 1: 11 iteraciones
        System.out.println("**************************");
        for( int i = 0; i <= 50; i+=5 )
            System.out.println(i);
        //forma 2: por fuerza bruta, 51 iteraciones
        System.out.println("**************************");
        for( int i = 0; i <= 50; i++ )
            if( i%5 == 0 )
                System.out.println(i);
        
        //4) recorrer los numeros del 1 al 50
        //   pero colo imprima los numeros pares
        
        // por como lo pide el ejercicio toca hacer
        // todo el recorrido
        System.out.println("**************************");
        for( int i = 1; i <= 50; i++ )
            if( i%2 == 0 )
                System.out.println(i);
        
        /*5) imprimir los numeros del 1 al 100; colocar un asterisco
        a la derecha de aquellos numeros que son multiplo de 10*/
        System.out.println("**************************");
        //forma 1
        for( int i = 1; i <= 100; i++ ){
            if( i%10 == 0 )
                System.out.println(i+"*");
            else
                System.out.println(i);
        }
        //forma 2
        System.out.println("**************************");
        for( int i = 1; i <= 100; i++ ){
            System.out.print(i);
            if( i%10 == 0 ) System.out.print("*");
            System.out.println();
        }
        /*6) imprimir los numeros del 10 al 1,
        de forma descendente de uno en uno*/
        System.out.println("**************************");
        for( int i = 10; i >= 1; i-- )
            System.out.println(i);
        
        /*7) imprimir los numeros del 10 al 0,
        de forma descendente de dos en dos*/
        System.out.println("**************************");
        for( int i = 10; i >= 0; i-=2 )
            System.out.println(i);
        
        /*8) imprimir los numeros del 100 al 0,
        de forma descendente de diez en diez*/
        System.out.println("**************************");
        for( int i = 100; i >= 0; i-=10 )
            System.out.println(i);
        
        /*la estructura for permite trabajar con decimales
        ejemplo:
        imprimir los numeros del 0 al 5 en saltos
        de 0.25*/
        System.out.println("**************************");
        for( float i = 0; i <= 5; i+=0.25f )
            System.out.println(i);
    }
}
