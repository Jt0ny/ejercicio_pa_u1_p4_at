package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.service.CuentaService;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;
import com.example.demo.matriculacion.service.VehiculoService;
import com.example.demo.matriculacion.service.VehiculoServiceImpl;

@SpringBootApplication
public class EjercicioPaU1P4AtApplication implements CommandLineRunner  {

	@Autowired
	private VehiculoService vehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4AtApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 //vehiculo1
		Vehiculo vehiculo1=new Vehiculo();
	}

}
