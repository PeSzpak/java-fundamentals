package Imc_calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class IMCCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfAltura;
	private JTextField tfPeso;
	private JTextField tfResultado;


	/**
	 * Create the frame.
	 */
	public IMCCalculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/pedroszpak/Downloads/macacozen.png"));
		setFont(new Font("AppleGothic", Font.PLAIN, 14));
		setTitle("Calculadora IMC do K4tchuga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(26, 0, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Altura");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("AppleGothic", Font.PLAIN, 24));
		lblNewLabel.setBounds(6, 6, 64, 30);
		contentPane.add(lblNewLabel);

		tfAltura = new JTextField();
		tfAltura.setBounds(82, 6, 130, 26);
		contentPane.add(tfAltura);
		tfAltura.setColumns(10);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.YELLOW);
		lblPeso.setFont(new Font("AppleGothic", Font.PLAIN, 24));
		lblPeso.setBounds(6, 62, 64, 30);
		contentPane.add(lblPeso);

		tfPeso = new JTextField();
		tfPeso.setColumns(10);
		tfPeso.setBounds(82, 62, 130, 26);
		contentPane.add(tfPeso);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(Color.YELLOW);
		lblResultado.setFont(new Font("AppleGothic", Font.PLAIN, 24));
		lblResultado.setBounds(252, 260, 106, 30);
		contentPane.add(lblResultado);

		tfResultado = new JTextField();
		tfResultado.setForeground(new Color(233, 56, 36));
		tfResultado.setHorizontalAlignment(SwingConstants.CENTER);
		tfResultado.setEditable(false);
		tfResultado.setFont(new Font("October Compressed Devanagari", Font.BOLD | Font.ITALIC, 50));
		tfResultado.setEnabled(false);
		tfResultado.setBounds(6, 302, 615, 216);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setForeground(new Color(138, 78, 149));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Calcular IMC
			
				try {
					double altura = Double.parseDouble(tfAltura.getText().replace(",", "."));
					double peso = Double.parseDouble(tfPeso.getText().replace(",", "."));
					
					double imc = peso / (altura * altura);

					String resultado;

					
					if (imc < 18.5) {
						resultado = "Baixo peso";
					} else if (imc >= 18.5 && imc < 24.9) {
						resultado = "Peso normal";
					} else if (imc >= 25 && imc <= 29.9) {
						resultado = "Sobrepeso";
					} else if (imc >= 30 && imc <= 34.9) {
						resultado = "Obesidade Grau I";
					} else if (imc >= 35 && imc <= 39.9) {
						resultado = "Obesidade Grau II";
					} else
						resultado = "Obesidade Grau III";
					
					tfResultado.setText(resultado);

				
					
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Campos Vazios seu palerma, FAVOR PREENCHER");

				}
				
				
				
			}
				
		});
		btnCalcular.setBackground(new Color(231, 0, 9));
		btnCalcular.setBounds(82, 188, 117, 29);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(new Color(138, 78, 149));
		btnLimpar.setBackground(new Color(211, 35, 24));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// limpar os campos
				tfAltura.setText("");
				tfPeso.setText("");
				tfResultado.setText("");
			}
		});
		btnLimpar.setBounds(428, 188, 117, 29);
		contentPane.add(btnLimpar);

	}
}
