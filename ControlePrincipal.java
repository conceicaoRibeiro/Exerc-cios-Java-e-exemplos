package controlador;

import visao.Principal;
import visao.Programa;

public class ControlePrincipal {

	public static void main(String[] args) {

		// Declara��o da classe da view
		//Programa programa = new Programa();
		Principal principal = new Principal();
		
		// Declara��o do controlador
		ControleCliente controleCliente = new ControleCliente();
		
		/*
		 *  Fazer a chamada ao m�todo da view, injetando
		 *  o controlador 
		 */
		//programa.solicitaDadosCliente(controleCliente);	
		//programa.exibeDadosCliente(controleCliente);
		
		principal.construirTela(controleCliente);
	
	}

}
