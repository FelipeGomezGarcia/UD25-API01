package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Fabricante;

public interface IFabricanteService {
	
	public List<Fabricante> listarFabricantes();
	
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public Fabricante fabricanteXID(Long codigo);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void eliminarFabricante(Long codigo);
}
