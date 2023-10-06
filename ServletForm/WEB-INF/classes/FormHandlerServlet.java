import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FormHandlerServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		String file = request.getParameter("file");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String[] hobbies = request.getParameterValues("hobby");
		String address = request.getParameter("addr");
		
		out.println("<HTML>");
	    out.println("<BODY style=\"border: 1px solid black; padding:1rem 3rem; width:80%; margin-left:5rem;text-align:center \">");
		
		out.println("<h2 style=\"color:green\"><strong>Form Submitted Successfully !<strong></h2>");
		out.println("<h3 style=\"text-decoration: underline;\"><strong>Details of User</strong></h3>");
         
		if (email.isBlank()) {
			out.println("<p>Email: Email not given </p>");
		} else {
			out.println("<p>Email: " + email + "</p>");
		}
		
		if (password.isBlank()) {
			out.println("<p>Password: Password not given </p>");
		} else {
			out.println("<p>Password: " + password + "</p>");
		}
		
		if (confirmpassword.isBlank() || confirmpassword == null) {
			out.println("<p>Confirm Password: Password not given </p>");
		} else {
			if (confirmpassword.equals(password)){
				out.println("<p>Confirm Password: " + confirmpassword + " --Password match </p>");
			} else{
				out.println("<p> Confirm Password: " + confirmpassword + " --Password do not match </p>");
		}
		}
		
		if (file.isBlank()) {
			out.println("<p>File: File not given </p>");
		} else {
			out.println("<p>File: " + file + "</p>");
		}
		
		if (gender == null) {
			out.println("<p>Gender: Gender not given </p>");
		} else {
			out.println("<p>Gender: " + gender + "</p>");
		}
		
		if (country == null) {
			out.println("<p>Country: Country not given </p>");
		} else {
			out.println("<p>Country: " + country + "</p>");
		}
		
		if (hobbies == null) {
			out.println("<p>Hobby: Hobby not given </p>");
		} else {
			out.println("<p>Hobby: " + Arrays.stream(hobbies).collect(Collectors.joining(",")) +  "</p>");
		}
		
		if (address.isBlank()) {
			out.println("<p>Address: Address not given </p>");
		} else {
			out.println("<p>Address: " + address + "</p>");
		}
		
		out.println("</BODY>");
        out.println("</HTML>");
	}
}