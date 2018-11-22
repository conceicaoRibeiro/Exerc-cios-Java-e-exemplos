package meuPacote;

public class PrimeiraClasse {

	// só pode ser acessado pela própria classe
	private int meuAtributo;
	// todos do projeto tem acesso
	public int outroAtributo;
	
	// todos do mesmo pacote tem acesso
	protected int maisUmAtributo;
	
	
public static void main(String[]args){
	
	System.out.println("Ola,mundo!!!!!!!");
	
	                                 
	//SegundaClasse segunda=new SegundaClasse();
	
	// declarando a "variável"/"objeto"
	SegundaClasse segunda; // declarando a referência do objeto
	
	// chamando o construtor da classe para instanciar o objeto
	segunda=new SegundaClasse();
	 
	segunda.setAtribA(10);
	segunda.setAtribC("Olá");
	segunda.setAtribB(22);
	

  }
}
