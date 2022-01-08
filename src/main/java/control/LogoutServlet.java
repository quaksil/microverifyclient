package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("links.jsp").include(request, response);

		HttpSession session = request.getSession();
		if (session != null) {
			session.removeAttribute("username");
		}
		session.invalidate();

		out.print("<p class='text-success'>You have been logged out.</p>");
		out.print("<a href='index.jsp' class='btn btn-primary btn-sm'>Go back");
		out.print("</a>");
		out.print("</div></div></div><jsp:include page='footer.jsp'/></html>");

		out.close();

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
