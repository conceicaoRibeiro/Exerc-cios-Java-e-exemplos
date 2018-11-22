package agenda;

import java.util.Scanner;       //Buguei tudo!!!!!!!!!!!!!!!! Está incompleto!

public class Principal {


	public static void main(String []args){
		int opcao;
	
		Patrocinador patrocinador = new Patrocinador();
		
		
		
		do{
		System.out.println("===Menu=====");
		System.out.println("1.Patrocinador");
		System.out.println("2.Local");
		System.out.println("3. Evento");
		System.out.println("4.Participante");
		System.out.println("5.Inscirção");
		System.out.println("0. Sair");
		System.out.println("==============");
		System.out.println("Opção:");
		
	     Scanner in =new Scanner(System.in);
	     opcao=in.nextInt();
	     
	     if(opcao==1){
	    	 System.out.println("++Patrocinador++");
	    		 
	     }else if(opcao==2){
	    	 System.out.println("++Local++");
	     }else if(opcao==3){
	    	 System.out.println("++Evento++");
	    	
	     }else if(opcao==4){
	    	 System.out.println("++Participante++");
	     }else if(opcao==5){
	    	 System.out.println("++Inscirção++");
	     }
		}while(opcao!=0);
	     
	                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                	}
}
