package com.company.F3;
import com.company.F3.Circulo;


public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(1,1,3);
        Circulo c3 = new Circulo(c2);

        //Teste de construtor e toString
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        //Teste da função equals
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c2.equals(c2));

        //Teste de outros metodos
        System.out.println("Raio de c3 = " + c3.calculaArea());
        System.out.println("Perimetro de c3 = " + c3.calculaPerimetro());
    }
}
