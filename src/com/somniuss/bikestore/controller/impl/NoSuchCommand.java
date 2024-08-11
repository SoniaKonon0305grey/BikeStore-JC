package com.somniuss.bikestore.controller.impl;

import com.somniuss.bikestore.controller.Command;

public class NoSuchCommand implements Command {
    @Override
    public String execute(String request) {
        return "Invalid command.";
    }
}