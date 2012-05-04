package guestbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import sun.misc.IOUtils;

import com.google.appengine.repackaged.org.json.JSONArray;
import com.google.appengine.repackaged.org.json.JSONException;
import com.google.appengine.repackaged.org.json.JSONObject;

//import sun.misc.IOUtils;

public class CraigsListReadjson {
	
	//String content = new Scanner(Readjson.class.getResourceAsStream("airports.txt")).useDelimiter("\\Z").next();

public   JSONObject filterJson(List<String> lListJon,String offset ,String limit) {
//ClassLoader cl = Readjson.class.getClassLoader();

	

JSONObject filterJSONObject = new JSONObject();
List<JSONObject> alist = new ArrayList<JSONObject>();
Boolean nextPage =false ;
int totalCount = 0;
int count1 =0;


if (lListJon == null || lListJon.size()==0)
{
	return filterJSONObject ;
}
//try {
	
for (String craigsListJon:lListJon )
{
//InputStream is = cl.getResourceAsStream("airports.txt");
try {
//	fis = new FileInputStream("airports.txt");
//
//	//try {
//		InputStreamReader in = new InputStreamReader(fis, "UTF-8");
//		
	
	
	String content = craigsListJon;
	//System.out.println(content);
	
	

		
		//InputStream input = Readjson.class.getResourceAsStream("airports.txt");
		
	//	String s = IOUtils.toString( input );

		
//String s =  input.toString();
JSONObject json = new JSONObject(content);
JSONArray jarray  = new JSONArray ();
String count = json.getJSONObject("query").getString("count");
count1 = new Integer(count);
totalCount =totalCount+ count1;
if((count1==100) && (!nextPage))
{
	nextPage=true;
}

if (count1>1)
 jarray = json.getJSONObject("query").getJSONObject("results").getJSONArray("RDF");
else if (count1==1)
{
	jarray.put(json.getJSONObject("query").getJSONObject("results").getJSONObject("RDF"));
	//filterJSONObject.accumulate("items", new JSONObject());
}
else 
{
	filterJSONObject.accumulate("items", new JSONObject());
}

//String count = json.getJSONObject("query").getString("count");

JSONArray filterArray = new JSONArray();

int off = new Integer(offset);
int lim = new Integer(limit);
int loopTill = lim+off ;
if (count1<loopTill)
{
	loopTill = count1 ;
}
//System.out.println("ssssssss" + searchresults.optString("count", ""));
//JSONArray array = searchresults.getJSONArray("URI");
for(int i=0 ; i < jarray.length(); i++) {
	JSONObject aJSONObject = jarray.getJSONObject(i);
	JSONObject item = aJSONObject.getJSONObject("item");
	String link = item.getString("link");
	JSONArray title = item.getJSONArray("title");
	JSONObject bJSONObject = new JSONObject();
	bJSONObject.put("link", link);
	String city = link.substring(7, link.indexOf("."));
	
	String titleS = title.getString(0);
	bJSONObject.put("title", titleS);
	bJSONObject.put("city", city);
	
	String date = item.getString("date");
	bJSONObject.put("date", date);
//	if(loc.toLowerCase().contains(craigsListJon.toLowerCase())
//			){
		//System.out.println("jarray [" + i + "] --------" + titleS);
		//filterJSONObject.accumulate("items", bJSONObject);
		alist.add(bJSONObject);
		
	//	filterArray.put(aJSONObject);
		continue;
//	}
//	else if (code.toLowerCase().contains(craigsListJon.toLowerCase()))
//	{
//		filterJSONObject.accumulate("airports", aJSONObject);
//		continue;
//	}
//	else if (name.toLowerCase().contains(craigsListJon.toLowerCase()))
//	{
//		filterJSONObject.accumulate("airports", aJSONObject);
//		continue;
//	}
	
	
	
}
}




 catch(Exception e) {
e.printStackTrace();
}
System.out.println("jarray [" + "] --------" + filterJSONObject.toString());
}
//Collections.sort(alist, new CraigsComparator());
//int count1 = new Integer(count);
int limit1  = new Integer(limit);
int offset1 = new Integer(offset);
int countFinal = count1;
//if (count1 == limit1)
if (count1 > 0)
	countFinal = limit1+offset1+1;
try {
	filterJSONObject.put("items", alist);
	if(nextPage)
	{
		totalCount++;
	}
	filterJSONObject.put("totalProperty", countFinal);
} catch (JSONException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return filterJSONObject;
}



}