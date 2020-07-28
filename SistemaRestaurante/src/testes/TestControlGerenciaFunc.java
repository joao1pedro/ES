package testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import control.ControlGerenciaFunc;

class TestControlGerenciaFunc {

	@Test
	public void TestValidaRegistro() {
		boolean valida;
		ControlGerenciaFunc ctrl = new ControlGerenciaFunc();
		/*
		 * aqui deve se mudar o nickname do usuario sempre q for realizar um teste
		 * para poder cadastrar um novo usuario no sistema
		 * pois o banco de dados verifica se existe nicknames iguais
		 * e se sim, não permite cadastrar um novo
		 * */
		valida = ctrl.validaRegistro("João", "jps","1234", "Apelido de infancia", "Pepe", 0, "Rua B", "10/08/1996", "Brasil", "Campo Novo", 40, "Quixadá");
		assertEquals(true, valida);
	}
	@Test
	public void TestVerificaUsuario() {
		boolean valida;
		ControlGerenciaFunc ctrl = new ControlGerenciaFunc();
		valida = ctrl.verificaUsuario("test");
		assertEquals(true, valida);
		valida = ctrl.verificaUsuario("generica");
		assertEquals(false, valida);
	}
	@Test
	public void TestVerificaPermissaoUsuario() {
		boolean valida;
		ControlGerenciaFunc ctrl = new ControlGerenciaFunc();
		valida = ctrl.verificaPermissao("test");
		assertEquals(true, valida);
		valida = ctrl.verificaPermissao("generica");
		assertEquals(false, valida);
	}
	@Test
	public void TestEditaFunc() {
		boolean valida;
		ControlGerenciaFunc ctrl = new ControlGerenciaFunc();
		valida = ctrl.editarFunc("João", "jps","1234", "Apelido de infancia", "Pepe", 0, "Rua B", "10/08/1996", "Brasil", "Campo Novo", 40, "Quixadá");
		assertEquals(true, valida);
		valida = ctrl.editarFunc("João", "jps","1234", "Apelido de infancia", "Pepe", 1, "Rua B", "10/08/1996", "Brasil", "Campo Novo", 40, "Quixadá");
		assertEquals(true, valida);
	}
	@Test
	public void TestRemoveFunc() {
		boolean valida;
		ControlGerenciaFunc ctrl = new ControlGerenciaFunc();
		/*
		 * aqui deve se mudar o nickname do usuario para um usuario existente 
		 * sempre q for realizar um teste
		 * para poder remover um usuario do sistema
		 * pois uma vez removido em um teste, em uma nova execucao
		 * o sistema acusara q o usuario n existe
		 * */
		valida = ctrl.removeFunc("jps");
		assertEquals(true, valida);
	}
}
