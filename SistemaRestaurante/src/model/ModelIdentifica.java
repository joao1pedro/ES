package model;

import dao.IdentificaDAO;

public class ModelIdentifica {
	private String usuario;
	private String senha;
	
	public ModelIdentifica(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void returnPergunta(ModelIdentifica model) {
		new IdentificaDAO().confirma(model);
	}
}
