package com.alana.web.idade.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet")
public class CalculaIdade extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
	    PrintWriter out = resp.getWriter();
	    String dataN = req.getParameter("nascimento");
	    Date date = new SimpleDateFormat("DD/MM/yyyy").parse(dataN);
	    SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy");
	    Date hoje = new Date();
	    sdf.format(hoje);
	       
	    SimpleDateFormat A = new SimpleDateFormat("D");
	    int dian = Interger.parseInt(A.format(date));

	    SimpleDateFormat B = new SimpleDateFormat("M");
	    int mesn = Interger.parseInt(B.format(date));
	        
	    SimpleDateFormat C = new SimpleDateFormat("y");
	    int anon = Interger.parseInt(C.format(date));
	       
	    try {

	      Data d = new Data(); //instancia classe Data    
	      Date nv = new SimpleDateFormat("DD/MM/yyyy").parse(d.Data(dian, mesn, anon));             
	      int Idade = calcular(nv, hoje);

	      out.println("<html><body>");
	      out.println("<label>Sua idade é:</label>");
	      out.println("<input>type="text" value=Idade</input>");
	      out.println("</body></html>");
	      out.close();
			
	    }catch (Exception e){
	      
	      out.println("<html><body>");
			  out.println("<input> type="text" value= e.getMessage()</input>");
			  out.println("</body></html>");
			  out.close();
		  }     
	}
	

	private int calcular(Date niver, Date hj) {

		SimpleDateFormat A = new SimpleDateFormat("D");
		int dian = Integer.parseInt(A.format(niver));
		int diahj = Integer.parseInt(A.format(hj));

		SimpleDateFormat B = new SimpleDateFormat("M");
		int mesn = Integer.parseInt(B.format(niver));
		int meshj = Integer.parseInt(B.format(hj));

		SimpleDateFormat C = new SimpleDateFormat("y");
		int anon = Integer.parseInt(C.format(niver));
		int anohj = Integer.parseInt(C.format(hj));

		int id = anohj - anon;
		if (meshj < mesn) {
			id -= 1;
		} else if (meshj == mesn && diahj < dian) {
			id -= 1;
		}
		return id;
	}

}
