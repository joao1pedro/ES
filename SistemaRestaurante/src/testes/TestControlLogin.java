package testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import control.ControlLogin;

class TestControlLogin {

	@Test
	public void testLogar() {
		boolean verifica;
		ControlLogin ctrl = new ControlLogin();
		verifica = ctrl.logar("test", "123456"); 
		assertEquals(true, verifica);
		verifica = ctrl.logar("teste", "1212");
		assertEquals(false, verifica);
	}
}
