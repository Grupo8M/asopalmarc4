package com.asopalmar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empleados {
	@Id
	private Integer id; 
	
	@Column
	private String nombreEmpleado;
	
	@Column
	private String apellidoEmpleado;

	@Column
	private String telefonoEmpleado;
	
	@Column
	private String direccionEmpleado;
	
	@Column
	private String emailEmpleado;
	
	@Column
	private String cargoEmpleado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getEmailEmpleado() {
		return emailEmpleado;
	}

	public void setEmailEmpleado(String emailEmpleado) {
		this.emailEmpleado = emailEmpleado;
	}

	public String getCargoEmpleado() {
		return cargoEmpleado;
	}

	public void setCargoEmpleado(String cargoEmpleado) {
		this.cargoEmpleado = cargoEmpleado;
	}
	
	//Gets and Setters
	
}
	