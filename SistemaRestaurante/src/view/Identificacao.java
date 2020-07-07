package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.ControlLogin;
import model.ModelLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Identificacao extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtSenha;
	
	ModelLogin modelLogin = new ModelLogin();
	ControlLogin controlLogin = new ControlLogin();

	
	public Identificacao() {
		setTitle("Identificação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUser = new JLabel("Usuário:");
		lblUser.setBounds(28, 12, 70, 15);
		panel.add(lblUser);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(28, 66, 70, 15);
		panel.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(28, 81, 114, 19);
		panel.add(txtSenha);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String senha;
				boolean autenticacao;
				
				senha = new String(txtSenha.getPassword());
				
				modelLogin.setLogin(TelaLogin.login);
				modelLogin.setSenha(senha);
				autenticacao = controlLogin.validLogin(modelLogin);
				
				if(autenticacao == true) {
					AlterarSenha frame = new AlterarSenha();
					dispose();
					frame.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Erro: Usuário e/ou senha inválidos!");
				}
			}
		});
		btnConfirmar.setBounds(28, 143, 103, 25);
		panel.add(btnConfirmar);
		
		JLabel lblNome = new JLabel(TelaLogin.login);
		lblNome.setBounds(28, 39, 70, 15);
		panel.add(lblNome);
	}
}
