package guestbook;

import java.io.IOException;

import javax.servlet.http.*;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class SignedOutServlet extends HttpServlet {
	 @Override
	    public void doGet(HttpServletRequest req, HttpServletResponse resp)
	              throws IOException {
	        UserService userService = UserServiceFactory.getUserService();
	        User user = userService.getCurrentUser();

	        if (user != null) {
	        	 resp.getWriter().println("Vous �tes bien d�connect�");
	        	resp.sendRedirect(userService.createLogoutURL(req.getRequestURI()));
	        	 
	        } 
	        else
	        	  resp.getWriter().println("Vous n'�tes pas encore connect�");
	    }
}

public class testclass
{
	public testclass()
	{
	
	}
}