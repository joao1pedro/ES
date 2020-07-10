package control;

import dao.IdentificaDAO;
import model.ModelIdentifica;

public class ControlIdentfica {
	public boolean confirma(String usuario, String senha) {
		boolean autentica;
		
		IdentificaDAO dao = new IdentificaDAO();
		ModelIdentifica model = new ModelIdentifica(usuario, senha);
		
		autentica = dao.confirma(model);
		if(autentica == true)
			return true;
		else
			return false;
	}
}
