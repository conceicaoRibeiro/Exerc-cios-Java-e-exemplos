package meuPacote;

public class PrimeiraClasse {

	// s� pode ser acessado pela pr�pria classe
	private int meuAtributo;
	// todos do projeto tem acesso
	public int outroAtributo;
	
	// todos do mesmo pacote tem acesso
	protected int maisUmAtributo;
	
	
public static void main(String[]args){
	
	System.out.println("Ola,mundo!!!!!!!");
	
	                                 
	//SegundaClasse segunda=new SegundaClasse();
	
	// declarando a "vari�vel"/"objeto"
	SegundaClasse segunda; // declarando a refer�ncia do objeto
	
	// chamando o construtor da classe para instanciar o objeto
	segunda=new SegundaClasse();
	 
	segunda.setAtribA(10);
	segunda.setAtribC("Ol�");
	segunda.setAtribB(22);
	

  }
}
