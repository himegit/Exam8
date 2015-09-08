package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hand.dao.DaoImp;
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\"></script>\r\n");
      out.write("<title>登录成功</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".divfloat {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ma {\r\n");
      out.write("\tmargin-top: 150px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction del(obj) {\r\n");
      out.write("\t\t\tif (window.confirm('您确定要删除该记录吗？')) {\r\n");
      out.write("\t\t\t\t//alert(\"确定\");\r\n");
      out.write("\t\t\t\tvar customer_id = obj.attributes[2].nodeValue;\r\n");
      out.write("\t\t\t\t$.post(\"/spring_hibernate4_struts2/Del\", {\r\n");
      out.write("\t\t\t\t\tcustomer_id : customer_id\r\n");
      out.write("\t\t\t\t//city:\"Duckburg\"\r\n");
      out.write("\t\t\t\t}, function(data, status) {\r\n");
      out.write("\t\t\t\t\talert(\"删除成功\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t//alert(\"取消\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

		Object admin = session.getAttribute("admin");
		if (admin == null) {
			out.println(session.getAttribute("admin"));
	
      out.write("\r\n");
      out.write("\t<h3>登录超时，请重新登录</h3>\r\n");
      out.write("\t<a href=\"login.jsp\">请返回等录页面</a>\r\n");
      out.write("\t");

		} else {
	
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"navbar-brand active btn btn-drfault\"><strong>WINHERE</strong></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"navbar\" class=\"collapse navbar-collapse pull-right\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav \">\r\n");
      out.write("\t\t\t\t<li><a href=\"LoginOut\">退出</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container ma\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-2 divfloat\" id=\"myScrollspy\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-tabs nav-stacked\">\r\n");
      out.write("\t\t\t\t\t<li class=\"\"><a href=\"#section-1\">Customer管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#section-2\">Film设置</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-xs-10  pull-left\">\r\n");
      out.write("\t\t\t\t<h2 id=\"section-1\">用户管理</h2>\r\n");
      out.write("\t\t\t\t<hr style=\"width: 1; border: 1 dashed blue;\">\r\n");
      out.write("\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t客户列表 <a class=\"btn btn-primary\" href=\"customer.jsp\">新建</a>\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t<div class=\"table-responsive\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-bordered table-condensed\">\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>First Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Last Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Address</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Customer ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>LastUppdate</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");

							DaoImp daoImp = new DaoImp();
								ResultSet rs = daoImp.showCustomer();
								while (rs.next()) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"success\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><button class=\"btn btn-warning\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(rs.getShort(5));
      out.write("\" id=\"edit\">编辑</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-danger\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(rs.getShort(5));
      out.write("\" id=\"del\" onclick=\"del(this)\">删除</button></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(1));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(rs.getShort(5));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(rs.getDate(6));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<h2 id=\"section-2\">Film管理</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
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
