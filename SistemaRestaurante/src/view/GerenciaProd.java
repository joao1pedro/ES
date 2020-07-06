package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import connection.ConnectionFactory;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class GerenciaProd extends JFrame {

	private JPanel contentPane;
	
	private JTable table;
	
	JLabel lblTotal = new JLabel("");
	JLabel lblTaxa = new JLabel("");

	/**
	 * Create the frame.
	 */
	public GerenciaProd() {
		setTitle("Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 567);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEstornar = new JButton("Estornar");
		btnEstornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				estornar();
				pegaTotal();
				pegaTaxa();
			}
		});
		btnEstornar.setBounds(272, 425, 95, 25);
		panel.add(btnEstornar);
		
		JLabel lblReceitaTotal = new JLabel("Receita total: R$");
		lblReceitaTotal.setBounds(33, 12, 103, 15);
		panel.add(lblReceitaTotal);
		
		JLabel lblTaxaTotal = new JLabel("Taxa total: ");
		lblTaxaTotal.setBounds(33, 39, 103, 15);
		panel.add(lblTaxaTotal);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ViewSistema frame = new ViewSistema();
				frame.setVisible(true);
			}
		});
		btnVoltar.setBounds(511, 425, 77, 25);
		panel.add(btnVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 12, 407, 401);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"id", "opera\u00E7\u00E3o", "qtd", "sub total", "taxa", "total", "vendedor", "mesa"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		scrollPane.setViewportView(table);

		lblTotal.setBounds(138, 12, 84, 15);
		panel.add(lblTotal);

		lblTaxa.setBounds(138, 39, 84, 15);
		panel.add(lblTaxa);
		
		JButton btnEditarPreo = new JButton("Editar preço");
		btnEditarPreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditarPreco frame = new EditarPreco();
				frame.setVisible(true);
				frame.updateProdutos();
			}
		});
		btnEditarPreo.setBounds(379, 425, 120, 25);
		panel.add(btnEditarPreo);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GerenciaProd.class.getResource("/pie-chart-icon.png")));
		label.setBounds(43, 80, 195, 276);
		panel.add(label);
	}
	public void updateTable() {
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select * from vendas;";
	    try{
	        stmt = con.prepareStatement(sql);
	        rs = stmt.executeQuery();
		        
	        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
	        modelo.setNumRows(0);
	        
	        while(rs.next()) {
	        	modelo.addRow(new Object[] {
	        			rs.getInt("id"),
	        			rs.getString("operacao"),
	        			rs.getInt("qtd"),
	        			rs.getDouble("sub_total"),
	        			rs.getDouble("taxa"),
	        			rs.getDouble("total"),
	        			rs.getString("vendedor"),
	        			rs.getInt("mesa")
	        	});
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
	public void pegaTotal() {
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select sum(total) as total from vendas;";
	    
	    String labelTotal = null;
	    double total = 0;
	    try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				labelTotal = rs.getString("total");
				total = Double.parseDouble(labelTotal);
				lblTotal.setText(String.format("%.2f", total));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
	public void pegaTaxa() {
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select sum(taxa) as taxa from vendas;";
	    
	    String labelTaxa = null;
	    double taxa = 0;
	    try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				labelTaxa = rs.getString("taxa");
				taxa = Double.parseDouble(labelTaxa);
				lblTaxa.setText(String.format("%.2f", taxa));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
	public void estornar() {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		
		int row = table.getSelectedRow();
		String selected = modelo.getValueAt(row, 0).toString();
		

        String sql = "delete from vendas where id = '"+ selected + "';";
        
        try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			JOptionPane.showMessageDialog(null, "Compra id:" + selected + " removido com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
        updateTable();
	}
}
