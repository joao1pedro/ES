package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import connection.ConnectionFactory;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

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
		btnEstornar.setBounds(272, 425, 95, 25);
		panel.add(btnEstornar);
		
		JLabel lblReceitaTotal = new JLabel("Receita total:");
		lblReceitaTotal.setBounds(33, 12, 103, 15);
		panel.add(lblReceitaTotal);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pegaValores();
			}
		});
		btnTotal.setBounds(379, 425, 75, 25);
		panel.add(btnTotal);
		
		JLabel lblTaxaTotal = new JLabel("Taxa total:");
		lblTaxaTotal.setBounds(33, 39, 103, 15);
		panel.add(lblTaxaTotal);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(466, 425, 84, 25);
		panel.add(btnVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 12, 407, 401);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"id", "opera\u00E7\u00E3o", "nome produto", "qtd", "taxa", "sub total", "total"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);

		lblTotal.setBounds(138, 12, 84, 15);
		panel.add(lblTotal);

		lblTaxa.setBounds(138, 39, 84, 15);
		panel.add(lblTaxa);
	}
	public void updateTable() {
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
	        			rs.getString("operacao"),
	        			rs.getString("nome_produto"),
	        			rs.getInt("qtd"),
	        			rs.getDouble("sub_total"),
	        			rs.getDouble("taxa"),
	        			rs.getDouble("total")
	        	});
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
	public void pegaValores() {
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select sum(total) as total from produtos;";
	    String labelTaxa = null;
	    String labelTotal = null;
	    try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
}