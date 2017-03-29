	package test;
	
	import java.util.GregorianCalendar;
	import negocio.ClienteABM;
	public class TestAgregarCliente {
		public static void main(String[] args) {
			String apellido = "tu apellido";
			String nombre = "tu nombre";
			int documento = 35000000;
			GregorianCalendar fechaDeNacimiento= new GregorianCalendar(); // tu fecha de nacimiento
			ClienteABM abm= new ClienteABM();
			
			long ultimoIdCliente = abm.agregar(apellido, nombre, documento,	fechaDeNacimiento);
		}
	}
