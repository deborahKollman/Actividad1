package guia6;

public class TipoCombustibleInvalidoException extends CargaInvalidaException {
	
	public TipoCombustibleInvalidoException(String mensaje,String combustible,double cantidadRequerida,double cantidadDisponible) {
		super(mensaje,combustible,cantidadRequerida,cantidadDisponible);

		// TODO Auto-generated constructor stub
	}

}
