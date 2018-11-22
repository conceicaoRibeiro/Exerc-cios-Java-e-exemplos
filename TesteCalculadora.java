package exemplo;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		
		//referência  do pai para filho
		Calculadora calc = new MinhaCalculadora();

		calc.soma(10, 15);
		
	}

}
