package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfDisplay;
	int num1, num2;
	String operador;


	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(17, 6, 7));
		panel.setBounds(0, 0, 250, 322);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfDisplay = new JTextField();
		tfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		tfDisplay.setBounds(6, 0, 238, 65);
		panel.add(tfDisplay);
		tfDisplay.setColumns(10);
		
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.setBounds(6, 77, 44, 40);
		panel.add(btnBackSpace);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText("");
			}
		});
		btnAc.setBounds(62, 77, 44, 40);
		panel.add(btnAc);
		
		JButton btnPorcent = new JButton("%");
		btnPorcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPorcent.setBounds(127, 78, 44, 40);
		panel.add(btnPorcent);
		
		JButton btnSplit = new JButton("/");
		btnSplit.setBackground(new Color(255, 146, 0));
		btnSplit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(tfDisplay.getText());
				operador = "/";
				tfDisplay.setText("");
			}
		});
		btnSplit.setBounds(192, 77, 44, 40);
		panel.add(btnSplit);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"7");

			}
		});
		btn7.setBounds(6, 129, 44, 40);
		panel.add(btn7);
		
		JButton bnt8 = new JButton("8");
		bnt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"8");

			}
		});
		bnt8.setBounds(62, 129, 44, 40);
		panel.add(bnt8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"9");

			}
		});
		btn9.setBounds(127, 130, 44, 40);
		panel.add(btn9);
		
		JButton btnTimes = new JButton("X");
		btnTimes.setBackground(new Color(255, 146, 0));
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(tfDisplay.getText());
				operador = "*";
				tfDisplay.setText("");
			}
		});
		btnTimes.setBounds(192, 129, 44, 40);
		panel.add(btnTimes);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"4");

			}
		});
		btn4.setBounds(6, 181, 44, 40);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"5");

			}
		});
		btn5.setBounds(62, 181, 44, 40);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"6");

			}
		});
		btn6.setBounds(127, 182, 44, 40);
		panel.add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(new Color(255, 146, 0));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(tfDisplay.getText());
				operador = "-";
				tfDisplay.setText("");
			}
		});
		btnMinus.setBounds(192, 181, 44, 40);
		panel.add(btnMinus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"1");

			}
		});
		btn1.setBounds(6, 233, 44, 40);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"2");

			}
		});
		btn2.setBounds(62, 233, 44, 40);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"3");

			}
		});
		btn3.setBounds(127, 234, 44, 40);
		panel.add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(255, 146, 0));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(tfDisplay.getText());
				operador = "+";
				tfDisplay.setText("");
			}
		});
		btnPlus.setBounds(192, 233, 44, 40);
		panel.add(btnPlus);
		
		JButton btnNewButton_7 = new JButton("+/-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(6, 275, 44, 40);
		panel.add(btnNewButton_7);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(tfDisplay.getText()+"0");			}
		});
		btn0.setBounds(62, 275, 44, 40);
		panel.add(btn0);
		
		JButton btnVirgle = new JButton(",");
		btnVirgle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVirgle.setBounds(127, 276, 44, 40);
		panel.add(btnVirgle);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Integer.parseInt(tfDisplay.getText());
				switch (operador) {
				case "+":
					tfDisplay.setText(Integer.toString(num1+num2));
					break;
				case "-":
					tfDisplay.setText(Integer.toString(num1-num2));
					break;
				case "*":
					tfDisplay.setText(Integer.toString(num1*num2));
					break;
				case "/":
					tfDisplay.setText(Integer.toString(num1/num2));
					break;
					default:
						tfDisplay.setText("ERROR");
				}
			}
		});
		btnEquals.setBackground(new Color(255, 146, 0));
		btnEquals.setBounds(192, 275, 44, 40);
		panel.add(btnEquals);

	}
}
