package Exercicios;

import java.util.Scanner;


public class Produto {

	    private String nome;
	    private String codigo;
	    private double preco;
	    private int quantidade;

	    public Produto() {
	        Scanner Ler = new Scanner(System.in);
	        System.out.print("Digite o nome do produto: ");
	        this.nome = Ler.nextLine();
	        System.out.print("Digite o código do produto: ");
	        this.codigo = Ler.nextLine();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }

	    public double calculaValorEstoque() {
	        return preco * quantidade;
	    }

	    public String statusEstoque() {
	        if (quantidade >= 10) {
	            return "Estoque suficiente";
	        } else {
	            return "Estoque baixo";
	        }
	    }
	}
