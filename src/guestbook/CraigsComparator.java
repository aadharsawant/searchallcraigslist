package guestbook;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import com.google.appengine.repackaged.org.json.JSONException;
import com.google.appengine.repackaged.org.json.JSONObject;

public class CraigsComparator implements Comparator<JSONObject> {

	@Override
	public int compare(JSONObject o1, JSONObject o2) {
		SimpleDateFormat aSF = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		// TODO Auto-generated method stub
		DateFormat aDateFormat = DateFormat.getInstance();
		try {
			Date a1 =  aSF.parse(o1.getString("date"));
			Date a2 =  aSF.parse(o2.getString("date"));
		return 	a2.compareTo(a1);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
