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

import com.example.api_rest.dto.Articulo;
import com.example.api_rest.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo guardarFabricante(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulo fabricanteXID (@PathVariable(name="codigo") Long codigo) {
		return articuloServiceImpl.articuloXID(codigo);
	}
	
	@PutMapping("/articulos")
	public Articulo actualizarFabricante(@PathVariable(name="codigo")Long codigo, @RequestBody Articulo articulo) {
		Articulo articuloActualizado = articuloServiceImpl.articuloXID(codigo);
		
		articuloActualizado.setNombre(articulo.getNombre());
		articuloActualizado.setPrecio(articulo.getPrecio());
		articuloActualizado.setFabricante(articulo.getFabricante());
		
		return articuloServiceImpl.actualizarArticulo(articuloActualizado);
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarFabricante(@PathVariable(name="codigo")Long codigo) {
		articuloServiceImpl.eliminarArticulo(codigo);
	}
}
