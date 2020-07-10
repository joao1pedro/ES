package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.ControlRecuperaSenha;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class RecuperaSenha extends JFrame {

	private JPanel contentPane;
	private JTextField txtRespostaSec;
	
	JLabel lblPergunta = new JLabel("");
	
	ControlRecuperaSenha ctrl = new ControlRecuperaSenha();
	private JTextField txtUser;

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
		lblRecuperarSenha.setBounds(243, 12, 152, 18);
		panel.add(lblRecuperarSenha);
		
		JLabel lblRespondaAPergunta = new JLabel("Responda a pergunta secreta");
		lblRespondaAPergunta.setBounds(45, 202, 224, 18);
		panel.add(lblRespondaAPergunta);
		
		txtRespostaSec = new JTextField();
		txtRespostaSec.setBounds(45, 252, 224, 18);
		panel.add(txtRespostaSec);
		txtRespostaSec.setColumns(10);
		
		JButton btnResponder = new JButton("Responder");
		btnResponder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String senha;
				
				senha = ctrl.validResposta(txtUser.getText(), txtRespostaSec.getText());
				if(senha != null) {
					
					JOptionPane.showMessageDialog(null, "Sua senha é : " + senha);
					dispose();
					
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
					}else
						JOptionPane.showMessageDialog(null, "Resposta secreta inválida!");
			}
		});
		btnResponder.setBounds(45, 282, 111, 25);
		panel.add(btnResponder);
		
		lblPergunta.setBounds(45, 222, 224, 18);
		panel.add(lblPergunta);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RecuperaSenha.class.getResource("/Apps-preferences-desktop-user-password-icon.png")));
		label.setBounds(330, 0, 233, 273);
		panel.add(label);
		
		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setBounds(45, 94, 70, 15);
		panel.add(lblUsurio);
		
		txtUser = new JTextField();
		txtUser.setEditable(false);
		txtUser.setColumns(10);
		txtUser.setBounds(45, 113, 224, 18);
		panel.add(txtUser);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				TelaLogin frame = new TelaLogin();
				frame.setVisible(true);
			}
		});
		btnCancelar.setBounds(166, 282, 96, 25);
		panel.add(btnCancelar);
	}

	public void recuperaLogin(String username) {
		
		String pergunta = ctrl.returnPergunta(username);
		if(pergunta!=null) {
			lblPergunta.setText(pergunta);
			txtUser.setText(username);
		}
		else {
			dispose();
			JOptionPane.showMessageDialog(null, "Usuário inválido!");
			TelaLogin frame = new TelaLogin();
			frame.setVisible(true); //retorna para a tela de login
		}
	}
}
