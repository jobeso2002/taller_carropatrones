package com.carros.carro.model;

public class Chasis {
    private int numeroEjes;
    private String numeroPieza;
    private String tipoTransmision;

    public Chasis(int numeroEjes, String numeroPieza, String tipoTransmision) {
        this.numeroEjes = numeroEjes;
        this.numeroPieza = numeroPieza;
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
}
