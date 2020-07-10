package model;

import dao.RecuperaSenhaDAO;

public class ModelRecuperaSenha {
	private String pergunta;
	private String resposta;
	private String usuario;
	private String senha;
	
	
	public ModelRecuperaSenha(String usuario, String resposta) {
		this.usuario = usuario;
		this.resposta = resposta;
	}
	public ModelRecuperaSenha(String usuario) {
		this.usuario = usuario;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
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
	public void returnPergunta(ModelRecuperaSenha model) {
		new RecuperaSenhaDAO().returnPergunta(model);
	}
	public void validResposta(ModelRecuperaSenha model) {
		new RecuperaSenhaDAO().validResposta(model);
	}
	
}
