/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-01-08 02:24:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbhelpers.SearchQueryStub.Students;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public final class searchRead_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dbhelpers.SearchQueryStub.Students");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<p>\n");
      out.write("	<br />\n");
      out.write("</p>\n");
      out.write("<p></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("	<div class=\"col\">\n");
      out.write("		<h3>Student List</h3>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"col-md-5\">\n");
      out.write("		<form name=\"verifyForm\" action=\"verify\" method=\"GET\">\n");
      out.write("\n");
      out.write("			<div class=\"input-group\">\n");
      out.write("				<div class=\"input-group-text\">\n");
      out.write("					<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\"\n");
      out.write("						fill=\"currentColor\" class=\"bi bi-search\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path\n");
      out.write("							d=\"M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z\" />\n");
      out.write("</svg>\n");
      out.write("				</div>\n");
      out.write("				<input type=\"text\" class=\"form-control form-control-sm\"\n");
      out.write("					name=\"searchVal\" id=\"searchField\"\n");
      out.write("					placeholder=\"Search (Fullname, Student Id, Firstname or Lastname)\"\n");
      out.write("					value=\"\" />\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div class=\"col-auto\">\n");
      out.write("		<a href=\"index.jsp\" class=\"btn btn-primary btn-sm\">My Portal</a>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Students[] students = new Students[0];

	String status = (String) request.getAttribute("utilOutput");
	students = (Students[]) request.getAttribute("students");

      out.write('\n');
      out.write('\n');

	if (students == null) {

      out.write("\n");
      out.write("<p class=\"text-danger\">No data is present, try searching.</p>\n");

	} else {

      out.write('\n');
      out.print(status);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table\n");
      out.write("	class='table table-bordered table-striped table-hover text-nowrap'>\n");
      out.write("\n");
      out.write("	<thead>\n");
      out.write("		<tr>\n");
      out.write("			<th>#</th>\n");
      out.write("			<th>Firstname</th>\n");
      out.write("			<th>Lastname</th>\n");
      out.write("			<!--  <th>Gender</th>\n");
      out.write("			<th>Birthday</th>\n");
      out.write("			<th>Father Firstname</th>\n");
      out.write("			<th>Mother Firstname</th>\n");
      out.write("			<th>Mother Lastname</th>\n");
      out.write("			<th>Faculty</th>\n");
      out.write("			<th>Department</th>\n");
      out.write("			<!--  <th>Course</th>\n");
      out.write("			<th>Level</th>\n");
      out.write("			<th>Major</th> -->\n");
      out.write("			<th>Registration</th>\n");
      out.write("			<th class='text-center'>Action</th>\n");
      out.write("	</thead>\n");
      out.write("	<tbody>\n");
      out.write("\n");
      out.write("		");

			for (int i = 0; i < students.length; i++) {
		
      out.write("\n");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<td>");
      out.print(students[i].getId());
      out.write("</td>\n");
      out.write("\n");
      out.write("			<td>");
      out.print(students[i].getFirstname());
      out.write("</td>\n");
      out.write("\n");
      out.write("			<td>");
      out.print(students[i].getLastname());
      out.write("</td>\n");
      out.write("\n");
      out.write("			<!--<td>");
      out.print(students[i].getGender());
      out.write("</td>\n");
      out.write("\n");
      out.write("			 <td>");
      out.print(students[i].getBday());
      out.write("</td>\n");
      out.write("\n");
      out.write("			<td>");
      out.print(students[i].getFirstfather());
      out.write("</td>\n");
      out.write("\n");
      out.write("			<td>");
      out.print(students[i].getFirstmaiden());
      out.write("</td>\n");
      out.write("			<td>");
      out.print(students[i].getLastmaiden());
      out.write("</td> \n");
      out.write("\n");
      out.write("			 <td>");
      out.print(students[i].getFaculty().getName());
      out.write("</td>\n");
      out.write("			<td>");
      out.print(students[i].getDepartment().getName());
      out.write("</td>\n");
      out.write("\n");
      out.write("			<td>");
      out.print(students[i].getCourse());
      out.write("</td>\n");
      out.write("\n");
      out.write("			<td>");
      out.print(students[i].getLevel());
      out.write("</td> \n");
      out.write("\n");
      out.write("			<td>");
      out.print(students[i].getMajor().getName());
      out.write("</td>-->\n");
      out.write("\n");
      out.write("			");

				int isAuthorizedYear = students[i].getLastyear();
			
      out.write("\n");
      out.write("			");

				if (isAuthorizedYear == 2021) {
			
      out.write("\n");
      out.write("\n");
      out.write("			<td class=\"text-decoration-none text-success\"><b>[Authorized]</b> - ");
      out.print(isAuthorizedYear);
      out.write("</td>\n");
      out.write("			");

				} else {
			
      out.write("\n");
      out.write("			<td class=\"text-decoration-none text-danger\"><b>[Unauthorized]</b> - ");
      out.print(isAuthorizedYear);
      out.write("\n");
      out.write("			</td>\n");
      out.write("			");

				}
			
      out.write("\n");
      out.write("\n");
      out.write("			<td class='text-center'>\n");
      out.write("\n");
      out.write("				<button type=\"button\" class=\"btn btn-warning btn-sm\"\n");
      out.write("					onClick=\"window.open\n");
      out.write("('view?studentId=");
      out.print(students[i].getId());
      out.write("','window','width=500,height=500')\">Photo</button>\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("	</tbody>\n");
      out.write("</table>\n");

	}

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
