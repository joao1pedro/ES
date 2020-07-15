package control;

import dao.GerenciaFuncDAO;
import model.ModelGerenciaFunc;

public class ControlGerenciaFunc {
	public boolean validaRegistro(String nome, String username, String password, String pergunta, String resposta, int permissao, String endereco,
			String nascimento, String pais, String bairro, int numero, String cidade) {
		boolean valida;
		
		GerenciaFuncDAO dao = new GerenciaFuncDAO();
		ModelGerenciaFunc model = new ModelGerenciaFunc(nome, username, password, pergunta, resposta, permissao, endereco, nascimento,
				pais, bairro, numero, cidade);
		
		valida = dao.validaRegistro(model);
		if(valida == true)
			return true;
		else
			return false;
	}
	public boolean verificaUsuario(String username) {
		boolean verifica;
		
		GerenciaFuncDAO dao = new GerenciaFuncDAO();
		ModelGerenciaFunc model = new ModelGerenciaFunc(username);
		
		verifica = dao.verificaUsuario(model);
		if(verifica == true)
			return true;
		else
			return false;
	}
	public boolean verificaPermissao(String username) {
		boolean verifica;
		
		GerenciaFuncDAO dao = new GerenciaFuncDAO();
		ModelGerenciaFunc model = new ModelGerenciaFunc(username);
		
		verifica = dao.verificaPermissao(model);
		if(verifica == true)
			return true;
		else
			return false;
	}
	public boolean editarFunc(String nome, String username, String password, String pergunta, String resposta, int permissao, String endereco,
			String nascimento, String pais, String bairro, int numero, String cidade) {
		boolean verifica;
		
		GerenciaFuncDAO dao = new GerenciaFuncDAO();
		ModelGerenciaFunc model = new ModelGerenciaFunc(nome, username, password, pergunta, resposta, permissao, endereco, nascimento,
				pais, bairro, numero, cidade);
		
		verifica = dao.editarFunc(model);
		if(verifica == true)
			return true;
		else
			return false;
	}
	public boolean removeFunc(String username) {
		boolean verifica;
		
		GerenciaFuncDAO dao = new GerenciaFuncDAO();
		ModelGerenciaFunc model = new ModelGerenciaFunc(username);
		
		verifica = dao.removeFunc(model);
		if(verifica == true)
			return true;
		else
			return false;
	}
	public boolean editarFunc(String nome, String username, String password, String pergunta, String resposta,
			int permissao, String endereco, String nascimento, String pais, String bairro, String cidade) {
		GerenciaFuncDAO dao = new GerenciaFuncDAO();
		ModelGerenciaFunc model = new ModelGerenciaFunc(nome, username, password, pergunta, resposta, permissao, endereco, nascimento,
				pais, bairro, cidade);
		boolean verifica;
		
		verifica = dao.editarFunc(model);
		if(verifica == true)
			return true;
		else
			return false;
	}
}