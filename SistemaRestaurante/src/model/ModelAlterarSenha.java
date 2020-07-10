package model;

import dao.AlterarSenhaDAO;

public class ModelAlterarSenha {
	private String usuario;
	private String senha;
	
	public ModelAlterarSenha(String usuario, String senha) {
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

	public void updatePass(ModelAlterarSenha model) {
		new AlterarSenhaDAO().updatePass(model);
	}
}
