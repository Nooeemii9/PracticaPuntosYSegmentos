package clases;

public class Punto {

	int x;
	int y;
	
	/**
	 * Constructor por defecto que tiene valores a 0
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor que recibe dos numeros enteros
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
/*
 * Get para obtener x
 */
	public int getX() {
		return x;

/**
 * Get para obtener y 
 */
	}
	public int getY() {
		return y;
	}
	
	
/**
 * Set para modificar x 
 * @param x
 */

	public void setX(int x) {
		this.x = x;
	}

/**
 * Set para modificar y 
 * @param y
 */
	public void setY(int y) {
		this.y = y;
	}
	
	
/**
 * ToString para leer el mensaje
 */
	@Override
	public String toString() {
		String mensaje = "";
		mensaje += "("  + this.x + ", " + this.y + ")";
		return mensaje;
	}
}
