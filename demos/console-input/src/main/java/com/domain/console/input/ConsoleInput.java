/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.domain.console.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fernando
 */
public class ConsoleInput {

    public static void main(String[] args) throws IOException {
        int salir = 0;
        while(salir == 0){

            BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));            
            System.out.println("Ingrese un numero: ");
            // Reading data using readLine
            int numberOne = Integer.valueOf(reader.readLine()); 
           
            
            System.out.println("Ingrese otro numero: ");
            // Reading data using readLine
            int numberTwo = Integer.valueOf(reader.readLine()); 
           
            int suma = numberOne + numberTwo;
            System.out.println("La suma de los numeros es: " + suma);
            
            System.out.println("Desea salir? Y (salir)/N (continuar)");

            String continuarSalir = reader.readLine(); 
           
            if(continuarSalir.equalsIgnoreCase("Y")){
                salir = 1;
            }
        }
    }
}
