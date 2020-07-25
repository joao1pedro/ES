package testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import control.ControlIdentfica;


class TestControlIdentificaUsuario {

	@Test
	public void testConfirmaUsuario() {
		boolean verifica;
		ControlIdentfica ctrl = new ControlIdentfica();
		verifica = ctrl.confirma("test", "123456");
		assertEquals(true, verifica);
		verifica = ctrl.confirma("admin", "admin");
		assertEquals(false, verifica);
	}

}
