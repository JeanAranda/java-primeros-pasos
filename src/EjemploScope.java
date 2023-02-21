
public class EjemploScope {
	public static void main(String[] args) {
		int edad = 21;
		int cantidadPersonas = 2;
		
		
		boolean esPareja;
		if(cantidadPersonas > 1) {
			esPareja = true;
			System.out.println("Si");
		}else {
			esPareja = false;
			System.out.println("No");
		}
		boolean respuesta = cantidadPersonas>1 && esPareja;
		boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la condicion es: "+ esPareja);
		
		if (puedeEntrar) {
			System.out.println("Bienvenido");
		}else {
			System.out.println("Regresa por donde viniste");
		}
		if(respuesta) {
			System.out.println("Si puede ingresar");
		}else {
			System.out.println("No puede ingresar");
		}
		
		
		
		
	}
}
