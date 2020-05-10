package guia6;

public class CargaInvalidaException extends Exception {
	private DatoCargaInvalido dato;
	public CargaInvalidaException(String mensaje, String combustible, double cantidadRequerida,double cantidadDisponible) {
		super(mensaje);
		this.dato=new DatoCargaInvalido(combustible, cantidadDisponible,cantidadRequerida);
		
	}
	public DatoCargaInvalido getDato() {
		return dato;
	}
	
}
