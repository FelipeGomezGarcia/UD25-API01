package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

}
