package com.example.api_rest.controller;

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

import com.example.api_rest.dto.Fabricante;
import com.example.api_rest.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricante fabricanteXID (@PathVariable(name="codigo") Long codigo) {
		
		Fabricante fabricante = new Fabricante();
		fabricante = fabricanteServiceImpl.fabricanteXID(codigo);
		
		return fabricante;
	}
	
	@PutMapping("/fabricantes")
	public Fabricante actualizarFabricante(@PathVariable(name="codigo")Long codigo, @RequestBody Fabricante fabricante) {
		Fabricante fabricanteActualizado = fabricanteServiceImpl.fabricanteXID(codigo);
		
		fabricanteActualizado.setNombre(fabricante.getNombre());
		
		return fabricanteServiceImpl.actualizarFabricante(fabricanteActualizado);
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarFabricante(@PathVariable(name="codigo")Long codigo) {
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}
}
