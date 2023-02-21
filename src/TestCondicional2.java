
public class TestCondicional2 {
	public static void main(String[] args) {
		System.out.println("Probando condicionales pratica");
		
		int edad = 18;
		int cantidadPersonas = 2;
		
		boolean bienvenido = edad >= 18 || cantidadPersonas >=2;
		boolean menor = edad < 18 && cantidadPersonas > 1;
		
		if(bienvenido) {
			System.out.println("Bienvenido");
		}else {
			System.out.println("Lo siento no puedes ingresar");
		}
		if(menor) {
			System.out.println("Es menor pero viene acompañado");
		}
	}
}
