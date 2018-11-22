package agenda;
//Buguei tudo!!!!!!!!!!!!!!!! Está incompleto!

import java.util.Scanner;

public class Participante {
          
	private  String cpf;
	private  String nome;
	private String marca;
	private String cnpj;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 public void cadastrar(){
		 System.out.println("Digite cnpj: ");
			Scanner in =new Scanner(System.in);
			System.out.println("Digite nome: ");
			in=new Scanner(System.in);
			System.out.println("Digite marca: ");
			in=new Scanner(System.in);
			this.marca=in.next();
			
		}
	
		
	 }


