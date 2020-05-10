package guia6;

public class Dato_Extraccion_Invalido {
	private double extraccionSolicitada;
	private double saldo;
	public Dato_Extraccion_Invalido(double extraccionSolicitada, double saldo) {
		super();
		this.extraccionSolicitada = extraccionSolicitada;
		this.saldo = saldo;
	}
	public double getExtraccionSolicitada() {
		return extraccionSolicitada;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
