package guia6;

import java.util.Arrays;

public class ConjuntoNumeros implements Cloneable{
	Numero[] celda;
	int largo;
	private String nombre;
	public ConjuntoNumeros(int largo, String nombre) {
		super();
		this.largo = largo;
		this.nombre = nombre;
	}
	public Object clone(){
		Object nuevo=new ConjuntoNumeros(this.largo,this.nombre);
		return nuevo;
	}
	public Numero[] getCelda() {
		return celda;
	}
	public int getLargo() {
		return largo;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "ConjuntoNumeros [celda=" + Arrays.toString(celda) + ", largo=" + largo + ", nombre=" + nombre + "]";
	}
	
}
