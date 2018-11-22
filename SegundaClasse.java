package meuPacote;
//Classe Bean ,quando a classe é mais elementar possível,simples.

public class SegundaClasse {

	
	/*
	 * Todos os tipos primitivos possuem tipos complexos associados a eles. São as chamadas classes wrapper.
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
	
	// getters and setters são métods de acesso
	
	//  lê o valor do atributo,ele faz a leitura,o método get
	public int getAtribA(){
		return atribA;
	}
	
	// definir o valor do atributo,o método set
	public void setAtribA(int atribA){
		// o this referência o que está contido no escopo da classe
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
