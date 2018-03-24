package com.calculo.galones.model;

import java.io.Serializable;

public class Carro implements Serializable{
	private String name;
	private Integer recorrido;
	private char vehiculo;
	private String vehiculoName;
	private double Resultado;
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
	public char getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(char vehiculo) {
		this.vehiculo = vehiculo;
	}
	public double getResultado() {
		return Resultado;
	}
	public void setResultado(double resultado) {
		Resultado = resultado;
	}
	public String getVehiculoName() {
		return vehiculoName;
	}
	public void setVehiculoName(String vehiculoName) {
		this.vehiculoName = vehiculoName;
	}

}
