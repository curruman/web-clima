package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Ciudad;
import modelo.Pais;
import modelo.Usuario;
import services.CiudadServices;

@WebServlet("/Login")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CiudadServices service = new CiudadServices();
		List<Pais> paises = service.getPaises();
				
		req.getSession().setAttribute("paises", paises);
		
		resp.sendRedirect("Login.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = (String) req.getParameter("exampleInputEmail1");
		String password = (String) req.getParameter("exampleInputPassword1");
		int pais = Integer.valueOf(req.getParameter("Seleccion"));
		
		CiudadServices service = new CiudadServices();
		List<Ciudad> ciudades = service.getCiudades(pais);
		
		Usuario usuario = new Usuario();
		usuario.setUser(user);
		
		req.getSession().setAttribute("usuario", usuario);
		req.getSession().setAttribute("ciudades", ciudades);
		resp.sendRedirect("Preferences.jsp");
		//super.doPost(req, resp);
	}

/*	public Collection<Pais> getPaises(){
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
	*/

}
