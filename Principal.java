package exemplo;

public class Principal {

	public static void main(String[] args) {
      
		Aluno a= new Aluno();
		
		a.setNome("Claudio");
		a.setCpf("111.222.333-44");
		a.setData("11/10/1998");
		a.setMatricula("aa2222");
		a.setEmail("claudinho@uol.com.br");
		
		a.falar(55);
		a.estudar(32);
		 
		
		Medico m = new Medico();
		m.setNome("Julio ");
		m.setEspecialidade("Cardiologia");
		
		m.dormir(8);
        a.dormir(8);
        
        System.out.println(a);
        System.out.println(m);
        
		 
        //método toString,todo objeto tas esse metodo,ele vem da Superclasse,todos os objetos que criamos já tem esse métod,poré podemos muda-lo.
		
	}

}
