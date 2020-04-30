package com.alana.web.idade.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/IdadeServlet")
public class IdadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String data = request.getParameter("data");

		Data hoje = new Data();
		Data nascimento = new Data(data);

		int idade = calcularIdade(hoje, nascimento);
		request.setAttribute("idade", idade);

		RequestDispatcher rd = request.getRequestDispatcher("idade.jsp");
		rd.forward(request, response);
	}

	// TODO tratar 10/10/2020

	private int calcularIdade(Data hoje, Data nascimento) {
		int idade = -1;

		int anoAtual = hoje.getAno();
		int mesAtual = hoje.getMes();
		int diaAtual = hoje.getAno();

		if (anoAtual == nascimento.getAno()) {
			idade = 0;
		} else {
			idade = anoAtual - nascimento.getAno();
			if (mesAtual < nascimento.getMes()) {
				idade -= 1;
			} else if (mesAtual == nascimento.getMes() && diaAtual < nascimento.getDia()) {
				idade -= 1;
			}
		}
		return idade;
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		log("Iniciando a servlet");
	}

	public void destroy() {
		super.destroy();
		log("Destruindo a servlet");
	}
}