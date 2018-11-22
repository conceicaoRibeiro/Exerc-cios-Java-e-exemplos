package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

// Implementação do padrão Factory
public class FabricaConexao {
	
	public Connection obtemConexao() {
		
		try {
			
			//Registro do Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/clientes?useTimezone=true&serverTimezone=UTC", 
					"root", "");
			
		} catch (ClassNotFoundException e) {

			JOptionPane.showMessageDialog(null, 
					"Impossível instanciar Driver MySQL.");
			
			e.printStackTrace();
			
			return null;
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, 
					"Impossível realizar conexão com o banco.");
			
			e.printStackTrace();
			
			return null;
		}
		
	}

}
