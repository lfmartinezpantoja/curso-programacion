package com.working.out.working.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Escriba un programa que reciba la edad de una persona e imprima en consola true si es
 * mayor que 18 y false si es menor que 18
 */
public class IsAdultMain {

    public static void main(String[] args) throws IOException {
        int salir = 0;
        while (salir == 0) {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            //Here you should put your code

            System.out.println("Please write something:");
            String input  = reader.readLine();
            System.out.println(input);

            //
            System.out.println("Desea salir? Y (salir)/N (continuar)");

            String continuarSalir = reader.readLine();

            if(continuarSalir.equalsIgnoreCase("Y")){
                salir = 1;
            }
        }
    }
}
