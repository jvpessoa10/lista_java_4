package school.cesar.Q1;

import java.util.List;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        TresLetras tresLetras = new TresLetras();
        Scanner in = new Scanner(System.in);

        boolean validInput;
        do{
            validInput  = true;

            System.out.println("Digite a palavra (Max. 5 letras): ");
            String input = in.nextLine();

            try{
                List<String> permutations = tresLetras.getTreeWordsCombinations(input);
                permutations.forEach(System.out::println);

            }catch (InvalidParameterException e){
                e.printStackTrace();
                validInput = false;
            }

        }while (!validInput);
    }
}
