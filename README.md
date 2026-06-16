# Estudos Java

Repositório com exercícios e projetos desenvolvidos durante a graduação em Análise e Desenvolvimento de Sistemas, organizados por tema.

## Estrutura

```
estudos-java/
├── 01-fundamentos/          → Primeiros programas: variáveis, condicionais, entrada/saída
├── 02-poo/                  → Orientação a Objetos: herança, polimorfismo, abstração
│   ├── adega-heranca/       → Herança: Bebida → Vinho, Espumante, Uisque
│   ├── sistema-hospitalar/  → Polimorfismo: Profissional → Medico, Enfermeiro, Tecnico
│   ├── heranca-rh/          → Herança RH: Empregado → Gerente, Desenvolvedor, Estagiario
│   └── exemplos-classes/    → Classes, atributos e métodos básicos
├── 03-interfaces/           → Interfaces Java: Calculadora, IMCCalculator
├── 04-arrays-e-strings/     → Manipulação de arrays e Strings: busca, matrizes, análise
├── 05-exercicios/           → Listas de exercícios progressivos
│   ├── lista-1/             → 24 exercícios (MeuProjetoJava)
│   ├── lista-2/             → 14 exercícios (ListaDeExercicios2)
│   └── exercicios-livro/    → Exercícios de livro: primos, progressão, conversão
├── 06-gui-awt/              → Interfaces gráficas com AWT: BlocoNotas, ListaTarefas
└── 07-projetos/             → Projetos completos de aula
    ├── sistema-cadastro-produtos/  → CRUD de produtos com exceção customizada
    ├── gerador-equipes/            → Gerador aleatório de nomes de equipes
    └── calculo-imposto-renda/      → Cálculo de IR com tabela progressiva
```

## Tecnologias

- Java 11+
- AWT (interfaces gráficas simples)
- Eclipse IDE

## Como rodar qualquer exercício

```bash
# Compilar
javac caminho/do/arquivo/Arquivo.java

# Executar
java -cp caminho/do/arquivo/ NomeDaClasse
```

## Licença

MIT © [Pedro Szpak](https://github.com/PeSzpak)
