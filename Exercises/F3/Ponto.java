package com.company.F3;

public class Ponto {
    private int x;
    private int y;

    public Ponto()  {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x ,int y) {
        this.x = x;
        this.y = y;
    }

    public  Ponto(Ponto  umPonto) {
        this.x = umPonto.getX();
        this.y = umPonto.getY();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ponto clone() {
        return new Ponto(this);
    }

    public String toString() {
        return "Ponto{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }

    public double  distancia(Ponto  umPonto) {
        return  Math.sqrt(Math.pow(this.x - umPonto.getX(), 2) +
            Math.pow(this.y - umPonto.getY(), 2));
    }
}
