package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long> {

}
