package com.asopalmar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asociados {
	
	@Id
	private Integer id;
	
	@Column
	private String nombreAsociado;
	
	@Column
	private String apellidoAsociado;
	
	@Column
	private String telefonoAsociado;
	
	@Column
	private String direccionAsociado;
	
	@Column
	private String nombreFinca;
	
	@Column
	private String emailAsociado;
	
	@Column
	private Integer hcsSembradas;
	
	@Column
	private String fechaSiembra;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreAsociado() {
		return nombreAsociado;
	}

	public void setNombreAsociado(String nombreAsociado) {
		this.nombreAsociado = nombreAsociado;
	}

	public String getApellidoAsociado() {
		return apellidoAsociado;
	}

	public void setApellidoAsociado(String apellidoAsociado) {
		this.apellidoAsociado = apellidoAsociado;
	}

	public String getTelefonoAsociado() {
		return telefonoAsociado;
	}

	public void setTelefonoAsociado(String telefonoAsociado) {
		this.telefonoAsociado = telefonoAsociado;
	}

	public String getDireccionAsociado() {
		return direccionAsociado;
	}

	public void setDireccionAsociado(String direccionAsociado) {
		this.direccionAsociado = direccionAsociado;
	}

	public String getNombreFinca() {
		return nombreFinca;
	}

	public void setNombreFinca(String nombreFinca) {
		this.nombreFinca = nombreFinca;
	}

	public String getEmailAsociado() {
		return emailAsociado;
	}

	public void setEmailAsociado(String emailAsociado) {
		this.emailAsociado = emailAsociado;
	}

	public Integer getHcsSembradas() {
		return hcsSembradas;
	}

	public void setHcsSembradas(Integer hcsSembradas) {
		this.hcsSembradas = hcsSembradas;
	}

	public String getFechaSiembra() {
		return fechaSiembra;
	}

	public void setFechaSiembra(String fechaSiembra) {
		this.fechaSiembra = fechaSiembra;
	}
	
	

}
