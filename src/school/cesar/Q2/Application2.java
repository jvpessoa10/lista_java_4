package school.cesar.Q2;

import school.cesar.exceptions.InvalidParameterException;

public class Application2 {

    public static void main(String[] args) {

        try{
            System.out.println(ConversorMorse.fromPortugueseToMorse("EU USO JAVA!"));

        }catch (InvalidParameterException e){
            e.printStackTrace();
            System.out.println();
        }

        try{
            System.out.println(" 'EU USO JAVA' - Morse: "+ConversorMorse.fromPortugueseToMorse("EU USO JAVA"));

        }catch (InvalidParameterException e){
            e.printStackTrace();
            System.out.println();

        }


        try{
            System.out.println("'a. ..-   ..- ... ---   .--- .- ...- .-' - Portugues : "+ConversorMorse.fromMorseToPortuguese("a. ..-   ..- ... ---   .--- .- ...- .- "));

        }catch (InvalidParameterException e){
            e.printStackTrace();
            System.out.println();
        }

        try{
            System.out.println("'. ..-   ..- ... ---   .--- .- ...- .-' - Portugues : "+ConversorMorse.fromMorseToPortuguese(". ..-   ..- ... ---   .--- .- ...- .- "));

        }catch (InvalidParameterException e){
            e.printStackTrace();
            System.out.println();
        }
    }
}
