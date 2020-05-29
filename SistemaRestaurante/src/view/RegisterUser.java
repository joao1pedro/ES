package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import control.ControlRegister;
import model.ModelRegister;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class RegisterUser extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtPergunta;
	private JTextField txtResposta;
	
	ModelRegister modelRegister = new ModelRegister();
	ControlRegister controlRegister = new ControlRegister();

	/**
	 * Create the frame.
	 */
	public RegisterUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 788, 567);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistroDeFuncionrio = new JLabel("Registro de funcionário");
		lblRegistroDeFuncionrio.setBounds(372, 12, 173, 15);
		panel.add(lblRegistroDeFuncionrio);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(29, 54, 70, 15);
		panel.add(lblNome);
		
		JLabel lblUser = new JLabel("Nome de usuário");
		lblUser.setBounds(29, 94, 129, 15);
		panel.add(lblUser);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(29, 132, 70, 15);
		panel.add(lblSenha);
		
		JLabel lblPerguntaSecreta = new JLabel("Pergunta secreta");
		lblPerguntaSecreta.setBounds(29, 171, 129, 15);
		panel.add(lblPerguntaSecreta);
		
		JLabel lblRespostaSecreta = new JLabel("Resposta secreta");
		lblRespostaSecreta.setBounds(29, 203, 129, 15);
		panel.add(lblRespostaSecreta);
		
		txtNome = new JTextField();
		txtNome.setBounds(29, 74, 242, 15);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(29, 116, 242, 15);
		panel.add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(29, 154, 242, 15);
		panel.add(txtPassword);
		
		txtPergunta = new JTextField();
		txtPergunta.setColumns(10);
		txtPergunta.setBounds(29, 187, 242, 15);
		panel.add(txtPergunta);
		
		txtResposta = new JTextField();
		txtResposta.setColumns(10);
		txtResposta.setBounds(29, 225, 242, 15);
		panel.add(txtResposta);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome;
				String username;
				String password;
				String pergunta;
				String resposta;
				boolean cadastra;
				
				nome = txtNome.getText();
				username = txtUsername.getText();
				password = txtPassword.getText();
				pergunta = txtPergunta.getText();
				resposta = txtResposta.getText();
				
				modelRegister.setNome(nome);
				modelRegister.setUsername(username);
				modelRegister.setPassword(password);
				modelRegister.setPergunta(pergunta);
				modelRegister.setResposta(resposta);
				
				cadastra = controlRegister.validaRegistro(modelRegister);
				
				if(cadastra == true) {
					JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null, "Falha ao adicionar novo usuários!");
				}
			}
		});
		btnCadastrar.setBounds(27, 252, 117, 25);
		panel.add(btnCadastrar);
	}
}
