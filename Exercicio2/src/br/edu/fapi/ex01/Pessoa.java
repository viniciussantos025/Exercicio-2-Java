package br.edu.fapi.ex01;


public class Pessoa {

		 String nome="jose";
		 String sobrenome="mario";
		 int idade=57;
		 int telefone=999547541;
		 
		 String voltaNome(){
			 System.out.println("Nome: "+nome);
			 return nome;
		 }
		 
		 String voltaSobrenome() {
			 System.out.println("Sobrenome: "+sobrenome);
			 return sobrenome;
		 }
		 int voltaIdade() {
			 System.out.println("Idade: "+idade);
			 return idade;
		 }
		 int voltaTelefone() {
			 System.out.println("Telefone: "+telefone);
			 return telefone;
		 }
	}