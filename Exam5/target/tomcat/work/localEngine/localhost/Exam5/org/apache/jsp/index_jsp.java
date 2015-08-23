package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import daoimp.DaoImp;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>登录成功</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap.min.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("h3 {\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#divleft {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 20%;\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tmargin: 100px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#divright {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tmargin: 100px 20px;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<h5 class=\"navbar-brand\" href=\"#\">8815 林家俊</h5>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"LoginServlet\" class=\"text-center\">退出</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div id=\"divleft\">\r\n");
      out.write("\t\t<div class=\"btn-group btn-group-xs\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("\t\t\t\tCustomer管理<span class=\"glyphicon glyphicon-align-right\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"btn-group btn-group-xs\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("\t\t\t\tFilm设置<span class=\"glyphicon glyphicon-align-right\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"divright\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h1>客户列表</h1>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<a class=\"btn btn-default\" href=\"NewFile.jsp\">新建</a>\r\n");
      out.write("\t\t<table style=\"border: 1px solid black; margin-left: 50px;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t<th>FirstName</th>\r\n");
      out.write("\t\t\t\t<th>LastName</th>\r\n");
      out.write("\t\t\t\t<th>address</th>\r\n");
      out.write("\t\t\t\t<th>CustomerId</th>\r\n");
      out.write("\t\t\t\t<th>LastUpdate</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");

			DaoImp di = new DaoImp();
			ResultSet rs = di.showCustomerInfo();
			while (rs.next()) {
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><a href=\"#\">编辑</a>|<a href=\"删除\">删除</a></td>\r\n");
      out.write("\t\t\t");

				out.print("<td>" + rs.getString(3) + "</td>");
				out.print("<td>" + rs.getString(4) + "</td>");
				out.print("<td>" + rs.getString(5) + "</td>");
				out.print("<td>" + rs.getInt(1) + "</td>");
				out.print("<td>" + rs.getDate(9) + "</td>");
			
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
