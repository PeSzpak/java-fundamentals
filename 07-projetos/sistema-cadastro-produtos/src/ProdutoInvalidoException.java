/**
 * Exception personalizada para regras de negocio do dominio "Produto".
 *
 * Conforme apresentado no slide "Custom Exceptions: Criando regras de negocio
 * especificas", criar excecoes proprias deixa o codigo mais semantico:
 * em vez de lancar um IllegalArgumentException generico, o erro carrega
 * o significado exato do problema (ex.: "preco negativo", "campo vazio").
 *
 * Estende Exception (checked) para forcar tratamento explicito com try/catch.
 */
public class ProdutoInvalidoException extends Exception {

    public ProdutoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
