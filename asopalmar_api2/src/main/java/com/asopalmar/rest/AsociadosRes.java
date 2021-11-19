package com.asopalmar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asopalmar.dao.AsociasdosDao;
import com.asopalmar.model.Asociados;

@RestController
@RequestMapping("asociados")
public class AsociadosRes {
	
	
	@Autowired
	private AsociasdosDao asociadosDao;
	
	
	 @PostMapping("/guardarAsociado")
	 public void guardar(@RequestBody Asociados asociado) {
		 asociadosDao.save(asociado);
	 }
	
	@GetMapping("/consultarAsociados")
	public List<Asociados> listar(){
		return asociadosDao.findAll();
	}
	
	@DeleteMapping("/eliminarAsociados/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		asociadosDao.deleteById(id);
	}
	
	@PutMapping("/actualizarAsociados")
	public void actualizar(@RequestBody Asociados asociado) {
		asociadosDao.save(asociado);
	}

}
