package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.ControlRecuperaSenha;
import model.ModelRecuperaSenha;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class RecuperaSenha extends JFrame {

	private JPanel contentPane;
	private JTextField txtRespostaSec;
	String username;
	ModelRecuperaSenha modRestore = new ModelRecuperaSenha();
	ControlRecuperaSenha ctrl = new ControlRecuperaSenha();
	
	JLabel lblPergunta = new JLabel("");

	/**
	 * Create the frame.
	 */
	public RecuperaSenha() {
		setTitle("Recuperação de senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 0, 650, 377);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRecuperarSenha = new JLabel("Recuperar Senha");
		lblRecuperarSenha.setFont(new Font("Dialog", Font.BOLD, 15));
		lblRecuperarSenha.setBounds(256, 12, 152, 18);
		panel.add(lblRecuperarSenha);
		
		JLabel lblRespondaAPergunta = new JLabel("Responda a pergunta secreta");
		lblRespondaAPergunta.setBounds(45, 74, 224, 18);
		panel.add(lblRespondaAPergunta);
		
		txtRespostaSec = new JTextField();
		txtRespostaSec.setBounds(45, 134, 224, 18);
		panel.add(txtRespostaSec);
		txtRespostaSec.setColumns(10);
		
		JButton btnResponder = new JButton("Responder");
		btnResponder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String senha;
				modRestore.setResposta(txtRespostaSec.getSelectedText());
				senha = ctrl.validResposta(modRestore);
				JOptionPane.showMessageDialog(null, "Sua senha é " + senha);
				dispose();
			}
		});
		btnResponder.setBounds(45, 164, 119, 25);
		panel.add(btnResponder);
		
		lblPergunta.setBounds(45, 107, 224, 18);
		panel.add(lblPergunta);
	}

	public void recuperaLogin(String username) {
		modRestore.setUsuario(username);
		String pergunta = ctrl.returnPergunta(modRestore);
		lblPergunta.setText(pergunta);
	}
}
