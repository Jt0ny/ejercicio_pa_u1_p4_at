package com.example.demo.matriculacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.PropietarioRepository;
import com.example.demo.matriculacion.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements  PropietarioService {

	@Autowired
	private PropietarioRepository propietarioRepository;
	
	
	
	@Override
	public void guardarPropietario(Propietario propietario) {
		this.propietarioRepository.insertar(propietario);
		
	}

	@Override
	public void actualizarPropietario(Propietario propietario) {
		this.propietarioRepository.actualizar(propietario);
		
	}

	@Override
	public void borrarPropietario(String identificacion) {
		this.borrarPropietario(identificacion);
		
	}

	@Override
	public Propietario seleccionarPorIdentificacion(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionarPorNumero(identificacion);
	}

	@Override
	public List<Propietario> seleccionarTodos() {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionarTodos();
	}

}
