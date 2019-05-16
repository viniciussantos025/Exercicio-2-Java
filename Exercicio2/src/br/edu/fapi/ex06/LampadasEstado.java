package br.edu.fapi.ex06;

import java.util.Scanner;

public class LampadasEstado {

	boolean estado = false;

	public void OnOff() {

		Scanner leia = new Scanner(System.in);
		Lampada lampada = new Lampada();

		int opmenu;
		do {
		System.out.println("LAMPADA");
		System.out.println("1-Ver estado da lampada");
		System.out.println("2-Ver cor lampada");
		System.out.println("3-sair");
		opmenu=leia.nextInt();
		switch(opmenu) {
		case 1:
			if (estado == false) {
			System.out.println("A lampada esta desligada deseja ligar");
			System.out.println("1-Ligar");
			System.out.println("2-Não ligar");
				int op = leia.nextInt();
				switch (op) {
				case 1:
					System.out.println("Lampada  ligada");
					estado = true;
					break;
				case 2:
					System.out.println("Lampada  desligada");
					break;
				}
				} else {
					System.out.println("A lampada esta ligada deseja desligar");
					System.out.println("1-Desligar");
					System.out.println("2-Não Desligar");
					int op = leia.nextInt();
					switch (op) {
						case 1:
							System.out.println("Lampada esta Desligada");
							estado = false;
							break;
						case 2:
							System.out.println("Lampada continuara ligada");
							break;
					}
				}
			break;
		case 2:
			System.out.println("A cor da lampada é "+lampada.cor);
			break;
		case 3:
			break;
		}
			}while(opmenu != 3);
	}
}