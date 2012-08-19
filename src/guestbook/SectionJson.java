package guestbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import sun.misc.IOUtils;

import com.google.appengine.repackaged.org.json.JSONArray;
import com.google.appengine.repackaged.org.json.JSONObject;

//import sun.misc.IOUtils;

public class SectionJson {
	
	//String content = new Scanner(Readjson.class.getResourceAsStream("airports.txt")).useDelimiter("\\Z").next();

public   JSONObject filterJson(String enteredVal,JsonTreeNode parent) {
//ClassLoader cl = Readjson.class.getClassLoader();

	

JSONObject filterJSONObject = new JSONObject();

if (enteredVal == null || enteredVal.equalsIgnoreCase(""))
	
{
//	if(!from.equals("dataview"))
//	return filterJSONObject ;
}
//try {
	

//InputStream is = cl.getResourceAsStream("airports.txt");
try {
//	fis = new FileInputStream("airports.txt");
//
//	//try {
//		InputStreamReader in = new InputStreamReader(fis, "UTF-8");
//		
	
	
	String content = new Scanner(SectionJson.class.getResourceAsStream("section.txt")).useDelimiter("\\Z").next();
	//System.out.println(content);
	
	

		
		//InputStream input = Readjson.class.getResourceAsStream("airports.txt");
		
	//	String s = IOUtils.toString( input );

		
//String s =  input.toString();
JSONObject json = new JSONObject(content);

JSONArray jarray = json.getJSONArray("sections");

JSONArray filterArray = new JSONArray();



//System.out.println("ssssssss" + searchresults.optString("count", ""));
//JSONArray jarray = searchresults.getJSONArray("URI");
for(int i=0 ; i < jarray.length(); i++) {
	JSONObject aJSONObject = jarray.getJSONObject(i);
	JsonTreeNode child = new JsonTreeNode();
	String loc = aJSONObject.getString("location");
//	String code = aJSONObject.getString("code");
//	String name = aJSONObject.getString("name");
	if(loc.toLowerCase().contains(enteredVal.toLowerCase())
			){
		
		child.id = aJSONObject.getString("code");
		child.text = aJSONObject.getString("name");
		child.cls ="file";
		child.leaf = "true";
		parent.children.add(child);
	//	filterArray.put(aJSONObject);
		continue;
	}
	
}
	
	






} catch(Exception e) {
e.printStackTrace();
}
return filterJSONObject;
}



}