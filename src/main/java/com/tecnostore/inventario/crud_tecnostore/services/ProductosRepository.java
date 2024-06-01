package com.tecnostore.inventario.crud_tecnostore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnostore.inventario.crud_tecnostore.models.Producto;


public interface ProductosRepository extends JpaRepository<Producto,Integer>{

}
