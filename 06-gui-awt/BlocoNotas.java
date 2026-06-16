package SegundaAula;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BlocoNotas extends Frame implements ActionListener {
    TextArea textArea;
    Button salvarBtn;

    public BlocoNotas() {
        setTitle("Bloco de Notas");
        setSize(500, 400);
        setLayout(new BorderLayout());

        textArea = new TextArea();
        salvarBtn = new Button("Salvar");

        add(textArea, BorderLayout.CENTER);
        add(salvarBtn, BorderLayout.SOUTH);

        salvarBtn.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            FileWriter fw = new FileWriter("bloco.txt");
            fw.write(textArea.getText());
            fw.close();
            Dialog d = new Dialog(this, "Sucesso", true);
            d.setLayout(new FlowLayout());
            d.setSize(250, 100);
            d.add(new Label("Arquivo salvo com sucesso!"));
            Button ok = new Button("OK");
            ok.addActionListener(ev -> d.dispose());
            d.add(ok);
            d.setVisible(true);
        } catch (IOException ex) {
            Dialog d = new Dialog(this, "Erro", true);
            d.setLayout(new FlowLayout());
            d.setSize(250, 100);
            d.add(new Label("Erro ao salvar o arquivo."));
            Button ok = new Button("OK");
            ok.addActionListener(ev -> d.dispose());
            d.add(ok);
            d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new BlocoNotas();
    }
}
