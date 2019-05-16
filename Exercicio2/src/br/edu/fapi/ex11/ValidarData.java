package br.edu.fapi.ex11;

import java.util.Scanner;

public class ValidarData {
	Scanner leia = new Scanner(System.in);
	Data data = new Data();
	public int dia() {
		do {
			System.out.println("Digite dia:");
			data.dia = leia.nextInt();
		} while (data.dia < 1 || data.dia > 31);
		return data.dia;
	}
	public int mes() {
		do {
			System.out.println("Digite mes");
			data.mes = leia.nextInt();
		} while (data.mes < 1 || data.mes > 12);
		return data.mes;
	}
	public int ano() {
		do {
			System.out.println("Digite ano");
			data.ano = leia.nextInt();
		} while (data.ano < 0);
		return data.ano;
	}

}
