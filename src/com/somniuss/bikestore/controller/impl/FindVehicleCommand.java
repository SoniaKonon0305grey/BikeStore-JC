package com.bikestore.controller.impl;

import com.bikestore.controller.Command;
import com.bikestore.entity.Vehicle;
import com.bikestore.service.VehicleService;
import com.bikestore.service.impl.VehicleServiceImpl;

public class FindVehicleCommand implements Command {
    private final VehicleService vehicleService = new VehicleServiceImpl();

    @Override
    public String execute(String request) {
        int id = Integer.parseInt(request);
        Vehicle vehicle = vehicleService.findVehicleById(id);

        return vehicle != null ? vehicle.toString() : "Vehicle not found!";
    }
}