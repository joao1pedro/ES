package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import control.ControlGerenciaFunc;

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
	private JTextField txtPermissao;
	private JTextField txtEndereco;
	private JTextField txtNascimento;
	private JTextField txtNumero;
	private JTextField txtPais;
	private JTextField txtBairro;
	private JTextField txtCidade;
	
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnRemover = new JButton("Remover");
	private JButton btnEditar = new JButton("Editar");
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnListarDados = new JButton("Listar Dados");
	
	private JTable tableDados;
	private boolean swt;
	private final JLabel lblNome = new JLabel("Nome:");
	private final JLabel lblUsurios = new JLabel("Usuários:");
	private final JLabel lblSenha = new JLabel("Senha:");
	private final JLabel lblPerguntaSecreta = new JLabel("Pergunta secreta:");
	private final JLabel lblRespostaSecreta = new JLabel("Resposta secreta:");
	private final JLabel lblNascimento = new JLabel("Nascimento:");
	private final JLabel lblPas = new JLabel("País:");
	private final JLabel lblBairro = new JLabel("Bairro:");
	private final JLabel lblCidade = new JLabel("Cidade:");
	private final JLabel lblEndereo = new JLabel("Endereço:");
	private final JLabel lblNmero = new JLabel("Número:");
	private final JLabel lblPermisso = new JLabel("Permissão:");
	
	public GerenciaFunc() {
		setTitle("Funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1354, 711);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblGerenciaFunc = new JLabel("Gerência de funcionários");
		lblGerenciaFunc.setBounds(372, 12, 185, 15);
		panel.add(lblGerenciaFunc);
		
		txtNome = new JTextField();
		txtNome.setBounds(29, 81, 287, 15);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(29, 122, 287, 15);
		panel.add(txtUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(29, 164, 287, 15);
		panel.add(txtPassword);
		
		txtPergunta = new JTextField();
		txtPergunta.setColumns(10);
		txtPergunta.setBounds(29, 205, 287, 15);
		panel.add(txtPergunta);
		
		txtResposta = new JTextField();
		txtResposta.setColumns(10);
		txtResposta.setBounds(29, 251, 287, 15);
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
				txtEndereco.setEnabled(true);
				txtNascimento.setEnabled(true);
				txtBairro.setEnabled(true);
				txtNumero.setEnabled(true);
				txtPais.setEnabled(true);
				txtCidade.setEnabled(true);
				
				btnEditar.setEnabled(false);
			}
		});
		btnCadastrar.setBounds(29, 554, 105, 25);
		panel.add(btnCadastrar);
		
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setBounds(228, 554, 88, 25);
		panel.add(btnLimpar);
		btnRemover.setIcon(new ImageIcon(GerenciaFunc.class.getResource("/Button-Close-icon.png")));
		
		
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
		btnRemover.setBounds(867, 478, 95, 64);
		panel.add(btnRemover);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(337, 66, 980, 400);
		panel.add(scrollPane);
		
		tableDados = new JTable();
		tableDados.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"id", "nome", "username", "nascimento", "pa\u00EDs", "cidade", "bairro", "endere\u00E7o", "n\u00FAmero", "permissao"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tableDados);
		btnListarDados.setIcon(new ImageIcon(GerenciaFunc.class.getResource("/Button-Reload-icon.png")));
		
		btnListarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateTable();
			}
		});
		btnListarDados.setBounds(708, 478, 95, 64);
		panel.add(btnListarDados);
		
		
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				swt = false;
				txtNome.setEnabled(true);
				txtPassword.setEnabled(true);
				txtPergunta.setEnabled(true);
				txtResposta.setEnabled(true);
				txtUsername.setEnabled(true);
				txtPermissao.setEnabled(true);
				txtEndereco.setEnabled(true);
				txtNascimento.setEnabled(true);
				txtBairro.setEnabled(true);
				txtNumero.setEnabled(true);
				txtPais.setEnabled(true);
				txtCidade.setEnabled(true);
				
				btnCadastrar.setEnabled(false);
			}
		});
		btnEditar.setBounds(140, 554, 82, 25);
		panel.add(btnEditar);
		
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome;
				String username;
				String password;
				String pergunta;
				String resposta;
				String endereco;
				String nascimento;
				String bairro;
				String pais;
				String cidade;
				int numero;
				int permissao = 0;

				boolean cadastra;
				boolean validaUpdate;
				boolean verifica;
				
				nome = txtNome.getText();
				password = new String (txtPassword.getPassword());
				pergunta = txtPergunta.getText();
				resposta = txtResposta.getText();
				endereco = txtEndereco.getText();
				nascimento = txtNascimento.getText();
				bairro = txtBairro.getText();
				pais = txtPais.getText();
				cidade = txtCidade.getText();
				numero = 0;
				
				if(!txtNumero.getText().isEmpty())
					numero = Integer.parseInt(txtNumero.getText());
				
				ControlGerenciaFunc ctrl = new ControlGerenciaFunc();
				
				
				DefaultTableModel modelo = (DefaultTableModel) tableDados.getModel();
				
				int row = tableDados.getSelectedRow();
				
				/*modo de cadastro*/
				if(swt == true) {
					username = txtUsername.getText();
					cadastra = ctrl.validaRegistro(nome, username,password,pergunta,resposta,permissao,endereco,nascimento,pais,bairro,numero,cidade);
					if(cadastra == true) {
						JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso!");
					}else {
						JOptionPane.showMessageDialog(null, "Falha ao adicionar novo usuário!");
					}
				}else {
					/*
					 * modo editar**/
					username = modelo.getValueAt(row, 2).toString();
					verifica = ctrl.verificaUsuario(username);
					
					if(verifica == true) {
						if(numero!=0) {
							validaUpdate = ctrl.editarFunc(nome, username, password, pergunta, resposta, permissao, endereco, nascimento,
								pais, bairro, numero, cidade);
							if(validaUpdate == true) {
								JOptionPane.showMessageDialog(null, "Usuário " + username + " atualizado com sucesso!");
							} else {
								JOptionPane.showMessageDialog(null, "Falha ao atualizar dados de usuário!");
							}
						}else {
							validaUpdate = ctrl.editarFunc(nome, username, password, pergunta, resposta, permissao, endereco, nascimento,
									pais, bairro, cidade);
								if(validaUpdate == true) {
									JOptionPane.showMessageDialog(null, "Usuário " + username + " atualizado com sucesso!");
								} else {
									JOptionPane.showMessageDialog(null, "Falha ao atualizar dados de usuário!");
								}
						}
					}
				}
				updateTable();
				limpar();
				
			}
		});
		btnSalvar.setBounds(29, 580, 105, 25);
		panel.add(btnSalvar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GerenciaFunc.class.getResource("/Actions-list-add-user-icon.png")));
		label.setBounds(146, 7, 70, 62);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(GerenciaFunc.class.getResource("/Actions-contact-new-icon.png")));
		label_1.setBounds(695, -4, 105, 82);
		panel.add(label_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ViewSistema frame = new ViewSistema();
				frame.setVisible(true);
			}
		});
		btnVoltar.setBounds(140, 580, 82, 25);
		panel.add(btnVoltar);
		
		txtPermissao = new JTextField();
		txtPermissao.setEnabled(false);
		txtPermissao.setColumns(10);
		txtPermissao.setBounds(29, 527, 287, 15);
		panel.add(txtPermissao);
		
		txtEndereco = new JTextField();
		txtEndereco.setEnabled(false);
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(29, 451, 287, 15);
		panel.add(txtEndereco);
		
		txtNascimento = new JTextField();
		txtNascimento.setEnabled(false);
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(29, 290, 287, 15);
		panel.add(txtNascimento);
		
		txtNumero = new JTextField();
		txtNumero.setEnabled(false);
		txtNumero.setColumns(10);
		txtNumero.setBounds(29, 490, 287, 15);
		panel.add(txtNumero);
		
		txtPais = new JTextField();
		txtPais.setEnabled(false);
		txtPais.setColumns(10);
		txtPais.setBounds(29, 326, 287, 15);
		panel.add(txtPais);
		
		txtBairro = new JTextField();
		txtBairro.setEnabled(false);
		txtBairro.setColumns(10);
		txtBairro.setBounds(29, 410, 287, 15);
		panel.add(txtBairro);
		
		txtCidade = new JTextField();
		txtCidade.setEnabled(false);
		txtCidade.setColumns(10);
		txtCidade.setBounds(29, 370, 287, 15);
		panel.add(txtCidade);
		lblNome.setBounds(29, 67, 70, 15);
		
		panel.add(lblNome);
		lblUsurios.setBounds(29, 94, 70, 27);
		
		panel.add(lblUsurios);
		lblSenha.setBounds(29, 147, 70, 15);
		
		panel.add(lblSenha);
		lblPerguntaSecreta.setBounds(29, 191, 140, 15);
		
		panel.add(lblPerguntaSecreta);
		lblRespostaSecreta.setBounds(29, 229, 140, 15);
		
		panel.add(lblRespostaSecreta);
		lblNascimento.setBounds(29, 268, 105, 15);
		
		panel.add(lblNascimento);
		lblPas.setBounds(29, 306, 70, 15);
		
		panel.add(lblPas);
		lblBairro.setBounds(29, 386, 70, 15);
		
		panel.add(lblBairro);
		lblCidade.setBounds(29, 353, 70, 15);
		
		panel.add(lblCidade);
		lblEndereo.setBounds(29, 425, 105, 15);
		
		panel.add(lblEndereo);
		lblNmero.setBounds(29, 467, 70, 15);
		
		panel.add(lblNmero);
		lblPermisso.setBounds(29, 509, 88, 15);
		
		panel.add(lblPermisso);
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
	        			rs.getString("nascimento"),
	        			rs.getString("pais"),
	        			rs.getString("cidade"),
	        			rs.getString("bairro"),
	        			rs.getString("endereco"),
	        			rs.getInt("numero"),
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
		txtPergunta.setText(null);
		txtResposta.setText(null);
		txtPermissao.setText(null);
		txtEndereco.setText(null);
		txtNascimento.setText(null);
		txtPassword.setText(null);
		txtBairro.setText(null);
		txtPais.setText(null);
		txtNumero.setText(null);
		txtCidade.setText(null);
		
		txtNome.setEnabled(false);
		txtPassword.setEnabled(false);
		txtPergunta.setEnabled(false);
		txtResposta.setEnabled(false);
		txtUsername.setEnabled(false);
		txtPermissao.setEnabled(false);
		txtEndereco.setEnabled(false);
		txtNascimento.setEnabled(false);
		txtBairro.setEnabled(false);
		txtPais.setEnabled(false);
		txtNumero.setEnabled(false);
		txtCidade.setEnabled(false);
		
		btnCadastrar.setEnabled(true);
		btnEditar.setEnabled(true);
	}
}