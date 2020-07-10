package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import control.ControlAlterarSenha;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AlterarSenha extends JFrame {
	
	private JPanel contentPane;
	private JPasswordField lblPass;
	private JPasswordField lblPassConfirm;

	public AlterarSenha() {
		setResizable(false);
		setTitle("Alterar senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 0, 426, 257);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDigiteANova = new JLabel("Digite a nova senha:");
		lblDigiteANova.setBounds(12, 12, 150, 15);
		panel.add(lblDigiteANova);
		
		lblPass = new JPasswordField();
		lblPass.setBounds(12, 39, 175, 19);
		panel.add(lblPass);
		lblPass.setColumns(10);
		
		JLabel lblConfirmeANova = new JLabel("Confirme a nova senha:");
		lblConfirmeANova.setBounds(12, 70, 175, 15);
		panel.add(lblConfirmeANova);
		
		lblPassConfirm = new JPasswordField();
		lblPassConfirm.setColumns(10);
		lblPassConfirm.setBounds(12, 97, 175, 19);
		panel.add(lblPassConfirm);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pass = new String(lblPass.getPassword()).trim();
				String passConfirm = new String(lblPassConfirm.getPassword()).trim();
				boolean valida;
				
				ControlAlterarSenha ctrl = new ControlAlterarSenha();
				
				if(pass.equals(passConfirm)) {
					valida = ctrl.updatePass(TelaLogin.login, passConfirm);
					if(valida == true) {
						JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
						dispose();
					}			
				}else 
					JOptionPane.showMessageDialog(null, "As senhas não são correspondentes!");
			}
		});
		btnSalvar.setBounds(12, 206, 78, 25);
		panel.add(btnSalvar);
	}
}