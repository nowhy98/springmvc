/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.86
 * Generated at: 2020-04-18 02:48:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>用户列表</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link href=\"/static/bootstrap-3.3.7-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"/static/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/bootstrap-3.3.7-dist/css/fresh-bootstrap-table.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"/static/js/bootstrap-table.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    ");

        pageContext.setAttribute("APP_PATH", request.getContextPath());
    
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"toolbar\" class=\"btn-group\">\r\n");
      out.write("    <button  id=\"btn_add\" type=\"button\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#add\">\r\n");
      out.write("        <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\" ></span>新增\r\n");
      out.write("    </button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"add\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <form method=\"post\" action=\"http://localhost:8083/save\" id=\"ff\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                    <h4 class=\"modal-title\">新增用户</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"姓名\" name=\"name\"  class=\"form-control\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"手机号\" name=\"phone\"  class=\"form-control\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"地址\" name=\"address\" class=\"form-control\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" value=\"保存\" >\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"edit\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <form action=\"http://localhost:8083/edit\" method=\"post\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                    <h4 class=\"modal-title\">修改用户信息</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"editBookModal\" class=\"modal-body\">\r\n");
      out.write("                    <div class=\"form-horizontal\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"editBookName\" class=\"col-sm-2 control-label\">编号:</label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input class=\"form-control\" readonly=\"readonly\" name=\"id\" id=\"id\" type=\"text\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"editBookName\" class=\"col-sm-2 control-label\">姓名:</label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input class=\"form-control\" name=\"name\" id=\"name\" type=\"text\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"editBookAuthor\" class=\"col-sm-2 control-label\">手机号:</label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input class=\"form-control\" id=\"phone\" name=\"phone\" type=\"phone\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"editBookPrice\" class=\"col-sm-2 control-label\">地址:</label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input class=\"form-control\" id=\"address\" name=\"address\" type=\"text\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <div class=\"center-block\">\r\n");
      out.write("                        <button id=\"cancelEdit\" type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                        <input id=\"saveEdit\" type=\"submit\" class=\"btn btn-success\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"del\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">确认要删除吗？</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <input id=\"del\" type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\" value=\"删除\" onclick=\"del()\" />\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"lj\" value=\"${pageContext.request.contextPath}\" />\r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("    <h1 align=\"center\">用户信息增删改查</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row main\">\r\n");
      out.write("        <div class=\"col-md-3 nav\">\r\n");
      out.write("            <div id=\"tree\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-9 content\">\r\n");
      out.write("            <div class=\"content-body\">\r\n");
      out.write("                <table class=\"table\" id=\"table\"></table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"/static/js/list.js\"></script>\r\n");
      out.write("</html>\r\n");
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
