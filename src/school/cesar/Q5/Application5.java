package school.cesar.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application5 {

    private  final static int numberOfSimulations = 10;


    public static void main(String[] args) {


        //TESTE MOKADO

        List<Integer> test1 = new ArrayList<>();
        test1.add(2);
        test1.add(4);
        test1.add(1);

        List<Integer> test2= new ArrayList<>();
        test2.add(3);
        test2.add(1);
        test2.add(10);

        ComparaListas.comparaListas(test1,test2).forEach(System.out::println);


        //SIMULAÇÔES
        for (int i = 0; i < numberOfSimulations ; i++) {

            System.out.println("Lista A: ");
            List<Integer> a = getRandomList();
            a.forEach(System.out::println);

            System.out.println("Lista B: ");
            List<Integer> b = getRandomList();
            b.forEach(System.out::println);

            List<Integer> result = ComparaListas.comparaListas(a,b);

            System.out.println("Resultado: ");
            result.forEach(System.out::println);

        }
    }



    private static  List<Integer> getRandomList(){

        Random r = new Random();

        int size = r.nextInt(100);


        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i <size ; i++) {
            lista.add(r.nextInt((1000 - (-1000)) + 1)  + (-1000));
        }

        return lista;

    }
}
