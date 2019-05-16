package br.edu.fapi.ex02;

public class Produto {
	int idProduto = 54785;
	String nome = "Celular";
	String departamento = "Eletronico";
	String cor = "Preto";
	String marca = "Motorola";
	float preco = 1500.00f;

	int voltaId() {
		System.out.println("ID Produto: "+idProduto);
		return idProduto;
	}

	String voltaNome() {
		System.out.println("Nome: "+nome);
		return nome;
	}

	String voltaDep() {
		System.out.println("Departamento: "+departamento);
		return departamento;
	}

	String voltaCor() {
		System.out.println("Cor: "+cor);
		return cor;
	}

	String voltaMarca() {
		System.out.println("Marca: "+marca);
		return marca;
	}

	float voltaPreco() {
		System.out.println("Preço: "+preco);
		return preco;
	}
}
