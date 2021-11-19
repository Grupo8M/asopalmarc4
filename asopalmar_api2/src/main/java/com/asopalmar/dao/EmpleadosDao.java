package com.asopalmar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asopalmar.model.Empleados;

public interface EmpleadosDao extends JpaRepository<Empleados, Integer> {
	

}
