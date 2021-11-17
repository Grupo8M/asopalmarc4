package com.asopalmar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asopalmar.dao.EmpleadosDao;
import com.asopalmar.model.Empleados;

import java.util.List;


@RestController
@RequestMapping("empleados")
public class EmpleadosRes {
	
	@Autowired
	private EmpleadosDao empleadosDao;
	
	//Metodos HTTP: Solicitud Al Servidor 
	
	/**
	 * Estado : 200 {Success}
	 * Estado : 500 {Error de Logica}
	 * Estado : 404 {Error No Encontrado}
	 * */
	
	 @PostMapping("/guardarEmpleado")
	 public void guardar(@RequestBody Empleados empleado) {
		 empleadosDao.save(empleado);
	 }
	
	@GetMapping("/consultarEmpleados")
	public List<Empleados> listar(){
		return empleadosDao.findAll();
	}
	
	@DeleteMapping("/eliminarEmpleado/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		empleadosDao.deleteById(id);
	}
	
	@PutMapping("/actualizarEmpleado")
	public void actualizar(@RequestBody Empleados empleado) {
		empleadosDao.save(empleado);
	}
	
}
