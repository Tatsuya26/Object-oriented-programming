package com.company.F3;

import java.util.Objects;

public class Triangulo {
    private Ponto v1,v2,v3;

    public Triangulo() {
        this.v1 = new Ponto();
        this.v2 = new Ponto();
        this.v3 = new Ponto();
    }

    public Triangulo(Ponto x, Ponto y, Ponto z) {
        this.v1 = x.clone();
        this.v2 = y.clone();
        this.v3 = z.clone();
    }

    public Triangulo(Triangulo t) {
        this.v1 = t.v1.clone();
        this.v2 = t.v2.clone();
        this.v3 = t.v3.clone();
    }

    public Ponto getV1() {
        return this.v1.clone();
    }

    public Ponto getV2() {
        return this.v2.clone();
    }

    public Ponto getV3() {
        return this.v3.clone();
    }

    public void setV1(Ponto v) {
        this.v1 = v.clone();
    }

    public void setV2(Ponto v) {
        this.v2 = v.clone();
    }

    public void setV3(Ponto v) {
        this.v3 = v.clone();
    }

    //useful functions
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo)) return false;
        Triangulo triangulo = (Triangulo) o;
        return Objects.equals(this.v1, triangulo.v1) && Objects.equals(this.v2, triangulo.v2) && Objects.equals(this.v3, triangulo.v3);
    }


    public String toString() {
        return "Triangulo{ \n" +
                "v1=" + v1 +
                ",\nv2=" + v2 +
                ",\nv3=" + v3 +
                '}';
    }

    public Triangulo clone() {
        return new Triangulo(this);
    }

    // Calculus

    public double calculaAreaTriangulo(){
        double a = this.v1.distancia(this.v2);
        double b = this.v2.distancia(this.v3);
        double c = this.v3.distancia(this.v1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double calculaPerimetroTriangulo() {
        double a = this.v1.distancia(this.v2);
        double b = this.v2.distancia(this.v3);
        double c = this.v3.distancia(this.v1);
        return a + b + c;
    }

}
