package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import control.ControlLogin;
import model.ModelLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class telaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;
	
	ModelLogin modelLogin = new ModelLogin();
	ControlLogin controlLogin = new ControlLogin();

	/**
	 * Create the frame.
	 */
	public telaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 276);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(300, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(60, 12, 70, 15);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(60, 55, 70, 15);
		contentPane.add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(60, 39, 86, 15);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(60, 73, 86, 15);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String login;
				String senha;
				boolean autenticacao;
				
				login = txtLogin.getText();
				senha = txtSenha.getText();
				
				modelLogin.setLogin(login);
				modelLogin.setSenha(senha);
				autenticacao = controlLogin.validLogin(modelLogin);
				
				if(autenticacao == false) {
					viewSistema logou = new viewSistema();
					dispose();
					logou.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Erro: Usuário e/ou senha inválidos!");
				}
			}
		});
		btnEntrar.setBounds(60, 100, 86, 25);
		contentPane.add(btnEntrar);
		
		JLabel lblEsqueciSenha = new JLabel("Esqueci minha senha!");
		lblEsqueciSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RecuperaSenha recSenha = new RecuperaSenha();
				dispose();
				recSenha.setVisible(true);
				recSenha.recuperaLogin(txtLogin.getText());
			}
		});
		lblEsqueciSenha.setBounds(60, 203, 162, 15);
		contentPane.add(lblEsqueciSenha);
	}
}
