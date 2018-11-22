package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Cliente;

/*
 * � a classe respons�vel por centralizar toda a intera��o
 * da entidade com o banco, como a implementa��o do CRUD. 
 * � comum termos uma classe DAO para cada entidade do 
 * sistema.
 */
public class ClienteDAO {
	
	private Connection conexao;
	
	private static ClienteDAO instancia;
	
	//Implementa��o do padr�o Singleton
	public static ClienteDAO getClienteDAO() {
		if(instancia == null) {
			instancia = new ClienteDAO();
			return instancia;
		} else {
			return instancia;
		}
	}
	
	private ClienteDAO() {
		FabricaConexao fabrica = new FabricaConexao();
		conexao = fabrica.obtemConexao();
	}
	
	// In�cio da implementa��o do CRUD
	public boolean adicionarCliente(Cliente c) {
		
		/*
		 *  String com o comando SQL que ser� executado junto
		 *  ao banco.
		 */
		String sql = "insert into cliente (nome,cpf,email) "
				+ "values (?,?,?)";
		
		boolean status = false;
		
		try {
			
			/*
			 * Objeto respons�vel pela execu��o dos comandos SQL
			 * no banco. Como quem "conhece" nosso banco � a
			 * conex�o, a utilizaremos para instanciar o objeto.
			 */
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			/*
			 * Substitui��o dos "?" pelos dados que ser�o
			 * persistidos. Cada interroga��o possui um
			 * �ndice espec�fico, sendo que iniciamos sempre
			 * em 1.
			 */
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCpf());
			stmt.setString(3, c.getEmail());
			
			// Executa o comando SQL junto ao banco.
			if(stmt.executeUpdate() !=0){
				status=true;
			}
			
			stmt.close();
			
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, 
					"Imposs�vel criar statement");
			
			e.printStackTrace();
		}
		
		return status;
	}
	
	public boolean removerCliente(int id) {
		
		String sql = "delete from cliente where id=?";
		
		boolean status = false;
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			if(stmt.executeUpdate() !=0){
				status=true;
			}
			stmt.close();
			
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, 
					"Imposs�vel criar statement.");
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public boolean atualizarCliente(Cliente c) {
		
		String sql = "update cliente set nome=?, cpf=?, "
				+ "email=? where id=?";
		
		boolean status = false;
		
		// try-catch � utilizado no tratamento de exce��es(?)
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCpf());
			stmt.setString(3, c.getEmail());
			stmt.setInt(4, c.getId());
			
			if(stmt.executeUpdate() !=0){
				status=true;
			}
			
			stmt.close();
			
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, 
					"Imposs�vel criar statement.");
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public List<Cliente> listarClientes() {
		
		String sql = "select * from cliente";
		
		// Lista que receber� o retorno do banco
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			/*
			 * Nesse caso onde precisamos do retorno do banco, 
			 * o m�todo execute() j� n�o � mais suficiente. Para
			 * obtermos o resultado da consulta usaremos o m�todo
			 * executeQuery(), que retorna um objeto do tipo
			 * ResultSet com todos os registros encontrados.
			 */
			ResultSet rs = stmt.executeQuery();
			
			/*
			 * Utilizamos o la�o enquanto para navegar entre
			 * os registros recuperados. A execu��o do la�o
			 * encerrar� quando o rs n�o possuir um pr�ximo
			 * elemento.
			 */
			while(rs.next()) {
				Cliente c = new Cliente();
				
				/*
				 * Para recuperarmos os dados do cliente
				 * utilizamos os m�todos get do rs, respeitando
				 * os tipos de cada um dos atributos.
				 */
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				
				clientes.add(c);
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, 
					"Imposs�vel criar statement.");
			e.printStackTrace();
		}
		
		return clientes;
	}
	
	public Cliente buscarCliente(int id) {
		
		String sql = "select * from cliente where id=?";
		
		Cliente c = new Cliente();
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {

			JOptionPane.showConfirmDialog(null, 
					"Imposs�vel criar statement");
			e.printStackTrace();
		}
		
		return c;
		
	}

}














