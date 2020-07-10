package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.ModelProdutos;

public class ProdutosDAO {
	public boolean registraVenda(ModelProdutos model){
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		if(model.getOperacao().isEmpty() || model.getQtd()==0 ||
				model.getValorTotal()==0 || model.getSubTotal()==0 ||
				model.getTaxa()==0){
			return false;
			
		}else {
			String sql = "insert into vendas (operacao, qtd, total, sub_total, taxa, vendedor, mesa) values ('"+
					model.getOperacao() +"','" + model.getQtd() + "','" +
					model.getValorTotal() + "','" + model.getSubTotal() +"','" + model.getTaxa()+"','"+model.getVendedor()+
					"','"+model.getMesa()+"');";
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
	public double getPrice(ModelProdutos model, String produto) {
		double preco = 0;
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "";
	    		
		switch(produto) {
		case "água":
			sql = "select * from produtos where nome = 'água';";
			break;
		case "café":
			sql = "select * from produtos where nome = 'café';";
			break;
		case "cerveja":
			sql = "select * from produtos where nome = 'cerveja';";
			break;
		case "coca-cola":
			sql = "select * from produtos where nome = 'coca-cola';";
			break;
		case "água de côco":
			sql = "select * from produtos where nome = 'água de côco';";
			break;
		case "suco de laranja":
			sql = "select * from produtos where nome = 'suco de laranja';";
			break;
		case "suco de maracujá":
			sql = "select * from produtos where nome = 'suco de maracujá';";
			break;
		case "batata frita":
			sql = "select * from produtos where nome = 'batata frita';";
			break;
		case "salada":
			sql = "select * from produtos where nome = 'salada';";
			break;
		case "hamburger":
			sql = "select * from produtos where nome = 'hamburger';";
			break;
		case "anéis de cebola":
			sql = "select * from produtos where nome = 'anéis de cebola';";
			break;
		case "salada de frango":
			sql = "select * from produtos where nome = 'salada de frango';";
			break;
		case "sanduiche de atum":
			sql = "select * from produtos where nome = 'sanduiche de atum';";
			break;
		case "sanduiche de queijo":
			sql = "select * from produtos where nome = 'sanduiche de queijo';";
			break;
		case "sanduiche de frango":
			sql = "select * from produtos where nome = 'sanduiche de frango';";
			break;
		case "brownie":
			sql = "select * from produtos where nome = 'brownie';";
			break;
		case "torrada":
			sql = "select * from produtos where nome = 'torrada';";
			break;
		case "bolinho":
			sql = "select * from produtos where nome = 'bolinho';";
			break;
		case "panqueca":
			sql = "select * from produtos where nome = 'panqueca';";
			break;
		case "picole":
			sql = "select * from produtos where nome = 'picole';";
			break;
		case "torta de morango":
			sql = "select * from produtos where nome = 'torta de morango';";
			break;
		case "torta de chocolate":
			sql = "select * from produtos where nome = 'torta de chocolate';";
			break;
		case "torta de limão":
			sql = "select * from produtos where nome = 'torta de limão';";
			break;
		case "torta de banana":
			sql = "select * from produtos where nome = 'torta de banana';";
			break;
		case "torta de abacaxi":
			sql = "select * from produtos where nome = 'torta de acabaxi';";
			break;
		case "torta de maça":
			sql = "select * from produtos where nome = 'torta de maçã';";
			break;
		case "sorvete":
			sql = "select * from produtos where nome = 'sorvete';";
			break;
		case "pudim":
			sql = "select * from produtos where nome = 'pudim';";
			break;
		case "pave":
			sql = "select * from produtos where nome = 'pave';";
			break;
		case "suco de uva":
			sql = "select * from produtos where nome = 'suco de uva';";
			break;
		case "suco de morango":
			sql = "select * from produtos where nome = 'suco de morango';";
			break;
		case "suco de limão":
			sql = "select * from produtos where nome = 'suco de limão';";
			break;
		case "suco de abacaxi":
			sql = "select * from produtos where nome = 'suco de abacaxi';";
			break;
		case "suco de caju":
			sql = "select * from produtos where nome = 'suco de caju';";
			break;
		case "suco de manga":
			sql = "select * from produtos where nome = 'suco de manga';";
			break;
		case "suco de graviola":
			sql = "select * from produtos where nome = 'suco de graviola';";
			break;
		case "arroz":
			sql = "select * from produtos where nome = 'arroz';";
			break;
		case "macarrão":
			sql = "select * from produtos where nome = 'macarrão';";
			break;
		case "feijão":
			sql = "select * from produtos where nome = 'feijão';";
			break;
		case "bife":
			sql = "select * from produtos where nome = 'bife';";
			break;
		case "frango":
			sql = "select * from produtos where nome = 'frango';";
			break;
		case "taxa": //permitir que a % de taxa tenha valor alterado
			sql = "select * from produtos where nome = 'taxa';";
			break;
		}
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				preco = rs.getDouble("preco");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return preco;
	}
}
