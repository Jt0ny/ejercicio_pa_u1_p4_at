package com.example.demo.matriculacion.service;

import java.util.List;

import com.example.demo.matriculacion.repository.modelo.Propietario;

public interface PropietarioService {
	
	public void guardarPropietario(Propietario propietario);
	public void actualizarPropietario(Propietario propietario);
	public void borrarPropietario(String identificacion);
	public Propietario seleccionarPorIdentificacion (String identificacion);
	public List <Propietario> seleccionarTodos ();
	
	
}
