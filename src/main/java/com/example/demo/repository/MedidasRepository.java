package com.example.demo.repository;

import org.springframework.stereotype.Component;

import com.example.demo.model.Medidas;
import com.example.demo.util.MedidasJson;

@Component("medidasRepository")
public class MedidasRepository{
	
	public boolean registrarMedidas(MedidasJson medidasJson){
		Medidas.obtenerInstancia().setBusto(medidasJson.getBusto());
		Medidas.obtenerInstancia().setCadera(medidasJson.getCadera());
		Medidas.obtenerInstancia().setCintura(medidasJson.getCintura());
		Medidas.obtenerInstancia().setLargoBrazo(medidasJson.getLargoBrazo());
		Medidas.obtenerInstancia().setLargoPierna(medidasJson.getLargoPierna());
		return true;
	}
	
	public MedidasJson obtenerMedidas(){
		MedidasJson mj = new MedidasJson();
		mj.setBusto(Medidas.obtenerInstancia().getBusto());
		mj.setCadera(Medidas.obtenerInstancia().getCadera());
		mj.setCintura(Medidas.obtenerInstancia().getCintura());
		mj.setLargoBrazo(Medidas.obtenerInstancia().getLargoPierna());
		mj.setLargoPierna(Medidas.obtenerInstancia().getLargoPierna());
		return mj;
	}

}
