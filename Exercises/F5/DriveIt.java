package com.company.F5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class DriveIt {
    private String name;
    private Map<String, Veiculo> veiculos;
    private Boolean promocao;

    public DriveIt() {
        this.name = "";
        this.veiculos = new HashMap<>();
        this.promocao = false;

    }

    public DriveIt(String n, Map<String, Veiculo> vs) {
        this.name = n;
        setVeiculos(vs);
        this.promocao = false;
    }

    public DriveIt(DriveIt d) {
        this.name = d.get_name();
        this.veiculos = d.getVeiculos();
        this.promocao = d.getPromoacao();
    }

    public String get_name() {
        return this.name;
    }

    public Map<String,Veiculo> getVeiculos() {
        Map<String, Veiculo> acc = new HashMap<>();
        for(Veiculo v: this.veiculos.values())  acc.put(v.getMatricula(), v.clone());
        return acc;
    }

    public Boolean getPromoacao() {
        return this.promocao;
    }


    public void setVeiculos(Map<String, Veiculo> veiculos) {
        this.veiculos = new HashMap<>();
        for(Veiculo v: this.veiculos.values())
            this.veiculos.put(v.getMatricula(), v.clone());
    }

    public boolean existeVeiculo(String cod) {
        return this.veiculos.containsKey(cod);
    }

    public int quantos() {
        return this.veiculos.size();
    }

    public int quantosT(String tipo) {
        return (int) this.veiculos.values().stream()
                                            .filter(v -> v.getMarca().equals(tipo))
                                            .count();
    }

    public List<Veiculo> getVeiculosAsList() {
        return this.veiculos.values().stream().map(Veiculo::clone).collect(Collectors.toList());
    }

    /*
    *
     */
    public Veiculo veiculo_mais_utilizado(){
        Comparator<Veiculo> cv = (v1, v2) -> (v1.getKms() != v2.getKms())
                                            ? (v2.getKms() - v1.getKms()) : v2.getMatricula().compareTo(v1.getMatricula());
        return  this.veiculos.values().stream()
                                      .map(Veiculo::clone)
                                      .sorted(cv)
                                      .findFirst().get().clone();
    }
}