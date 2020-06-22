package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.ModelProdutos;

public class ControlProdutos {
	public boolean registraVenda(ModelProdutos model){
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		if(model.getOperacao().isEmpty() || model.getQtd()==0 ||
				model.getValorTotal()==0 || model.getSubTotal()==0 ||
				model.getTaxa()==0){
			return false;
			
		}else {
			String sql = "insert into vendas (operacao, qtd, total, sub_total, taxa) values ('"+
					model.getOperacao() +"','" + model.getQtd() + "','" +
					model.getValorTotal() + "','" + model.getSubTotal() +"','" + model.getTaxa()+"');";
			try {
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();    
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				ConnectionFactory.closeConnection(con, stmt, rs);
			}
			return true;
		}
	}
	public boolean verificaVenda(ModelProdutos model){
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select * from vendas where id = '"+ model.getId() +"';";
	    try{
	        stmt = con.prepareStatement(sql);
	        rs = stmt.executeQuery();
	        if(rs.next()){
	        	return true;
	        } else{
	        	JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
	public boolean totalBanco(ModelProdutos model) {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select sum(total) as total from vendas;";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
	public boolean totalTaxa(ModelProdutos model) {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select sum(taxa) as taxa from vendas;";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
	public int getMax(ModelProdutos model) {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int max = 0;
		
		String sql = "select max(id) from vendas;";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				max = rs.getInt("max(id)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return max;
	}
}
