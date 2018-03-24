package com.calculo.galones.model;

import java.io.Serializable;

public class Carro implements Serializable{
	private String name;
	private Integer recorrido;
	private String vehiculo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(Integer recorrido) {
		this.recorrido = recorrido;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

}
