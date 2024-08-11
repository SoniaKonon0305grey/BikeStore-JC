package com.bikestore.controller.impl;

import com.bikestore.controller.Command;
import com.bikestore.entity.Vehicle;
import com.bikestore.service.VehicleService;
import com.bikestore.service.impl.VehicleServiceImpl;

public class UpdateVehicleCommand implements Command {
    private final VehicleService vehicleService = new VehicleServiceImpl();

    @Override
    public String execute(String request) {
        String[] params = request.split(" ");
        int id = Integer.parseInt(params[0]);
        String brand = params[1];
        String model = params[2];

        Vehicle vehicle = new Vehicle(id, brand, model);
        vehicleService.updateVehicle(vehicle);

        return "Vehicle updated!";
    }
}