package com.mycompany._string11;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Leer un numero de cedula de Honduras (DNI), el programa
        unicamente debe validar que este numero tenga 13 caracteres.
        * el programa deberá eliminar los espacios de relleno, güiones,
          güiones bajos, espacios en blanco de la cadena.

        *Luego de leer la cedula mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) año de asentamiento
        4) correlativo en que fue asentado

        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        Año de asentamiento: 1982
        Correlativo: 01055*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite su dni: ");
        String dni = s.nextLine();
        //sanitizar el string
        dni = dni.trim().replace("_", "").replace("-", "").replace(" ", "");
        //validar que dni tenga 13 caracteres
        if( dni.length() == 13 ){
            System.out.println("Departamento: "+dni.substring(0,2));
            System.out.println("Municipio: "+dni.substring(2,4));
            System.out.println("Año de asentamiento: "+dni.substring(4,8));
            System.out.println("Correlativo: "+dni.substring(8));
        }
        else
            System.out.println("DNI debe ser de 13 caracteres.");
    }
}
