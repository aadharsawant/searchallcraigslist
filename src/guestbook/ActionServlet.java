package guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("serial")
public class ActionServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		
		try {
			req.getRequestDispatcher("/web/html/travel.html").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	resp.sendRedirect("/web/html/travel.html");
		
		//resp.getWriter().println("cbfunc({"Title":"True Grit","Year":"1969","Rated":"G","Released":"11 Jun 1969","Genre":"Adventure, Western, Drama","Director":"Henry Hathaway","Writer":"Charles Portis, Marguerite Roberts","Actors":"John Wayne, Kim Darby, Glen Campbell, Jeremy Slate","Plot":"A drunken, hard-nosed U.S. Marshal and a Texas Ranger help a stubborn young woman track down her father's murderer in Indian territory.","Poster":"http://ia.media-imdb.com/images/M/MV5BMTYwNTE3NDYzOV5BMl5BanBnXkFtZTcwNTU5MzY0MQ@@._V1_SX320.jpg","Runtime":"2 hrs 8 mins","Rating":"7.3","Votes":"16092","ID":"tt0065126","Response":"True"});");
	}
	
	
	
	
	
	
}
