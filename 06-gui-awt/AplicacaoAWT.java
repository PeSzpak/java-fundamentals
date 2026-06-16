package SegundaAula;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
 
public class AplicacaoAWT {
 
    public static void main(String[] args) {
 
        Frame frame = new Frame("Aplicação Completa AWT");

         frame.setSize(400, 300);

         frame.setLayout(new FlowLayout());
 
        Label label = new Label("Digite seu nome:");

         TextField textField = new TextField(20);

         TextArea textArea = new TextArea(5, 30);

         Button saveButton = new Button("Salvar");

         Button loadButton = new Button("Carregar");
 
        saveButton.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent e) {

                 try (FileWriter writer = new FileWriter("dados.txt")) {

                     writer.write(textField.getText());

                     textArea.setText("Nome salvo com sucesso!");

                 } catch (IOException ex) {

                     textArea.setText("Erro ao salvar o arquivo.");

                 }

             }

         });
 
        loadButton.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent e) {

                 try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {

                     String linha = reader.readLine();

                     textArea.setText("Nome carregado: " + linha);

                 } catch (IOException ex) {

                     textArea.setText("Erro ao carregar o arquivo.");

                 }

             }

         });
 
        frame.add(label);

         frame.add(textField);

         frame.add(saveButton);

         frame.add(loadButton);

         frame.add(textArea);
 
        frame.setVisible(true);
 
        frame.addWindowListener(new WindowAdapter() {

             public void windowClosing(WindowEvent e) {

                 frame.dispose();

             }

         });
 
    }

 }