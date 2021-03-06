package zx.soft.video.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zx.soft.video.dao.DetailDao;

public class DeleteDetailServlet extends HttpServlet {

	private static final long serialVersionUID = -3345301747336084944L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int did = Integer.parseInt(request.getParameter("did").toString());
		new DetailDao().deleteDetail(did);
		request.getRequestDispatcher("servlet").forward(request, response);
		//		response.sendRedirect("servlet");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
