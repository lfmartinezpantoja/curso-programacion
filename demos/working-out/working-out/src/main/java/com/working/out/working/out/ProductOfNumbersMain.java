package com.working.out.working.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Escriba un programa que reciba el numero de numeros dado en la variable numeros
 * y calcular la multipicacion de esos numeros e imprimirlo en pantalla.
 * NOTA: usar while y luego hacerlo con for
 */
public class ProductOfNumbersMain {
    public static void main(String[] args) throws IOException {
        int salir = 0;
        while(salir == 0){

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            //Here you should put your code

            System.out.println("Ingrese un numero de numeros a recibir ");
            // Reading data using readLine
            int numeros = Integer.valueOf(reader.readLine());



            //----------------------------------

            System.out.println("Desea salir? Y (salir)/N (continuar)");

            String continuarSalir = reader.readLine();

            if(continuarSalir.equalsIgnoreCase("Y")){
                salir = 1;
            }
        }
    }
}
