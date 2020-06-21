package com.alana.web.servlet.model;

public class UsuarioCad {

	private int id;
	private String Nome;
	private String DataNascimento;
	private String Email;
	private String Senha;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}
	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return DataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return Senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		Senha = senha;
	}
	@Override
	public String toString() {
		return "UsuarioCad [id=" + id + ", Nome=" + Nome + ", DataNascimento=" + DataNascimento + ", Email=" + Email
				+ ", Senha=" + Senha + "]";
	}

	
	
}
