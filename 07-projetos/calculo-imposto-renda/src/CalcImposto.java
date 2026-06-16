package ImpostoRenda;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcImposto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfHorasTrab;
	private JTextField tfValorHora;
	private JLabel lblResNome;
	private JLabel lblResBruto;
	private JLabel lblResImposto;
	private JLabel lblResLiquido;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcImposto frame = new CalcImposto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalcImposto() {
		setTitle("Calculadora de Imposto de Renda - 2026");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 440);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Cálculo de Imposto de Renda");
		lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 5, 490, 30);
		contentPane.add(lblTitulo);

		JPanel panelEntrada = new JPanel();
		panelEntrada.setBorder(new TitledBorder("Dados do Funcionário"));
		panelEntrada.setBounds(10, 45, 490, 110);
		panelEntrada.setLayout(null);
		contentPane.add(panelEntrada);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(10, 25, 150, 16);
		panelEntrada.add(lblNome);

		tfNome = new JTextField();
		tfNome.setBounds(10, 45, 150, 28);
		tfNome.setColumns(10);
		panelEntrada.add(tfNome);

		JLabel lblHorasTrabalhadas = new JLabel("Horas trabalhadas");
		lblHorasTrabalhadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorasTrabalhadas.setBounds(170, 25, 150, 16);
		panelEntrada.add(lblHorasTrabalhadas);

		tfHorasTrab = new JTextField();
		tfHorasTrab.setBounds(170, 45, 150, 28);
		tfHorasTrab.setColumns(10);
		panelEntrada.add(tfHorasTrab);

		JLabel lblValorHora = new JLabel("Valor da hora");
		lblValorHora.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorHora.setBounds(330, 25, 150, 16);
		panelEntrada.add(lblValorHora);

		tfValorHora = new JTextField();
		tfValorHora.setBounds(330, 45, 150, 28);
		tfValorHora.setColumns(10);
		panelEntrada.add(tfValorHora);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nome = tfNome.getText().trim();

					if (nome.isEmpty()) {
						throw new IllegalArgumentException("Informe o nome do funcionário.");
					}

					double horasTrab = Double.parseDouble(tfHorasTrab.getText().replace(",", "."));
					double valorHora = Double.parseDouble(tfValorHora.getText().replace(",", "."));

					if (horasTrab < 0 || valorHora < 0) {
						throw new IllegalArgumentException("Valores não podem ser negativos.");
					}

					double salarioBt = horasTrab * valorHora;
					double imposto = calcularImposto(salarioBt);
					double salarioLq = salarioBt - imposto;

					lblResNome.setForeground(Color.BLACK);
					lblResNome.setText(nome);
					lblResBruto.setText(String.format("R$ %.2f", salarioBt));
					lblResImposto.setText(String.format("R$ %.2f", imposto));
					lblResLiquido.setText(String.format("R$ %.2f", salarioLq));

				} catch (NumberFormatException ex) {
					lblResNome.setForeground(new Color(178, 34, 34));
					lblResNome.setText("Erro: digite valores numéricos válidos");
					lblResBruto.setText("R$ 0,00");
					lblResImposto.setText("R$ 0,00");
					lblResLiquido.setText("R$ 0,00");

				} catch (IllegalArgumentException ex) {
					lblResNome.setForeground(new Color(178, 34, 34));
					lblResNome.setText("Erro: " + ex.getMessage());
					lblResBruto.setText("R$ 0,00");
					lblResImposto.setText("R$ 0,00");
					lblResLiquido.setText("R$ 0,00");

				} catch (Exception ex) {
					lblResNome.setForeground(new Color(178, 34, 34));
					lblResNome.setText("Erro inesperado ao calcular.");
					lblResBruto.setText("R$ 0,00");
					lblResImposto.setText("R$ 0,00");
					lblResLiquido.setText("R$ 0,00");
				}
			}

			private double calcularImposto(double salarioBruto) {
				double aliquota;
				double parcelaDeduzir;

				if (salarioBruto <= 2428.80) {
					aliquota = 0.0;
					parcelaDeduzir = 0.0;
				} else if (salarioBruto <= 2826.65) {
					aliquota = 0.075;
					parcelaDeduzir = 182.16;
				} else if (salarioBruto <= 3751.05) {
					aliquota = 0.15;
					parcelaDeduzir = 394.16;
				} else if (salarioBruto <= 4664.68) {
					aliquota = 0.225;
					parcelaDeduzir = 675.49;
				} else {
					aliquota = 0.275;
					parcelaDeduzir = 908.73;
				}

				double imposto = (salarioBruto * aliquota) - parcelaDeduzir;
				if (imposto < 0) {
					imposto = 0;
				}

				if (salarioBruto <= 5000.00) {
					return 0.0;
				} else if (salarioBruto <= 7350.00) {
					double redutor = 978.62 - (0.133145 * salarioBruto);
					if (redutor < 0) {
						redutor = 0;
					}
					imposto = imposto - redutor;
					if (imposto < 0) {
						imposto = 0;
					}
				}

				return imposto;
			}
		});
		btnCalcular.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnCalcular.setBounds(180, 165, 150, 32);
		contentPane.add(btnCalcular);

		JPanel panelResultado = new JPanel();
		panelResultado.setBorder(new TitledBorder("Resultado"));
		panelResultado.setBounds(10, 210, 490, 180);
		panelResultado.setLayout(null);
		contentPane.add(panelResultado);

		JLabel lblNomeFixo = new JLabel("Nome:");
		lblNomeFixo.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNomeFixo.setBounds(15, 30, 200, 20);
		panelResultado.add(lblNomeFixo);

		lblResNome = new JLabel("-");
		lblResNome.setBounds(220, 30, 250, 20);
		panelResultado.add(lblResNome);

		JLabel lblBrutoFixo = new JLabel("Salário Bruto:");
		lblBrutoFixo.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblBrutoFixo.setBounds(15, 60, 200, 20);
		panelResultado.add(lblBrutoFixo);

		lblResBruto = new JLabel("R$ 0,00");
		lblResBruto.setBounds(220, 60, 250, 20);
		panelResultado.add(lblResBruto);

		JLabel lblImpostoFixo = new JLabel("Imposto de Renda (2026):");
		lblImpostoFixo.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblImpostoFixo.setBounds(15, 90, 200, 20);
		panelResultado.add(lblImpostoFixo);

		lblResImposto = new JLabel("R$ 0,00");
		lblResImposto.setForeground(new Color(178, 34, 34));
		lblResImposto.setBounds(220, 90, 250, 20);
		panelResultado.add(lblResImposto);

		JLabel lblLiquidoFixo = new JLabel("Salário Líquido:");
		lblLiquidoFixo.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblLiquidoFixo.setBounds(15, 130, 200, 20);
		panelResultado.add(lblLiquidoFixo);

		lblResLiquido = new JLabel("R$ 0,00");
		lblResLiquido.setForeground(new Color(0, 100, 0));
		lblResLiquido.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblResLiquido.setBounds(220, 130, 250, 20);
		panelResultado.add(lblResLiquido);

	}
}