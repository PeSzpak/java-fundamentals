import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Sistema de Cadastro de Produtos
 *
 * Atividade Pratica - Aula 09 (Swing, Exceptions e Collections em Java)
 * Professor: Roberson Cesar Alves de Araujo
 * Aluno:     Pedro Szpak - ADS / Senac PR
 *
 * Esta classe integra as 4 camadas que o professor apresentou nos slides:
 *
 *   1. Camada Visual    -> Swing (JFrame, JPanel, JButton, JTextField, JTable, JOptionPane)
 *   2. Camada Controle  -> Eventos com ActionListener via expressoes Lambda
 *   3. Camada de Dados  -> ArrayList<Produto> em memoria
 *   4. Camada Seguranca -> try/catch, validacoes e ProdutoInvalidoException
 */
public class SistemaCadastroProdutos extends JFrame {

    // ---------- Camada de Dados ----------
    // ArrayList obrigatorio pelo enunciado.
    // Cresce dinamicamente conforme novos produtos sao adicionados.
    private final ArrayList<Produto> produtos = new ArrayList<>();

    // ---------- Componentes Swing ----------
    private JTextField txtNome;
    private JTextField txtCategoria;
    private JTextField txtPreco;
    private JTextField txtQuantidade;
    private JTable tabelaProdutos;
    private DefaultTableModel modeloTabela;
    private JLabel lblTotal;

    // ---------- Paleta de cores (interface moderna) ----------
    private static final Color COR_PRIMARIA = new Color(33, 47, 90);     // azul escuro
    private static final Color COR_SECUNDARIA = new Color(70, 90, 140);  // azul medio
    private static final Color COR_SUCESSO = new Color(46, 160, 67);     // verde "Salvar"
    private static final Color COR_AVISO = new Color(230, 145, 30);      // laranja "Limpar"
    private static final Color COR_PERIGO = new Color(200, 50, 50);      // vermelho "Excluir"
    private static final Color COR_FUNDO = new Color(245, 247, 251);     // fundo geral
    private static final Color COR_PAINEL = Color.WHITE;
    private static final Color COR_TEXTO = new Color(40, 50, 70);
    private static final Color COR_BORDA = new Color(220, 225, 235);
    private static final Color COR_LINHA_PAR = new Color(248, 250, 253);

    // Formatador de moeda brasileira (R$ 1.234,56)
    private static final NumberFormat FORMATO_MOEDA =
            NumberFormat.getCurrencyInstance(
                    new Locale.Builder().setLanguage("pt").setRegion("BR").build());

    /**
     * Construtor: monta toda a janela.
     */
    public SistemaCadastroProdutos() {
        configurarJanela();
        montarInterface();
        registrarEventos();
    }

    // =================================================================
    // CONFIGURACAO DA JANELA
    // =================================================================
    private void configurarJanela() {
        setTitle("Sistema de Cadastro de Produtos");
        setSize(960, 720);
        setMinimumSize(new Dimension(820, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza a janela na tela
        setLayout(new BorderLayout());
        getContentPane().setBackground(COR_FUNDO);
    }

    // =================================================================
    // MONTAGEM DA INTERFACE (uso de JPanel para organizar areas)
    // =================================================================
    private void montarInterface() {
        add(criarCabecalho(), BorderLayout.NORTH);
        add(criarCorpo(), BorderLayout.CENTER);
        add(criarRodape(), BorderLayout.SOUTH);
    }

    /**
     * Cabecalho com titulo e subtitulo (JPanel - "painelNorte").
     */
    private JPanel criarCabecalho() {
        JPanel painel = new JPanel(new BorderLayout());
        painel.setBackground(COR_PRIMARIA);
        painel.setBorder(new EmptyBorder(22, 32, 22, 32));

        JLabel titulo = new JLabel("Sistema de Cadastro de Produtos");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 24));
        titulo.setForeground(Color.WHITE);

        JLabel subtitulo = new JLabel("Swing + Exceptions + Collections (ArrayList)");
        subtitulo.setFont(new Font("SansSerif", Font.PLAIN, 13));
        subtitulo.setForeground(new Color(200, 210, 230));

        JPanel textos = new JPanel();
        textos.setOpaque(false);
        textos.setLayout(new BoxLayout(textos, BoxLayout.Y_AXIS));
        titulo.setAlignmentX(Component.LEFT_ALIGNMENT);
        subtitulo.setAlignmentX(Component.LEFT_ALIGNMENT);
        textos.add(titulo);
        textos.add(Box.createVerticalStrut(4));
        textos.add(subtitulo);

        painel.add(textos, BorderLayout.WEST);
        return painel;
    }

    /**
     * Corpo: formulario em cima + tabela embaixo (painelCentro).
     */
    private JPanel criarCorpo() {
        JPanel corpo = new JPanel(new BorderLayout(0, 16));
        corpo.setBackground(COR_FUNDO);
        corpo.setBorder(new EmptyBorder(20, 24, 20, 24));

        corpo.add(criarPainelFormulario(), BorderLayout.NORTH);
        corpo.add(criarPainelTabela(), BorderLayout.CENTER);
        return corpo;
    }

    /**
     * Painel branco com os JTextFields + botoes de acao.
     * Layout: GridBagLayout para alinhamento perfeito de labels e campos.
     */
    private JPanel criarPainelFormulario() {
        JPanel painel = new JPanel(new BorderLayout(0, 14));
        painel.setBackground(COR_PAINEL);
        painel.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(COR_BORDA, 1, true),
                new EmptyBorder(18, 22, 18, 22)
        ));

        // Titulo da secao
        JLabel tituloSecao = new JLabel("Cadastro de Produto");
        tituloSecao.setFont(new Font("SansSerif", Font.BOLD, 16));
        tituloSecao.setForeground(COR_TEXTO);
        painel.add(tituloSecao, BorderLayout.NORTH);

        // ----- Formulario com GridBagLayout -----
        JPanel form = new JPanel(new GridBagLayout());
        form.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;

        txtNome = criarCampo();
        txtCategoria = criarCampo();
        txtPreco = criarCampo();
        txtQuantidade = criarCampo();

        // Linha 1: Nome | Categoria
        adicionarCampo(form, gbc, "Nome do Produto:", txtNome, 0, 0);
        adicionarCampo(form, gbc, "Categoria:",       txtCategoria, 2, 0);

        // Linha 2: Preco | Quantidade
        adicionarCampo(form, gbc, "Preco (R$):",      txtPreco, 0, 1);
        adicionarCampo(form, gbc, "Quantidade:",      txtQuantidade, 2, 1);

        painel.add(form, BorderLayout.CENTER);
        painel.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return painel;
    }

    /**
     * Helper: adiciona um label + campo no GridBagLayout.
     */
    private void adicionarCampo(JPanel form, GridBagConstraints gbc, String texto,
                                JTextField campo, int colInicial, int linha) {
        gbc.gridx = colInicial;
        gbc.gridy = linha;
        gbc.weightx = 0;
        JLabel label = new JLabel(texto);
        label.setFont(new Font("SansSerif", Font.PLAIN, 13));
        label.setForeground(COR_TEXTO);
        form.add(label, gbc);

        gbc.gridx = colInicial + 1;
        gbc.weightx = 1.0;
        form.add(campo, gbc);
    }

    /**
     * Cria um JTextField com estilo unificado.
     */
    private JTextField criarCampo() {
        JTextField campo = new JTextField(18);
        campo.setFont(new Font("SansSerif", Font.PLAIN, 14));
        campo.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(COR_BORDA, 1, true),
                new EmptyBorder(6, 8, 6, 8)
        ));
        return campo;
    }

    /**
     * Painel com os 3 botoes (JButton).
     */
    private JPanel criarPainelBotoes() {
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 4));
        painel.setOpaque(false);

        JButton btnSalvar  = criarBotao("Salvar",  COR_SUCESSO);
        JButton btnLimpar  = criarBotao("Limpar",  COR_AVISO);
        JButton btnExcluir = criarBotao("Excluir", COR_PERIGO);

        // ActionListeners com expressoes Lambda (boa pratica do slide)
        btnSalvar.addActionListener(e -> salvarProduto());
        btnLimpar.addActionListener(e -> limparCampos());
        btnExcluir.addActionListener(e -> excluirProduto());

        painel.add(btnSalvar);
        painel.add(btnLimpar);
        painel.add(btnExcluir);
        return painel;
    }

    /**
     * Cria um JButton estilizado (cor de fundo + texto branco).
     */
    private JButton criarBotao(String texto, Color corFundo) {
        JButton botao = new JButton(texto);
        botao.setFont(new Font("SansSerif", Font.BOLD, 13));
        botao.setForeground(Color.WHITE);
        botao.setBackground(corFundo);
        botao.setFocusPainted(false);
        botao.setBorder(new EmptyBorder(8, 22, 8, 22));
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botao.setOpaque(true);
        botao.setBorderPainted(false);
        return botao;
    }

    /**
     * Painel com a JTable dentro de um JScrollPane.
     */
    private JPanel criarPainelTabela() {
        JPanel painel = new JPanel(new BorderLayout(0, 10));
        painel.setBackground(COR_PAINEL);
        painel.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(COR_BORDA, 1, true),
                new EmptyBorder(18, 22, 18, 22)
        ));

        JLabel tituloSecao = new JLabel("Produtos Cadastrados");
        tituloSecao.setFont(new Font("SansSerif", Font.BOLD, 16));
        tituloSecao.setForeground(COR_TEXTO);
        painel.add(tituloSecao, BorderLayout.NORTH);

        // Modelo de tabela que NAO permite edicao direta nas celulas
        String[] colunas = {"ID", "Nome", "Categoria", "Preco (R$)", "Quantidade"};
        modeloTabela = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // somente leitura - edicao acontece pelos campos
            }
        };

        tabelaProdutos = new JTable(modeloTabela);
        configurarEstiloTabela();

        JScrollPane scroll = new JScrollPane(tabelaProdutos);
        scroll.setBorder(new LineBorder(COR_BORDA, 1, true));
        scroll.getViewport().setBackground(COR_PAINEL);
        painel.add(scroll, BorderLayout.CENTER);
        return painel;
    }

    /**
     * Configura aparencia da tabela: fontes, header colorido e zebra.
     */
    private void configurarEstiloTabela() {
        tabelaProdutos.setFont(new Font("SansSerif", Font.PLAIN, 13));
        tabelaProdutos.setRowHeight(28);
        tabelaProdutos.setShowGrid(false);
        tabelaProdutos.setIntercellSpacing(new Dimension(0, 0));
        tabelaProdutos.setSelectionBackground(new Color(200, 215, 245));
        tabelaProdutos.setSelectionForeground(COR_TEXTO);
        tabelaProdutos.getTableHeader().setReorderingAllowed(false);

        // Cabecalho colorido
        JTableHeader header = tabelaProdutos.getTableHeader();
        header.setBackground(COR_SECUNDARIA);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("SansSerif", Font.BOLD, 13));
        header.setPreferredSize(new Dimension(0, 34));

        // Renderer com efeito "zebra" (linhas alternadas)
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                if (!isSelected) {
                    c.setBackground(row % 2 == 0 ? COR_PAINEL : COR_LINHA_PAR);
                    c.setForeground(COR_TEXTO);
                }
                setBorder(new EmptyBorder(0, 10, 0, 10));
                return c;
            }
        };
        for (int i = 0; i < tabelaProdutos.getColumnCount(); i++) {
            tabelaProdutos.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Ajusta largura das colunas
        tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);   // ID
        tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(250);  // Nome
        tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(180);  // Categoria
        tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(120);  // Preco
        tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);  // Quantidade
    }

    /**
     * Rodape simples com contagem total de produtos.
     */
    private JPanel criarRodape() {
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 24, 10));
        painel.setBackground(COR_FUNDO);
        painel.setBorder(new EmptyBorder(0, 24, 14, 24));

        lblTotal = new JLabel("Total: 0 produto(s)");
        lblTotal.setFont(new Font("SansSerif", Font.BOLD, 13));
        lblTotal.setForeground(COR_SECUNDARIA);
        painel.add(lblTotal);
        return painel;
    }

    // =================================================================
    // EVENTOS ADICIONAIS
    // =================================================================
    private void registrarEventos() {
        // Ao clicar numa linha da tabela, preenche os campos automaticamente
        // (facilita edicoes / exclusoes - UX melhor).
        tabelaProdutos.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int linha = tabelaProdutos.getSelectedRow();
                if (linha >= 0 && linha < produtos.size()) {
                    Produto p = produtos.get(linha);
                    txtNome.setText(p.getNome());
                    txtCategoria.setText(p.getCategoria());
                    txtPreco.setText(String.valueOf(p.getPreco()));
                    txtQuantidade.setText(String.valueOf(p.getQuantidade()));
                }
            }
        });
    }

    // =================================================================
    // ACAO: SALVAR PRODUTO
    // Demonstra: try/catch + custom exception + JOptionPane + ArrayList.add
    // =================================================================
    private void salvarProduto() {
        try {
            // 1. Le e valida campos textuais
            String nome = txtNome.getText().trim();
            String categoria = txtCategoria.getText().trim();

            if (nome.isEmpty()) {
                throw new ProdutoInvalidoException("O campo 'Nome do Produto' nao pode estar vazio.");
            }
            if (categoria.isEmpty()) {
                throw new ProdutoInvalidoException("O campo 'Categoria' nao pode estar vazio.");
            }

            // 2. Le e converte campos numericos
            //    Aceita virgula como separador decimal (padrao brasileiro).
            double preco;
            int quantidade;
            try {
                preco = Double.parseDouble(txtPreco.getText().trim().replace(",", "."));
            } catch (NumberFormatException ex) {
                throw new ProdutoInvalidoException("O preco informado nao e um numero valido.");
            }
            try {
                quantidade = Integer.parseInt(txtQuantidade.getText().trim());
            } catch (NumberFormatException ex) {
                throw new ProdutoInvalidoException("A quantidade informada nao e um numero inteiro valido.");
            }

            // 3. Regras de negocio (custom exception)
            if (preco < 0) {
                throw new ProdutoInvalidoException("O preco nao pode ser negativo.");
            }
            if (quantidade < 0) {
                throw new ProdutoInvalidoException("A quantidade nao pode ser negativa.");
            }

            // 4. Persiste no ArrayList e atualiza a tabela
            Produto novo = new Produto(nome, categoria, preco, quantidade);
            produtos.add(novo);
            atualizarTabela();
            limparCampos();

            JOptionPane.showMessageDialog(this,
                    "Produto cadastrado com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (ProdutoInvalidoException ex) {
            // Erros de validacao - mensagem amigavel
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Dados invalidos",
                    JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            // Rede de seguranca para qualquer erro inesperado
            JOptionPane.showMessageDialog(this,
                    "Ocorreu um erro inesperado: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // =================================================================
    // ACAO: LIMPAR CAMPOS
    // =================================================================
    private void limparCampos() {
        txtNome.setText("");
        txtCategoria.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        tabelaProdutos.clearSelection();
        txtNome.requestFocus();
    }

    // =================================================================
    // ACAO: EXCLUIR PRODUTO SELECIONADO
    // =================================================================
    private void excluirProduto() {
        int linha = tabelaProdutos.getSelectedRow();

        if (linha < 0) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um produto na tabela para excluir.",
                    "Nenhum produto selecionado",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // showConfirmDialog (slide do JOptionPane) - solicita confirmacao Sim/Nao
        int resposta = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este produto?",
                "Confirmar exclusao",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {
            try {
                produtos.remove(linha); // .remove(indice) - ArrayList
                atualizarTabela();
                limparCampos();
                JOptionPane.showMessageDialog(this,
                        "Produto excluido com sucesso!",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (IndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(this,
                        "Nao foi possivel localizar o produto na lista.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // =================================================================
    // ATUALIZACAO DA TABELA (percorrendo o ArrayList com for-each)
    // =================================================================
    private void atualizarTabela() {
        modeloTabela.setRowCount(0); // limpa a tabela antes de redesenhar

        // for-each (slide "Iteracao em Collections" - sintaxe limpa e segura)
        for (Produto p : produtos) {
            modeloTabela.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getCategoria(),
                    FORMATO_MOEDA.format(p.getPreco()),
                    p.getQuantidade()
            });
        }
        lblTotal.setText("Total: " + produtos.size() + " produto(s)");
    }

    // =================================================================
    // METODO MAIN - ponto de entrada da aplicacao
    // =================================================================
    public static void main(String[] args) {
        // Aplica o Look and Feel "Nimbus" para uma aparencia mais moderna
        // (cai no padrao caso nao esteja disponivel).
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) {
            // mantem o LookAndFeel padrao em caso de erro
        }

        // Boa pratica Swing: criar a janela na Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            SistemaCadastroProdutos tela = new SistemaCadastroProdutos();
            tela.setVisible(true);
        });
    }
}
