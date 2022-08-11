package com.OBexercise1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = suma(1, 2, 3);

		System.out.println("La suma es: " + suma);
		// prueba

	
		Coche miCoche = new Coche(2);
		//miCoche.setPuertas(2);
		int puertas = miCoche.maspuertas(suma);
		
		System.out.println("Mi coche tiene "+puertas+" puertas.");

	}

	public static int suma(int param1, int param2, int param3) {
		return param1 + param2 + param3;

	}

}
