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
 * É a classe responsável por centralizar toda a interação
 * da entidade com o banco, como a implementação do CRUD. 
 * É comum termos uma classe DAO para cada entidade do 
 * sistema.
 */
public class ClienteDAO {
	
	private Connection conexao;
	
	private static ClienteDAO instancia;
	
	//Implementação do padrão Singleton
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
	
	// Início da implementação do CRUD
	public boolean adicionarCliente(Cliente c) {
		
		/*
		 *  String com o comando SQL que será executado junto
		 *  ao banco.
		 */
		String sql = "insert into cliente (nome,cpf,email) "
				+ "values (?,?,?)";
		
		boolean status = false;
		
		try {
			
			/*
			 * Objeto responsável pela execução dos comandos SQL
			 * no banco. Como quem "conhece" nosso banco é a
			 * conexão, a utilizaremos para instanciar o objeto.
			 */
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			/*
			 * Substituição dos "?" pelos dados que serão
			 * persistidos. Cada interrogação possui um
			 * índice específico, sendo que iniciamos sempre
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
					"Impossível criar statement");
			
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
					"Impossível criar statement.");
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public boolean atualizarCliente(Cliente c) {
		
		String sql = "update cliente set nome=?, cpf=?, "
				+ "email=? where id=?";
		
		boolean status = false;
		
		// try-catch é utilizado no tratamento de exceções(?)
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
					"Impossível criar statement.");
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public List<Cliente> listarClientes() {
		
		String sql = "select * from cliente";
		
		// Lista que receberá o retorno do banco
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			/*
			 * Nesse caso onde precisamos do retorno do banco, 
			 * o método execute() já não é mais suficiente. Para
			 * obtermos o resultado da consulta usaremos o método
			 * executeQuery(), que retorna um objeto do tipo
			 * ResultSet com todos os registros encontrados.
			 */
			ResultSet rs = stmt.executeQuery();
			
			/*
			 * Utilizamos o laço enquanto para navegar entre
			 * os registros recuperados. A execução do laço
			 * encerrará quando o rs não possuir um próximo
			 * elemento.
			 */
			while(rs.next()) {
				Cliente c = new Cliente();
				
				/*
				 * Para recuperarmos os dados do cliente
				 * utilizamos os métodos get do rs, respeitando
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
					"Impossível criar statement.");
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
					"Impossível criar statement");
			e.printStackTrace();
		}
		
		return c;
		
	}

}














