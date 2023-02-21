import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		int edad = 18;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;		
		System.out.println("El valor dela expresion dada es: "+ esPareja);
		
		if (puedeEntrar) {
			System.out.println("Sean bienvenidos");
		}else {
			System.out.println("No puede ingresar");
		}
		
		edad = 65;
		boolean esAnciano = edad >= 65;
		boolean siBeneficia = edad > 18 && edad < 65;
		System.out.println("La persona es anciana: "+esAnciano);
		
		if (siBeneficia) {
			System.out.println("Usted todavia no puede tener pension 65");
		}else {
			System.out.println("Usted ya tiene pension 65");
		}
	}
}
