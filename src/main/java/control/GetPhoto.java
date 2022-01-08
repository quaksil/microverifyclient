package control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.SearchQueryIOExceptionException;
import dbhelpers.SearchQuerySQLExceptionException;
import dbhelpers.SearchQueryStub;
import dbhelpers.SearchQueryStub.Photo;;

@WebServlet("/view")
public class GetPhoto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetPhoto() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("studentId"));

		SearchQueryStub stub = new SearchQueryStub();

		SearchQueryStub.GetPhoto paramph = new SearchQueryStub.GetPhoto();

		paramph.setStudentid(studentId);

		SearchQueryStub.GetPhotoResponse responseph = null;
		try {
			responseph = stub.getPhoto(paramph);
		} catch (SearchQuerySQLExceptionException | SearchQueryIOExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Photo photo = responseph.get_return();

		request.setAttribute("photo", photo);

		String page = "/view.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
		requestDispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
