package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Punto;
import clases.Segmento;
class testDistancia {

	
	static int x1 ;
	static int y1;
	static int x2;
	static int y2;
	

	@Test
	void testDistancia() {
		Punto p1 = new Punto(1,3);
		Punto p2 = new Punto(4,5);
		
		Segmento seg = new Segmento (p1,p2);
		
		
		double resultadoObtenido = seg.distancia();
		double resultadoEsperado = 3.605551275463989;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testDistanciaNegativa() {
		Punto p1 = new Punto(-1,-3);
		Punto p2 = new Punto(-4,-5);
		
		Segmento seg = new Segmento (p1,p2);
		
		
		double resultadoObtenido = seg.distancia();
		double resultadoEsperado = 3.605551275463989;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testDistanciaPositivoNegativo() {
		Punto p1 = new Punto(1,3);
		Punto p2 = new Punto(-4,-5);
		
		Segmento seg = new Segmento (p1,p2);
		
		
		double resultadoObtenido = seg.distancia();
		double resultadoEsperado = 9.433981132056604;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
/*	@Test
	void testDistanciaMismosPuntos() throws Exception {
		Punto p1 = new Punto(1,3);
		Punto p2 = new Punto(1,3);
		
		Segmento seg = new Segmento (p1,p2);
		
		
		double resultadoObtenido = seg.distancia();
		double resultadoEsperado = 0;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}*/
	
	@Test
	void testException()  {
		Punto p1 = new Punto(1,3);
		Punto p2 = new Punto(1,3);
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Segmento(p1,p2));
	
		String mensajeEsperado = "Numeros con coordenadas iguales";
		String mensajeObtenido = excepcion.getMessage();
		
		assertEquals(mensajeEsperado,mensajeObtenido);
	}

	

	


}
