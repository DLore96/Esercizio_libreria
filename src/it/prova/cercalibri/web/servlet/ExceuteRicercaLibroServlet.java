package it.prova.cercalibri.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.cercalibri.model.Libro;

/**
 * Servlet implementation class exceuteRicercaLibroServlet
 */
@WebServlet("/ExceuteRicercaLibroServlet")
public class ExceuteRicercaLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<Libro> elencolibri = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExceuteRicercaLibroServlet() {
		super();
		this.elencolibri.add(new Libro("One Piece", "Action", 140));

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String titoloParameter = request.getParameter("titoloinput");
		String genereParameter = request.getParameter("genereinput");
		Integer pagineparameter = Integer.parseInt(request.getParameter("pagineinput"));

		RequestDispatcher rd = null;

		if (titoloParameter != null && !titoloParameter.isEmpty() && genereParameter != null
				&& !genereParameter.isEmpty() && ExceuteRicercaLibroServlet.elencolibri
						.contains(new Libro(titoloParameter, genereParameter, pagineparameter))) {

			request.setAttribute("libro_attribute", new Libro(titoloParameter, genereParameter, pagineparameter));
			rd = request.getRequestDispatcher("presente.jsp");

		} else {

			request.setAttribute("libro_attribute", new Libro(titoloParameter, genereParameter, pagineparameter));
			rd = request.getRequestDispatcher("nonpresente.jsp");
		}
		rd.forward(request, response);

	}

}
