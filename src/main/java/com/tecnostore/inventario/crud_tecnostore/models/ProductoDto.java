package com.tecnostore.inventario.crud_tecnostore.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductoDto {
	
	@NotEmpty(message = "El nombre es obligatorio")
	private String nombre;
	
	@NotEmpty(message = "La marca es obligatoria")
	private String marca;
	
	@NotEmpty(message = "El nombre de la categoria es obligatorio")
	private String categoria;
	
	@Min(0)
	private double precio;
	
	@Size(min=10,message = "La descpción debe tener más de 10 caracteres")
	@Size(max=255,message = "La descpción no debe exceder los 255 caracteres")
	private String descripcion;
	
	private MultipartFile archivoImage;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public MultipartFile getArchivoImage() {
		return archivoImage;
	}

	public void setArchivoImage(MultipartFile archivoImage) {
		this.archivoImage = archivoImage;
	}
	
	
}
