import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class RegisterServlet extends HttpServlet
{
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("FIRSTNAME");
		String lname=request.getParameter("LASTNAME");
		String gen=request.getParameter("GENDER");
		String bd=request.getParameter("BirthDay");
		String bm=request.getParameter("BirthdayMonth");
		String by=request.getParameter("BirthdayYear");
		String add=request.getParameter("Address");
		String col=request.getParameter("college");
		String yog=request.getParameter("YearOfGraduation");
		String  mno=request.getParameter("MobileNumber");
		String email=request.getParameter("Email");
		Connection con=null;
		PreparedStatement pst=null;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		pst=con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1,fname);
		pst.setString(2,lname);
		pst.setString(3,gen);
		pst.setString(4,bd);
		pst.setString(5,bm);
		pst.setString(6,by);
		pst.setString(7,add);
		pst.setString(8,col);
		pst.setString(9,yog);
		pst.setString(10,mno);
		pst.setString(11,email);
		pst.execute();

	out.print("<h1 align=center>Mr|Mrs."+fname+"U R Registered Successfully..!</h1>");
			
		}
		catch (ClassNotFoundException s)
		{
			out.print(s);
		}
		catch(SQLException se)
		{
			out.print(se);
		}
		finally
		{
			try
			{
				if(pst!=null)
					pst.close();
				if(con!=null);
				con.close();
			}
			catch (Exception e)
			{
				out.print(e);
			}
		}
		out.close();
	}
}