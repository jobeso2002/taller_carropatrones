package com.carros.carro.abstrctfactory;

import com.carros.carro.model.Chasis;
import com.carros.carro.model.Cojineria;
import com.carros.carro.model.Motor;

public class FordFactory implements VehiculoFactory{
    @Override
    public Chasis crearChasis() {
        return new Chasis(4, "F001", "Mecánica");
    }

    @Override
    public Motor crearMotor() {
        return new Motor(180, "F002", "Térmico");
    }

    @Override
    public Cojineria crearCojineria() {
        return new Cojineria("F003", "Tela");
    }
}
