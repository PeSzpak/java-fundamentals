/**
 * Classe modelo que representa um Produto no sistema.
 *
 * Aplica os conceitos de POO vistos em aula:
 *  - Encapsulamento (atributos privados + getters/setters)
 *  - Construtor para inicializar o objeto
 *  - Atributo estatico para gerar IDs sequenciais automaticamente
 *
 * Autor: Pedro Szpak - ADS / Senac PR
 * Disciplina: Analise e Projeto de Sistemas - Prof. Roberson Cesar Alves de Araujo
 */
public class Produto {

    // Contador estatico - compartilhado entre todas as instancias.
    // Garante que cada produto criado receba um ID unico e sequencial.
    private static int proximoId = 1;

    private int id;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;

    /**
     * Construtor padrao. O ID e atribuido automaticamente.
     */
    public Produto(String nome, String categoria, double preco, int quantidade) {
        this.id = proximoId++;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // ---------- Getters ----------
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // ---------- Setters ----------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Representacao textual util para debug e logs.
     */
    @Override
    public String toString() {
        return String.format("Produto[id=%d, nome=%s, categoria=%s, preco=%.2f, quantidade=%d]",
                id, nome, categoria, preco, quantidade);
    }
}
