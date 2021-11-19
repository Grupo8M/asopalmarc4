package com.asopalmar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facturas {

	@Id
	private Integer id;
	
	@Column
	private String fechaFactura;
	
	@Column
	private Integer toneladas;
	
	@Column
	private Float precioTonelada;
	
	@Column
	private Float subtotalTOnelada;
	
	@Column
	private Float total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Integer getToneladas() {
		return toneladas;
	}

	public void setToneladas(Integer toneladas) {
		this.toneladas = toneladas;
	}

	public Float getPrecioTonelada() {
		return precioTonelada;
	}

	public void setPrecioTonelada(Float precioTonelada) {
		this.precioTonelada = precioTonelada;
	}

	public Float getSubtotalTOnelada() {
		return subtotalTOnelada;
	}

	public void setSubtotalTOnelada(Float subtotalTOnelada) {
		this.subtotalTOnelada = subtotalTOnelada;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}
	
	
	
}
