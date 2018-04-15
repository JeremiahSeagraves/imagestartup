package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MedidasRepository;
import com.example.demo.util.MedidasJson;

@Service("medidasService")
public class MedidasServiceImpl implements MedidasService{
	
	@Autowired 
	private MedidasRepository medidasRepository;

	@Override
	public MedidasJson consultarMedidas() {
		return medidasRepository.obtenerMedidas();
	}

	@Override
	public boolean registrarMedidas(MedidasJson medidasJson) {
		medidasRepository.registrarMedidas(medidasJson);
		return true;
	}
	

}
