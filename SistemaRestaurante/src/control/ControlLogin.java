package control;

import dao.LoginDAO;
import model.ModelLogin;

public class ControlLogin {
	public boolean logar(String login, String senha) {
		boolean autentica;
		
		LoginDAO dao = new LoginDAO();
		ModelLogin model = new ModelLogin(login, senha);
		
		autentica = dao.logar(model);
		if(autentica == true)
			return true;
		else
			return false;
	}
}