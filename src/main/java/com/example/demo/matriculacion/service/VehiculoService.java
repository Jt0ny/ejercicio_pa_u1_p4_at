package com.example.demo.matriculacion.service;

import java.util.List;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface VehiculoService {

	public void matricularVehiculo(Vehiculo vehiculo);
	public void actualizarVehiculo(Vehiculo vehiculo);
	public void eliminarVehiculo(String placa);
	public Vehiculo buscarPorPlaca(String placa);
	public List <Vehiculo> seleccionarTodos();

}
