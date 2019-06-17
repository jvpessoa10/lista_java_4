package school.cesar.Q3;

import java.util.*;

public class Contabilidade {


    private HashMap<String,Despesa> despesas;


    public Contabilidade() {
        this.despesas = new HashMap<>();
    }

    public HashMap<String, Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(HashMap<String, Despesa> despesas) {
        this.despesas = despesas;
    }


    /*Apenas coloca se não existir Despesa com o mesmo nome*/
    public void addDespesas(Despesa despesa){
        despesas.putIfAbsent(despesa.getNome(),despesa);
    }



    public void verDespesasPorValorMenorMaior(){

        ArrayList<Despesa> sortedDespesas = new ArrayList<Despesa>(despesas.values());

        sortedDespesas.sort(Comparator.comparing(Despesa::getValor));

        sortedDespesas.forEach(System.out::println);

    }

    public void verDespesasPorValorMaiorMenor(){

        ArrayList<Despesa> sortedDespesas = new ArrayList<Despesa>(despesas.values());

        sortedDespesas.sort(new Despesa.InverseValorComparator());

        sortedDespesas.forEach(System.out::println);

    }

    public void verDespesasPorData(){
        ArrayList<Despesa> sortedDespesas = new ArrayList<Despesa>(despesas.values());

        sortedDespesas.sort(Comparator.comparing(Despesa::getDataDeInsersao));

        sortedDespesas.forEach(System.out::println);
    }


    public void verDespesasPorNome(){
        ArrayList<Despesa> sortedDespesas = new ArrayList<Despesa>(despesas.values());

        sortedDespesas.sort(Comparator.comparing(Despesa::getNome));

        sortedDespesas.forEach(System.out::println);
    }



    public double getMediaDeDespesas(){

        return this.getSomaDespesas()/despesas.size();

    }

    public double getSomaDespesas(){
        double amount = 0;
        for(Map.Entry<String,Despesa> entry: despesas.entrySet()){
            amount += entry.getValue().getValor();
        }
        return amount;
    }


    public Despesa getMaiorDespesa(){
        Despesa maior = despesas.entrySet().iterator().next().getValue();

        for(Map.Entry<String,Despesa> entry: despesas.entrySet()){
            if(maior.getValor() < entry.getValue().getValor()) maior = entry.getValue();
        }

        return maior;
    }

    public Despesa getMenorDespesa(){
        Despesa maior = despesas.entrySet().iterator().next().getValue();

        for(Map.Entry<String,Despesa> entry: despesas.entrySet()){
            if(maior.getValor() > entry.getValue().getValor()) maior = entry.getValue();
        }
        return maior;
    }

    public ArrayList<Despesa> getFromRange(double max){
        ArrayList<Despesa> menoresQueRange= new ArrayList<>();

        for(Map.Entry<String,Despesa> entry: despesas.entrySet()){
            if(max > entry.getValue().getValor()) menoresQueRange.add(entry.getValue());
        }

        return menoresQueRange;
    }



    public ArrayList<String> getNames(){

        return new ArrayList<>(despesas.keySet());
    }


}
