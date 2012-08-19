package guestbook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import sun.java2d.pipe.RegionSpanIterator;



@SuppressWarnings("serial")
public class SectionCodes  {
	
	
	
	
	
	
	public  final Map<String,String> sectionBkpMap = new HashMap <String,String>();
	public  final Map<String,String> categoryBkpMap = new HashMap <String,String>();
	
	
	private static SectionCodes aCraigsRegions = null ;
	
	
	
	
	private static final Logger l =  Logger.getLogger(SectionCodes.class.getName());

	private SectionCodes() {
		super();
	
		
		
		
		
		sectionBkpMap.put("sss", "4378");
		sectionBkpMap.put("ppa", "4378");
		 sectionBkpMap.put("ata", "4378");
		  sectionBkpMap.put("bar", "4378");
		  sectionBkpMap.put("bia", "4378");
		  sectionBkpMap.put("boo", "4378");
		  sectionBkpMap.put("bka", "4378");
		  sectionBkpMap.put("bfa", "4378");
		  sectionBkpMap.put("sya", "4378");
		  sectionBkpMap.put("zip", "4378");
		  sectionBkpMap.put("fua", "4378");
		  sectionBkpMap.put("foa ","4378");
		  sectionBkpMap.put("jwa", "4378");
		  sectionBkpMap.put("maa", "4378");
		  sectionBkpMap.put("rva", "4378");
		  sectionBkpMap.put("sga", "4378");
		  sectionBkpMap.put("tia", "4378");
		  sectionBkpMap.put("wan", "4378");
		  sectionBkpMap.put("ara", "4378");
		  sectionBkpMap.put("pta", "4378");
		  sectionBkpMap.put("baa", "4378");
		  sectionBkpMap.put("haa", "4378");
		  
		
		sectionBkpMap.put("ema", "4378");
		sectionBkpMap.put("moa", "4378");
		sectionBkpMap.put("cla", "4378");
		sectionBkpMap.put("cba", "4378");
		sectionBkpMap.put("ela", "4378");
		sectionBkpMap.put("gra", "4378");
		sectionBkpMap.put("gms", "4378");
		sectionBkpMap.put("hsa", "4378");
		sectionBkpMap.put("mca", "4378");
		sectionBkpMap.put("msa", "4378");
		sectionBkpMap.put("taa", "4378");
		sectionBkpMap.put("vga", "4378");
		sectionBkpMap.put("pha", "4378");
		
		
		sectionBkpMap.put("tla", "153676");
		sectionBkpMap.put("cto", "153676");
		sectionBkpMap.put("ctd", "153676");
		
		//jobs
		sectionBkpMap.put("jjj", "4373");
		sectionBkpMap.put("ctd", "4373");
		sectionBkpMap.put("acc", "4373");
		sectionBkpMap.put("ofc","4373");
		sectionBkpMap.put("egr","4373");
		sectionBkpMap.put("med","4373");
		sectionBkpMap.put("sci", "4373");
		sectionBkpMap.put("bus","4373");
		sectionBkpMap.put("csr","4373");
		sectionBkpMap.put("edu", "4373");
		sectionBkpMap.put("fbh", "4373");
		sectionBkpMap.put("lab", "4373");
		sectionBkpMap.put("gov", "4373");
		sectionBkpMap.put("hum", "4373");
		sectionBkpMap.put("eng", "4373");
		sectionBkpMap.put("lgl", "4373");
		sectionBkpMap.put("mnu", "4373");
		sectionBkpMap.put("mar", "4373");
		sectionBkpMap.put("hea", "4373");
		sectionBkpMap.put("npo","4373");


		sectionBkpMap.put("rej","4373");
		sectionBkpMap.put("ret","4373");
		sectionBkpMap.put("sls","4373");
		sectionBkpMap.put("spa","4373");
		sectionBkpMap.put("sec","4373");
		sectionBkpMap.put("trd","4373");
		sectionBkpMap.put("sof","4373");
		sectionBkpMap.put("sad","4373");
		sectionBkpMap.put("tch","4373");

		sectionBkpMap.put("trp", "4373");
		sectionBkpMap.put("tfr", "4373");
		sectionBkpMap.put("web", "4373");
		sectionBkpMap.put("wri", "4373");
		sectionBkpMap.put("etc", "4373");
		
		
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
	
	public  static final SectionCodes getInstance()
	{
		if (aCraigsRegions == null)
		{
			aCraigsRegions =  new SectionCodes();
		}
		
		
			
		return  aCraigsRegions ;
		
		
	}
	
	
}
