package guestbook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import sun.java2d.pipe.RegionSpanIterator;



@SuppressWarnings("serial")
public class ClassifiedAdsCodes  {
	
	
	
	
	
	
	public  final Map<String,String> sectionMap = new HashMap <String,String>();
	public  final Map<String,String> categoryBkpMap = new HashMap <String,String>();
	
	
	private static ClassifiedAdsCodes aCraigsRegions = null ;
	
	
	
	
	private static final Logger l =  Logger.getLogger(ClassifiedAdsCodes.class.getName());

	private ClassifiedAdsCodes() {
		super();
	
		
		
		
		
		sectionMap.put("sss", "4");//all sale
		sectionMap.put("ppa", "13");//applicances
		sectionMap.put("ata", "1");//antiques
		sectionMap.put("bar", "4");//barter
		sectionMap.put("bia", "220");//bikes
		sectionMap.put("boo", "327");
		sectionMap.put("bka", "4");
		sectionMap.put("bfa", "4");
		sectionMap.put("sya", "4");
		sectionMap.put("zip", "4");
		sectionMap.put("fua", "4");
		sectionMap.put("foa ","4");
		sectionMap.put("jwa", "4");
		sectionMap.put("maa", "4");
		sectionMap.put("rva", "4");
		sectionMap.put("sga", "4");
		sectionMap.put("tia", "4");
		sectionMap.put("wan", "4");
		sectionMap.put("ara", "4");
		sectionMap.put("pta", "4");
		sectionMap.put("baa", "4");
		sectionMap.put("haa", "4");
		  
		
		sectionMap.put("ema", "4");
		sectionMap.put("moa", "4");
		sectionMap.put("cla", "4");
		sectionMap.put("cba", "4");
		sectionMap.put("ela", "4");
		sectionMap.put("gra", "4");
		sectionMap.put("gms", "4");
		sectionMap.put("hsa", "4");
		sectionMap.put("mca", "470");
		sectionMap.put("msa", "4");
		sectionMap.put("taa", "4");
		sectionMap.put("vga", "4");
		sectionMap.put("pha", "4");
		
		
		sectionMap.put("tla", "336");
		sectionMap.put("cto", "336");
		sectionMap.put("ctd", "336");
		
		//jobs
		sectionMap.put("jjj", "4");
		sectionMap.put("ctd", "4");
		sectionMap.put("acc", "4");
		sectionMap.put("ofc","4");
		sectionMap.put("egr","4");
		sectionMap.put("med","4");
		sectionMap.put("sci", "4");
		sectionMap.put("bus","4");
		sectionMap.put("csr","4");
		sectionMap.put("edu", "4");
		sectionMap.put("fbh", "4");
		sectionMap.put("lab", "4");
		sectionMap.put("gov", "4");
		sectionMap.put("hum", "4");
		sectionMap.put("eng", "4");
		sectionMap.put("lgl", "4");
		sectionMap.put("mnu", "4");
		sectionMap.put("mar", "4");
		sectionMap.put("hea", "4");
		sectionMap.put("npo","4");


		sectionMap.put("rej","4");
		sectionMap.put("ret","4");
		sectionMap.put("sls","4");
		sectionMap.put("spa","4");
		sectionMap.put("sec","4");
		sectionMap.put("trd","4");
		sectionMap.put("sof","4");
		sectionMap.put("sad","4");
		sectionMap.put("tch","4");

		sectionMap.put("trp", "4");
		sectionMap.put("tfr", "4");
		sectionMap.put("web", "4");
		sectionMap.put("wri", "4");
		sectionMap.put("etc", "4");
		
		
		categoryBkpMap.put("pta", "78693");
		categoryBkpMap.put("ata", "4422");
		categoryBkpMap.put("cba", "4422");
		
		categoryBkpMap.put("ppa", "5431");
		categoryBkpMap.put("bfa", "9085884");
		categoryBkpMap.put("boo", "5433");
		categoryBkpMap.put("gra", "9085882");
		categoryBkpMap.put("cla", "5434");
		categoryBkpMap.put("jwa", "5434");
		categoryBkpMap.put("sya", "4424");
		categoryBkpMap.put("ela", "4424");
		categoryBkpMap.put("hsa", "9085880");
		categoryBkpMap.put("zip", "5436");
		categoryBkpMap.put("fua", "4425");
		categoryBkpMap.put("pet", "4434");
		categoryBkpMap.put("pet", "4428");
		categoryBkpMap.put("sga", "5435");
		categoryBkpMap.put("bia", "5435");
		categoryBkpMap.put("tia", "4431");
		categoryBkpMap.put("maa", "5437");
		categoryBkpMap.put("wan", "5440");
		categoryBkpMap.put("gms", "4433");
		categoryBkpMap.put("pas", "4428");
		


		
		// TODO Auto-generated constructor stub
	}
	
	public  static final ClassifiedAdsCodes getInstance()
	{
		if (aCraigsRegions == null)
		{
			aCraigsRegions =  new ClassifiedAdsCodes();
		}
		
		
			
		return  aCraigsRegions ;
		
		
	}
	
	
}
