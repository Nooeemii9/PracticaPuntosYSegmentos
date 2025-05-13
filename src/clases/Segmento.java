package clases;

public class Segmento {

	private Punto a;
	private Punto b;
	
	/**
	 * Constructor 
	 */
	public Segmento() {
		this.a = new Punto();
		this.b = new Punto();
	}
	
	
	/**
	 * Constructor que recibe dos parametros y lanza excepcion
	 * 
	 * @param a
	 * @param b
	 * @throws IllegalArgumentException
	 */
	public Segmento(Punto a, Punto b) throws IllegalArgumentException {
		if (a.getX() == b.getX() && a.getY() == b.getY()) {
			throw new IllegalArgumentException ("Coordenadas iguales. Numeros iguales");
		}
		this.a = a;
		this.b = b;
	}


/**
 * Get para obtener a 
 * @return a
 */
	public Punto getA() {
		return this.a;
	}

/**
 * Get para obtener b
 * @return b
 */
	public Punto getB() {
		return this.b;
	}
	
	
/**
 * Set para modificar el punto a
 * @param a
 */
	public void setA(Punto a) {
		this.a = a;
	}

/**
 * Set para obtener el punto b
 * @param b
 */
	public void setB(Punto b) {
		this.b = b;
	}
	
	
	/**
	 * Metodo distancia para saber la distancia entre ambos puntos
	 * @return un double que es la distancia
	 */
	public double distancia() {
		
		double x = (float) Math.pow(b.getY() - a.getX(),2);
		double y = (float) Math.pow(b.getY() - a.getY(),2);
		
		double distancia = Math.sqrt(x+y);
		
		return distancia;
				
	}
	
	
	/**
	 * Metodo toString para sacar mensajes 
	 */
	@Override
	public String toString() {
		String mensaje = "";
		mensaje += "[("  + a.getX() + ", " + b.getX() + a.getY() + ", " + b.getY() + ")]";
		return mensaje;
	}
	
	
}
