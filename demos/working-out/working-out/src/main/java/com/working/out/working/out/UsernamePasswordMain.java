package com.working.out.working.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Escriba un programa que reciba un nombre  y constraseña
 * y los compare que las variables name y password
 * si es igual imprima: usuario y contrasenaña correctos
 * si no son iguales imprima: lo sentimos tu usuario y contraseña no coinciden
 *
 */
public class UsernamePasswordMain {

    public static void main(String[] args) throws IOException {
        String name = "Jose";
        String password = "contrasena123";
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
