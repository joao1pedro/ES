package model;

public class ModelLogin {
	String login;
	String senha;
	int nivelPermissao;
	
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
}
