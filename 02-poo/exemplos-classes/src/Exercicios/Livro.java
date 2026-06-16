package Exercicios;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private int anoDePublicacao;
    private boolean emEstoque;

    public Livro(String titulo, String autor, String editora, int anoDePublicacao) {
        this.titulo          = titulo;
        this.autor           = autor;
        this.editora         = editora;
        this.anoDePublicacao = anoDePublicacao;
        this.emEstoque       = true; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }

    public void emprestar() {
        if (emEstoque) {
            emEstoque = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" não está disponível para empréstimo.");
        }
    }

    public void devolver() {
        emEstoque = true;
        System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
    }
}