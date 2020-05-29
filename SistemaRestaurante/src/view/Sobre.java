package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;

@SuppressWarnings("serial")
public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Sobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 540, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSobre = new JLabel("Sobre:");
		lblSobre.setBounds(233, 37, 70, 15);
		panel.add(lblSobre);
		
		JTextPane txtpnSoftwareDesenvolvidoPara = new JTextPane();
		txtpnSoftwareDesenvolvidoPara.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtpnSoftwareDesenvolvidoPara.setText("Software desenvolvido para a disicplina de Engenharia de Software.\n\nDesenvolvedores: João Pedro, Samuel Italo\n\nUniversidade Federal do Ceará, Campus Quixadá");
		txtpnSoftwareDesenvolvidoPara.setEditable(false);
		txtpnSoftwareDesenvolvidoPara.setBounds(53, 87, 456, 163);
		panel.add(txtpnSoftwareDesenvolvidoPara);
	}
}
