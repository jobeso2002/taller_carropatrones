package com.carros.carro.controller;

import com.carros.carro.abstrctfactory.FordFactory;
import com.carros.carro.abstrctfactory.MazdaFactory;
import com.carros.carro.abstrctfactory.ToyotaFactory;
import com.carros.carro.abstrctfactory.VehiculoFactory;
import com.carros.carro.model.Chasis;
import com.carros.carro.model.Cojineria;
import com.carros.carro.model.Motor;
import com.carros.carro.model.Vehiculo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/vehiculo")

public class VehiculoControlloler {
    @PostMapping("ensamblar")
    public Vehiculo ensamblarVehiculo(@RequestBody EnsamblarVehiculoRequest request) {
        VehiculoFactory factory;

        switch (request.getMarca().toLowerCase()) {
            case "toyota":
                factory = new ToyotaFactory();
                break;
            case "ford":
                factory = new FordFactory();
                break;
            case "mazda":
                factory = new MazdaFactory();
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada: " + request.getMarca());
        }

        Chasis chasis = factory.crearChasis();
        Motor motor = factory.crearMotor();
        Cojineria cojineria = factory.crearCojineria();

        return new Vehiculo(request.getMarca(), request.getColor(), LocalDate.now().toString(),
                request.getNumeroEnsamblaje(), chasis, motor, cojineria);

    }


}
