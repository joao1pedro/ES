package model;

public class ModelGerenciaFunc {
	int id;
	int permissao;
	int numero;
	String nome;
	String username;
	String password;
	String pergunta;
	String resposta;
	String endereco;
	String nascimento;
	String bairro;
	String pais;
	String cidade;

	public ModelGerenciaFunc() {
		
	}
	public ModelGerenciaFunc(String nome, String username, String password, String pergunta, String resposta, int permissao, String endereco,
			String nascimento, String pais, String bairro, int numero, String cidade) {
		this.nome = nome;
		this.username = username;
		this.password = password;
		this.pergunta = pergunta;
		this.resposta = resposta;
		this.permissao = permissao;
		this.endereco = endereco;
		this.nascimento = nascimento;
		this.pais = pais;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
	}
	public ModelGerenciaFunc(String nome, String username, String password, String pergunta, String resposta, int permissao, String endereco,
			String nascimento, String pais, String bairro, String cidade) {
		this.nome = nome;
		this.username = username;
		this.password = password;
		this.pergunta = pergunta;
		this.resposta = resposta;
		this.permissao = permissao;
		this.endereco = endereco;
		this.nascimento = nascimento;
		this.pais = pais;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public ModelGerenciaFunc(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPermissao() {
		return permissao;
	}
	public void setPermissao(int permissao) {
		this.permissao = permissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
