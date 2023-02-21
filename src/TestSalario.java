
public class TestSalario {
	public static void main(String[] args) {
		
		boolean fuePromovido = true;
		double salario; // Esta  es la correcion al codigo
		
		if(fuePromovido) {
			salario = 4200.0; // Se quito el double a cada variable
		}else {
			salario = 3800.0;
		}
		System.out.println("Su salario actual es: S/."+salario);
	}
}
