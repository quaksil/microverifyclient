package control;

import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProfileServlet", value = "/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("links.jsp").include(request, response);

		HttpSession session = request.getSession(false);

		if (session.getAttribute("username") != null) {

			int agent_id = (int) session.getAttribute("agent_id");
			String firstname = (String) session.getAttribute("firstname");
			String lastname = (String) session.getAttribute("lastname");

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyy");
			LocalDateTime now = LocalDateTime.now();

			String username = (String) session.getAttribute("username");
			out.print("<a class='text-warning text-decoration-none'><b>" + firstname + " " + lastname + "</b></a>");
			out.print("<p>Hello, <b>" + username + "</b>, this is your profile.</p>");
			

			out.print("<p> Today: " + dtf.format(now) + "</p>");

			out.print("<a href='index.jsp' class='btn btn-primary btn-sm'>My Portal");
			out.print("</a>");

			out.print("</div></div></div><jsp:include page='footer.jsp'/></html>");
		} else {

			out.print("<p class='text-decoration-none text-danger'>You are not logged in, log in first.</p>");
			out.print("<a href='login.jsp' class='btn btn-primary btn-sm'>Login");
			out.print("</a>");
			out.print("</div></div></div><jsp:include page='footer.jsp'/></html>");
		}
		out.close();

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
