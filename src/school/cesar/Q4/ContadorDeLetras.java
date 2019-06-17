package school.cesar.Q4;

import school.cesar.exceptions.InvalidParameterException;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContadorDeLetras {



    static HashMap occurrences(String word) throws InvalidParameterException {


        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(word);

        if(m.find()) throw new InvalidParameterException("Caracteres inválidos");

        HashMap<Character,Integer> occurrencesTotal = new HashMap<>();
        char [] letters = word.toLowerCase().toCharArray();

        for (char letter : letters) {

            Integer ocurrences = occurrencesTotal.get(letter);

            if(ocurrences == null){
                ocurrences = 0;
            }

            occurrencesTotal.put(letter, ocurrences+1);
        }


        return occurrencesTotal;
    }
}
