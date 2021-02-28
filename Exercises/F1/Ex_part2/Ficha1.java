package com.company;
import java.time.LocalDateTime;

public class Ficha1 {
    //implementação dos métodos que permitem
    //responder a cada um dos exercícios propostos
    //Ex 1
    public double celsiusParaFarenheit(double graus){
        return 1.8 * graus + 32;
    }

    //Ex 2
    public int maximoNumeros( int a, int b) {
        int r = a;
        if(a < b) r = b;
        return r;
    }

    //Ex 3
    public String criaDescricaoConta(String nome, float saldo) {return "Nome: " + nome + ", saldo: " + saldo;}

    //Ex 4
    public double eurosParaLibras( double valor, double taxaConversao) {
        return valor * taxaConversao;
    }

    //Ex 6
    public long factorial( int num) {
        int r = 1;
        for(int i = 0; i <= num; i++) r *=num;
        return r;
    }

    public long tempoGasto() {
        int previus_date = LocalDateTime.now().getNano();
        long fact = factorial(5000);
        return LocalDateTime.now().getNano() - previus_date;
    }
}
