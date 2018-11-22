package meuPacote;
//Classe Bean ,quando a classe � mais elementar poss�vel,simples.

public class SegundaClasse {

	
	/*
	 * Todos os tipos primitivos possuem tipos complexos associados a eles. S�o as chamadas classes wrapper.
	 * 
	 * int-> Integer
	 * double-> Double
	 * float->Float
	 * char-> Char
	 * ......
	 * 
	 */
	
	private int atribA;
	private int atribB;
	private String atribC;
	
	// getters and setters s�o m�tods de acesso
	
	//  l� o valor do atributo,ele faz a leitura,o m�todo get
	public int getAtribA(){
		return atribA;
	}
	
	// definir o valor do atributo,o m�todo set
	public void setAtribA(int atribA){
		// o this refer�ncia o que est� contido no escopo da classe
	           this.atribA =atribA;
		
	}

	public int getAtribB() {
		return atribB;
	}

	public void setAtribB(int atribB) {
		this.atribB = atribB;
	}

	public String getAtribC() {
		return atribC;
	}

	public void setAtribC(String atribC) {
		this.atribC = atribC;
	}
	
	
	
}
