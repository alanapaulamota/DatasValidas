package com.alana.web.servlet.Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String driver = "com.mysql.jdb.Driver";
	private String URL = "jdbc:mysql://localhost/CRUD";
	private String USER = "root";
	private String SENHA = "123";
	private Connection conn;

	public Conexao() {
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(URL, USER, SENHA);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	public void fecharConexao() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
