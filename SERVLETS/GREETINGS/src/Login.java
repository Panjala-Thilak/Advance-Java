import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class Login extends HttpServlet
{
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		String name=request.getParameter("NAME");
		Calendar rightNow = Calendar.getInstance();
		int hour = rightNow.get(Calendar.HOUR_OF_DAY);
		response.setContentType("text/html");
		out.print("<html>");
		if(hour<12)
		{
			out.println("<body text=white background=m.jpg><font face=Bahnschrift SemiCondensed size=10 WELCOME </font>");
			out.print("<embed src=m.mp3 start=auto hidden=true>");
		out.print("<h2 align=center> Hii!!!..</h2>");
		out.print("<h2 align=center>"+name+"</h2>");
		out.print("<h2 align=center>Good Morning</h2></body>");

		}
		else if(hour>=12&&hour<16)
		{
			out.println("<body text=white background=a.jpg><font face=Bahnschrift SemiCondensed size=10 WELCOME </font>");
			out.print("<embed src=a.mp3 start=auto hidden=true>");
		out.print("<h2 align=center> Hii!!!..</h2>");
		out.print("<h2 align=center>"+name+"</h2>");
		out.print("<h2 align=center>Good Afternoon</h2></body>");
		}
		else if(hour>=16 &&hour<22)
		{
			
			out.println("<body text=white background=e.jpg><font face=Bahnschrift SemiCondensed size=10 WELCOME </font>");
			out.print("<embed src=e.mp3 auto=start hidden=true>");
		out.print("<h2 align=center> Hii!!!..</h2>");
		out.print("<h2 align=center>"+name+"</h2>");
		out.print("<h2 align=center>Good Evening</h2></body>");

		}
		else
		{
			
			out.println("<body background=n.jpg text=white><font face=Bahnschrift SemiCondensed size=10 WELCOME </font>");
			out.print("<embed src=n.mp3 start=auto hidden=true>");
		out.print("<h2 align=center> Hii!!!..</h2>");
		out.print("<h2 align=center>"+name+"</h2>");
		out.print("<h2 align=center>Good Evening</h2></body>");

		}
		out.print("</html>");
		out.close();
	}
}