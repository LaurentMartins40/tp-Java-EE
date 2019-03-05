package jetty_exemple.jetty_exemple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse rep)
					throws ServletException, IOException {

		PrintWriter writer = rep.getWriter();
		
		writer.write("<p>This text is important.</p>");
	}
}