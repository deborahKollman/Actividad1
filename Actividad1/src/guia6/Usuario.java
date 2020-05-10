package guia6;

public class Usuario {
	protected String nombre;
	protected String contraseña;
	
	public Usuario(String nombre, String contraseña) throws NombreInvalidoException, ContrasenaInvalidaException{
		super();
		this.setNombre(nombre);
		this.setContraseña(contraseña);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws NombreInvalidoException{
		if(nombre!=null) {		
			if(!nombre.isEmpty())
				this.nombre=nombre;
			else
				throw new NombreInvalidoException("El nombre no puede estar vacio");
		}else 
			throw new NombreInvalidoException("El nombre no puede ser null ");
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña)throws ContrasenaInvalidaException{
		if(contraseña!=null) {
			if(contraseña.length()>6)
				if(isLetra(contraseña.charAt(1)))
					this.contraseña=contraseña;
				else
					throw new ContrasenaInvalidaException("El primer caracter de la contraseña debe ser una letra");
			else 
				throw new ContrasenaInvalidaException("La contraseña debe tener mas de seis caracteres");
		}
		else 
			throw new ContrasenaInvalidaException("La contraseña no puede ser nula");
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseña=" + contraseña + "]";
	}
	public boolean isLetra(char car) {
		boolean res=false;
		if((car>=65 && car<=90)|| (car>=97 && car<=122))
			res=true;
		return res;
	}
	
	
}
