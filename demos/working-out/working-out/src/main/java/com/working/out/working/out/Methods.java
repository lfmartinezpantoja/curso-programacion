package com.working.out.working.out;

public class Methods {
    public static void main(String[] args) {

        int numeroA = 50;
        int numeroB = 20;


        /**
         * Con los dos numeros anteriores realizar la suma y la resta e
         * imprimirla en consola
         */

        int respuestaSuma = sumar(numeroB, numeroB);
        System.out.println("Suma: " + respuestaSuma);

        respuestaSuma = sumar(30, 40);
        System.out.println("Suma: " + respuestaSuma);

        respuestaSuma = sumar(numeroB, 40);
        System.out.println("Suma: " + respuestaSuma);

        respuestaSuma = sumar(20, numeroA);
        System.out.println("Suma: " + respuestaSuma);

    }
    public static int sumar(int numeroUno, int numberoDos){
        int suma = numeroUno + numberoDos;
        return suma;
    }

    public static int resta(int numeroUno, int numberoDos){
        int resta = numeroUno + numberoDos;
        return resta;
    }

    /**
     * Cree un metodo que reciba 2 numeros y un tercer parametro llamado operacion de
     * tipo string y con este parametro (operacion: suma, resta, multiplicacion, division)
     * ejecute la operacion requerida con los numeros recibidos
     */
}
