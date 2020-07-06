package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connection.ConnectionFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class EditarPreco extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public EditarPreco() {
		setTitle("Editar preços");
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 12, 282, 243);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"id", "nome", "pre\u00E7o"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editarPrice();
			}
		});
		btnEditar.setBounds(50, 157, 94, 25);
		panel.add(btnEditar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSair.setBounds(50, 194, 94, 25);
		panel.add(btnSair);
	}
	public void updateProdutos() {
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select * from produtos;";
	    try{
	        stmt = con.prepareStatement(sql);
	        rs = stmt.executeQuery();
		        
	        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
	        modelo.setNumRows(0);
	        
	        while(rs.next()) {
	        	modelo.addRow(new Object[] {
	        			rs.getInt("id"),
	        			rs.getString("nome"),
	        			rs.getDouble("preco")
	        	});
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
	public void editarPrice() {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		double preco = 0;
		
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		
		int row = table.getSelectedRow();
		String selected = modelo.getValueAt(row, 1).toString();
		
		String numero = JOptionPane.showInputDialog("Digite o novo preço: ");
		preco = Double.parseDouble(numero);
		
		String sql = "update produtos set preco  = '"+ preco +"' where nome = '"+ selected + "';";

        try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			JOptionPane.showMessageDialog(null, "Editado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
        updateProdutos();
	}
}
