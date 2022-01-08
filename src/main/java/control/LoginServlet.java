package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbhelpers.AgentProfile;
import model.Agent;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("links.jsp").include(request, response);
		HttpSession session = null;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		AgentProfile ap = new AgentProfile();
		Agent agent = ap.verify(username, password);

		// if (agent != null) {

			session = request.getSession();

			int agent_id = agent.getId();
			String firstname = agent.getFirstname();
			String lastname = agent.getLastname();

			out.print("<p> Welcome, " + firstname + " " + lastname + ".</p>");
			out.print("<a href='index.jsp' class='btn btn-primary btn-sm'>My Portal");
			out.print("</a>");
			out.print("</div></div></div><jsp:include page='footer.jsp'/></html>");

			session.setAttribute("username", username);
			session.setAttribute("firstname", firstname);
			session.setAttribute("lastname", lastname);
			session.setAttribute("agent_id", agent_id);
		/*} else {
			out.print("<p class='text-danger text-decoration-none'>Could not log you in.</p>");
			out.print("<a href='login.jsp' class='btn btn-primary btn-sm'>Try Again");
			out.print("</a>");
			out.print("</div></div></div><jsp:include page='footer.jsp'/></html>");
		}*/
		out.close();

	}

}
