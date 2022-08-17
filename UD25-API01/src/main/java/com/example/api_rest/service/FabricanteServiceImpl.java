package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IFabricanteDAO;
import com.example.api_rest.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{

	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Long codigo) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long codigo) {
		// TODO Auto-generated method stub
		iFabricanteDAO.deleteById(codigo);
	}

}
