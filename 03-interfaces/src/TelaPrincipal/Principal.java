package TelaPrincipal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Calc.Calculadora;
import Imc_calculator.IMCCalculator;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Calculadora calc;
	private IMCCalculator imc;


	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Minhas Calculadoras");
		lblNewLabel.setBounds(151, 6, 136, 16);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(54, 53, 338, 176);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Calculadora");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calc == null || !calc.isDisplayable()) {
					calc = new Calculadora();
				}
				
				calc.setVisible(true);
				calc.toFront();
			}
		});
		btnNewButton.setBounds(19, 108, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("IMC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (imc == null || !imc.isDisplayable()) {
					imc = new IMCCalculator();
				}
				
				imc.setVisible(true);
				imc.toFront();
			}
		});
		btnNewButton_1.setBounds(202, 108, 117, 29);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(140, 6, 61, 16);
		panel.add(lblNewLabel_1);

	}
}
