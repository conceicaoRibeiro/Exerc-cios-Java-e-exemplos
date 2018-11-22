package controlador;

import java.util.List;

import modelo.BdFake;
import modelo.Cliente;
import modelo.dao.ClienteDAO;
import modelo.tabela.ClienteTableModel;
import visao.ExibeCliente;

public class ControleCliente {

	//Cliente cliente = new Cliente();
	//BdFake banco = new BdFake();
	
	// Instanciação do objeto DAO para manipulação do banco
	ClienteDAO dao = ClienteDAO.getClienteDAO();
	
	public boolean criarCliente(String nome, String email, String cpf) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		
		//return banco.gravarCliente(cliente);
		return dao.adicionarCliente(cliente);
		
	}
	 
	public Cliente obtemDadosCliente(int id) {
		
		//Cliente cliente = banco.obtemCliente(indice);
		Cliente cliente = dao.buscarCliente(id);
		
		/*
		String dados = cliente.getNome() + "\n" +
				cliente.getCpf() + "\n" +
				cliente.getEmail();
		
		return dados;
		*/
		return cliente;
	}
	
	
	public List<Cliente> obtemClientes() {
		//return banco.getClientes();
		return dao.listarClientes();
	}
	
	public void constroiTabela() {
		ClienteTableModel modeloTabela = 
				new ClienteTableModel(obtemClientes());
		
		ExibeCliente telaTabela = new ExibeCliente(modeloTabela);
		
		telaTabela.setVisible(true);
	}
}






