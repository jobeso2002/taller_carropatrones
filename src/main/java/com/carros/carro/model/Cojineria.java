package com.carros.carro.model;

public class Cojineria {
    private String numeroPieza;
    private String materialBase;

    public Cojineria(String numeroPieza, String materialBase) {
        this.numeroPieza = numeroPieza;
        this.materialBase = materialBase;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getMaterialBase() {
        return materialBase;
    }

    public void setMaterialBase(String materialBase) {
        this.materialBase = materialBase;
    }
}
