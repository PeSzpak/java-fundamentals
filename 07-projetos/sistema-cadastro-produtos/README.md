# Sistema de Cadastro de Produtos

**Atividade Pratica - Aula 09 (Swing, Exceptions e Collections em Java)**
**Professor:** Roberson Cesar Alves de Araujo
**Aluno:** Pedro Szpak - ADS / Senac PR

---

## Estrutura do projeto

```
SistemaCadastroProdutos/
├── src/
│   ├── Produto.java                    -> Classe modelo (POO + encapsulamento)
│   ├── ProdutoInvalidoException.java   -> Custom exception
│   └── SistemaCadastroProdutos.java    -> Janela principal (Swing)
└── README.md
```

## Como executar pelo terminal

```bash
cd src
javac *.java
java SistemaCadastroProdutos
```

## Como executar pelo NetBeans

1. File -> New Project -> Java Application
2. Importar os 3 arquivos `.java` na pasta `src`
3. Definir `SistemaCadastroProdutos` como Main Class
4. Run (F6)

## Componentes Swing utilizados (todos os obrigatorios)

- `JFrame`       - janela principal
- `JPanel`       - 5 paineis organizando cabecalho, formulario, botoes, tabela e rodape
- `JTextField`   - 4 campos (Nome, Categoria, Preco, Quantidade)
- `JButton`      - 3 botoes (Salvar, Limpar, Excluir) com Lambdas
- `JTable`       - exibicao dos produtos com cabecalho colorido e linhas zebradas
- `JOptionPane`  - mensagens de sucesso, alerta e confirmacao

## Boas praticas aplicadas

- **POO:** classe `Produto` com construtor, getters/setters e ID auto-incremento.
- **Collections:** `ArrayList<Produto>` para armazenamento dinamico (`add`, `remove`, `size`, `get`).
- **Exceptions:**
  - `try/catch` em todas as conversoes (`NumberFormatException`).
  - Custom exception `ProdutoInvalidoException` para regras de negocio.
  - Validacao de campos vazios e valores negativos (preco e quantidade).
- **Eventos:** `ActionListener` com expressoes Lambda.
- **UX:** clicar numa linha da tabela preenche os campos; campos limpam apos salvar; confirmacao antes de excluir; total de produtos atualizado em tempo real.
- **Visual:** Look and Feel Nimbus, paleta de cores propria, formatacao de moeda em pt-BR (R$ 1.234,56).
