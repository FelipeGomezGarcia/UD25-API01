package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Articulo;

public interface IArticuloService {

	public List<Articulo> listarArticulos();
	
	public Articulo guardarArticulo(Articulo articulo);
	
	public Articulo articuloXID(Long codigo);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public void eliminarArticulo(Long codigo);
}
