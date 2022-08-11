package com.OBexercise1;

public class Coche {
	int puertas;

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public Coche(int puertas) {
		super();
		this.puertas = puertas;
	}

	public int maspuertas(int otrapuerta) {

		puertas = puertas + otrapuerta;
		return puertas;
		
		

	}

}
