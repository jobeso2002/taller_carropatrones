package com.carros.carro.abstrctfactory;

import com.carros.carro.model.Chasis;
import com.carros.carro.model.Cojineria;
import com.carros.carro.model.Motor;

public class MazdaFactory implements VehiculoFactory{
    @Override
    public Chasis crearChasis() {
        return new Chasis(4, "M001", "Automática");
    }

    @Override
    public Motor crearMotor() {
        return new Motor(220, "M002", "Eléctrico");
    }

    @Override
    public Cojineria crearCojineria() {
        return new Cojineria("M003", "Sintético");
    }
}
