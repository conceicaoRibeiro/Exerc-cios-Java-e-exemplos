package agenda;
//Buguei tudo!!!!!!!!!!!!!!!! Está incompleto!

import java.util.Date;
import java.util.Scanner;

public class Evento {

	private Date data;
	private String horarioInicio;
	private String horarioFim;
	private Local local;
	private Patrocinador patrocinador;
	private Evento even;
	
	
	public Date getData() {      
		return data;
	}
	public void setData(Date data) {  
		this.data = data;
	}
	public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Patrocinador getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}
	
	public void cadastrar(){
		
		System.out.println("Digite a data: ");
		Scanner in =new Scanner(System.in);
		System.out.println("Digite o horário de início: ");
		in=new Scanner(System.in);
		System.out.println("Digite o local: ");
		in=new Scanner(System.in);
		System.out.println("Digite o patrocinador: ");
		this.patrocinador= in.next();
		
	}
	
	
}
	
	
	

