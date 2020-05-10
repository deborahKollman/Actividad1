package guia6;

public class ExtraccionInvalidaException extends Exception {
	private Dato_Extraccion_Invalido datoInvalido;

	public ExtraccionInvalidaException(Dato_Extraccion_Invalido datoInvalido) {
		super();
		this.datoInvalido = datoInvalido;
	}
	
}
