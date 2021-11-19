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

import com.asopalmar.dao.FacturasDao;
import com.asopalmar.model.Facturas;

import java.util.List;

@RestController
@RequestMapping("facturas")
public class FacturasRes {

	@Autowired
	private FacturasDao facturasDao;
	
	@PostMapping("/guardarFacturas")
	public void guasrdar(@RequestBody Facturas factura) {
		facturasDao.save(factura);
	}
	
	@GetMapping("/consultarFacturas")
	public List<Facturas> listar(){
		return facturasDao.findAll();
	}
	
	@DeleteMapping("/eliminarFacturas/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		facturasDao.deleteById(id);
	}
	
	@PutMapping("/actualizarFacturas")
	public void actualizar(@RequestBody Facturas factura) {
		facturasDao.save(factura);
	}
	
}
