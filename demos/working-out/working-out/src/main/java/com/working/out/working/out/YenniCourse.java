package com.working.out.working.out;

public class YenniCourse {
    public static void main(String[] args) {

        String phrase = "hola mi nombre es yeniffer y mi segundo nombre es Estefa";

        System.out.println("phrase: " + phrase);

        String[] words =phrase.split(" ");

        /**
         * This part of the code print all words
         */
        System.out.println("number of words: " + words.length);
        System.out.println("Words: ");
        for(int indexPhrase = 0; indexPhrase < words.length; indexPhrase++){
            System.out.println("word number " + indexPhrase + ": " + words[indexPhrase]);
        }


        /**
         * This part of code count the repeated words
         */
        String[] countedWords = new String[words.length];
        //Hago un ciclo para recorrer una a una las palabras
        for(int indexOfPhrase = 0; indexOfPhrase < words.length; indexOfPhrase++){
            //dentro de este ciclo necesito saber cada palabra que voy leyendo se encuentra
            //repetida en el array words, por ende necesito otro array
            String word = words[indexOfPhrase];
            int counterOfWords = 0;
            for(int indexOfPhraseTwo = 0; indexOfPhraseTwo < words.length; indexOfPhraseTwo++){
                if(word.equals(words[indexOfPhraseTwo])){
                    counterOfWords++;
                }
            }
            //Se compara si la palabra esta presente mas de dos veces en el array
            if(counterOfWords >= 2){
                System.out.println("The word " + word +" is repeated: " + counterOfWords + " times");
            }
        }
    }
}
