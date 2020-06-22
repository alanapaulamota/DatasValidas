package com.alana.web.servlet.model;

public class Usuario {

	private int id;
	private String Nome;
	private String DataNascimento;
	private String Email;
	private String Senha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	@Override
	public String toString() {
		return "UsuarioCad [id=" + id + ", Nome=" + Nome + ", DataNascimento=" + DataNascimento + ", Email=" + Email
				+ ", Senha=" + Senha + "]";
	}

}
