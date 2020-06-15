package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			String sql = "insert into produtos (operacao, nome_produto, qtd, total, sub_total, taxa) values ('"+
					model.getOperacao() + "','" +model.getNomeProduto() + "','" + model.getQtd() + "','" +
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
}
