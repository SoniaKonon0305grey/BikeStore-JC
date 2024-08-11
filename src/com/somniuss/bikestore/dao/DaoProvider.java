package com.somniuss.bikestore.dao;

import com.somniuss.bikestore.dao.impl.FileBikeStoreDao;

public final class DaoProvider {
	private static final DaoProvider INSTANCE = new DaoProvider();

	private DaoProvider() {
	}

	private BikeStoreDao bikeStoreDao = new FileBikeStoreDao();

	public BikeStoreDao getBikeStoreDao() {
		return bikeStoreDao;
	}

	public static DaoProvider getInstance() {
		return INSTANCE;
	}
}