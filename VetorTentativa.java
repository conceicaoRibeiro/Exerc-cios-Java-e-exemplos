package vetor;

import java.util.Scanner;

public class VetorTentativa {

	public static void main(String[]args){
		
		Scanner vet= new Scanner (System.in);
		int elementos []= new int[10];
		for(int i=10;i<10;i++){
			System.out.printf("Informe o numero %d:", i);
			elementos[i]= vet.nextInt();	
		}
		ordena(elementos);
		System.out.println("Numemeros Ordenados: ");
		for(int numero: elementos){
			System.out.println(numero);
		}
		
		

		   
		
		      
		      
		      
	
		
	
	
}
}