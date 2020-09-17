package Entities;

public class Fornecedor extends Pessoa 
{
       private double valorDivida;
       private double valorCredito;
       private double saldo;
       
       
       public Fornecedor(String nome, String endereco) {
   		super(nome, endereco);
   		// TODO Auto-generated constructor stub
   	}

   	public Fornecedor(String nome, String endereco, String telefone) {
   		super(nome, endereco, telefone);
   		
   	}
   	
   	public Fornecedor () {
   	
   		super ();
   	}
   	
   	public Fornecedor(String nome) {
   		super(nome);
   	}

   	public Fornecedor(String nome, double valorCredito, double valorDivida) {
   		super(nome);
   		this.valorCredito = valorCredito;
   		this.valorDivida = valorDivida;
   	}
   	
   	public Fornecedor(double valorCredito, double valorDivida) {
   		
   		this.valorCredito = valorCredito;
   		this.valorDivida = valorDivida;
   	}
   	
   	

   	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
   		super(nome, endereco, telefone);
   		this.valorCredito = valorCredito;
   		this.valorDivida = valorDivida;
   	}

   	public double getValorCredito() {
   		return valorCredito;
   	}

   	public void setValorCredito(double valorCredito) {
   		this.valorCredito = valorCredito;
   	}

   	public double getValorDivida() {
   		return valorDivida;
   	}

   	public void setValorDivida(double valorDivida) {
   		this.valorDivida = valorDivida;
   	}
   //___________________________________________________________________________	
   	public double obterSaldo() {
   		
   		return (valorCredito - valorDivida) ;
   	}
   	
   	public void check() {
   		saldo = obterSaldo();
   		
   		if(saldo >0) {
   			System.out.println("Saldo positivo: R$ " + obterSaldo());
   		} else {
   			System.out.println("Saldo negativo: R$ " + obterSaldo());
   		}
   	}
   	public String toString() {
       	
       	return "Nome: " + getNome() + "\n" + "Endereço: " + getEndereco() + "\n"
       	+ "Telefone: " + getTelefone();
       	
       	
       }



}
