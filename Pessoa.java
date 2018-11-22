package exemplo;

public class Pessoa {
	
	protected String nome;
	private String cpf;
	private char sexo;
	private String data;
	private String email;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void andar(int passos){
		System.out.println(nome  + "andou" +  passos + "passos");
	}
	 public void falar(int palavras){
		 System.out.println(nome + " falou "+palavras+ " palavras ");
		 
	 }
	 public void dormir(int dormir){
		 System.out.println(nome+" dormiu "+dormir+" palavras ");
	 }
	 public void comer(int calorias){
		 System.out.println(nome+ " ingeriu "+calorias+" calarias ");
	 }

}
