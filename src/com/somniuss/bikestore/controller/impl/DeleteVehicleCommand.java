package com.bikestore.controller.impl;

import com.bikestore.controller.Command;
import com.bikestore.service.VehicleService;
import com.bikestore.service.impl.VehicleServiceImpl;

public class DeleteVehicleCommand implements Command {
    private final VehicleService vehicleService = new VehicleServiceImpl();

    @Override
    public String execute(String request) {
        int id = Integer.parseInt(request);
        vehicleService.deleteVehicle(id);
        return "Vehicle deleted!";
    }
}