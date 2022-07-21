package com.working.out.working.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberIsOddOrEvenMain {

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
