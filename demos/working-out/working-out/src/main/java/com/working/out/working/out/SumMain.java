package com.working.out.working.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumMain {
    public static void main(String[] args) throws IOException {
        int salir = 0;
        while(salir == 0){

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            //Here you should put your code

            System.out.println("Ingrese un numero: ");
            // Reading data using readLine
            int numberOne = Integer.valueOf(reader.readLine());

            System.out.println("Ingrese otro numero: ");
            // Reading data using readLine
            int numberTwo = Integer.valueOf(reader.readLine());

            int suma = numberOne + numberTwo;
            System.out.println("La suma de los numeros es: " + suma);

            //----------------------------------

            System.out.println("Desea salir? Y (salir)/N (continuar)");

            String continuarSalir = reader.readLine();

            if(continuarSalir.equalsIgnoreCase("Y")){
                salir = 1;
            }
        }
    }
}
