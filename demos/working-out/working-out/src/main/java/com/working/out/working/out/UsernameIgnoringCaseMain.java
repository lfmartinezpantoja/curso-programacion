package com.working.out.working.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Escriba un programa que reciba un nombre y lo compare que la variable name
 * declarada en la linea 14 pero ignorando mayusculas y minusculas, si es igual imprima: los nombres son iguales
 * si no son iguales imprima: los nombres son diferentes
 *
 */
public class UsernameIgnoringCaseMain {

    public static void main(String[] args) throws IOException {
        String name = "Jose";
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
