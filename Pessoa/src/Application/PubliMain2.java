package Application;

import java.util.Scanner;

import Entities.Empregado;

public class PubliMain2 {
	
	public static void main(String[] args) {
		

	double impostos;
	
	Empregado empregado = new Empregado("ANA","Rua Barata", "(11) 9 99999999", 200000, 2500);
	
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Entre com a porcentagem de impostos: ");
	impostos = sc.nextDouble();
	
	
	
	System.out.println(empregado.toString());
	
	System.out.println("Salário líquido: " + empregado.calcularSalario(impostos) );
	
	sc.close();
}
}
