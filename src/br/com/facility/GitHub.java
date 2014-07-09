package br.com.facility;

import br.com.facility.to.Cliente;

public class GitHub {

	public static void main(String[] args) {
		//teste de commit
		
		Cliente c = new Cliente();
		c.setNome("Marcelo");
		c.setId(1);
		
		System.out.println(c.getNome() + " - " + c.getId());

	}
	
}
