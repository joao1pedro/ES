package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.ModelProdutos;

public class SistemaDAO {
	public boolean registraVenda(ModelProdutos model){
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		if(model.getOperacao().isEmpty() || model.getQtd()==0 ||
				model.getValorTotal()==0 || model.getSubTotal()==0 ||
				model.getTaxa()==0){
			return false;
			
		}else {
			String sql = "insert into vendas (operacao, qtd, total, sub_total, taxa, vendedor, mesa) values (?,?,?,?,?,?,?);";
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
}
