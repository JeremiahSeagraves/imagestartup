package com.example.demo.util;

public class MedidasJson {

	private float busto;
	private float cintura;
	private float cadera;
	private float largoPierna;
	private float largoBrazo;
	
	public MedidasJson() {
	
	}

	public MedidasJson(float busto, float cintura, float cadera, float largoPierna, float largoBrazo) {
		super();
		this.busto = busto;
		this.cintura = cintura;
		this.cadera = cadera;
		this.largoPierna = largoPierna;
		this.largoBrazo = largoBrazo;
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
