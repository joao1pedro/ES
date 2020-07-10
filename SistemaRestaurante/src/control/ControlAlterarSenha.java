package control;

import dao.AlterarSenhaDAO;
import model.ModelAlterarSenha;

public class ControlAlterarSenha {
	public boolean updatePass(String usuario, String senha) {
		boolean valida;
		
		AlterarSenhaDAO dao = new AlterarSenhaDAO();
		ModelAlterarSenha model = new ModelAlterarSenha(usuario, senha);
		
		valida = dao.updatePass(model);
		if(valida == true)
			return true;
		else
			return false;
	}
}
