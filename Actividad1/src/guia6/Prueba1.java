package guia6;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario u1,u2,u3;
		try {
			u1=new Usuario("Juan","abcd123");
			System.out.println(u1.toString());
			u2=new Usuario("Juan","abcd1234");
			System.out.println(u2.toString());
			u3=new Usuario("Ana","abcd123");
			System.out.println(u3.toString());
		} catch (NombreInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ContrasenaInvalidaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
