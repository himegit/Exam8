package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/in.html");
  }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>创建customer</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
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
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <disv class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <h5 class=\"navbar-brand\" href=\"#\">8815</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("    </disv>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<script src=\"jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(\"#mytab a\").click(function (e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $(this).tab(\"show\");\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<div id=\"divleft\"></div>\r\n");
      out.write("\t<h3>基本信息</h3>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<div id=\"divright\">\r\n");
      out.write("\t<form aciton=\"\" method=\"post\">\r\n");
      out.write("\t\t<table boder=\"1px solid black\">\r\n");
      out.write("\t\t\t<tr></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
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
