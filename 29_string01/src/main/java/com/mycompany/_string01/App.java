package com.mycompany._string01;
public class App {
    public static void main(String[] args) {
        /*String
        Es una clase y es una coleccion de elementos char.
        -> no es necesario importar nada en JAVA puesto que
           String ya viene incorporado en cualquier proyecto
           de JAVA por medio del paquete java.lang*/
        //declaracion de objetos String
        String str;
        //no puede acceder al contenido de un String si no lo inicializa
        //System.out.println("El contenido de str es: "+str);
        //declarar e inicializar String
        String str1 = "Ing. en Sistemas";
        System.out.println("str1: "+str1);
        String str2 = "gato", str3 = "loro";
        
        //concatenar String
        String s1 = "Gerardo";
        String s2 = "Portillo";
        String s3 = s1+s2;
        System.out.println(s3);
        s3 = s1+" "+s2;
        System.out.println(s3);
        
        //es posible concatenar numeros siempre y cuando halla un String en la expresion
        int n1 = 7, n2 = 11;
        //no se puede asignar un numero primitivo a un String directamente:
        //String s4 = n1;
        //pero puede incluir un String en la expresion para que sea aceptado
        String s4 = n1+"";
        System.out.println("s4: "+s4);
        String s5 = ""+(n1+n2);
        System.out.println("s5: "+s5);
        
        //obtener la longitud de un String
        String verdura = "Chile verde";
        System.out.println("Longitud de verdura: "+verdura.length());
        
        /*Importante: para acceder a los caracteres de un String se usa el metodo
        llamado charAt, los caracteres se numeran desde CERO a lenght-1*/
        //recorrer los caracteres en un String e imprimirlos renglon por renglon
        String mascota = "Mandarino Naranjoso";
        for (int i = 0; i < mascota.length(); i++) {
            System.out.println( mascota.charAt(i) );
        }
        //pueden obtener un char indivualmente:
        System.out.println("Primer char en mascota: "+mascota.charAt(0));
        System.out.println("Ultimo char en mascota: "+mascota.charAt( mascota.length()-1 ));
        
        //obtener versiones en mayuscula o minuscula de un String
        String carrera = "Ingenieria en Sistemas";
        //metodo toUpperCase: devuelve una copia del String en mayusculas
        //sin alterar al String original
        System.out.println("carrera en mayusculas: "+carrera.toUpperCase());
        System.out.println("carrera, variable original: "+carrera);
        //metodo toLowerCase: devuelve una copia del String en minusculas
        //sin alterar al String original
        System.out.println("carrera en minusculas: "+carrera.toLowerCase());
        System.out.println("carrera, variable original: "+carrera);
        //Ejercicio:
        String carro = "Honda Civic 2004";
        //convertir a mayusculas el String carro; pero afectando al String original
        //imprima el antes y el despues de la conversion
        System.out.println("antes de convertir: "+carro);
        //reescribir la propia variable con su version en mayusculas
        carro = carro.toUpperCase();
        System.out.println("despues de convertir: "+carro);
        
        //metodo trim()
        //devuelve una version del String; pero eliminando los espacios iniciales y finales
        //o sea los espacios de relleno sin alterar al String original
        String nombre = "        Gerardo Josue Portillo           ";
        System.out.println("nombre, variable original: "+nombre);
        System.out.println("nombre, longitud de variable original: "+nombre.length());
        //usando trim
        System.out.println("nombre, usando trim: "+nombre.trim());
        System.out.println("nombre, longitud usando trim: "+nombre.trim().length());
        //la vraible original no se vio afectada:
        System.out.println("nombre, variable original: "+nombre);
        System.out.println("nombre, longitud de variable original: "+nombre.length());
        //si desea afectar a la variable original con su version sin espacios:
        nombre = nombre.trim();
        System.out.println("nombre, variable original: "+nombre);
        System.out.println("nombre, longitud de variable original: "+nombre.length());
        
        String mascota1 = "      El Gato Oreo     ";
        /*Imprimir la variable mascota1; pero sin relleno de espacios, toda en
        mayusculas y sin alterar a la variable original: utilizando una sola instruccion.*/
        System.out.println(mascota1.trim().toUpperCase()); //forma 1
        System.out.println(mascota1.toUpperCase().trim()); //forma 2
        
        //Concatenar valores char a un String
        String universidad = "UNAH";
        //concatenar char sin afectar a la variable original
        System.out.println( universidad+'Z' );
        //concatenar char afectando a la variable original
        universidad = universidad + 'X';
        System.out.println( universidad );
        //concatenar varios char a un String
        String proveedor = "Intel";
        proveedor = proveedor + 'W'+ 'X' + 'J';
        System.out.println( proveedor );
        //aunque a veces es mas practico concatenar un String
        String vehiculo = "Toyota";
        vehiculo = vehiculo + " Corolla";
        System.out.println( vehiculo );
        //tambien puede tener el char en una variable
        char coma = ',';
        String comida = "Baleada";
        comida = comida + coma;
        System.out.println(comida);
        
        String nombre1 = "Gerardo Josue Portillo";
        /*Generar una nueva variable de tipo String que sea una copia
        de la variable nombre1; pero reemplazando cada espacio en blanco
        por un asterisco; sin utilizar el metodo replace. Imprimir la
        nueva variable.*/
        String copia = "";
        for (int i = 0; i < nombre1.length(); i++) {
            if( nombre1.charAt(i) == ' ' )
                copia = copia + '*';
            else
                copia = copia + nombre1.charAt(i);
        }
        System.out.println("original: "+nombre1);
        System.out.println("copia: "+copia);
        
        /*Operador Ternario
        Retorna el resultado de evaluar una o varias condiciones.
        El resultado tiene dos posibles valores:
        1) el que tiene que ver con el cumplimiento de las condiciones (true)
        2) el que no tiene que ver con que se cumplan (false)
        IMPORTANTE: ambos resultados debe de ser del mismo tipo de dato*/
        boolean pagaISV = false;
        float venta = 5000;
        System.out.println("Valor a pagar: "+( pagaISV == true ? 1.15 : 1 )*venta);
        
        float pagar = venta*( pagaISV == true ? 1.15f : 1 );
        System.out.println("Valor a pagar: "+pagar);
        System.out.println("Esta pagando ISV? "+( pagaISV == true ? "Si" : "No" ));
        
        int rojo = 0, verde = 1;
        System.out.println("Rojo: "+( rojo == 1 ? "Si" : "No" )+" Verde: "+( verde == 1 ? "Si" : "No" ));
        
        //ejercicio del reemplazo por astetiscos usando el operador ternario
        copia = "";
        for (int i = 0; i < nombre1.length(); i++)
            copia = copia + ( nombre1.charAt(i) == ' ' ? '*' : nombre1.charAt(i) );
        
        System.out.println("original: "+nombre1);
        System.out.println("copia: "+copia);
    }
}

