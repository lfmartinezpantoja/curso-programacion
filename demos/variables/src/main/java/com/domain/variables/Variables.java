/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.domain.variables;

/**
 *
 * @author fernando
 */
public class Variables {

    public static void main(String[] args) {

       /**
        * Una variable en programación es un elemento de datos cuyo valor 
        * puede cambiar durante el curso de la ejecución de un programa”.
        * Como se declara: crear un variable y definir un valor:
        * Sintaxis: tipo_variable nombre_variable = valor_variable;
        * Ej: crear un variable de tipo entero con valor 1:
        * int numero = 1;
        * Ej2: Crear una variable tipo String que contenga la oracion: Hola Amigos:
        * String saludo = "Hola Amigos"; // ojo el String va son S mayuscula el valor va con comilla doble
        * Ej3: Crear un variable tipo char que tenga el caracter: A
        * char letraA = 'A'; // ojo el valor del caracter va en '' comilla simple
        * 
        */
       
       //Formas de declarar e inicializar variables
       //Se declara y al mismo tiempo se incializa
       //El operador = es un operador de asinacion, te permire asignar en valor de una variable
       int numeroPrueba = 1;
       System.out.println("El valor del numero prueba es: " + numeroPrueba);
       
       //Se declara y luego se incializa
       int numeroPrueba2;
       numeroPrueba2 = 3;
       System.out.println("El valor del numero prueba es: " + numeroPrueba2);
       
       
       
       
        /**
         * Una variable String es un conjunto de carateres 
         * (puede ser una frase, oracion o incluso numeros que no queremos 
         * que se comporten como numeros)
         */
        String nombre = "Luis Fernando Martinez";
        
        /**
         *En este caso cedula es una variable que esta compuesta por numeros
         * pero es un string.
         * 
         */
        String cedula = "1999998";
        
        /**
         * Ahora usemos la variable anterior para componer un mensaje que:
         * 1. indique que se ha recibido un nombre
         * 2. tambien que indique el numero asociado a ese nombre.
         */
        System.out.println("Mi nombre es " + nombre + " y mi cedula es:" + cedula);
        
        /**
         * Como se puede observar para imprimir en pantalla se usa la funcion print 
         * que hacer parte de  System.out, esta recibe como argumento el stringa imprimir
         */
        
        
        
        //----------------------- Otros tipos de variables (primitivos) ------------------
        /**
         * int representa un entero (es decir no tiene decimales)
         */
        
        int cedulaInt = 1999998000;
        
        System.out.println("Mi cedula es: " + cedulaInt);
        
        /**
         * long representa un entero (es decir no tiene decimales) pero con
         * un rango mucho mas amplio que el int
         */
        long cedulaLong = 19999980000000l;
        
        System.out.println("Mi cedula es: " + cedulaLong);
        
        /**
         * char: representa un caracter (letra)
         */
        char firstLastNameLetter = 'M';
        System.out.println("La primera letra de mi apellido es: " + firstLastNameLetter);
        
        /**
         * boolean: representa una variable que solo almacena dos valores
         * true (verdadero) y false (falso)
         */
        /**Escenario: necesitamos saber si fernando es mayor de edad
         * para ello vamos a usar una variable que es verdadero si fernando es mayor de edad
         * y falso si no.
         * Tenemos dos variables enteras: 
         * 1. ageFernando: representa la edad de fernando
         * 2. ageAdultColombia: representa la edad adulta en colombia
         * 
         * Se debe imprimir si ferando es adulto o no usando System.out.println
         * Ej: 
         * Fernando is adult: true
         * Fernando is adult: false 
         * donde true false es el booleano fernandoIsAdult
         */
        int ageFernando = 30;
        int ageAdultColombia = 18;
        boolean fernandoIsAdult = false;
        
        if(ageFernando > ageAdultColombia){
            fernandoIsAdult = true;
        }
        System.out.println("Fernando is adult: " + fernandoIsAdult);
        
        
        /**
         * Que pasa con los numeros que poseen decimales?
         * double y float: pueden representar numeros con decimales
         */
        float calificacionFinalMate = 4.9f; //ojo no olvidar la f al final de la inicializacion
        
        System.out.println("Su calificacion final en matematicas es: " + calificacionFinalMate);
        
        double calificationFinalFisica;
        
        calificationFinalFisica = 3.9111111d; //ojo no olvidar la d al final de la inicializacion
        
        System.out.println("Su calificacion final en fisica es: " + calificationFinalFisica);
        
        
        
        /**
         * Ejecicios:
         * 1. Crear una variable llamada numeroEntero de tipo numerica e inicializar su valor en 10 postetior a esto imprimir su valor 
         * en consola, de la siguiente manera: El valor de la variable numero entero es: numeroEntero
         * 2. Despues del ejercicio anterior crear dos nuevas linea de codigo, en la primera linea cambiar el valor de la variable 
         * numeroEntero a 35, en la segunda linea imprimir nuevamente el valor de la variable de la siguiente manera: 
         * El valor de la variable numero entero es: numeroEntero, ¿Cual es el valor que se imprimira en consola al ejecutar las dos nuevas lineas?
         * 3. En este ejercicio se pretende que usted defina el tipo de variable que debe usar dependiendo de las condiciones siguientes:
         *      1. Ej: crear una variable llamada nombre, que contenga como valor: "Luis" - entendiendo que Luis es un conjunto de caracteres 
         *         el tipo de variable a usar debe ser un string, es decir la solucion es:
         *         String nombre = "Luis";
         *         System.out.println("Variable nombre" + nombre);
         *      NOTA: Siempre poner un System.out.println que imprima el valor de la variable.
         *      2. crear una variable de nombre numeroDeCuardernos que tiene un valor de 10
         *      3. Crear un variable llamada apellido que contenga "Martinez"
         *      4. Crear una variable llamada numeroDeManzanas que contenga el valor de 0
         *      5. Crear una variable llamada fernandoEsMayorDeEdad que contenga el valor de true
         *      6. Crear una variable llamada fernandoEsEnfermero que contenga el valor de false
         *      7. Crear una variable llamada cedula que contenga el numero 208831553321
         *      8. Crear una variable llamada cantidadMilitros que contenga el valor: 4.3
         */
        
    }
}
