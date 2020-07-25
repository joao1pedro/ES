package testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import control.ControlAlterarSenha;

class TestControlAlterarSenha {

	@Test
	public void TestUpdatePassword() {
		boolean valida;
		
		ControlAlterarSenha ctrl = new ControlAlterarSenha();
		valida = ctrl.updatePass("test", "123456");
		assertEquals(valida, true);
	}

}
