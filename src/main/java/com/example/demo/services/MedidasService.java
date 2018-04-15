package com.example.demo.services;

import com.example.demo.util.MedidasJson;


public interface MedidasService {
	public abstract boolean registrarMedidas(MedidasJson medidasJson);
	public abstract MedidasJson consultarMedidas();
}
