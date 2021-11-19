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

import com.asopalmar.dao.UsuariosDao;
import com.asopalmar.model.Usuarios;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuariosRes {
	
	@Autowired
	private UsuariosDao usuariosDao;
	
	@PostMapping("/guardarUsuarios")
	public void guardar(@RequestBody Usuarios usuario) {
		usuariosDao.save(usuario);
	}
	
	@GetMapping("/consultarUsuarios")
	public List<Usuarios> listar(){
		return usuariosDao.findAll();
	}
	
	@DeleteMapping("/eliminarUsuarios/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		usuariosDao.deleteById(id);
	}
	
	@PutMapping("actualizarUsuarios")
	public void actualizar(@RequestBody Usuarios usuario) {
		usuariosDao.save(usuario);
	}
	
	

}
