package it.prova.cercalibri.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.cercalibri.model.Libro;

/**
 * Servlet implementation class executeAddLibroServlet
 */
@WebServlet("/ExecuteAddLibroServlet")
public class ExecuteAddLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExecuteAddLibroServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String titoloParameter = request.getParameter("titoloinput");
		String genereParameter = request.getParameter("genereinput");
		Integer pagineParameter = Integer.parseInt(request.getParameter("pagineinput"));
		RequestDispatcher rd = null;
		ExceuteRicercaLibroServlet.elencolibri.add(new Libro(titoloParameter, genereParameter, pagineParameter));
		request.setAttribute("esito_attribute", new Libro(titoloParameter, genereParameter, pagineParameter));
		rd = request.getRequestDispatcher("inserito.jsp");
		rd.forward(request, response);
	}

}
