package guestbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.xmlparser.TreeNode;

import com.google.appengine.repackaged.org.json.JSONArray;
import com.google.appengine.repackaged.org.json.JSONException;
import com.google.appengine.repackaged.org.json.JSONObject;
import com.google.gson.Gson;




@SuppressWarnings("serial")
public class SectionsServlet extends HttpServlet {
	
	private static final Logger l =  Logger.getLogger(GuestbookServlet.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		 l.info("Inside SectionsServlet servlet");
		 List<TreeNode> aT = new ArrayList<TreeNode>();
		 
		 TreeNode aTreeNode = new TreeNode("Jobs");
		 aTreeNode.addAttribute("id", "jjj");
		 aTreeNode.addAttribute("text", "Jobs");
		 aTreeNode.addAttribute("cls", "folder");
		 aTreeNode.addAttribute("leaf", "false");
		// aTreeNode.
		//resp.setContentType("application/json");
		//resp.setCharacterEncoding("UTF-8");
		String callback = req.getParameter("callback");
		String enteredVal = req.getParameter("query");
		String from = req.getParameter("from");
		resp.setContentType("application/json");
		try {
			resp.getWriter().println(aT);
		} catch (Exception e) {
			l.severe(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resp.getWriter().println("cbfunc({"Title":"True Grit","Year":"1969","Rated":"G","Released":"11 Jun 1969","Genre":"Adventure, Western, Drama","Director":"Henry Hathaway","Writer":"Charles Portis, Marguerite Roberts","Actors":"John Wayne, Kim Darby, Glen Campbell, Jeremy Slate","Plot":"A drunken, hard-nosed U.S. Marshal and a Texas Ranger help a stubborn young woman track down her father's murderer in Indian territory.","Poster":"http://ia.media-imdb.com/images/M/MV5BMTYwNTE3NDYzOV5BMl5BanBnXkFtZTcwNTU5MzY0MQ@@._V1_SX320.jpg","Runtime":"2 hrs 8 mins","Rating":"7.3","Votes":"16092","ID":"tt0065126","Response":"True"});");
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		 l.info("Inside SectionsServlet servlet");
		 List<JsonTreeNode> aT = new ArrayList<JsonTreeNode>();
		 
		 String section = req.getParameter("section");
		 String section2 = req.getParameter("section2");
		 String section3 = req.getParameter("section3");
		 
		 JsonTreeNode aTreeNode = new JsonTreeNode();
		 JsonTreeNode aTreeNode2 = null;
		 JsonTreeNode aTreeNode3 = null;
		 
		 if (section.equals("jobs"))
		 {
			 aTreeNode.text ="All Jobs";
			 aTreeNode.id ="jjj";
			 aTreeNode.cls ="folder";
			 
		 }
		else if(section.equals("community"))
		{
		 aTreeNode.text ="All Community";
		 aTreeNode.id ="ccc";
		 aTreeNode.cls ="folder";
		}
		else if (section.equals("sale"))
		{
			aTreeNode.text ="All Sale";
			 aTreeNode.id ="sss";
			 aTreeNode.cls ="folder";
		}
		else if (section.equals("services"))
		{
			aTreeNode.text ="All Services";
			 aTreeNode.id ="bbb";
			 aTreeNode.cls ="folder";
		}
		
		if(section2!=null && section2.equals("housing"))
		{
			aTreeNode2 = new JsonTreeNode();
			aTreeNode2.text ="All Housing";
			aTreeNode2.id ="hhh";
			aTreeNode2.cls ="folder";
			aTreeNode3 = new JsonTreeNode();
			aTreeNode3.text ="All Gigs";
			aTreeNode3.id ="ggg";
			aTreeNode3.cls ="folder";
		}
		
		if(section3!=null && section3.equals("gigs"))
		{
			
			aTreeNode3 = new JsonTreeNode();
			aTreeNode3.text ="All Gigs";
			aTreeNode3.id ="ggg";
			aTreeNode3.cls ="folder";
		}
		 
		 SectionJson sS = new SectionJson();
		 sS.filterJson(section, aTreeNode);
		 		 aT.add(aTreeNode);
		 		 if (section2!=null)
		 		 {
		 			sS.filterJson(section2, aTreeNode2);
		 		 }
		 		 if(aTreeNode2!=null)
		 		aT.add(aTreeNode2);
		 		 
		 		 
		 		 if (section3!=null)
		 		 {
		 			sS.filterJson(section3, aTreeNode3);
		 		 }
		 		 if(aTreeNode3!=null)
		 		aT.add(aTreeNode3);
		 Gson gson = new Gson();
		 gson.toJson(aTreeNode);
//		 aTreeNode.
//		 aTreeNode.addAttribute("text", "Jobs");
//		 aTreeNode.addAttribute("cls", "folder");
//		 aTreeNode.addAttribute("leaf", "false");
		 JSONObject itemObj = new JSONObject(aTreeNode);
		// aTreeNode.
		//resp.setContentType("application/json");
		//resp.setCharacterEncoding("UTF-8");
		String callback = req.getParameter("callback");
		String enteredVal = req.getParameter("query");
		String from = req.getParameter("from");
		resp.setContentType("application/json");
		JSONArray a =  new JSONArray();
		a.put( itemObj);
//			JSONObject a = null;
//			a = new  JSONObject(itemObj);
		
		try {
			resp.getWriter().println(gson.toJson(aT));
		} catch (Exception e) {
			l.severe(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resp.getWriter().println("cbfunc({"Title":"True Grit","Year":"1969","Rated":"G","Released":"11 Jun 1969","Genre":"Adventure, Western, Drama","Director":"Henry Hathaway","Writer":"Charles Portis, Marguerite Roberts","Actors":"John Wayne, Kim Darby, Glen Campbell, Jeremy Slate","Plot":"A drunken, hard-nosed U.S. Marshal and a Texas Ranger help a stubborn young woman track down her father's murderer in Indian territory.","Poster":"http://ia.media-imdb.com/images/M/MV5BMTYwNTE3NDYzOV5BMl5BanBnXkFtZTcwNTU5MzY0MQ@@._V1_SX320.jpg","Runtime":"2 hrs 8 mins","Rating":"7.3","Votes":"16092","ID":"tt0065126","Response":"True"});");
	}
	
	
	
	
	
	private static String getJSONPObject(String callback, JSONObject s) throws JSONException {
	    return callback + "(" + s + ")";
	}
}
