package guestbook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import sun.java2d.pipe.RegionSpanIterator;



@SuppressWarnings("serial")
public class CraigsRegions  {
	
	public  final Map<String,List<String>> regionMap = new HashMap <String,List<String>>();
	
	public  final Map<String,String> sectionBkpMap = new HashMap <String,String>();
	public  final Map<String,String> categoryBkpMap = new HashMap <String,String>();
	
	
	private static CraigsRegions aCraigsRegions = null ;
	
	
	public static final List <String> allusabkp = Arrays.asList("'alabama'","'kansas'","'anchorage'",
			"'arizona'",
			"'arkansas'",
			"'colorado'",
			"'connecticut'",
			"'delaware'",
			"'washingtondc'",
			"'georgia'",
			"'hawaii'",
			"'idaho'",
			"'illinois'",
			"'indiana'",
			"'iowa'",
			"'kentucky'",
			"'louisiana'",
			"'maine'",
			"'maryland'",
			"'massachusetts'",
			"'michigan'",
			"'minnesota'",
			"'mississippi'",
			"'missouri'",
			"'montana'",
			"'nebraska'",
			"'nevada'",
			"'newhampshire'",
			"'newjersey'",
			"'newmexico'",
			"'newyork'",
			"'northcarolina'",
			"'northdakota'",
			"'ohio'",
			"'oklahoma'",
			"'oregon'",
			"'pennsylvania'",
			"'providence'",
			"'southcarolina'",
			"'southdakota'",
			"'southdakota'",
			"'tennessee'",
			"'utah'",
			"'burlington'",
			"'virginia'",
			"'washington'",
			"'westvirginia'",
			"'wisconsin'",
			"'wyoming'",
			//california
			"'bakersfield'",
			"'chico'",
			"'fresno'",
			"'humboldt'",
			"'imperial'",
			"'inlandempire'",
			"'longbeach'",
			"'losangeles'",
			"'mendocino'",
			"'merced'",
			"'modesto'",
			"'monterey'",
			"'northbay'",
			"'orangecounty'",
			"'eastbay'",
			"'palmsprings'",
			"'palmdale'",
			"'redding'",
			"'sacramento'",
			"'sandiego'",
			"'sanfernandovalley'",
			"'sf'",
			"'sangabrielvalley'",
			"'sanjose'",
			"'sanluisobispo'",
			"'sanmateo'",
			"'santabarbara'",
			"'santacruz'",
			"'santamaria'",
			"'siskiyou'",
			"'stockton'",
			"'susanville'",
			"'ventura'",
			"'visalia'",
			//florida
			"'daytona'",
			"'fortmyers'",
			"'ftlauderdale'",
			"'gainesville'",
			"'jacksonville'",
			"'keys'",
			"'lakeland'",
			"'miami'",
			"'ocala'",
			"'orlando'",
			"'panamacity'",
			"'pensacola'",
			"'sarasota'",
			"'spacecoast'",
			"'staugustine'",
			"'tallahassee'",
			"'tampa'",
			"'treasurecoast'",
			"'westpalmbeach'",
			//texas
			"'abilene'",
			"'amarillo'",
			"'austin'",
			"'beaumont'",
			"'brownsville'",
			"'collegestation'",
			"'corpuschristi'",
			"'dallas'",
			"'delrio'",
			"'denton'",
			"'elpaso'",
			"'fortworth'",
			"'galveston'",
			"'houston'",
			"'huntsvilletx'",
			"'killeen'",
			"'laredo'",
			"'lubbock'",
			"'mcallen'",
			"'arlington'",
			"'odessa'",
			"'sanantonio'",
			"'sanmarcos'",
			"'texarkana'",
			"'texoma'",
			"'tyler'",
			"'victoriatx'",
			"'waco'",
			"'wichitafalls'");
	
	public static final List <String> allusa = Arrays.asList("'sfbay'","'bakersfield'",
			"'chico'","'fresno'","'goldcountry'","'hanford'","'humboldt'","'imperial'","'inlandempire'","'losangeles'","'mendocino'","'merced'",
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
			"'sarasota'"
			,
			//"'miami'",
			"'spacecoast'",
			"'staugustine'",
			"'tallahassee'",
			"'tampa'",
			"'treasure'",
			"'westpalmbeach'",
			//georgia
			
			"'albanyga'",
			"'athensga'",
			"'atlanta'",
			"'augusta'",
			"'brunswick'",
			"'columbusga'",
			"'macon'",
			"'nwga'",
			"'savannah'",
			"'statesboro'",
			"'valdosta'",
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
			"'waterloo'",
			//kansas
			"'lawrence'",
			"'ksu'",
			"'nwks'",
			"'salina'",
			"'seks'",
			"'swks'",
			"'topeka'",
			"'wichita'",


			//kentucky

			"'bgky'",
			"'eastky'",
			"'lexington'",
			"'louisville'",
			"'owensboro'",
			"'westky'",


			//Lousiana
			"'batonrouge'",
			"'cenla'",
			"'houma'",
			"'lafayette'",
			"'lakecharles'",
			"'monroe'",
			"'neworleans'",
			"'shreveport'",

//
//			//maine
//
			"'maine'",


			//Maryland
			"'annapolis'",
			"'baltimore'",
			"'easternshore'",
			"'frederick'",
			"'smd'",
			"'westmd'",
//
//
//
			//Massachusetts
			"'boston'",
			"'capecod'",
			"'southcoast'",
			"'westernmass'",
			"'worcester'",



			//Michigan
			"'annarbor'",
			"'battlecreek'",
			"'centralmich'",
			"'detroit'",
			"'flint'",
			"'grandrapids'",
			"'holland'",
			"'jxn'",
			"'kalamazoo'",
			"'lansing'",
			"'monroemi'",
			"'muskegon'",
			"'nmi'",
			"'porthuron'",
			"'saginaw'",
			"'swmi'",
			"'thumb'",
			"'up'",


			//Minnesota


			"'bemidji'",
			"'brainerd'",
			"'duluth'",
			"'mankato'",
			"'minneapolis'",
			"'rmn'",
			"'marshall'",
			"'stcloud'",

			//Missippi
			"'gulfport'",
			"'hattiesburg'",
			"'jackson'",
			"'meridian'",
			"'northmiss'",
			"'natchez'",
			//missouri
			"'columbiamo'",
			"'joplin'",
			"'kansascity'",
			"'kirksville'",
			"'loz'",
			"'semo'",
			"'springfield'",
			"'stjoseph'",
			"'stlouis'",
			//montana
			"'billings'",
			"'bozeman'",
			"'butte'",
			"'greatfalls'",
			"'helena'",
			"'kalispell'",
			"'missoula'",
			"'montana'",
			//nebraska
			"'grandisland'",
			"'lincoln'",
			"'northplatte'",
			"'omaha'",
			"'scottsbluff'",
			//nevada
			"'elko'",
			"'lasvegas'",
			"'reno'",
			//new hampshire
			"'nh'",
			//new jersey
			"'cnj'",
			"'jerseyshore'",
			"'newjersey'",
			"'southjersey'",

			//new mexico
			"'albuquerque'",
			"'clovis'",
			"'farmington'",
			"'lascruces'",
			"'roswell'",
			"'santafe'",

			//new york
			"'albany'",
			"'binghamton'",
			"'buffalo'",
			"'catskills'",
			"'chautauqua'",
			"'elmira'",
			"'fingerlakes'",
			"'glensfalls'",
			"'hudsonvalley'",
			"'ithaca'",
			"'longisland'",
			"'newyork'",
			"'oneonta'",
			"'plattsburgh'",
			"'potsdam'",
			"'rochester'",
			"'syracuse'",
			"'twintiers'",
			"'utica'",
			"'watertown'",

			//north carolina
			"'asheville'",
			"'boone'",
			"'charlotte'",
			"'eastnc'",
			"'fayetteville'",
			"'greensboro'",
			"'hickory'",
			"'onslow'",
			"'outerbanks'",
			"'raleigh'",
			"'wilmington'",
			"'winstonsalem'",
			//north dakota
			"'bismarck'",
			"'fargo'",
			"'grandforks'",
			"'nd'",
			//ohio
			"'akroncanton'",
			"'ashtabula'",
			"'athensohio'",
			"'chillicothe'",
			"'cincinnati'",
			"'cleveland'",
			"'columbus'",
			"'dayton'",
			"'limaohio'",
			"'mansfield'",
			"'sandusky'",
			"'toledo'",
			"'tuscarawas'",
			"'youngstown'",
			"'zanesville'",
			//oklahoma
			"'lawton'",
			"'enid'",
			"'oklahomacity'",
			"'stillwater'",
			"'tulsa'",
			//oregon
			"'bend'",
			"'corvallis'",
			"'eastoregon'",
			"'eugene'",
			"'klamath'",
			"'medford'",
			"'oregoncoast'",
			"'portland'",
			"'roseburg'",
			"'salem'",
			
			//part 4
			//pennsylvania
			"'altoona'",
			"'chambersburg'",
			"'erie'",
			"'harrisburg'",
			"'lancaster'",
			"'allentown'",
			"'meadville'",
			"'philadelphia'",
			"'pittsburgh'",
			"'poconos'",
			"'reading'",
			"'scranton'",
			"'pennstate'",
			"'williamsport'",
			"'york'",

			//rhode island
			"'providence'",
			"'charleston'",
			"'columbia'",
			"'florencesc'",
			"'greenville'",
			"'hiltonhead'",
			"'myrtlebeach'",
			//south dakota
			"'nesd'",
			"'csd'",
			"'rapidcity'",
			"'siouxfalls'",
			"'sd'",
			//Tennessee
			"'chattanooga'",
			"'clarksville'",
			"'cookeville'",
			"'jacksontn'",
			"'knoxville'",
			"'memphis'",
			"'nashville'",
			"'tricities'",
			//Texas
			"'abilene'",
			"'amarillo'",
			"'austin'",
			"'beaumont'",
			"'brownsville'",
			"'collegestation'",
			"'corpuschristi'",
			"'dallas'",
			"'nacogdoches'",
			"'delrio'",
			"'elpaso'",
			"'galveston'",
			"'houston'",
			"'killeen'",
			"'laredo'",
			"'lubbock'",
			"'mcallen'",
			"'odessa'",
			"'sanangelo'",
			"'sanantonio'",
			"'sanmarcos'",
			"'bigbend'",
			"'texoma'",
			"'easttexas'",
			"'victoriatx'",
			"'waco'",
			"'wichitafalls'",
			//utah
			"'logan'",
			"'ogden'",
			"'provo'",
			"'saltlakecity'",
			"'stgeorge'",
			//vermont
			"'burlington'",
			//virginia
			"'charlottesville'",
			"'danville'",
			"'fredericksburg'",
			"'norfolk'",
			"'harrisonburg'",
			"'lynchburg'",
			"'blacksburg'",
			"'richmond'",
			"'roanoke'",
			"'swva'",
			"'winchester'",
			//washington
			"'bellingham'",
			"'kpr'",
			"'moseslake'",
			"'olympic'",
			"'pullman'",
			"'seattle'",
			"'skagit'",
			"'spokane'",
			"'wenatchee'",
			"'yakima'",
			//west virginia
			"'charlestonwv'",
			"'martinsburg'",
			"'huntington'",
			"'morgantown'",
			"'wheeling'",
			"'parkersburg'",
			"'swv'",
			"'wv'",
			//wisconsin
			"'appleton'",
			"'eauclaire'",
			"'greenbay'",
			"'janesville'",
			"'racine'",
			"'lacrosse'",
			"'madison'",
			"'milwaukee'",
			"'northernwi'",
			"'sheboygan'",
			"'wausau'",
			//wyoming
			"'wyoming'",
			//terrortories
			"'micronesia'",
			"'puertorico'",
			"'virgin'"
			
			
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
	
	
	public static final List <String> Georgia = Arrays.asList(
			"'albanyga'",
			"'athensga'",
			"'atlanta'",
			"'augusta'",
			"'brunswick'",
			"'columbusga'",
			"'macon'",
			"'nwga'",
			"'savannah'",
			"'statesboro'",
			"'valdosta'"
			
			);
	
	
	
	
	public static final List <String> hawaii = Arrays.asList(
			"'honolulu'"
			);
	
	
	public static final List <String> idaho = Arrays.asList(
			"'boise'",
			"'eastidaho'",
			"'lewiston'",
			"'twinfalls'"
			);
	public static final List <String> illinois = Arrays.asList(
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
	
	
	public static final List <String> kansas = Arrays.asList(
			"'lawrence'",
			"'ksu'",
			"'nwks'",
			"'salina'",
			"'seks'",
			"'swks'",
			"'topeka'",
			"'wichita'"
			);
	
	
	public static final List <String> kentucky = Arrays.asList(
			"'bgky'",
			"'eastky'",
			"'lexington'",
			"'louisville'",
			"'owensboro'",
			"'westky'"
			);
	public static final List <String> louisiana = Arrays.asList(
			"'batonrouge'",
			"'cenla'",
			"'houma'",
			"'lafayette'",
			"'lakecharles'",
			"'monroe'",
			"'neworleans'",
			"'shreveport'"
			);
	public static final List <String> maine = Arrays.asList(
			"'maine'"
			);
	public static final List <String> maryland = Arrays.asList(
			"'annapolis'",
			"'baltimore'",
			"'easternshore'",
			"'frederick'",
			"'smd'",
			"'westmd'"
			);
	public static final List <String> massachusetts = Arrays.asList(
			"'boston'",
			"'capecod'",
			"'southcoast'",
			"'westernmass'",
			"'worcester'"
			);
	public static final List <String> michigan = Arrays.asList(
			"'annarbor'",
			"'battlecreek'",
			"'centralmich'",
			"'detroit'",
			"'flint'",
			"'grandrapids'",
			"'holland'",
			"'jxn'",
			"'kalamazoo'",
			"'lansing'",
			"'monroemi'",
			"'muskegon'",
			"'nmi'",
			"'porthuron'",
			"'saginaw'",
			"'swmi'",
			"'thumb'",
			"'up'"
			);
	
	
	
	public static final List <String> minnesota = Arrays.asList(
			"'bemidji'",
			"'brainerd'",
			"'duluth'",
			"'mankato'",
			"'minneapolis'",
			"'rmn'",
			"'marshall'",
			"'stcloud'"
			);
	
	
	public static final List <String> mississippi = Arrays.asList(

"'gulfport'",
"'hattiesburg'",
"'jackson'",
"'meridian'",
"'northmiss'",
"'natchez'"
			);
	
	
	
	public static final List <String> missouri = Arrays.asList(

			//missouri
			"'columbiamo'",
			"'joplin'",
			"'kansascity'",
			"'kirksville'",
			"'loz'",
			"'semo'",
			"'springfield'",
			"'stjoseph'",
			"'stlouis'"
			
						);
	
	
	
	public static final List <String> montana = Arrays.asList(

			"'billings'",
			"'bozeman'",
			"'butte'",
			"'greatfalls'",
			"'helena'",
			"'kalispell'",
			"'missoula'",
			"'montana'"
						);
	
	
	public static final List <String> nebraska = Arrays.asList(

			//nebraska
			"'grandisland'",
			"'lincoln'",
			"'northplatte'",
			"'omaha'",
			"'scottsbluff'"
						);
	public static final List <String> nevada = Arrays.asList(
			//nevada
			"'elko'",
			"'lasvegas'",
			"'reno'"
						);
	public static final List <String> newhampshire = Arrays.asList(

			//new hampshire
			"'nh'"
						);
	public static final List <String> newjersey = Arrays.asList(

			//new jersey
			"'cnj'",
			"'jerseyshore'",
			"'newjersey'",
			"'southjersey'"
						);
	public static final List <String> newmexico = Arrays.asList(

			//new mexico
			"'albuquerque'",
			"'clovis'",
			"'farmington'",
			"'lascruces'",
			"'roswell'",
			"'santafe'"
						);
	public static final List <String> newyork = Arrays.asList(
			//new york
			"'albany'",
			"'binghamton'",
			"'buffalo'",
			"'catskills'",
			"'chautauqua'",
			"'elmira'",
			"'fingerlakes'",
			"'glensfalls'",
			"'hudsonvalley'",
			"'ithaca'",
			"'longisland'",
			"'newyork'",
			"'oneonta'",
			"'plattsburgh'",
			"'potsdam'",
			"'rochester'",
			"'syracuse'",
			"'twintiers'",
			"'utica'",
			"'watertown'"
						);
	public static final List <String> northcarolina = Arrays.asList(

			//north carolina
			"'asheville'",
			"'boone'",
			"'charlotte'",
			"'eastnc'",
			"'fayetteville'",
			"'greensboro'",
			"'hickory'",
			"'onslow'",
			"'outerbanks'",
			"'raleigh'",
			"'wilmington'",
			"'winstonsalem'"
						);
	
	
	
	public static final List <String> northdakota = Arrays.asList(

			//north dakota
			"'bismarck'",
			"'fargo'",
			"'grandforks'",
			"'nd'"
						);
	
	
	public static final List <String> ohio = Arrays.asList(
			//ohio
			"'akroncanton'",
			"'ashtabula'",
			"'athensohio'",
			"'chillicothe'",
			"'cincinnati'",
			"'cleveland'",
			"'columbus'",
			"'dayton'",
			"'limaohio'",
			"'mansfield'",
			"'sandusky'",
			"'toledo'",
			"'tuscarawas'",
			"'youngstown'",
			"'zanesville'"
						);
	
	public static final List <String> oklahoma = Arrays.asList(

			//oklahoma
			"'lawton'",
			"'enid'",
			"'oklahomacity'",
			"'stillwater'",
			"'tulsa'"
						);
	
	public static final List <String> oregon = Arrays.asList(

			//oregon
			"'bend'",
			"'corvallis'",
			"'eastoregon'",
			"'eugene'",
			"'klamath'",
			"'medford'",
			"'oregoncoast'",
			"'portland'",
			"'roseburg'",
			"'salem'"
						);
	public static final List <String> pennsylvania = Arrays.asList(

			//pennsylvania
			"'altoona'",
			"'chambersburg'",
			"'erie'",
			"'harrisburg'",
			"'lancaster'",
			"'allentown'",
			"'meadville'",
			"'philadelphia'",
			"'pittsburgh'",
			"'poconos'",
			"'reading'",
			"'scranton'",
			"'pennstate'",
			"'williamsport'",
			"'york'"

						);
	public static final List <String> rhodeisland = Arrays.asList(

			//rhode island
			"'providence'",
			"'charleston'",
			"'columbia'",
			"'florencesc'",
			"'greenville'",
			"'hiltonhead'",
			"'myrtlebeach'"
						);
	
	
	public static final List <String> southcarolina = Arrays.asList(

			
			"'charleston'",
			"'columbia'",
			"'florencesc'",
			"'greenville'",
			"'hiltonhead'",
			"'myrtlebeach'"
						);
	public static final List <String> southdakota = Arrays.asList(

			"'nesd'",
			"'csd'",
			"'rapidcity'",
			"'siouxfalls'",
			"'sd'"
						);
	public static final List <String> Tennessee = Arrays.asList(

			//Tennessee
			"'chattanooga'",
			"'clarksville'",
			"'cookeville'",
			"'jacksontn'",
			"'knoxville'",
			"'memphis'",
			"'nashville'",
			"'tricities'"
						);
	public static final List <String> Texas = Arrays.asList(

			//Texas
			"'abilene'",
			"'amarillo'",
			"'austin'",
			"'beaumont'",
			"'brownsville'",
			"'collegestation'",
			"'corpuschristi'",
			"'dallas'",
			"'nacogdoches'",
			"'delrio'",
			"'elpaso'",
			"'galveston'",
			"'houston'",
			"'killeen'",
			"'laredo'",
			"'lubbock'",
			"'mcallen'",
			"'odessa'",
			"'sanangelo'",
			"'sanantonio'",
			"'sanmarcos'",
			"'bigbend'",
			"'texoma'",
			"'easttexas'",
			"'victoriatx'",
			"'waco'",
			"'wichitafalls'"
						);
	public static final List <String> utah = Arrays.asList(

			//utah
			"'logan'",
			"'ogden'",
			"'provo'",
			"'saltlakecity'",
			"'stgeorge'"
						);
	public static final List <String> vermont = Arrays.asList(

			//vermont
			"'burlington'"
						);
	
	public static final List <String> virginia = Arrays.asList(

			//virginia
			"'charlottesville'",
			"'danville'",
			"'fredericksburg'",
			"'norfolk'",
			"'harrisonburg'",
			"'lynchburg'",
			"'blacksburg'",
			"'richmond'",
			"'roanoke'",
			"'swva'",
			"'winchester'"
						);
	public static final List <String> washington = Arrays.asList(

			//washington
			"'bellingham'",
			"'kpr'",
			"'moseslake'",
			"'olympic'",
			"'pullman'",
			"'seattle'",
			"'skagit'",
			"'spokane'",
			"'wenatchee'",
			"'yakima'"
						);
	public static final List <String> westvirginia = Arrays.asList(

			//west virginia
			"'charlestonwv'",
			"'martinsburg'",
			"'huntington'",
			"'morgantown'",
			"'wheeling'",
			"'parkersburg'",
			"'swv'",
			"'wv'"
						);
	public static final List <String> wisconsin = Arrays.asList(

			//wisconsin
			"'appleton'",
			"'eauclaire'",
			"'greenbay'",
			"'janesville'",
			"'racine'",
			"'lacrosse'",
			"'madison'",
			"'milwaukee'",
			"'northernwi'",
			"'sheboygan'",
			"'wausau'"
						);
	public static final List <String> wyoming = Arrays.asList(

			//wyoming
			"'wyoming'"
						);
	public static final List <String> terrortories = Arrays.asList(

			//terrortories
			"'micronesia'",
			"'puertorico'",
			"'virgin'"
						);
	
	
	
	
	public static final List <String> Canada = Arrays.asList(//Alberta
			"'calgary'",
			"'edmonton'",
			"'ftmcmurray'",
			"'lethbridge'",
			"'hat'",
			"'peace'",
			"'reddeer'",
			//British Columbia
			"'cariboo'",
			"'comoxvalley'",
			"'abbotsford'",
			"'kamloops'",
			"'kelowna'",
			"'cranbrook'",
			"'nanaimo'",
			"'princegeorge'",
			"'skeena'",
			"'sunshine'",
			"'vancouver'",
			"'victoria'",
			"'whistler'",
			//Manitoba
			"'winnipeg'",
			//New Brunswick
			"'newbrunswick'",
			//Newfoundland and Labrador
			"'newfoundland'",
			//Northwest Territories
			"'territories'",
			"'yellowknife'",
			//Nova Scotia
			"'halifax'",
			//Ontario
			"'barrie'",
			"'belleville'",
			"'brantford'",
			"'chatham'",
			"'cornwall'",
			"'guelph'",
			"'hamilton'",
			"'kingston'",
			"'kitchener'",
			"'londonon'", 
			"'niagara'", 
			"'ottawa'",
			"'owensound'",
			"'peterborough'",
			"'sarnia'",
			"'soo'",
			"'sudbury'",
			"'thunderbay'",
			"'toronto'",
			"'windsor'",
			//Prince Edward Island
			"'pei'",
			//Quebec
			"'montreal'",
			"'quebec'",
			"'saguenay'",
			"'sherbrooke'",
			"'troisrivieres'",
			//Saskatchewan
			"'regina'",
			"'saskatoon'",
			//Yukon Territory
			"'whitehorse'");
	
	
	public static final List <String> Mexico = Arrays.asList("'acapulco'",
			"'bajasur'",
			"'chihuahua'",
			"'juarez'",
			"'guadalajara'",
			"'guanajuato'",
			"'hermosillo'",
			"'mazatlan'",
			"'mexicocity'",
			"'monterrey'",
			"'oaxaca'",
			"'puebla'",
			"'pv'",
			"'tijuana'",
			"'veracruz'",
			"'yucatan'");
	
	
	public static final List <String> India = Arrays.asList("'ahmedabad'",
			"'bangalore'",
			"'bhubaneswar'",
			"'chandigarh'",
			"'chennai'",
			"'delhi'",
			"'goa'",
			"'hyderabad'",
			"'indore'",
			"'jaipur'",
			"'kerala'",
			"'kolkata'",
			"'lucknow'",
			"'mumbai'",
			"'pune'",
			"'surat'");
	
	
	public static final List <String> Australia = Arrays.asList("'adelaide'",
			"'brisbane'",
			"'cairns'",
			"'canberra'",
			"'darwin'",
			"'goldcoast'",
			"'melbourne'",
			"'ntl'",
			"'perth'",
			"'sydney'",
			"'hobart'",
			"'wollongong'",
			//new zealand
			"'auckland'",
			"'christchurch'",
			"'dunedin'",
			"'wellington'");
	
	public static final List <String> Japan = Arrays.asList("'fukuoka'",
			"'hiroshima'",
			"'nagoya'",
			"'okinawa'",
			"'osaka'",
			"'sapporo'",
			"'sendai'",
			"'tokyo'");
	
	
	
	public static final List <String> UK = Arrays.asList(//United Kingdom
			"'aberdeen'",
			"'bath'",
			"'belfast'",
			"'birmingham'",
			"'brighton'",
			"'bristol'",
			"'cambridge'",
			"'cardiff'",
			"'coventry'",
			"'derby'",
			"'devon'",
			"'dundee'",
			"'norwich'",
			"'eastmids'",
			"'edinburgh'",
			"'essex'",
			"'glasgow'",
			"'hampshire'",
			"'kent'",
			"'leeds'",
			"'liverpool'",
			"'london'",
			"'manchester'",
			"'newcastle'",
			"'nottingham'",
			"'oxford'",
			"'sheffield'");
	
	
	public static final List <String> Euro = Arrays.asList(
			//Germany
			"'berlin'",
			"'bremen'",
			"'cologne'",
			"'dresden'",
			"'dusseldorf'",
			"'essen'",
			"'frankfurt'",
			"'hamburg'",
			"'hannover'",
			"'heidelberg'",
			"'kaiserslautern'",
			"'leipzig'",
			"'munich'",
			"'nuremberg'",
			"'stuttgart'",
			//France
			"'bordeaux'",
			"'rennes'",
			"'grenoble'",
			"'lille'",
			"'loire'",
			"'lyon'",
			"'marseilles'",
			"'montpellier'",
			"'cotedazur'",
			"'rouen'",
			"'paris'",
			"'strasbourg'",
			"'toulouse'",
			//spain
			"'alicante'",
			"'baleares'",
			"'barcelona'",
			"'bilbao'",
			"'cadiz'",
			"'canarias'",
			"'granada'",
			"'madrid'",
			"'malaga'",
			"'sevilla'",
			"'valencia'",
			//Italy
			"'bologna'",
			"'florence'",
			"'genoa'",
			"'milan'",
			"'naples'",
			"'perugia'",
			"'rome'",
			"'sardinia'",
			"'sicily'",
			"'torino'",
			"'venice'",
			//portugal
			"'faro'",
			"'lisbon'",
			"'porto'",
			//Switzerland
			"'basel'",
			"'bern'",
			"'geneva'",
			"'lausanne'",
			"'zurich'",
			//russia
			"'moscow'",
			"'stpetersburg'",
			//europe
			"'copenhagen'",
			"'vienna'",
			"'brussels'",
			"'bulgaria'",
			"'prague'",
			"'copenhagen'",
			"'helsinki'",
			"'athens'",
			"'budapest'",
			"'reykjavik'",
			"'dublin'",
			"'luxembourg'",
			"'amsterdam'",
			"'oslo'",
			"'warsaw'",
			"'bucharest'",
			"'stockholm'",
			"'istanbul'",
			"'ukraine'"
			);
	
	
	
	public static final List <String> AfricaMEAsia = Arrays.asList(
			"'cairo'",
			"'addisababa'",
			"'accra'",
			"'kenya'",
			"'casablanca'", 
			"'capetown'",
			"'durban'",
			"'johannesburg'",
			"'pretoria'",
			"'tunis'",
			"'bangladesh'",
			"'tehran'",
			"'baghdad'",
			"'haifa'",
			"'jerusalem'",
			"'telaviv'",
			"'ramallah'",
			"'kuwait'",
			"'beirut'",
			"'dubai'",
			"'pakistan'",
			//india
			"'ahmedabad'",
			"'bangalore'",
			"'bhubaneswar'",
			"'chandigarh'",
			"'chennai'",
			"'delhi'",
			"'goa'",
			"'hyderabad'",
			"'indore'",
			"'jaipur'",
			"'kerala'",
			"'kolkata'",
			"'lucknow'",
			"'mumbai'",
			"'pune'",
			"'surat'"
			);
	
	public static final List <String> AsiaPac = Arrays.asList(
			"'beijing'",
			"'chengdu'",
			"'chongqing'",
			"'dalian'",
			"'guangzhou'",
			"'hangzhou'",
			"'nanjing'",
			"'shanghai'",
			"'shenyang'",
			"'shenzhen'",
			"'wuhan'",
			"'xian'",
			"'hongkong'",
			//Philippines
			"'bacolod'",
			"'naga'",
			"'cdo'",
			"'cebu'",
			"'davaocity'",
			"'iloilo'",
			"'manila'",
			"'pampanga'",
			"'zamboanga'",
			//Singapore
			"'singapore'",
			//Taiwan
			"'taipei'",
			//Thailand
			"'bangkok'",
			//United Arab Emirates
			
			//Vietnam
			"'vietnam'",
			
			//japan
			"'fukuoka'",
			"'hiroshima'",
			"'nagoya'",
			"'okinawa'",
			"'osaka'",
			"'sapporo'",
			"'sendai'",
			"'tokyo'",
			//rest
			"'micronesia'",
			
			"'jakarta'",
			
			"'seoul'",
			
			"'malaysia'"
			
			
			);
	
	
	public static final List <String> SouthAmerica = Arrays.asList(
			//Brazil
			"'belohorizonte'",
			"'brasilia'",
			"'curitiba'",
			"'fortaleza'",
			"'portoalegre'",
			"'recife'",
			"'rio'",
			"'salvador'",
			"'saopaulo'",
			"'caribbean'",
			"'buenosaires'",
			"'lapaz'",
			"'santiago'",
			"'colombia'",
			"'costarica'",
			"'santodomingo'",
			"'quito'",
			"'elsalvador'",
			"'guatemala'",
			"'managua'",
			"'panama'",
			"'lima'",
			"'puertorico'",
			"'montevideo'",
			"'caracas'",
			"'virgin'",
			"'acapulco'",
			"'bajasur'",
			"'chihuahua'",
			"'juarez'",
			"'guadalajara'",
			"'guanajuato'",
			"'hermosillo'",
			"'mazatlan'",
			"'mexicocity'",
			"'monterrey'",
			"'oaxaca'",
			"'puebla'",
			"'pv'",
			"'tijuana'",
			"'veracruz'",
			"'yucatan'"
			
			
			);
	
	
	
	
	
	
	private static final Logger l =  Logger.getLogger(CraigsRegions.class.getName());

	private CraigsRegions() {
		super();
		regionMap.put("USA", allusa);
		regionMap.put("USAbkp", allusabkp);
		regionMap.put("Alabama", alabama);
		regionMap.put("Alaska", alaska);
		regionMap.put("Arizona", arizona);
		regionMap.put("Arkansas", arkansas);
		regionMap.put("California", california);
		regionMap.put("Colorado", colorado);
		regionMap.put("Connecticut", connecticut);
		regionMap.put("Delaware", delaware);
		regionMap.put("District of Columbia", districtOfColumbia);
		regionMap.put("Florida", florida);
		regionMap.put("Georgia", Georgia);
		regionMap.put("Hawaii", hawaii);
		regionMap.put("Idaho", idaho);
		regionMap.put("Illinois", illinois);
		regionMap.put("Indiana", indiana);
		regionMap.put("Iowa", iowa);
		regionMap.put("Kansas", kansas);
		regionMap.put("Kentucky", kentucky);
		regionMap.put("Louisiana", louisiana);
		regionMap.put("Maine", maine);
		regionMap.put("Maryland", maryland);
		regionMap.put("Massachusetts", massachusetts);
		regionMap.put("Michigan", michigan);
		regionMap.put("Minnesota", minnesota);
		regionMap.put("Mississippi", mississippi);
		regionMap.put("Missouri", missouri);
		regionMap.put("Montana", montana);
		regionMap.put("Nebraska", nebraska);
		regionMap.put("Nevada", nevada);
		regionMap.put("New Hampshire", newhampshire);
		regionMap.put("New Jersey", newjersey);
		regionMap.put("New Mexico", newmexico);
		regionMap.put("New York", newyork);
		regionMap.put("North Carolina", northcarolina);
		regionMap.put("North Dakota", northdakota);
		regionMap.put("Ohio", ohio);
		regionMap.put("Oklahoma", oklahoma);
		regionMap.put("Oregon", oregon);
		regionMap.put("Pennsylvania", pennsylvania);
		regionMap.put("Rhode Island", rhodeisland);
		regionMap.put("South Carolina", southcarolina);
		regionMap.put("South Dakota", southdakota);
		regionMap.put("Tennessee", Tennessee);
		regionMap.put("Texas", Texas);
		regionMap.put("Utah", utah);
		regionMap.put("Vermont", vermont);
		regionMap.put("Virginia", virginia);
		regionMap.put("Washington", washington);
		regionMap.put("West Virginia", westvirginia);
		regionMap.put("Wisconsin", wisconsin);
		regionMap.put("Wyoming", wyoming);
		
		regionMap.put("Canada", Canada);
		regionMap.put("India", India);
		regionMap.put("Australia", Australia);
		regionMap.put("Japan", Japan);
		regionMap.put("Mexico", Mexico);
		regionMap.put("UK", UK);
		regionMap.put("Euro", Euro);
		regionMap.put("AfricaMEAsia", AfricaMEAsia);
		regionMap.put("AsiaPac", AsiaPac);
		regionMap.put("SouthAmerica", SouthAmerica);
		
		
		
		
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
		  sectionBkpMap.put("tla", "153676");
		sectionBkpMap.put("cto", "153676");
		sectionBkpMap.put("ctd", "153676");
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
		
		categoryBkpMap.put("pta", "78693");


		
		// TODO Auto-generated constructor stub
	}
	
	public  static final CraigsRegions getInstance()
	{
		if (aCraigsRegions == null)
		{
			aCraigsRegions =  new CraigsRegions();
		}
		
		
			
		return  aCraigsRegions ;
		
		
	}
	
	
}
