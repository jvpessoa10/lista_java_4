package school.cesar.Q2;

import com.sun.deploy.util.StringUtils;
import school.cesar.exceptions.InvalidParameterException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ConversorMorse {


    static final Map MORSE  = new HashMap<String, String>(){
            {
                put("A",".-");
                put("B","-...");
                put("C","-.-.");
                put("D","-..");
                put("E",".");
                put("F","..-.");
                put("G","--.");
                put("H","....");
                put("I","..");
                put("J",".---");
                put("K","-.-");
                put("L",".-..");
                put("M","--");
                put("N","-.");
                put("O","---");
                put("P",".--.");
                put("Q","--.-");
                put("R",".-.");
                put("S","...");
                put("T","-");
                put("U","..-");
                put("V","...-");
                put("W",".--");
                put("X","-..-");
                put("Y","-.--");
                put("Z","--..");
                put("1",".----");
                put("2","..---");
                put("3","...--");
                put("4","....-");
                put("5",".....");
                put("6","-....");
                put("7","--...");
                put("8","---..");
                put("9","----.");
                put("0","-----");
                put(" ","   ");


            }
    };

    public static String fromMorseToPortuguese(String morse) throws InvalidParameterException{

        StringBuilder finalString = new StringBuilder();

        String [] rawWords =  morse.split("[ ]{3}");

        for (String rawWord : rawWords) {
            String [] words = rawWord.split("[ ]");

            for (String word : words) {
                String result = getKeysByValue(MORSE,word);
                if (result.equals("")) throw  new InvalidParameterException("Caractere inválido: "+ word);
                finalString.append(result);

            }
            finalString.append(" ");
        }

        return finalString.toString();
    }

    static String fromPortugueseToMorse(String morse) throws InvalidParameterException {

        StringBuilder newString = new StringBuilder();
        char [] letters = morse.toUpperCase().toCharArray();

        for (Character letter : letters) {

            Object newLetter = MORSE.get(letter.toString());

            if(newLetter == null) throw new InvalidParameterException("Caractere inválido: "+ letter);
            newString.append(newLetter);

            if(letter != ' ') newString.append(' ');
        }

        return newString.toString();

    }

    public static <T, E> String getKeysByValue(Map<T, E> map, E value) {

        return StringUtils.join( map.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet()), " ");
    }
}
