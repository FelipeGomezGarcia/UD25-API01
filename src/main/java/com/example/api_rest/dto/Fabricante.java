package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Fabricantes")
public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Articulo> articulo;
	
	//Constructores
	public Fabricante() {
		
	}

	public Fabricante(Long codigo, String nombre, List<Articulo> articulo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.articulo = articulo;
	}

	/**
	 * @return the id
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the id to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the articulo
	 */
	@JsonIgnore
	@OneToMany(fetch =  FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}

	/**
	 * @param articulo the articulo to set
	 */
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}
