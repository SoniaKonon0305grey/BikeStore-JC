package com.somniuss.bikestore.main;

import com.somniuss.bikestore.controller.Command;
import com.somniuss.bikestore.controller.impl.AddInstrumentCommand;

public class Main {

	public static void main(String[] args) {
		Command command = new AddVehicleCommand();
		try {
			command.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}