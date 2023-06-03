package com.example.demo.matriculacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.VehiculoRepository;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService{

	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Override
	public void matricularVehiculo(Vehiculo vehiculo) {
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		this.vehiculoRepository.actualizar(vehiculo);
		
	}

	@Override
	public void eliminarVehiculo(String placa) {
		this.vehiculoRepository.eliminar(placa);
		
	}

	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionarPorNumero(placa);
	}

	@Override
	public List<Vehiculo> seleccionarTodos() {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionarTodos();
	}

}
