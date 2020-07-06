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
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class GerenciaFunc extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtPergunta;
	private JTextField txtResposta;
	
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnRemover = new JButton("Remover");
	private JButton btnEditar = new JButton("Editar");
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnListarDados = new JButton("Listar Dados");
	
	ModelGerenciaFunc model = new ModelGerenciaFunc();
	ControlGerenciaFunc control = new ControlGerenciaFunc();
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
		
		txtNome.setEnabled(false);
		txtPassword.setEnabled(false);
		txtPergunta.setEnabled(false);
		txtResposta.setEnabled(false);
		txtUsername.setEnabled(false);
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				swt = true;
				txtNome.setEnabled(true);
				txtPassword.setEnabled(true);
				txtPergunta.setEnabled(true);
				txtResposta.setEnabled(true);
				txtUsername.setEnabled(true);
				
				btnEditar.setEnabled(false);
			}
		});
		btnCadastrar.setBounds(29, 252, 105, 25);
		panel.add(btnCadastrar);
		
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setBounds(146, 289, 82, 25);
		panel.add(btnLimpar);
		
		
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				Connection con = new ConnectionFactory().getConnection();
				PreparedStatement stmt = null;
				ResultSet rs = null;
				
				DefaultTableModel modelo = (DefaultTableModel) tableDados.getModel();
				
				int row = tableDados.getSelectedRow();
				String selected = modelo.getValueAt(row, 2).toString();

		        String sql = "delete from usuarios where nickname = '"+ selected + "';";
		        
		        try {
					stmt = con.prepareStatement(sql);
					rs = stmt.executeQuery();
					JOptionPane.showMessageDialog(null, "Usuário " + selected + " removido com sucesso!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					ConnectionFactory.closeConnection(con, stmt, rs);
				}
		        updateTable();
			}
		});
		btnRemover.setBounds(532, 435, 117, 25);
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
		
		btnListarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateTable();
			}
		});
		btnListarDados.setBounds(372, 435, 147, 25);
		panel.add(btnListarDados);
		
		
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				swt = false;
				txtNome.setEnabled(true);
				txtPassword.setEnabled(true);
				txtPergunta.setEnabled(true);
				txtResposta.setEnabled(true);
				txtUsername.setEnabled(true);
				
				btnCadastrar.setEnabled(false);
			}
		});
		btnEditar.setBounds(146, 252, 82, 25);
		panel.add(btnEditar);
		
		
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
				
				nome = txtNome.getText();
				password = new String (txtPassword.getPassword());
				pergunta = txtPergunta.getText();
				resposta = txtResposta.getText();
				
				model.setNome(nome);
				model.setPassword(password);
				model.setPergunta(pergunta);
				model.setResposta(resposta);
				
				DefaultTableModel modelo = (DefaultTableModel) tableDados.getModel();
				
				int row = tableDados.getSelectedRow();
				
				/*modo de cadastro*/
				if(swt == true) {
					username = txtUsername.getText();
					model.setUsername(username);
					cadastra = control.validaRegistro(model);
					
					if(cadastra == true) {
						JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso!");
					}else {
						JOptionPane.showMessageDialog(null, "Falha ao adicionar novo usuário!");
					}
				}else {
					/*
					 * modo editar**/
					username = modelo.getValueAt(row, 2).toString();
					model.setUsername(username);
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
				updateTable();
				limpar();
				
			}
		});
		btnSalvar.setBounds(29, 289, 105, 25);
		panel.add(btnSalvar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GerenciaFunc.class.getResource("/Actions-list-add-user-icon.png")));
		label.setBounds(146, 7, 70, 62);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(GerenciaFunc.class.getResource("/Actions-contact-new-icon.png")));
		label_1.setBounds(695, -4, 105, 82);
		panel.add(label_1);
	}
	public void updateTable() {
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
	public void limpar() {
		txtNome.setText(null);
		txtUsername.setText(null);
		//new String (txtPassword.getPassword());
		txtPergunta.setText(null);
		txtResposta.setText(null);
		
		txtNome.setEnabled(false);
		txtPassword.setEnabled(false);
		txtPergunta.setEnabled(false);
		txtResposta.setEnabled(false);
		txtUsername.setEnabled(false);
		
		btnCadastrar.setEnabled(true);
		btnEditar.setEnabled(true);
	}
}