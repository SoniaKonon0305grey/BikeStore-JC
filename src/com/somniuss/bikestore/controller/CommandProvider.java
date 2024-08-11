package com.bikestore.controller;

import java.util.HashMap;
import java.util.Map;

import com.bikestore.controller.impl.AddVehicleCommand;
import com.bikestore.controller.impl.UpdateVehicleCommand;
import com.bikestore.controller.impl.FindVehicleCommand;
import com.bikestore.controller.impl.DeleteVehicleCommand;
import com.bikestore.controller.impl.NoSuchCommand;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    public CommandProvider() {
        repository.put(CommandName.ADD, new AddVehicleCommand());
        repository.put(CommandName.UPDATE, new UpdateVehicleCommand());
        repository.put(CommandName.FIND, new FindVehicleCommand());
        repository.put(CommandName.DELETE, new DeleteVehicleCommand());
        repository.put(CommandName.WRONG_REQUEST, new NoSuchCommand());
    }

    public Command getCommand(String name) {
        CommandName commandName;
        Command command;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG_REQUEST);
        }

        return command;
    }
}