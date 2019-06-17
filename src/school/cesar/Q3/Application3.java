package school.cesar.Q3;

import java.util.ArrayList;
import java.util.Date;

public class Application3 {

    public static void main(String[] args) {


        Contabilidade contabilidade = new Contabilidade();


        contabilidade.addDespesas(new Despesa("joao",2.4,new Date()));

        contabilidade.addDespesas(new Despesa("pedro",2.1,new Date()));

        contabilidade.addDespesas(new Despesa("joao",2.4,new Date()));

        System.out.println("MAIOR PARA MENOR:");
        contabilidade.verDespesasPorValorMaiorMenor();


        System.out.println("MENOR PARA MAIOR:");
        contabilidade.verDespesasPorValorMenorMaior();


        System.out.println("POR DATA:");
        contabilidade.verDespesasPorData();

        System.out.println("POR NOME:");
        contabilidade.verDespesasPorNome();



        System.out.println("MEDIA DESPESAS:");
        System.out.println(contabilidade.getMediaDeDespesas());

        System.out.println("SOMA DAS DESPESAS:");
        System.out.println(contabilidade.getSomaDespesas());

        System.out.println("MAIOR DESPESA:");
        System.out.println(contabilidade.getMaiorDespesa());

        System.out.println("MENOR DESPESA:");
        System.out.println(contabilidade.getMenorDespesa());

        System.out.println("MENORES QUE UM NUMERO DADO:");
        System.out.println(contabilidade.getFromRange(2.3));

        ArrayList<String> nomes= contabilidade.getNames();

        System.out.println("NOMES:");
        nomes.forEach(System.out::println);

    }
}
