package com.mycompany._arreglos;
public class App {
    public static void main(String[] args) {
        /*Arreglo o Array
        Es una estructura de datos estatica, homogenea y secuencial
        que permite agrupar datos como una coleccion.
        @ Estatica: no puede cambiar su tamaño (lo opuesto a dinamico)
        @ Homogenea: todos sus elementos son del mismo tipo (lo opuesto a heterogeneo)
        @ Secuencial: cada elemento existe en un espacio consecutivo de memoria (lo opuesto a aleatorio)
        -> IMPORTANTE: un arreglo en JAVA numera sus elementos usando Zero Indexing o sea
           desde 0 hasta N-1
        
        Formas de declarar arreglos:
        1) inicializar el arreglo sin datos
        2) inicializar el arreglo prellenado con datos
        */
        //forma 1: inicializar el arreglo sin datos
        int arreglo1[] = new int[5]; //arreglo unidimensional de enteros de 5 elementos
        //que valor predeterminado asigna JAVA a un arreglo sin definir sus datos?
        //imprimamos cada uno de sus elementos para averiguarlo:
        System.out.println( arreglo1[0] );
        System.out.println( arreglo1[1] );
        System.out.println( arreglo1[2] );
        System.out.println( arreglo1[3] );
        System.out.println( arreglo1[4] );
        //asignar manual valor por valor (poco practico)
        arreglo1[2] = 7;
        arreglo1[4] = 115;
        //imprimir todos los elementos del arreglo sin tener que programar linea por linea
        for( int i = 0; i < arreglo1.length; i++ ){
            System.out.print("posicion: "+i);
            System.out.println(", valor: "+arreglo1[i]);
        }
        System.out.println("Longitud de arreglo1: "+arreglo1.length);
        
        System.out.println("El primer elemento de arreglo1 es: "+arreglo1[0]);
        System.out.println("El ultimo elemento de arreglo1 es: "+arreglo1[4]);
        System.out.println("El ultimo elemento de arreglo1 es: "+arreglo1[arreglo1.length-1]);
        
        //forma 2: inicializar el arreglo prellenado con datos
        int arreglo2[] = { 45, 563, -7, 111, 0, 1234, 1050, 6789, 4 };
        System.out.println("Numero de elementos en arreglo2: "+arreglo2.length);
        System.out.println("**************************");
        //imprimir arreglo2
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( arreglo2[i] );
        
        //que pasa si imprime directamente el arreglo sin indice
        System.out.println( "Direccion de memoria de arreglo2: "+arreglo2 );
        System.out.println( "Direccion de memoria de arreglo1: "+arreglo1 );
    }
}
