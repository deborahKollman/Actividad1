package guia6;

public class Surtidor {
	private double cantidadDiesel;
	private double cantidadPremium;
	private double cantidadSuper;
	private static final double cantidadMaxima=20000;
	public Surtidor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void cargarCombustible(String combustible, double cantidad) throws CargaInvalidaException {
		if(cantidad>=0) {
			if(combustible.equals("Diesel")) {
				if(this.cantidadDiesel>=cantidad)
					this.cantidadDiesel-=cantidad;
				else {
					this.cantidadDiesel=0;
					throw new FaltaCombustibleException("No hay suficiente Diesel",combustible,cantidad,this.cantidadDiesel);
				}
			}else if(combustible.equals("Premium")) {
				if(this.cantidadPremium>=cantidad)
					this.cantidadPremium-=cantidad;
				else {
					this.cantidadPremium=0;
					throw new FaltaCombustibleException("No hay suficiente Premium",combustible,cantidad,this.cantidadPremium);
					}
			}else if(combustible.equals("Super")) {
				if(this.cantidadSuper>=cantidad)
					this.cantidadSuper-=cantidad;
				else {
					this.cantidadSuper=0;
					throw new FaltaCombustibleException("No hay suficiente Super",combustible,cantidad,this.cantidadSuper);
				}
			}else
				throw new TipoCombustibleInvalidoException("No existe tipo de combustible",combustible,cantidad,0);
		}else {
			throw new CargaInvalidaException("La carga no puede ser menor a 0",combustible,cantidad,0);
		}
		
	}
	public void llenarDiesel() {
		this.cantidadDiesel=this.cantidadMaxima;
	}
	public void llenarPremium() {
		this.cantidadPremium=this.cantidadMaxima;
	}
	public void llenarSuper() {
		this.cantidadSuper=this.cantidadMaxima;
	}
	public double getCantidadDiesel() {
		return cantidadDiesel;
	}
	public double getCantidadPremium() {
		return cantidadPremium;
	}
	public double getCantidadSuper() {
		return cantidadSuper;
	}
	
}
