
public class TestCondicional {
	public static void main(String[] args) {
		System.out.println("probando condicionales");
		int edad = 17;
		int cantidadPersonas = 3;

		if (edad >= 18) {
			System.out.println("Usted cumple con la mayoria de edad");
			System.out.println("Bienvenido");
		} else {
			if (cantidadPersonas >= 2) {
				System.out.println("Ya que tiene compañia puede ingresar");
			} else {
				System.out.println("Lo senitmos no tiene la edad suficiente");
			}
		}

	}
}
