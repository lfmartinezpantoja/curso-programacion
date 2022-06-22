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
        System.out.print("Mi nombre es" + nombre + " y mi cedula es:" + cedula);
        
        /**
         * Como se puede observar para imprimir en pantalla se usa la funcion print 
         * que hacer parte de  System.out, esta recibe como argumento el stringa imprimir
         */
        
        
    }
}
