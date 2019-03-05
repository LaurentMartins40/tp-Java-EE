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
			String errorReponse = "les elements manquants sont : ";
			if(matricule==null){
				errorReponse = errorReponse + " un matricule";
			}
			if(titre==null){
				errorReponse = errorReponse +" un titre";
			}
			if(nom==null){
				errorReponse = errorReponse +" un nom";
			}
			if(prenom==null){
				errorReponse = errorReponse + " un prenom";
			}
			resp.sendError(400, errorReponse);
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