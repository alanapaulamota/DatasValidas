package com.alana.web.servlet.login;

public class Autenticacao {
	private String login;
	private String senha;

	public static boolean AutenticacaoLog(String login, String senha) {
		boolean aut = false;
		try {
			if (login.contentEquals("root") && senha.equals("123")) {
				aut = true;
			} else {
				aut = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aut;
	}

	public String getlogin() {
		return login;
	}

	public void setlogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Autenticacao: [login=" + login + ", senha=" + senha + "]";
	}

}
