/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspCServletContext/1.0
 * Generated at: 2017-05-24 12:13:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
	public void jspInit()
	{
		System.out.println("LoginPage");
	}   
		

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n<html>\r\n   <head>\r\n      <title>Login Page for secret </title>\r\n      <link href=\"mycss.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n   </head>\r\n   <body>\r\n         User Login Page\r\n         <hr>\r\n         <br>\r\n\t\t \r\n\t\t");

		beans.LoginManager log = (beans.LoginManager) request.getAttribute("login");

		if(log != null)
		{
			
      out.write("\r\n\t\t\tLogin status was: <b> ");
      out.print( log.getLoginIncorrect() );
      out.write(" </b> \r\n\t\t\t");

		}
		
      out.write("\r\n\t\t \r\n        <form method=\"get\" action=\"welcome\">\r\n            <table class = \"center\">\r\n               <tr>\r\n                  <td align=\"right\">\r\n                     Username:\r\n                  </td>\r\n                  <td>\r\n\t\t\t\t  <input name=\"username\"  value=\"Username\"  size=\"15\">\r\n                  </td>\r\n               </tr>\r\n               <tr>\r\n                  <td align=\"right\">\r\n                     Password:\r\n                  </td>\r\n                  <td>\r\n                     <input type=\"password\" name=\"passie\"  value=\"Password\"  size=\"15\">\r\n                  </td>\r\n               </tr>\r\n               <tr>\r\n                  <td colspan = \"2\" align= \"right\">\r\n                      <input type=\"submit\" value=\"Inloggen\">\r\n                  </td>\r\n               </tr>   \r\n            </table>\r\n\t\t</form>\r\n   </body>\r\n</html>");
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
