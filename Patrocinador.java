package agenda;
//Buguei tudo!!!!!!!!!!!!!!!! Está incompleto!

import java.util.Scanner;

public class Patrocinador {
	
	private String cpf;
	private String nome;
	private String marca;
	private int cnpj;
	private Patrocinador patrocinador;
	
	public Patrocinador getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
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
	@Override
	public String toString() {
		return "Patrocinador [cpf=" + cpf + ", nome=" + nome + ", marca=" + marca + ", cnpj=" + cnpj + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
		
	}
	


