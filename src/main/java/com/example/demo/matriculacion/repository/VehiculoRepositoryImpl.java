package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

	private static List<Vehiculo> baseDatos= new ArrayList<>();

	
	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		Vehiculo vehiculo=this.seleccionarPorNumero(placa);
		baseDatos.remove(vehiculo);
		
	}
	@Override
	public Vehiculo seleccionarPorNumero(String placa) {
		Vehiculo vehiculoEncontrado=new Vehiculo();
		for(Vehiculo vehiculo: baseDatos){
			if(placa.equals(vehiculo.getPlaca()))
				vehiculoEncontrado= vehiculo;}
		return vehiculoEncontrado;
	}
		

	@Override
	public List<Vehiculo> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
