package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component()
public class Medidas {
	
	private static Medidas instancia = null;
	
	private float busto;
	private float cintura;
	private float cadera;
	private float largoPierna;
	private float largoBrazo;
	
	private Medidas() {
	
	}
	
	public static Medidas obtenerInstancia(){
		if (instancia == null){
			instancia = new Medidas();
		}
		return instancia;
			
	}

	public float getBusto() {
		return busto;
	}

	public void setBusto(float busto) {
		this.busto = busto;
	}

	public float getCintura() {
		return cintura;
	}

	public void setCintura(float cintura) {
		this.cintura = cintura;
	}

	public float getCadera() {
		return cadera;
	}

	public void setCadera(float cadera) {
		this.cadera = cadera;
	}

	public float getLargoPierna() {
		return largoPierna;
	}

	public void setLargoPierna(float largoPierna) {
		this.largoPierna = largoPierna;
	}

	public float getLargoBrazo() {
		return largoBrazo;
	}

	public void setLargoBrazo(float largoBrazo) {
		this.largoBrazo = largoBrazo;
	}

	
}
