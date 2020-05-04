package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class viewSistema extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewSistema frame = new viewSistema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public viewSistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 471);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(800, 600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(517, 84, 235, 341);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setBounds(12, 12, 70, 15);
		panel.add(lblBebidas);
		
		JCheckBox chckbxgua = new JCheckBox("Água");
		chckbxgua.setBounds(8, 35, 129, 23);
		panel.add(chckbxgua);
		
		JCheckBox chckbxCaf = new JCheckBox("Café");
		chckbxCaf.setBounds(8, 62, 129, 23);
		panel.add(chckbxCaf);
		
		JCheckBox chckbxcervej = new JCheckBox("Cerveja");
		chckbxcervej.setBounds(8, 89, 129, 23);
		panel.add(chckbxcervej);
		
		JCheckBox chckbxcoca = new JCheckBox("Coca-Cola");
		chckbxcoca.setBounds(8, 116, 129, 23);
		panel.add(chckbxcoca);
		
		JCheckBox chckbxsularanja = new JCheckBox("Laranja");
		chckbxsularanja.setBounds(12, 219, 107, 23);
		panel.add(chckbxsularanja);
		
		JCheckBox chckbxsumaracuja = new JCheckBox("Maracujá");
		chckbxsumaracuja.setBounds(12, 246, 107, 23);
		panel.add(chckbxsumaracuja);
		
		JCheckBox chckbxguacc = new JCheckBox("Água de Côco");
		chckbxguacc.setBounds(8, 143, 129, 23);
		panel.add(chckbxguacc);
		
		JLabel lblSucos = new JLabel("Sucos");
		lblSucos.setBounds(12, 196, 70, 15);
		panel.add(lblSucos);
		
		textField = new JTextField();
		textField.setBounds(143, 39, 80, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 64, 80, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 91, 80, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 118, 80, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 143, 80, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 221, 80, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(143, 248, 80, 19);
		panel.add(textField_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(12, 0, 740, 72);
		contentPane.add(panel_1);
		
		JLabel lbTelaInfo = new JLabel("SISTEMA RESTAURANTE");
		lbTelaInfo.setBounds(282, 24, 200, 24);
		panel_1.add(lbTelaInfo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(12, 84, 235, 341);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(259, 263, 246, 162);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPagamento = new JLabel("PAGAMENTO");
		lblPagamento.setBounds(12, 12, 91, 15);
		panel_3.add(lblPagamento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 39, 91, 24);
		panel_3.add(comboBox);
	}
}
