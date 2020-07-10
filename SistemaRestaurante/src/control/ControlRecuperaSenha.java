package control;

import dao.RecuperaSenhaDAO;
import model.ModelRecuperaSenha;

public class ControlRecuperaSenha {
	public String returnPergunta(String usuario) {
		RecuperaSenhaDAO dao = new RecuperaSenhaDAO();
		ModelRecuperaSenha model = new ModelRecuperaSenha(usuario);
		
		String pergunta = dao.returnPergunta(model);
		return pergunta;
	}
	public String validResposta(String usuario, String resposta) {
		String password;
		
		RecuperaSenhaDAO dao = new RecuperaSenhaDAO();
		ModelRecuperaSenha model = new ModelRecuperaSenha(usuario, resposta);
		
		password = dao.validResposta(model);
		return password;
	}
	
}
