package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.CalculatorBean;
@SuppressWarnings("serial")
public class CalculateServlet extends HttpServlet
{
   public void init() throws ServletException
   {
      super.init();
      log("servlet init");
   }
   
   public void destroy()
   {
      log("servlet destroy");
      super.destroy();
   }
   
   public void doGet(HttpServletRequest request,HttpServletResponse response)
                                         throws ServletException, IOException
   {
	  String sx = request.getParameter("xvalue");
	  String sy = request.getParameter("yvalue");
	  String url = "";
	  
	  CalculatorBean cb = new CalculatorBean();
	  cb.setXvalue(sx);
	  cb.setYvalue(sy);
	  if(cb.xisValid() && cb.yisValid())
	  {
		  request.setAttribute("calc", cb);
		  url = "calculate1.jsp";
	  }
	  else {
		  System.out.println("X & Y ARE INVALID");
		  request.setAttribute("calc", cb);
		  url = "formdemo.html";
	  }
		  
 
	  RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	  dispatcher.forward(request, response);
  }
}

