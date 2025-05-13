package app;

import clases.Punto;
import clases.Segmento;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Aleatorios para x e y
		 */
		int aleatoriox = (int)(1 + (Math.random() * 10));
		int aleatorioy = (int)(1 + (Math.random() * 10));
		int aleatoriox2 = (int)(1 + (Math.random() * 10));
		int aleatorioy2 = (int)(1 + (Math.random() * 10));
		
		/**
		 * Creacion de puntos
		 */
		Punto punto1 = new Punto(aleatoriox,aleatorioy);
		Punto punto2 = new Punto(aleatoriox2,aleatorioy2);
		Punto punto3 = new Punto(aleatoriox,aleatorioy);
		Punto punto4 = new Punto(aleatoriox2,aleatorioy2);
		
		
		/**
		 * Creacion de segmentos
		 */
		Segmento segmento1 = new Segmento(punto1, punto2);
		Segmento segmento2 = new Segmento (punto3, punto4);
		
		
		
		/**
		 * Uso los metodos para calcular la distancia entre puntos
		 */
		double distanciasprueba = segmento1.distancia();
		double distanciasprueba2 = segmento2.distancia();
		
		

	}

}
