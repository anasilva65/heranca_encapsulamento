package Application;

import Entities.Fornecedor;

public class PubliMain {

	public static void main(String[] args) 
	{
		
Fornecedor fornecedor =  new Fornecedor(2500, 1800);
		
		fornecedor.setNome("Carlos");
		fornecedor.setEndereco("Rua Barata, 323, bela vista, São Paulo, SP");
		fornecedor.setTelefone("11 9 99999-111");
		
		System.out.println(fornecedor.toString());
		fornecedor.check();
		
	}
}
