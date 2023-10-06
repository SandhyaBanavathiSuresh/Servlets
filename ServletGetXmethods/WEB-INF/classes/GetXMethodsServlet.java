import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetXMethodsServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		
		out.println("<div style=\"border: 1px solid black; padding:1rem 3rem; width:80%; margin-left:5rem\">");
		
		out.println("<h2>Get X Methods from HttpServletRequest class</h2>");
		
		out.println("<h4>Auth Type</h2>");
		out.println(request.getAuthType());
		
		out.println("<h4>Context Path</h2>");
		out.println(request.getContextPath());
		
		out.println("<h4>Request Method</h2>");
        out.println(request.getMethod());
		
		out.println("<h4>Path Info</h2>");
		out.println(request.getPathInfo());
		
		out.println("<h4>Path Translated</h2>");
		out.println(request.getPathTranslated());
		
		out.println("<h4>Query String</h2>");
		out.println(request.getQueryString());

        out.println("<h4>Request URL</h2>");
        out.println(request.getRequestURL());

        out.println("<h4>Servlet Path</h2>");
        out.println(request.getServletPath());
		
		out.println("<br> <br>");
		
		out.println("<h2>Get X Methods from super interface ServletRequest</h2>");
		
		out.println("<h4>Character Encoding</h2>");
        out.println(request.getCharacterEncoding());
		
		out.println("<h4>Content Length</h2>");
        out.println(request.getContentLength());
		
		out.println("<h4>ContentType</h2>");
        out.println(request.getContentType());

        out.println("<h4>Protocol</h2>");
        out.println(request.getProtocol());
		
		out.println("<h4>Scheme</h2>");
        out.println(request.getScheme());
		
		out.println("<h4>Server Name</h2>");
        out.println(request.getServerName());
		
		out.println("<h4>ServerPort</h2>");
        out.println(request.getServerPort());

        out.println("<h4>Remote Address</h2>");
        out.println(request.getRemoteAddr());

        out.println("<h4>Remote Host</h2>");
        out.println(request.getRemoteHost());

        out.println("<h4>Remote Port</h2>");
        out.println(request.getRemotePort());

        out.println("<h4>Local Address</h2>");
        out.println(request.getLocalAddr());

        out.println("<h4>Local Name</h2>");
        out.println(request.getLocalName());
		
		out.println("<h4>Local Port</h2>");
        out.println(request.getLocalPort());

        out.println("<h4>Server Name</h2>");
        out.println(request.getServerName());

        out.println("<h4>Server Port</h2>");
        out.println(request.getServerPort());
		
		out.println("</div>");
		
		out.println("</html>");
		out.println("</body>");
	}
}