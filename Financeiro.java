package exemplo;

public class Financeiro {
	
	private double custoTotal = 0.0;
	//Conceito de polimorfismo
    public void calcularCustoFuncionarios(Funcionario f){
    	custoTotal += f.getSalario();
    	
    }
    public double getCustoTotal(){
    	return custoTotal;
    }
}
