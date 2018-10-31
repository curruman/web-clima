package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Pais;

@WebServlet("/Login")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		resp.sendRedirect("Login.jsp");
		req.getSession();
		Collection<Pais> paises = getPaises();
		req.setAttribute("paises", paises);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = (String) req.getParameter("exampleInputEmail1");
		String password = (String) req.getParameter("exampleInputPassword1");
		int pais = Integer.valueOf(req.getParameter("Seleccion"));
		super.doPost(req, resp);
	}

	private Collection<Pais> getPaises(){
		Collection<Pais> ListaPaises = new ArrayList();
		Pais arg = new Pais();
		arg.setId(1);
		arg.setNombre("Argentina");
				
		Pais bol = new Pais();
		bol.setId(2);
		bol.setNombre("Bolivia");

		Pais bra = new Pais();
		bol.setId(3);
		bol.setNombre("Brasil");

		Pais chi = new Pais();
		bol.setId(4);
		bol.setNombre("Chile");
		
		ListaPaises.add(arg);
		ListaPaises.add(bol);
		ListaPaises.add(bra);
		ListaPaises.add(chi);
		return ListaPaises;
	}
	

}
