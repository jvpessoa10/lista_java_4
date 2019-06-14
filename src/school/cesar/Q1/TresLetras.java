package school.cesar.Q1;

import java.util.ArrayList;
import java.util.List;

public class TresLetras {

    private final int N_SPACES = 3;


    public List<String> getTreeWordsCombinations(String word )throws InvalidParameterException{

        if(word.length() != 5 || !word.matches(".*[a-z].*")) {
            throw  new InvalidParameterException("Input inválido: " + word);
        }

        return this.permutate(word.substring(0,this.N_SPACES),0,this.N_SPACES-1);

    }

    private List<String> permutate(String word,int startRange, int finalRange ){

        List<String> permutationNode = new ArrayList<>();

        if(startRange == finalRange) permutationNode.add(word);

        for (int i = startRange; i <= finalRange; i++) {
            word = swap(word, startRange, i);
            permutationNode.addAll(permutate(word,startRange+1,finalRange));
            word  = swap(word, startRange, i);

        }


        return permutationNode;
    }

    private String swap(String word, int indexI, int indexJ){

        char [] letterArray = word.toCharArray();

        char tmp = letterArray[indexI];
        letterArray[indexI] = letterArray[indexJ];
        letterArray[indexJ] = tmp;

        return new String(letterArray);
    }


}
