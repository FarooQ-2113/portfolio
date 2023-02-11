import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class PerClientAccessCount extends HttpServlet {
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 HttpSession session = request.getSession(true);
 String header = "";
 Integer accessCount = (Integer) session.getAttribute("accessCount");
 if(accessCount == null) {
 accessCount = 0;
 session.setAttribute("accessCount", accessCount);
 header = "Welcome, New User";
 } else {
 header = "Welcome Back";
 accessCount++;
 session.setAttribute("accessCount", accessCount);
 }
 out.println("Session Id : " + session.getId());
 out.println("Session Creation Time : " + session.getCreationTime());
 out.println("Session Last Accessed Time : " + session.getLastAccessedTime());
 out.println("Access Count : " + accessCount);
 }
}