package br.edu.fapi.ex11;

public class Main {
	public static void main(String[] args) {		 
		ValidarData valida= new ValidarData();		
		int dia = valida.dia();
		int mes= valida.mes();
		int ano= valida.ano();		 
		System.out.println(ano + "-" + mes + "-" + dia);		
	}
}
