package App1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	//use service method when creating servlets not any other method
	//more- severs provide services
	//pass request(fetch data from client) and response object(respond to client)
	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		
		int k =i+j;
		PrintWriter out = res.getWriter();
		
		out.println("The answer is " + k);
	}

}
