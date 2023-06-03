package com.example.demo.matriculacion.repository;

import java.util.List;

import com.example.demo.matriculacion.repository.modelo.Propietario;

public interface PropietarioRepository {

	
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void eliminar(String identificacion);
	public Propietario seleccionarPorNumero (String identificacion);
	public List <Propietario> seleccionarTodos ();

}
