package guia6;

public class DatoCargaInvalido {
	private double cantidadDeposito;
	private double cantidadRequerida;
	private String combustible;
	public DatoCargaInvalido(String combustible, double cantidadDeposito, double cantidadRequerida) {
		super();
		this.cantidadDeposito = cantidadDeposito;
		this.cantidadRequerida = cantidadRequerida;
		this.combustible = combustible;
	}
	public double getCantidadDeposito() {
		return cantidadDeposito;
	}
	public double getCantidadRequerida() {
		return cantidadRequerida;
	}
	public String getCombustible() {
		return combustible;
	}
	
	
}
