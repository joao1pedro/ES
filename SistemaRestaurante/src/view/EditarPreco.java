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

@SuppressWarnings("serial")
public class EditarPreco extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public EditarPreco() {
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
		scrollPane.setBounds(89, 12, 282, 243);
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
				false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
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
	        			rs.getInt("preco")
	        	});
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
	public boolean editarPrice() {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String cafe = "café";
		String agua = "água";
		String cerveja = "cerveja";
		String coca = "coca-cola";
		String aguacc = "água de côco";
		String sucoLaranja = "suco de laranja";
		String sucoMaracuja = "suco de maracuja";
		String fritas = "batata frita";
		String salada = "salada";
		String hamburger = "hamburger";
		String aneisCebola = "anéis de cebola";
		String saladaFrango = "salada de frango";
		String sanduicheAtum = "sanduiche de atum";
		String sanduicheQueijo = "sanduiche de queijo";
		String sanduicheFrango = "sanduiche de frango";
		String brownie = "brownie";
		String torrada = "torrada";
		String bolinho = "bolinho";
		String panqueca = "panqueca";
		String picole = "picole";
		String tortaMorango = "torta de morango";
		String tortaChocolate = "torta de chocolate";
		String tortaLimao = "torta de limão";
		String tortaAbacaxi = "torta de abacaxi";
		String tortaBanana = "torta de banana";
		String tortaMaca = "torta de maça";
		String sorvete = "sorvete";
		String pudim = "pudim";
		String pave = "pave";
		String uva = "suco de uva";
		String morango = "suco de morango";
		String limao = "suco de limão";
		String abacaxi = "suco de abacaxi";
		String caju = "suco de caju";
		String manga = "suco de manga";
		String graviola = "suco de graviola";
		String arroz = "arroz";
		String macarrao = "macarrão";
		String feijao = "feijão";
		String bife = "bife";
		String frango = "bife";
		
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		
		int row = table.getSelectedRow();
		String selected = modelo.getValueAt(row, 0).toString();
		

        String sql = "update produtos set preco  = ? where id = '"+ selected + "';";
        
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
        return true;
	}
}
