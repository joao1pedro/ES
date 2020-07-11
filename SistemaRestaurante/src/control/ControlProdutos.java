package control;

import dao.SistemaDAO;
import model.ModelProdutos;

public class ControlProdutos {
	public boolean registraVenda(String operacao, String vendedor,double taxa, double valorTotal, double subTotal, int qtd, int mesa) {
		SistemaDAO dao = new SistemaDAO();
		ModelProdutos model = new ModelProdutos(operacao, vendedor, taxa, valorTotal, subTotal, qtd, mesa);
		
		boolean valida = dao.registraVenda(model);
		
		if(valida == true)
			return true;
		else
			return false;
	}
	public int getMax() {
		SistemaDAO dao = new SistemaDAO();
		ModelProdutos model = new ModelProdutos();
		
		int value = dao.getMax(model);
		
		return value;
	}
	public double getPrice(String produto) {
		SistemaDAO dao = new SistemaDAO();
		ModelProdutos model = new ModelProdutos();
		
		double preco = dao.getPrice(model, produto);
		return preco;
	}
}
