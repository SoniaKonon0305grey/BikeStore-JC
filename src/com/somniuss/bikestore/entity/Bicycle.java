package com.somniuss.bikestore.entity;

import java.util.Objects;
import java.io.Serializable;

public class Bicycle extends Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String frameMaterial; // Материал рамы

	public Bicycle() {
	}

	public Bicycle(int id, String type, String brand, String model, double price, String frameMaterial) {
		super(id, type, brand, model, price);
		this.frameMaterial = frameMaterial;
	}

	public Bicycle(String type, String brand, String model, double price, String frameMaterial) {
		super(type, brand, model, price);
		this.frameMaterial = frameMaterial;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), frameMaterial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicycle that = (Bicycle) obj;
		return Objects.equals(frameMaterial, that.frameMaterial);
	}

	@Override
	public String toString() {
		return "Bicycle{" +
				"id=" + getId() +
				", type='" + getType() + '\'' +
				", brand='" + getBrand() + '\'' +
				", model='" + getModel() + '\'' +
				", price=" + getPrice() +
				", frameMaterial='" + frameMaterial + '\'' +
				'}';
	}
}