package exemplo;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		
		//refer�ncia  do pai para filho
		Calculadora calc = new MinhaCalculadora();

		calc.soma(10, 15);
		
	}

}
