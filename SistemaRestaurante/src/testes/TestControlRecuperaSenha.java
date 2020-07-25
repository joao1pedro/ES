package testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import control.ControlRecuperaSenha;

class TestControlRecuperaSenha {

	@Test
	public void TestRetornaPergunta() {
		String teste;
		ControlRecuperaSenha ctrl = new ControlRecuperaSenha();
		teste = ctrl.returnPergunta("test"); //usuario test existe no bd
		assertNotEquals(null, teste);
		teste = ctrl.returnPergunta("generico"); //usuario generico nao existe no bd
		assertEquals(null, teste);
	}
	@Test
	public void TestValidaResposta() {
		String teste;
		ControlRecuperaSenha ctrl = new ControlRecuperaSenha();
		teste = ctrl.validResposta("test", "Maria"); //resposta certa
		assertNotEquals(null, teste);
		teste = ctrl.validResposta("test", "Joana"); //resposta errada
		assertEquals(null, teste);
	}

}
