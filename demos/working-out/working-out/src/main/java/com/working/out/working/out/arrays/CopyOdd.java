package com.working.out.working.out.arrays;

import java.util.Arrays;

/**
 *Dado el Array numeros imprimir los numeros impares contenidos en el array
 */
public class CopyOdd {

    public static void main(String[] args) {

        int[] numeros = {1,2,2,3,4,5,6,7,1,2,3,4,5,6,7,4,11,2,33,22,33,41,42};

        /**
         * imprimir los impares
         */
        /**
         * Para satisfacer el requerimiento se debe
         * 1. contar los impares en el arreglo
         * 2. con el numero de impares interior se debe crear un nuevo array
         * del tamaño de numeros impares.
         * 3. por ultimo recorrer el array y agregar todos los pares al nuevo array
         */

        /**
         * cuento los pares
         */
        int numerosImparesEnArray = 0;
        for(int indicePrimerArray=0; indicePrimerArray<numeros.length; indicePrimerArray++){
            if (numeros[indicePrimerArray]%2 != 0) {
                numerosImparesEnArray++;
            }
        }

        /**
         * creo el nuevo array del tamaño de los numeros impares presentes
         */
        int[] numerosImpares = new int[numerosImparesEnArray];
        int indiceImpares = 0;

        /**
         * agrego todos los impares al nuevo array
         */
        for(int indiceNumeros =0; indiceNumeros<numeros.length; indiceNumeros++){
            if (numeros[indiceNumeros]%2 != 0) {
                numerosImpares[indiceImpares] = numeros[indiceNumeros];
                indiceImpares++;
            }
        }
        Arrays.stream(numerosImpares).forEach(System.out::println);
    }
}
