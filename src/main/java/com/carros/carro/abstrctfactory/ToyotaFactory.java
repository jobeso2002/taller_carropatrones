package com.carros.carro.abstrctfactory;

import com.carros.carro.model.Chasis;
import com.carros.carro.model.Cojineria;
import com.carros.carro.model.Motor;

public class ToyotaFactory implements VehiculoFactory{
    @Override
    public Chasis crearChasis(){
        return new Chasis(4,"T001","automatica");
    }
    @Override
    public Motor crearMotor() {
        return new Motor(200, "T002", "Híbrido");
    }

    @Override
    public Cojineria crearCojineria() {
        return new Cojineria("T003", "Cuero");
    }
}
