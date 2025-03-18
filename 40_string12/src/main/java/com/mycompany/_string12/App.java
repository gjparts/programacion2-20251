package com.mycompany._string12;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Metodo split
        Devuelve un arreglo de elementos String el cual es el resultado
        de dividir en parte otro String, cada una de las parte esta delimitada
        por un token el cual es un String que sirve para separar.*/
        String str = "rojo,verde,azul,blanco,negro,gris,amarilo";
        String arreglo[]; //arreglo de destino (sin inicializar)
        //apuntar hacia arreglo[] el resultado de split para str:
        arreglo = str.split(",");
        //recorrer e imprimir el arreglo:
        for (int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
        
        //el token puede ser cualquier String:
        str = "ToyotaSEPARADORCorollaSEPARADOR2012SEPARADORAzulSEPARADORImportado";
        arreglo = str.split("SEPARADOR");
        //recorrer e imprimir el arreglo:
        for (int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
        
        //hay caracteres no permitidos, como por ejemplo \
        //el cual debe usar como \\; pero split no lo va a aceptar
        //porque lo va a confundir con una expresion regular.
        //str = "fresa\\naranja\\mandarina\\sandia";
        //arreglo = str.split("\\");
        
        //existen otros caracteres no permitidos; pero que no dan error
        str = "fresa|naranja|mandarina|sandia";
        arreglo = str.split("|");
        //recorrer e imprimir el arreglo:
        for (int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
        //lo anterior no hace el split correctamente
        
        //el truco en estos casos es, por medio de replace cambiar el caracter no
        //valido por un caracter que si es valido.
        str = "fresa|naranja|mandarina|sandia";
        str = str.replace("|", ";");
        arreglo = str.split(";");
        //recorrer e imprimir el arreglo:
        for (int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
        
        /*Hace un programa que pregunte un String al usuario,
        el programa dira cuantas palabras tiene el String
        tomando en cuenta que cada palabra se separara por solo un espacio
        en blanco.
        Ejemplo:
        Digitar String: Gerardo Josue Portillo
        numero de palabras: 3*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String: ");
        String str2 = s.nextLine();
        //forma 1:
        String arreglo9[] = str2.split(" ");
        System.out.println("numero de palabras: "+arreglo9.length);
        //forma 2:
        System.out.println("numero de palabras: "+str2.split(" ").length);
    }
}
