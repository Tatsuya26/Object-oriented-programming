package com.company.F3;

import java.util.Arrays;
import java.util.Objects;

public class Telemovel {
    private String marca;
    private String modelo;
    private int display_x;
    private int display_y;
    private int armazenamento_fotos;
    private int armazenamento_apps;
    private int armazenamento_total;
    private int total_ocupado;
    private int num_fotos;
    private int num_apps;
    private String[] Apps;

    public Telemovel() {
        this.marca = null;
        this.modelo = null;
        this.display_y = 0;
        this.display_x = 0;
        this.armazenamento_total = 1024;
        this.armazenamento_fotos = 0;
        this.armazenamento_apps  = 0;
        this.armazenamento_fotos = 0;
        this.total_ocupado = 0;
        this.num_fotos = 0;
        this.num_apps = 0;
        this.Apps = null;
    }

    public Telemovel(String marca, String modelo, int dx, int dy,int armazenamento_total, int armazenamento_fotos, int armazenamento_apps, int nfotos, int num_apps) {
        this.marca = marca;
        this.modelo = modelo;
        this.display_y = dx;
        this.display_x = dy;
        this.armazenamento_total = 1024;
        this.armazenamento_fotos = armazenamento_fotos;
        this.armazenamento_apps  = armazenamento_apps;
        this.total_ocupado = armazenamento_apps + armazenamento_fotos;
        this.num_fotos = 0;
        this.num_apps = 0;
        this.Apps = null;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDisplay_x(int x) {
        this.display_x = x;
    }

    public void setDisplay_y(int y) {
        this.display_y = y;
    }

    public void setArmazenamento_fotos(int armazenamento_fotos) {
        this.armazenamento_fotos = armazenamento_fotos;
    }

    public void setNum_fotos(int n) {
        this.num_fotos = n;
    }

    public void setArmazenamento_apps(int armazenamento_apps) {
        this.armazenamento_apps = armazenamento_apps;
    }

    public void setNum_apps(int num_apps) {
        this.num_apps = num_apps;
    }

    public void setTotal_ocupado() {
        this.total_ocupado = this.armazenamento_apps + this.armazenamento_fotos;
    }

    public int getDisplay_x() {
        return display_x;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getArmazenamento_apps() {
        return armazenamento_apps;
    }

    public int getArmazenamento_fotos() {
        return armazenamento_fotos;
    }

    public int getArmazenamento_total() {
        return armazenamento_total;
    }

    public int getDisplay_y() {
        return display_y;
    }

    public int getNum_apps() {
        return num_apps;
    }

    public int getNum_fotos() {
        return num_fotos;
    }

    public int getTotal_ocupado() {
        return total_ocupado;
    }

    public String[] getApps() {
        return Apps;
    }

    public void setArmazenamento_total(int armazenamento_total) {
        this.armazenamento_total = armazenamento_total;
    }


    public String toString() {
        return "Telemovel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", display_x=" + display_x +
                ", display_y=" + display_y +
                ", armazenamento_fotos=" + armazenamento_fotos +
                ", armazenamento_apps=" + armazenamento_apps +
                ", armazenamento_total=" + armazenamento_total +
                ", total_ocupado=" + total_ocupado +
                ", num_fotos=" + num_fotos +
                ", num_apps=" + num_apps +
                ", Apps=" + Arrays.toString(Apps) +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telemovel)) return false;
        Telemovel telemovel = (Telemovel) o;
        return display_x == telemovel.display_x && display_y == telemovel.display_y && armazenamento_fotos == telemovel.armazenamento_fotos && armazenamento_apps == telemovel.armazenamento_apps && armazenamento_total == telemovel.armazenamento_total && total_ocupado == telemovel.total_ocupado && num_fotos == telemovel.num_fotos && num_apps == telemovel.num_apps && Objects.equals(marca, telemovel.marca) && Objects.equals(modelo, telemovel.modelo) && Arrays.equals(Apps, telemovel.Apps);
    }

}
