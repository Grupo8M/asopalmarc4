package com.asopalmar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asopalmar.model.Facturas;

public interface FacturasDao extends JpaRepository<Facturas, Integer> {

}
