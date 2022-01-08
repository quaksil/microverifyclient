package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbhelpers.SearchQueryIOExceptionException;
import dbhelpers.SearchQuerySQLExceptionException;
import dbhelpers.SearchQueryStub;
import dbhelpers.SearchQueryStub.Students;

@WebServlet(name = "WSClientServlet", value = "/verify")
public class WSClientServlet extends HttpServlet {
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

		HttpSession session = request.getSession(false);

		if (session.getAttribute("username") != null) {

			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String queryS = request.getParameter("searchVal");
			StringBuffer utilOutput = new StringBuffer();

			SearchQueryStub stub = new SearchQueryStub();

			SearchQueryStub.DoSearch params = new SearchQueryStub.DoSearch();

			params.setQueryS(queryS);

			SearchQueryStub.DoSearchResponse resp = null;
			try {
				resp = stub.doSearch(params);
			} catch (SearchQuerySQLExceptionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SearchQueryIOExceptionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Students[] students = resp.get_return();

			if (students == null) {

				/*
				 * System.out.println("This is null");
				 * 
				 * utilOutput.
				 * append("\n <p class='text-danger'>Student is not present in database.</p>");
				 * request.setAttribute("utilOutput", utilOutput.toString());
				 */

			} else {
				System.out.println("This is not null");

				utilOutput.append("\n <p class='text-success'>Students present in database.</p>");
				request.setAttribute("utilOutput", utilOutput.toString());
			}

			request.setAttribute("students", students);
			String url = "/searchRead.jsp";

			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);

		} else {

			out.print("<p class='text-decoration-none text-danger'>You are not logged in, log in first.</p>");
			out.print("<a href='login.jsp' class='btn btn-primary btn-sm'>Login");
			out.print("</a>");
			out.print("</div></div></div><jsp:include page='footer.jsp'/></html>");
		}
		out.close();

	}
}
