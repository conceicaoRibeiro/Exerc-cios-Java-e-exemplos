package exemplo;
/*
 *Para verificar se a herença foi aplicada de forma correta,
 *podemos utilizar a frase ----é um tipo de-------- 
 */

public class Medico extends Pessoa {
   
	private String crm;
	private String especialidade;
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	 public void operar(int pessoas){
		 System.out.println(nome+"operou"+pessoas+"pessoas.");
	 }
	
	 @Override
	public String toString(){
		return "Nome: " + nome + "|" + " Especialidade " + especialidade;	
	}
}
