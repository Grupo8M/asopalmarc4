package com.asopalmar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {
	
	@Id
	private Integer id;
	
	@Column
	private String nombreUsuario;
	
	@Column
	private String contrasenaUsuario;

	@Column
	private Integer estadoUsuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}

	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}

	public Integer getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(Integer estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}
	
	
	
}
