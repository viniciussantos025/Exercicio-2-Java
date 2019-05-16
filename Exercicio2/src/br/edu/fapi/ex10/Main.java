package br.edu.fapi.ex10;

import java.util.Scanner;

public class Main{
	static int lado;
	static Scanner leia= new Scanner (System.in);	
	public static void main(String[] args) {
		System.out.println("Digite o lado do quadrado");
		lado = leia.nextInt();
		Quadrado quadrado= new Quadrado();
		quadrado.areaQuadrado(lado);
		quadrado.perimetro(lado);		
	}
}
