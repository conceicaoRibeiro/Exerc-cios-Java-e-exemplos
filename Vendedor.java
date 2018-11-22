package exemplo;

public class Vendedor extends Funcionario {

	private double comissao;
 
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//construtor default
	public Vendedor(){
		salario= 1200;
	}
	
	public double aplicarComissao(){
		salario+=comissao;
		return salario;
	}
	
}
