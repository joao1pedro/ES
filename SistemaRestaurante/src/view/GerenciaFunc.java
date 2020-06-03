package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;


import control.ControlGerenciaFunc;
import model.ModelGerenciaFunc;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connection.ConnectionFactory;

@SuppressWarnings("serial")
public class GerenciaFunc extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtPergunta;
	private JTextField txtResposta;
	
	ModelGerenciaFunc model = new ModelGerenciaFunc();
	ControlGerenciaFunc control = new ControlGerenciaFunc();
	private JTextField txtRmUser;
	private JTable tableDados;
	
	private boolean swt;

	/**
	 * Create the frame.
	 */
	public GerenciaFunc() {
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
		
		JLabel lblGerenciaFunc = new JLabel("Gerência de funcionários");
		lblGerenciaFunc.setBounds(372, 12, 185, 15);
		panel.add(lblGerenciaFunc);
		
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
		txtNome.setBounds(29, 74, 287, 15);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(29, 116, 287, 15);
		panel.add(txtUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(29, 154, 287, 15);
		panel.add(txtPassword);
		
		txtPergunta = new JTextField();
		txtPergunta.setColumns(10);
		txtPergunta.setBounds(29, 187, 287, 15);
		panel.add(txtPergunta);
		
		txtResposta = new JTextField();
		txtResposta.setColumns(10);
		txtResposta.setBounds(29, 225, 287, 15);
		panel.add(txtResposta);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				swt = true;
			}
		});
		btnCadastrar.setBounds(29, 252, 105, 25);
		panel.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNome.setText(null);
				txtUsername.setText(null);
				//new String (txtPassword.getPassword());
				txtPergunta.setText(null);
				txtResposta.setText(null);
			}
		});
		btnLimpar.setBounds(234, 252, 82, 25);
		panel.add(btnLimpar);
		
		JLabel lblRemoverUsurio = new JLabel("Remover usuário:");
		lblRemoverUsurio.setBounds(29, 377, 131, 15);
		panel.add(lblRemoverUsurio);
		
		txtRmUser = new JTextField();
		txtRmUser.setBounds(31, 404, 287, 19);
		panel.add(txtRmUser);
		txtRmUser.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username;
				boolean validaRemove;
				boolean verifica;
				
				username = txtRmUser.getText();
				model.setUsername(username);
				
				verifica = control.verificaUsuario(model);
				
				if(verifica == true) {
					validaRemove = control.removeFunc(model);
					model.getNome();
					if(validaRemove == true) {
						JOptionPane.showMessageDialog(null, "Usuário " + username + " removido com sucesso!");
					} else {
						JOptionPane.showMessageDialog(null, "Falha ao remover usuário!");
					}
				}	
			}
		});
		btnRemover.setBounds(31, 435, 117, 25);
		panel.add(btnRemover);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(372, 66, 390, 357);
		panel.add(scrollPane);
		
		tableDados = new JTable();
		tableDados.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"id", "nome", "username", "permissao"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tableDados);
		
		JButton btnListarDados = new JButton("Listar Dados");
		btnListarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection con = new ConnectionFactory().getConnection();
				ResultSet rs = null;
				PreparedStatement stmt = null;
			    String sql = "select * from usuarios;";
			    try{
			        stmt = con.prepareStatement(sql);
			        rs = stmt.executeQuery();
				        
			        DefaultTableModel modelo = (DefaultTableModel) tableDados.getModel();
			        modelo.setNumRows(0);
			        
			        while(rs.next()) {
			        	modelo.addRow(new Object[] {
			        			rs.getInt("id_login"),
			        			rs.getString("nome_login"),
			        			rs.getString("nickname"),
			        			rs.getInt("nivelpermissao")
			        	});
			        }
			    } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					ConnectionFactory.closeConnection(con, stmt, rs);
				}
			}
		});
		btnListarDados.setBounds(372, 435, 147, 25);
		panel.add(btnListarDados);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				swt = false;
			}
		});
		btnEditar.setBounds(146, 252, 76, 25);
		panel.add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome;
				String username;
				String password;
				String pergunta;
				String resposta;
				boolean cadastra;
				boolean validaUpdate;
				boolean verifica;
				
				/*modo de cadastro*/
				if(swt == true) {
					nome = txtNome.getText();
					username = txtUsername.getText();
					password = new String (txtPassword.getPassword());
					pergunta = txtPergunta.getText();
					resposta = txtResposta.getText();
					
					model.setNome(nome);
					model.setUsername(username);
					model.setPassword(password);
					model.setPergunta(pergunta);
					model.setResposta(resposta);
					
					cadastra = control.validaRegistro(model);
					
					if(cadastra == true) {
						JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso!");
					}else {
						JOptionPane.showMessageDialog(null, "Falha ao adicionar novo usuário!");
					}
				}else {
					/*
					 * modo editar**/
					nome = txtNome.getText();
					username = txtUsername.getText();
					password = new String (txtPassword.getPassword());
					pergunta = txtPergunta.getText();
					resposta = txtResposta.getText();
					
					model.setNome(nome);
					model.setUsername(username);
					model.setPassword(password);
					model.setPergunta(pergunta);
					model.setResposta(resposta);
					
					verifica = control.verificaUsuario(model);
					
					if(verifica == true) {
						validaUpdate = control.editarFunc(model);
						model.getNome();
						if(validaUpdate == true) {
							JOptionPane.showMessageDialog(null, "Usuário " + username + " atualizado com sucesso!");
						} else {
							JOptionPane.showMessageDialog(null, "Falha ao atualizar dados de usuário!");
						}
					}
				}
				
				
			}
		});
		btnSalvar.setBounds(29, 289, 82, 25);
		panel.add(btnSalvar);
	}
}