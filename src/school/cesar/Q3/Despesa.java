package school.cesar.Q3;

import sun.security.krb5.internal.crypto.Des;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Despesa {

    private String nome;

    private double valor;

    private Date dataDeInsersao;


    public Despesa(String nome, double valor, Date dataDeInsersao) {
        this.nome = nome;
        this.valor = valor;
        this.dataDeInsersao = dataDeInsersao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataDeInsersao() {
        return dataDeInsersao;
    }

    public void setDataDeInsersao(Date dataDeInsersao) {
        this.dataDeInsersao = dataDeInsersao;
    }




    public static class  InverseValorComparator implements Comparator<Despesa> {

        @Override
        public int compare(Despesa o1, Despesa o2) {

            if(o1.getValor() < o2.getValor()){
                return 1;
            }else if(o1.getValor() > o2.getValor()){
                return -1;
            }

            return 0;
        }
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", dataDeInsersao=" + dataDeInsersao +
                '}';
    }
}
