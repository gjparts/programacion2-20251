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
        
        /*tipo de dato long
        permite almacenar numeros enteros de hasta 8 bytes, a diferencia
        de int que solo permite 4 bytes.*/
        //ejemplo:
        //int dni = 1401198201055; //int no soporta este numero
        long dni = 1401198201055L;
        System.out.println("El valor de dni es "+dni);
        
        //uso de char (se establece usando comillas simples) '
        //el codigo de la comilla simple es 39
        //no confundan la comilla simple con la tilde inversa (backtip) `
        //char mide 1 byte
        char c1 = 'X';
        char c2 = '\'';
        char c3 = '$';
        System.out.println("el valor de c1 es "+c1);
        System.out.println("el valor de c2 es "+c2);
        System.out.println("el valor de c3 es "+c3);
        
        //tipo de dato booleano
        boolean respuesta = true;
        System.out.println("El valor de respuesta es "+respuesta);
        respuesta = false;
        System.out.println("El valor de respuesta es "+respuesta);
        //las expresiones de comparacion tambien devuelven valores boolean
        boolean evaluacion;
        int x = 5, y = 8;
        evaluacion = x > y;
        System.out.println("La evaluacion es "+evaluacion);
        
        /*Ley de precedencia de operadores
        Las expresiones en cualquier de programacion se evaluan
        de izquierda a derecha y se resuelven dando prioridad
        de acuerdo a la tabla siguiente:
        a) parentesis ()
        b) exponentes pow
        c) multiplicaciones y divisiones * /
        d) sumas y restas + -
        e) ! operadores NOT
        f) && operadores AND
        g) || operadores OR    (la barra es el caracter 124)
        */
        double n1 = 7, n2 = 4, n3 = 2, n4 = 6;
        System.out.println( n1+n2/n3 );
        System.out.println( (n1+n2)/n3 );
        System.out.println( (n1-n2)/(n3+n4)*n1 );
        
        //concatenar: unir los contenidos de dos o mas expresiones
        double g = 9.8;
        System.out.println("La gravedad de la tierra es "+g+" metros sobre segundo cuadrado.");
        System.out.println("n1 vale "+n1+", n2 vale "+n2+", n3 vale "+n3);
        int jkl = 2, asd = 3;
        /*el operador SUMA esta sobrecargado, lo que quiere decir que si sus
        parametros son numeros los sumara; pero si uno de ellos es String entonces
        lo va a concatenar. Siempre obedeciendo a la tabla de precedencia de operadores
        por eso si va a realizar una operacion aritmetica debe ir entre parentesis
        para que sea evaluada antes de comenzar a concatenar:*/
        System.out.println("La suma de "+jkl+" mas "+asd+" es "+jkl+asd); //sin parentesis
        System.out.println("La suma de "+jkl+" mas "+asd+" es "+(jkl+asd)); //con parentesis
        //importante: restas, multiplicaciones, divisiones al concatenarlas con String
        //deben ir en parentesis sino no les va a dejar compilar:
        System.out.println("La resta de "+n1+" menos "+n2+" es "+(n1-n2));
    }
}
