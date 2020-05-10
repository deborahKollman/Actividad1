package guia6;

public class CuentaBancaria {
	protected String titular;
	protected double saldo;
	public CuentaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double cantidad) throws DepositoInvalidoException{
		if(cantidad>0)
			this.saldo+=cantidad;
		else
			throw new DepositoInvalidoException(cantidad);
	}
	public void extraer(double cantidad) throws ExtraccionInvalidaException{
		if(cantidad<=this.saldo)
			this.saldo-=cantidad;
		else {
			Dato_Extraccion_Invalido dato=new Dato_Extraccion_Invalido(cantidad,saldo);
			throw new ExtraccionInvalidaException(dato);
		}
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
