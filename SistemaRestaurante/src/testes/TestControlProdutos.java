package testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import control.ControlProdutos;

class TestControlProdutos {

	@Test
	public void TestRegistraVenda() {
		boolean valida;
		ControlProdutos ctrl = new ControlProdutos();
		valida = ctrl.registraVenda("venda", "emo", 2, 10.2, 10, 2, 7);
		assertEquals(true, valida);
		valida = ctrl.registraVenda("venda", "emo", 2, 10.2, 10, 0, 0); //n pode ter mesa = 0 e qtd =0
		assertFalse(valida);
	}
	@Test
	public void TestGetMax() {
		int teste;
		ControlProdutos ctrl = new ControlProdutos();
		teste = ctrl.getMax();
		assertNotEquals(0, teste);
	}
	@Test
	public void TestGetPrice() {
		double price;
		ControlProdutos ctrl = new ControlProdutos();
		price = ctrl.getPrice("invalido"); // não existe no sistema
		assertEquals(0, price,0);
		price = ctrl.getPrice("água"); //existe no sistema
		assertNotEquals(0, price);
	}

}
