package Servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendInfoMore")
public class SendInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Enumeration e = req.getParameterNames();
		resp.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/html; charset=UTF-8");
		resp.getWriter().print("<html><head></head><body>");
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String text = name + ": " + req.getParameter(name) + "<br />";
			resp.getWriter().println(text);	
		}
		resp.getWriter().println("</body></html>");
	}
}
