package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.repository.modelo.Propietario;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements  PropietarioRepository{
	
	
	private static List<Propietario> baseDatos= new ArrayList<>();


	@Override
	public void insertar(Propietario propietario) {
		baseDatos.add(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.eliminar(propietario.getIdentificacion());
		this.insertar(propietario);
		
	}

	@Override
	public void eliminar(String identificacion) {
		Propietario propietario=this.seleccionarPorNumero(identificacion);
		baseDatos.remove(propietario);
		
	}

	@Override
	public Propietario seleccionarPorNumero(String identificacion) {
		Propietario propietarioEncontrado=new Propietario();
		for(Propietario propietario: baseDatos){
			if(identificacion.equals(propietario.getIdentificacion()))
				propietarioEncontrado= propietario;}
		return propietarioEncontrado;
	}

	@Override
	public List<Propietario> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
