package com.carros.carro.abstrctfactory;

import com.carros.carro.model.Chasis;
import com.carros.carro.model.Cojineria;
import com.carros.carro.model.Motor;

public interface VehiculoFactory {
    Chasis crearChasis();
    Motor crearMotor();
    Cojineria crearCojineria();
}
