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
    }
}

