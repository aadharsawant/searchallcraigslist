package guestbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class CraigslistSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String query = "cricketer sachin tendulkar";
        String API_KEY="xxxxx";//get your own key
        URL url;
        try {
        	
        	
        	
            query = URLEncoder.encode(query, "UTF-8");
            url = new URL("http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter')%20and%20type%20%3D%20'web'%20and%20query%20%3D%20'html'%20%20%20limit%20100%20offset%200&format=json");
            URLConnection connection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection
                    .getInputStream()));
            String inputLine = "";
            while ((inputLine = in.readLine()) != null) {
                    System.out.println( inputLine);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
