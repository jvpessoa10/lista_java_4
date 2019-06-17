package school.cesar.Q4;

import school.cesar.exceptions.InvalidParameterException;

public class Application4 {

    public static void main(String[] args) {


        try {
            System.out.println(ContadorDeLetras.occurrences("aabbb"));

            System.out.println(ContadorDeLetras.occurrences("aabbbaaAA"));

            System.out.println(ContadorDeLetras.occurrences("aabbb!"));
        }catch (InvalidParameterException e){
            e.printStackTrace();
        }
    }
}
