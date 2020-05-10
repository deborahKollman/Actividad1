package guia6;

public class Usuario {
	protected String nombre;
	protected String contrase�a;
	
	public Usuario(String nombre, String contrase�a) throws NombreInvalidoException, ContrasenaInvalidaException{
		super();
		this.setNombre(nombre);
		this.setContrase�a(contrase�a);
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a)throws ContrasenaInvalidaException{
		if(contrase�a!=null) {
			if(contrase�a.length()>6)
				if(isLetra(contrase�a.charAt(1)))
					this.contrase�a=contrase�a;
				else
					throw new ContrasenaInvalidaException("El primer caracter de la contrase�a debe ser una letra");
			else 
				throw new ContrasenaInvalidaException("La contrase�a debe tener mas de seis caracteres");
		}
		else 
			throw new ContrasenaInvalidaException("La contrase�a no puede ser nula");
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrase�a=" + contrase�a + "]";
	}
	public boolean isLetra(char car) {
		boolean res=false;
		if((car>=65 && car<=90)|| (car>=97 && car<=122))
			res=true;
		return res;
	}
	
	
}
