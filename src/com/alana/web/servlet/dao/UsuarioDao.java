package com.alana.web.servlet.dao;

import java.beans.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.alana.web.servlet.Connect.Conexao;
import com.alana.web.servlet.model.Usuario;

public class UsuarioDao {

	public String inserir(Usuario usuario) {
		String retorno = "falha";
		Conexao conn = new Conexao();
		try {
			Statement stmt = (Statement) conn.getConn().createStatement();
			stmt.execute("Insert into Usuario values ('" + usuario.getNome() + usuario.getDataNascimento()
					+ usuario.getEmail() + usuario.getSenha() + "')");
			retorno = "sucesso";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.fecharConexao();
		}
		return retorno;
	}

	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Conexao conn = new Conexao();
		try {
			Statement stmt = (Statement) conn.getConn().createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("Select + fron Usuario");
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setDataNascimento(rs.getString("Data de aniversario"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));

				usuarios.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.fecharConexao();
		}
		return usuarios;
	}

	// FINALIZAR

	public String delete(Usuario usuario) {
		String retorno = "falha";
		Conexao conn = new Conexao();
		try {
			Statement stmt = (Statement) conn.getConn().createStatement();
			stmt.execute();
			retorno = "sucesso";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.fecharConexao();
		}
		return retorno;
	}

	public String update(Usuario usuario) {
		String retorno = "falha";
		Conexao conn = new Conexao();
		try {
			Statement stmt = (Statement) conn.getConn().createStatement();
			stmt.execute();
			retorno = "sucesso";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.fecharConexao();
		}
		return retorno;
	}

}
