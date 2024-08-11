package com.somniuss.bikestore.logic;

import com.somniuss.bikestore.logic.impl.*;

public final class StoreLogicProvider {

	private static final StoreLogicProvider instance = new StoreLogicProvider();

	private StoreLogicProvider() {
	}

	private StoreLogic logic = new StoreLogicImpl();

	public StoreLogic getStoreLogic() {
		return logic;
	}

	public static StoreLogicProvider getInstance() {
		return instance;
	}

}