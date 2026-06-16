package SegundaAula;
import java.awt.*;
import java.awt.event.*;

public class ListaTarefasSimples extends Frame implements ActionListener {

    private TextField campoTarefa;
    private TextField campoCategoria;
    private Button botaoAdicionar;
    private TextArea areaResultado;
    private Label labelAluno;
    private static final String NOME_ALUNO = "Pedro Szpak";

    public ListaTarefasSimples() {
        criarInterface();
    }

    private void criarInterface() {
        setTitle("Lista de Tarefas Simples");
        setSize(500, 450);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setResizable(false);

        Label labelTarefa = new Label("Nome da Tarefa:");
        campoTarefa = new TextField(40);

        Label labelCategoria = new Label("Categoria:         ");
        campoCategoria = new TextField(40);

        botaoAdicionar = new Button("Adicionar Tarefa");
        botaoAdicionar.addActionListener(this);

        areaResultado = new TextArea("", 10, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        areaResultado.setEditable(false);

        labelAluno = new Label("Aluno: " + NOME_ALUNO);
        labelAluno.setFont(new Font("SansSerif", Font.BOLD, 14));

        add(labelTarefa);
        add(campoTarefa);
        add(labelCategoria);
        add(campoCategoria);
        add(botaoAdicionar);
        add(areaResultado);
        add(labelAluno);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String lerTarefa() {
        return campoTarefa.getText().trim();
    }

    private String lerCategoria() {
        return campoCategoria.getText().trim();
    }

    private String gerarMensagem(String tarefa, String categoria) {
        return "Tarefa cadastrada com sucesso!\n"
             + "Tarefa: " + tarefa + "\n"
             + "Categoria: " + categoria + "\n"
             + "Aluno: " + NOME_ALUNO + "\n"
             + "----------------------------\n";
    }

    private void mostrarResultado(String mensagem) {
        areaResultado.append(mensagem);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tarefa = lerTarefa();
        String categoria = lerCategoria();

        if (tarefa.isEmpty() || categoria.isEmpty()) {
            areaResultado.setText("Preencha todos os campos.\n");
            return;
        }

        String mensagem = gerarMensagem(tarefa, categoria);
        mostrarResultado(mensagem);

        campoTarefa.setText("");
        campoCategoria.setText("");
        campoTarefa.requestFocus();
    }

    public static void main(String[] args) {
        new ListaTarefasSimples();
    }
}