package model;

import dao.LoginDAO;

public class ModelLogin {
	String login;
	String senha;
	int nivelPermissao;
	
	public ModelLogin(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public int getNivelPermissao() {
		return nivelPermissao;
	}
	public void setNivelPermissao(int nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void logar(ModelLogin model) {
		new LoginDAO().logar(model);
	}
}
