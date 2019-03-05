package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		String matricule=req.getParameter("matricule");
		String titre=req.getParameter("titre");
		String nom=req.getParameter("nom");
		String prenom=req.getParameter("prenom");
		
		if(matricule==null||titre==null||nom==null||prenom==null){
			resp.getWriter().write("<h1> les elements manquants sont les suivants : </h1>");
			if(matricule==null){
				resp.getWriter().write("<h2> un matricule</h2>");
			}
			if(titre==null){
				resp.getWriter().write("<h2> un titre</h2>");
			}
			if(nom==null){
				resp.getWriter().write("<h2> un nom</h2>");
			}
			if(prenom==null){
				resp.getWriter().write("<h2> un prenom</h2>");
			}
			
		}else{
			resp.setContentType("text/html");
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Creation d’un collaborateur avec les informations suivantes :</h1>"
					+ "<ul>"
					+ "<li>matricule="+ matricule + "</li>"
					+ "<li>titre="+ titre + "</li>"
					+ "<li>nom="+ nom + "</li>"
					+ "<li>prenom="+ prenom + "</li>"
					+ "</ul>");
		}
	}
}