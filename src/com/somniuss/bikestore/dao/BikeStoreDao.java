package com.somniuss.bikestore.dao;

import com.somniuss.bikestore.entity.Bike;

import java.util.List;

public interface BikeStoreDao {
	List<Bike> findAllBikes() throws DaoException;

	Bike findBikeById(int id) throws DaoException;

	void addBike(Bike bike) throws DaoException;

	void deleteBike(int id) throws DaoException;

	void updateBike(Bike bike) throws DaoException;
}