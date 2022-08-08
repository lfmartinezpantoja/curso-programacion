package com.working.out.working.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Recibir un numero que representa la temperatura en celciuis y convertirla a
 * Fahrenheit, formula: f = 9*c/5 + 32
 * imprima en pantalla: los grados Fahrenheit son: f
 */
public class ConvertCelciusToFahrenheitMain {
    public static void main(String[] args) throws IOException {
        int salir = 0;
        while(salir == 0){

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            //Here you should put your code


            //----------------------------------

            System.out.println("Desea salir? Y (salir)/N (continuar)");

            String continuarSalir = reader.readLine();

            if(continuarSalir.equalsIgnoreCase("Y")){
                salir = 1;
            }
        }
    }
}
