package com.example.demo.matriculacion.repository;

import java.util.List;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface VehiculoRepository {
	
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);
	public Vehiculo seleccionarPorNumero(String placa);
	public List <Vehiculo> seleccionarTodos();




}
