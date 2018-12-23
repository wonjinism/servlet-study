package Servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public LoginServlet() {
		super();
		map.put("javaking", "abcd"); // key : id , value: password
		map.put("starjava", "aaaa");
		map.put("jsp", "bbbb");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		if(map.containsKey(id)) {
			if(map.get(id).equals(pw)) {
				
			}
		}
	}

}
