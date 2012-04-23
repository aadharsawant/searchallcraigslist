package guestbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.org.json.JSONException;
import com.google.appengine.repackaged.org.json.JSONObject;



@SuppressWarnings("serial")
public class CaliforniaServlet extends HttpServlet {
	
	
	public static final List <String> allusa = Arrays.asList("'sfbay'","'bakersfield'","'chico'","'fresno'","'goldcountry'","'hanford'","'humboldt'","'imperial'","'inlandempire'","'losangeles'","'mendocino'","'merced'",
			"'modesto'",
			"'monterey'",
			"'orangecounty'",
			"'palmsprings'",
			"'redding'",
			"'reno'",
			"'sacramento'",
			"'sandiego'",
			"'slo'",
			"'santabarbara'",
			"'santamaria'",
			"'siskiyou'",
			"'stockton'",
			"'susanville'",
			"'ventura'",
			"'visalia'",
			"'yubasutter'",
			"'auburn'","'bham'","'dothan'","'shoals'","'gadsden'","'huntsville'","'mobile'","'montgomery'","'tuscaloosa'" ,
			"'anchorage'",
			"'fairbanks'",
			"'kenai'",
			"'juneau'",
			//arizona
			"'flagstaff'",
			"'mohave'",
			"'phoenix'",
			"'prescott'",
			"'showlow'",
			"'sierravista'",
			"'tucson'",
			"'yuma'",
			//arkansas
			"'fayar'",
			"'fortsmith'",
			"'jonesboro'",
			"'littlerock'",
			"'texarkana'",
			//colorado
			"'boulder'",
			"'cosprings'",
			"'denver'",
			"'eastco'",
			"'fortcollins'",
			"'rockies'",
			"'pueblo'",
			"'westslope'",
			//connecticut
			"'newlondon'",
			"'hartford'",
			"'newhaven'",
			"'nwct'",
			//delaware
			"'delaware'",
			//District of colubia
			"'washingtondc'",
			//florida
			"'daytona'",
			"'keys'",
			"'fortlauderdale'",
			"'fortmyers'",
			"'gainesville'",
			"'cfl'",
			"'jacksonville'",
			"'lakeland'",
			"'lakecity'",
			"'ocala'",
			"'okaloosa'",
			"'orlando'",
			"'panamacity'",
			"'pensacola'",
			"'sarasota'",
			"'miami'",
			"'spacecoast'",
			"'staugustine'",
			"'tallahassee'",
			"'tampa'",
			"'treasure'",
			"'westpalmbeach'",
			//hawai
			"'honolulu'",
			//idaho
			"'boise'",
			"'eastidaho'",
			"'lewiston'",
			"'twinfalls'",
			//illionis
			"'bn'",
			"'chambana'",
			"'chicago'",
			"'decatur'",
			"'lasalle'",
			"'mattoon'",
			"'peoria'",
			"'rockford'",
			"'carbondale'",
			"'springfieldil'",
			"'quincy'",
			//indiana
			"'bloomington'",
			"'evansville'",
			"'fortwayne'",
			"'indianapolis'",
			"'kokomo'",
			"'tippecanoe'",
			"'muncie'",
			"'richmondin'",
			"'southbend'",
			"'terrehaute'",
			//iowa
			"'ames'",
			"'cedarrapids'",
			"'desmoines'",
			"'dubuque'",
			"'fortdodge'",
			"'iowacity'",
			"'masoncity'",
			"'quadcities'",
			"'siouxcity'",
			"'ottumwa'",
			"'waterloo'"
			
			);
	public static final List <String> california = Arrays.asList("'sfbay'","'bakersfield'","'chico'","'fresno'","'goldcountry'","'hanford'","'humboldt'","'imperial'","'inlandempire'","'losangeles'","'mendocino'","'merced'",
			"'modesto'",
			"'monterey'",
			"'orangecounty'",
			"'palmsprings'",
			"'redding'",
			"'reno'",
			"'sacramento'",
			"'sandiego'",
			"'slo'",
			"'santabarbara'",
			"'santamaria'",
			"'siskiyou'",
			"'stockton'",
			"'susanville'",
			"'ventura'",
			"'visalia'",
			"'yubasutter'");
	
	public static final List <String> alabama = Arrays.asList(
			"'auburn'","'bham'","'dothan'","'shoals'","'gadsden'","'huntsville'","'mobile'","'montgomery'","'tuscaloosa'" 
			);
	
	
	public static final List <String> alaska = Arrays.asList(
			"anchorage",
			"fairbanks",
			"kenai",
			"juneau" 
			);
	
	
	public static final List <String> arizona = Arrays.asList(
			"flagstaff",
			"mohave",
			"phoenix",
			"prescott",
			"showlow",
			"sierravista",
			"tucson",
			"yuma" 
			);
	
	
	public static final List <String> arkansas = Arrays.asList(
			//arkansas
			"'fayar'",
			"'fortsmith'",
			"'jonesboro'",
			"'littlerock'",
			"'texarkana'"
			);
	
	
	public static final List <String> colorado = Arrays.asList(
			"'boulder'",
			"'cosprings'",
			"'denver'",
			"'eastco'",
			"'fortcollins'",
			"'rockies'",
			"'pueblo'",
			"'westslope'"
			);
	
	
	
	public static final List <String> connecticut = Arrays.asList(
			"'newlondon'",
			"'hartford'",
			"'newhaven'",
			"'nwct'"
			);
	
	public static final List <String> delaware = Arrays.asList(
			"'delaware'"
			);
	public static final List <String> districtOfColumbia = Arrays.asList(
			"'washingtondc'"
			);
	public static final List <String> florida = Arrays.asList(
			"'daytona'",
			"'keys'",
			"'fortlauderdale'",
			"'fortmyers'",
			"'gainesville'",
			"'cfl'",
			"'jacksonville'",
			"'lakeland'",
			"'lakecity'",
			"'ocala'",
			"'okaloosa'",
			"'orlando'",
			"'panamacity'",
			"'pensacola'",
			"'sarasota'",
			"'miami'",
			"'spacecoast'",
			"'staugustine'",
			"'tallahassee'",
			"'tampa'",
			"'treasure'",
			"'westpalmbeach'"
			);
	
	
	public static final List <String> hawai = Arrays.asList(
			"'honolulu'"
			);
	
	
	public static final List <String> idaho = Arrays.asList(
			"'boise'",
			"'eastidaho'",
			"'lewiston'",
			"'twinfalls'"
			);
	public static final List <String> illionios = Arrays.asList(
			"'bn'",
			"'chambana'",
			"'chicago'",
			"'decatur'",
			"'lasalle'",
			"'mattoon'",
			"'peoria'",
			"'rockford'",
			"'carbondale'",
			"'springfieldil'",
			"'quincy'"
			);
	public static final List <String> indiana = Arrays.asList(
			"'bloomington'",
			"'evansville'",
			"'fortwayne'",
			"'indianapolis'",
			"'kokomo'",
			"'tippecanoe'",
			"'muncie'",
			"'richmondin'",
			"'southbend'",
			"'terrehaute'"
			);
	public static final List <String> iowa = Arrays.asList(
			"'ames'",
			"'cedarrapids'",
			"'desmoines'",
			"'dubuque'",
			"'fortdodge'",
			"'iowacity'",
			"'masoncity'",
			"'quadcities'",
			"'siouxcity'",
			"'ottumwa'",
			"'waterloo'"
			);
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		//String query = "cricketer sachin tendulkar";
        String API_KEY="xxxxx";//get your own key
        URL url;
        try {
        	
        	String callback = req.getParameter("callback");
        	String offset = req.getParameter("start");
        	String query = req.getParameter("query");
        	String inType = req.getParameter("inType");
        	String addOne = req.getParameter("addOne");
        	String addTwo = req.getParameter("addTwo");
        	String addThree = req.getParameter("addThree");
        	String addFour = req.getParameter("addFour");
        	String addFive = req.getParameter("addFive");
        	String hasPic = req.getParameter("hasPic");
        	String itemDate = req.getParameter("byDate");
        	String urlParams = "";
        	if (addOne!=null && (!addOne.equals("")))
        	{
        		
        		
        		
        		urlParams = urlParams +
        	        	"%20and%20addOne%20%3D%20'telecommuting'" ;
        	}
        	if (addTwo!=null && (!addTwo.equals("")))
        	{
        		urlParams = urlParams +
        	        	"%20and%20addTwo%20%3D%20'"+addTwo+"'" ;
        	}
        	if (addThree!=null && (!addThree.equals("")))
        	{
        		urlParams = urlParams +
        	        	"%20and%20addThree%20%3D%20'"+addThree +"'";
        	}
        	if (addFour!=null && (!addFour.equals("")))
        	{
        		urlParams = urlParams +
        	        	"%20and%20addFour%20%3D%20'"+addFour+"'" ;
        	}
        	if (addFive!=null && (!addFive.equals("")))
        	{
        		urlParams = urlParams +
        	        	"%20and%20addFive%20%3D%20'"+addFive+"'" ;
        	}
        	if (hasPic!=null && (!hasPic.equals("")))
        	{
        		urlParams = urlParams +
        	        	"%20and%20hasPic%20%3D%20'"+hasPic+"'" ;
        	}
//        	String urlParams =
//        	"%20and%addOne%20%3D%20'"+addOne +"%20and%addTwo%20%3D%20'"+addTwo + "%20and%addThree%20%3D%20'"+addThree + "%20and%addFour%20%3D%20'"+addFour +"%20and%addFive%20%3D%20'"+addFive + "%20and%hasPic%20%3D%20'"+hasPic;
        	
        	
        	
        	String states = join(allusa,"%2C%0A");
        	//http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table(5000)%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter')%20and%20type%20%3D%20'web'%20%20and%20query%20%3D%20'html'%20and%20addOne%20%3D%20'telecommuting'%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)&format=json&callback=cbfunc
        	if (query=="")
        	{
        		query = "%20";
        	}
        	if (offset.equals(""))
        		offset = "0";
        	String limit = req.getParameter("limit");
        	if (limit.equals(""))
        		limit = "100";
        	if (offset!=null && (!offset.equals("0")))
        	{
        		//item.date%3C'2012-04-18T20%3A19%3A06-07%3A00'
        		urlParams = urlParams +
        	        	"%20and%20item.date%3C'"+itemDate+"'" ;
        	}
        	
        	
        	
//http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter'%2C'auburn'%2C'bham'%2C'dothan'%2C'shoals'%2C'gadsden'%2C'huntsville'%2C'mobile'%2C'montgomery'%2C'tuscaloosa')%20and%20type%20%3D%20'vol'%20and%20query%20%3D%20'%20'%20%20%20%7C%20sort(field%3D%22item.date%22)%20%20%7C%20truncate%20(100)&format=json&callback=cbfunc        	
        	
//http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter'%2C'auburn'%2C'bham'%2C'dothan'%2C'shoals'%2C'gadsden'%2C'huntsville'%2C'mobile'%2C'montgomery'%2C'tuscaloosa'%2C'anchorage'%2C%0A'fairbanks'%2C%0A'kenai'%2C%0A'juneau'%2C%0A%0A'flagstaff'%2C%0A'mohave'%2C%0A'phoenix'%2C%0A'prescott'%2C%0A'showlow'%2C%0A'sierravista'%2C%0A'tucson'%2C%0A'yuma')%20and%20type%20%3D%20'vol'%20and%20query%20%3D%20'html'%20%20and%20item.date%3C'2012-04-18T20%3A19%3A06-07%3A00'%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate(100)&format=json&callback=cbfunc        	
        	
           // query = URLEncoder.encode(query, "UTF-8");
            url = new URL("http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml"
            		+ "%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20("+states+")%20and%20type%20%3D%20'"+inType+"'%20and%20query%20%3D%20'"
            		+query+ "'"+urlParams+ "%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate("+limit+")&format=json");
            //"%20%20%20limit%20"+limit+"%20offset%20"+offset+
            
       //http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table(5000)%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter')%20and%20type%20%3D%20'web'%20%20and%20query%20%3D%20'%20'%20and%20addOne%20%3D%20'telecommuting'&format=json&callback=cbfunc     
            
           // http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table(5000)%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter')%20and%20type%20%3D%20'web'%20%20and%20query%20%3D%20'%20'&format=json&callback=cbfunc
            
            
            
          //  http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%2Clocation%20FROM%20craig_table%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter')%20and%20type%20%3D%20'web'%20and%20query%20%3D%20'html'%20%20%20limit%20100%20offset%200&format=json&callback=cbfunc    
            
            
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(200000000);
            connection.setReadTimeout(200000000);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection
                    .getInputStream()));
            String inputLine = "";
            String s = "";
            while ((inputLine = in.readLine()) != null) {
                   // System.out.println( inputLine);
                    s = inputLine ;
                }
            
            resp.setContentType("text/plain");
    		try {
    			
    			CraigsListReadjson aCraigsListReadjson = new CraigsListReadjson();
    			resp.getWriter().println( callback + '(' + aCraigsListReadjson.filterJson(s,offset,limit) +')' );
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	
	
	static String join(Collection<?> s, String delimiter) {
	     StringBuilder builder = new StringBuilder();
	     Iterator iter = s.iterator();
	     while (iter.hasNext()) {
	         builder.append(iter.next());
	         if (!iter.hasNext()) {
	           break;                  
	         }
	         builder.append(delimiter);
	     }
	     return builder.toString();
	 }

	
	
	private static String getJSONPObject(String callback, JSONObject s) throws JSONException {
	    return callback + "(" + s + ")";
	}
}
