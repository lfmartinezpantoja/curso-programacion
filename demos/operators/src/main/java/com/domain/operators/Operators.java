/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.domain.operators;

/**
 *
 * @author fernando
 */
public class Operators {

    public static void main(String[] args) {
        
        
        /**
         * Operadores ariteticos
         * 
         * Te permiten realizar operaciones matematicas con tus variables o numeros
         * literales
         */
        
        /**---------------------------------------------------------------------------------*/
        
        /**
         * Operador Suma
         * Permmite sumar dos variables
         */
        /**
         * Ej: Se tiene una tienda de frutas, el dia de hoy llegaron nuevas
         * cajas con naranjas desde el distribuidor, se tienen dos variables,
         * la primera llamada naranjasEnTienda que representan las naranjas 
         * que se disponen en la tienda actualmente y la segunda es naranjasDistribuidor
         * Requerimiento: Se necesita crear un tercera varaible que almacene el total de 
         * naranjas, las disponibles en tienda y la que llegaron del distribuidor
         * y mostrar en pantalla un mensaje con el numero total de naranjas
         */
        
        int naranjasEnTienda = 10;
        int naranjasDistribuidor = 101;
        
        int totalNaranjas = naranjasEnTienda + naranjasDistribuidor;
        System.out.println("El numero total de naranjas es: " + totalNaranjas);
        
        
        
        /**---------------------------------------------------------------------------------*/
        /**
         * Operacion concatenacion
         * Sirva para unir dos strings o mas en uno solo
         */
        String fraseIncompleta1 = "Mi nombre es ";
        String fraseIncompleta2 = "Pepito Pinos";
        //Se requiere unirlas para que la oracion tenga sentido en otra variable
        String fraseCompleta = fraseIncompleta1 + fraseIncompleta2;
        System.out.println(fraseCompleta);
        
        //Que pasa si quiero crear una cuarta variable que agrege: y mi edad es 12
        
        String fraseCompleta2 = fraseCompleta + " y mi edad es 12";
        System.out.println(fraseCompleta2);
        
        int edad = 12;
        
        String fraseCompleta3 = fraseCompleta + " y mi edad es " + edad;
        System.out.println(fraseCompleta3);
        
        /**
         * Operador resta.
         * 
         * Ej: se tienen 2 variables tipo entero, 
         * la variable dinero representa el dinero en efectivo disponible
         * para realizar una compra, la variable valorEctrodomestico representa
         * el valor de un objecto que es requerido comprar
         * Requerimiento: Crear una variable llamada dineroRestante que representa la diferencia o resta 
         * de el dinero y valorEctrodomestico, por ultimo imprimir el valor esta variable
         */
        int dinero = 100000;
        int valorEctrodomestico = 30000;
        int dineroRestante = dinero - valorEctrodomestico;
        System.out.println("El dinero restante es: " + dineroRestante);
        
        
        /**
         * Operador residuo y division.
         * 
         * Ej: se tienen 2 variables tipo entero, 
         * La variable numeroRebanasPizza que representa el numero de rebanadas de una pizza (su valor sera de 8)
         * y la variable numeroDePersonas que representa el numero de personas que comeran la pizza (su valor sera de 3)
         * Requerimiento: Crear dos variables, la primer llamada residuo y la segunda llamada division,
         * con la primera variable debe contener el numero de rebanadas restantes y la segunda el numero de rebanadas a comer
         * por persona
         */
        
        
        
        
        /**-----------------------------------------------------------------------*/
        /**
         * Operadores logicos
         * Permiten espresan sentencias - expresiones que pueden representan uno de los dos siguientes valores: true o false (falso verdadero)
        */ 
        
        /**
         * Operador: y
         * Ex: Imagina que tiene dos variables booleanas (esAdulto y esMasculino), el valor inicial debe ser false para ambas
         * Requerimiento: imprimir en consola el siguiente mensaje: 
         * La persona es adulta y de genero masculino: false
         * el false al final de la oración debe representar una nueva variable llamada esAdultoYEsMasculino, la tarea es crear la expresion
         * logica que genere el valor de esa variable
         */
        boolean esAdulto = false;
        boolean esMasculino = false;
        boolean esAdultoYEsMasculino = esAdulto && esMasculino;
        System.out.println("La persona es adulta y de genero masculino: "+ esAdultoYEsMasculino);
       
    }
}
