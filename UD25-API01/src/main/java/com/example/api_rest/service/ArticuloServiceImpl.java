package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IArticuloDAO;
import com.example.api_rest.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{

	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		// TODO Auto-generated method stub
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long codigo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long codigo) {
		// TODO Auto-generated method stub
		iArticuloDAO.deleteById(codigo);
	}

}
