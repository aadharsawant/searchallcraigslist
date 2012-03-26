package guestbook;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.org.json.JSONException;
import com.google.appengine.repackaged.org.json.JSONObject;



@SuppressWarnings("serial")
public class GuestbookServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		
		//resp.setContentType("application/json");
		//resp.setCharacterEncoding("UTF-8");
		String callback = req.getParameter("callback");
		String enteredVal = req.getParameter("query");
		resp.setContentType("text/plain");
		try {
			resp.getWriter().println(getJSONPObject( callback,  Readjson.filterJson(enteredVal)));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resp.getWriter().println("cbfunc({"Title":"True Grit","Year":"1969","Rated":"G","Released":"11 Jun 1969","Genre":"Adventure, Western, Drama","Director":"Henry Hathaway","Writer":"Charles Portis, Marguerite Roberts","Actors":"John Wayne, Kim Darby, Glen Campbell, Jeremy Slate","Plot":"A drunken, hard-nosed U.S. Marshal and a Texas Ranger help a stubborn young woman track down her father's murderer in Indian territory.","Poster":"http://ia.media-imdb.com/images/M/MV5BMTYwNTE3NDYzOV5BMl5BanBnXkFtZTcwNTU5MzY0MQ@@._V1_SX320.jpg","Runtime":"2 hrs 8 mins","Rating":"7.3","Votes":"16092","ID":"tt0065126","Response":"True"});");
	}
	
	
	
	
	
	private static String getJSONPObject(String callback, JSONObject s) throws JSONException {
	    return callback + "(" + s + ")";
	}
}
