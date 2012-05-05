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
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.org.json.JSONException;
import com.google.appengine.repackaged.org.json.JSONObject;



@SuppressWarnings("serial")
public class CaliforniaServlet extends HttpServlet {
	
	
	public static final List <String> allmegausa = Arrays.asList("'sfbay'","'bakersfield'",
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


		//	kentucky

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


			//maine

			"'maine'",


			//Maryland
			"'annapolis'",
			"'baltimore'",
			"'easternshore'",
			"'frederick'",
			"'smd'",
			"'westmd'",



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
//			,
//			//"'miami'",
//			"'spacecoast'",
//			"'staugustine'",
//			"'tallahassee'",
//			"'tampa'",
//			"'treasure'",
//			"'westpalmbeach'",
//			//hawai
//			"'honolulu'",
//			//idaho
//			"'boise'",
//			"'eastidaho'",
//			"'lewiston'",
//			"'twinfalls'",
//			//illionis
//			"'bn'",
//			"'chambana'",
//			"'chicago'",
//			"'decatur'",
//			"'lasalle'",
//			"'mattoon'",
//			"'peoria'",
//			"'rockford'",
//			"'carbondale'",
//			"'springfieldil'",
//			"'quincy'",
//			//indiana
//			"'bloomington'",
//			"'evansville'",
//			"'fortwayne'",
//			"'indianapolis'",
//			"'kokomo'",
//			"'tippecanoe'",
//			"'muncie'",
//			"'richmondin'",
//			"'southbend'",
//			"'terrehaute'"
//			//iowa
//			"'ames'",
//			"'cedarrapids'",
//			"'desmoines'",
//			"'dubuque'",
//			"'fortdodge'",
//			"'iowacity'",
//			"'masoncity'",
//			"'quadcities'",
//			"'siouxcity'",
//			"'ottumwa'",
//			"'waterloo'",
//			//kansas
//			"'lawrence'",
//			"'ksu'",
//			"'nwks'",
//			"'salina'",
//			"'seks'",
//			"'swks'",
//			"'topeka'",
//			"'wichita'",
//
//
//			//kentucky
//
//			"'bgky'",
//			"'eastky'",
//			"'lexington'",
//			"'louisville'",
//			"'owensboro'",
//			"'westky'",
//
//
//			//Lousiana
//			"'batonrouge'",
//			"'cenla'",
//			"'houma'",
//			"'lafayette'",
//			"'lakecharles'",
//			"'monroe'",
//			"'neworleans'",
//			"'shreveport'",
//
//
//			//maine
//
//			"'maine'",


//			//Maryland
//			"'annapolis'",
//			"'baltimore'",
//			"'easternshore'",
//			"'frederick'",
//			"'smd'",
//			"'westmd'",
//
//
//
//			//Massachusetts
//			"'boston'",
//			"'capecod'",
//			"'southcoast'",
//			"'westernmass'",
//			"'worcester'",
//
//
//
//			//Michigan
//			"'annarbor'",
//			"'battlecreek'",
//			"'centralmich'",
//			"'detroit'",
//			"'flint'",
//			"'grandrapids'",
//			"'holland'",
//			"'jxn'",
//			"'kalamazoo'",
//			"'lansing'",
//			"'monroemi'",
//			"'muskegon'",
//			"'nmi'",
//			"'porthuron'",
//			"'saginaw'",
//			"'swmi'",
//			"'thumb'",
//			"'up'",
//
//
//			//Minnesota
//
//
//			"'bemidji'",
//			"'brainerd'",
//			"'duluth'",
//			"'mankato'",
//			"'minneapolis'",
//			"'rmn'",
//			"'marshall'",
//			"'stcloud'",
//
//			//Missippi
//			"'gulfport'",
//			"'hattiesburg'",
//			"'jackson'",
//			"'meridian'",
//			"'northmiss'",
//			"'natchez'",
//			//missouri
//			"'columbiamo'",
//			"'joplin'",
//			"'kansascity'",
//			"'kirksville'",
//			"'loz'",
//			"'semo'",
//			"'springfield'",
//			"'stjoseph'",
//			"'stlouis'",
//			//montana
//			"'billings'",
//			"'bozeman'",
//			"'butte'",
//			"'greatfalls'",
//			"'helena'",
//			"'kalispell'",
//			"'missoula'",
//			"'montana'",
//			//nebraska
//			"'grandisland'",
//			"'lincoln'",
//			"'northplatte'",
//			"'omaha'",
//			"'scottsbluff'",
//			//nevada
//			"'elko'",
//			"'lasvegas'",
//			"'reno'",
//			//new hampshire
//			"'nh'",
//			//new jersey
//			"'cnj'",
//			"'jerseyshore'",
//			"'newjersey'",
//			"'southjersey'",
//
//			//new mexico
//			"'albuquerque'",
//			"'clovis'",
//			"'farmington'",
//			"'lascruces'",
//			"'roswell'",
//			"'santafe'",
//
//			//new york
//			"'albany'",
//			"'binghamton'",
//			"'buffalo'",
//			"'catskills'",
//			"'chautauqua'",
//			"'elmira'",
//			"'fingerlakes'",
//			"'glensfalls'",
//			"'hudsonvalley'",
//			"'ithaca'",
//			"'longisland'",
//			"'newyork'",
//			"'oneonta'",
//			"'plattsburgh'",
//			"'potsdam'",
//			"'rochester'",
//			"'syracuse'",
//			"'twintiers'",
//			"'utica'",
//			"'watertown'",
//
//			//north carolina
//			"'asheville'",
//			"'boone'",
//			"'charlotte'",
//			"'eastnc'",
//			"'fayetteville'",
//			"'greensboro'",
//			"'hickory'",
//			"'onslow'",
//			"'outerbanks'",
//			"'raleigh'",
//			"'wilmington'",
//			"'winstonsalem'",
//			//north dakota
//			"'bismarck'",
//			"'fargo'",
//			"'grandforks'",
//			"'nd'",
//			//ohio
//			"'akroncanton'",
//			"'ashtabula'",
//			"'athensohio'",
//			"'chillicothe'",
//			"'cincinnati'",
//			"'cleveland'",
//			"'columbus'",
//			"'dayton'",
//			"'limaohio'",
//			"'mansfield'",
//			"'sandusky'",
//			"'toledo'",
//			"'tuscarawas'",
//			"'youngstown'",
//			"'zanesville'",
//			//oklahoma
//			"'lawton'",
//			"'enid'",
//			"'oklahomacity'",
//			"'stillwater'",
//			"'tulsa'",
//			//oregon
//			"'bend'",
//			"'corvallis'",
//			"'eastoregon'",
//			"'eugene'",
//			"'klamath'",
//			"'medford'",
//			"'oregoncoast'",
//			"'portland'",
//			"'roseburg'",
//			"'salem'",
			
			//part 4
			//pennsylvania
//			"'altoona'",
//			"'chambersburg'",
//			"'erie'",
//			"'harrisburg'",
//			"'lancaster'",
//			"'allentown'",
//			"'meadville'",
//			"'philadelphia'",
//			"'pittsburgh'",
//			"'poconos'",
//			"'reading'",
//			"'scranton'",
//			"'pennstate'",
//			"'williamsport'",
//			"'york'",
//
//			//rhode island
//			"'providence'",
//			"'charleston'",
//			"'columbia'",
//			"'florencesc'",
//			"'greenville'",
//			"'hiltonhead'",
//			"'myrtlebeach'",
//			//south dakota
//			"'nesd'",
//			"'csd'",
//			"'rapidcity'",
//			"'siouxfalls'",
//			"'sd'",
//			//Tennessee
//			"'chattanooga'",
//			"'clarksville'",
//			"'cookeville'",
//			"'jacksontn'",
//			"'knoxville'",
//			"'memphis'",
//			"'nashville'",
//			"'tricities'",
//			//Texas
//			"'abilene'",
//			"'amarillo'",
//			"'austin'",
//			"'beaumont'",
//			"'brownsville'",
//			"'collegestation'",
//			"'corpuschristi'",
//			"'dallas'",
//			"'nacogdoches'",
//			"'delrio'",
//			"'elpaso'",
//			"'galveston'",
//			"'houston'",
//			"'killeen'",
//			"'laredo'",
//			"'lubbock'",
//			"'mcallen'",
//			"'odessa'",
//			"'sanangelo'",
//			"'sanantonio'",
//			"'sanmarcos'",
//			"'bigbend'",
//			"'texoma'",
//			"'easttexas'",
//			"'victoriatx'",
//			"'waco'",
//			"'wichitafalls'",
//			//utah
//			"'logan'",
//			"'ogden'",
//			"'provo'",
//			"'saltlakecity'",
//			"'stgeorge'",
//			//vermont
//			"'burlington'",
//			//virginia
//			"'charlottesville'",
//			"'danville'",
//			"'fredericksburg'",
//			"'norfolk'",
//			"'harrisonburg'",
//			"'lynchburg'",
//			"'blacksburg'",
//			"'richmond'",
//			"'roanoke'",
//			"'swva'",
//			"'winchester'",
//			//washington
//			"'bellingham'",
//			"'kpr'",
//			"'moseslake'",
//			"'olympic'",
//			"'pullman'",
//			"'seattle'",
//			"'skagit'",
//			"'spokane'",
//			"'wenatchee'",
//			"'yakima'",
//			//west virginia
//			"'charlestonwv'",
//			"'martinsburg'",
//			"'huntington'",
//			"'morgantown'",
//			"'wheeling'",
//			"'parkersburg'",
//			"'swv'",
//			"'wv'",
//			//wisconsin
//			"'appleton'",
//			"'eauclaire'",
//			"'greenbay'",
//			"'janesville'",
//			"'racine'",
//			"'lacrosse'",
//			"'madison'",
//			"'milwaukee'",
//			"'northernwi'",
//			"'sheboygan'",
//			"'wausau'",
//			//wyoming
//			"'wyoming'",
//			//terrortories
//			"'micronesia'",
//			"'puertorico'",
//			"'virgin'"
			
			
			);
	
	
	public static final List <String> allusa2 = Arrays.asList(
			
			//"'miami'",
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


			//maine

			"'maine'"
//			,
//			//"'miami'",
//			"'spacecoast'",
//			"'staugustine'",
//			"'tallahassee'",
//			"'tampa'",
//			"'treasure'",
//			"'westpalmbeach'",
//			//hawai
//			"'honolulu'",
//			//idaho
//			"'boise'",
//			"'eastidaho'",
//			"'lewiston'",
//			"'twinfalls'",
//			//illionis
//			"'bn'",
//			"'chambana'",
//			"'chicago'",
//			"'decatur'",
//			"'lasalle'",
//			"'mattoon'",
//			"'peoria'",
//			"'rockford'",
//			"'carbondale'",
//			"'springfieldil'",
//			"'quincy'",
//			//indiana
//			"'bloomington'",
//			"'evansville'",
//			"'fortwayne'",
//			"'indianapolis'",
//			"'kokomo'",
//			"'tippecanoe'",
//			"'muncie'",
//			"'richmondin'",
//			"'southbend'",
//			"'terrehaute'"
//			//iowa
//			"'ames'",
//			"'cedarrapids'",
//			"'desmoines'",
//			"'dubuque'",
//			"'fortdodge'",
//			"'iowacity'",
//			"'masoncity'",
//			"'quadcities'",
//			"'siouxcity'",
//			"'ottumwa'",
//			"'waterloo'",
//			//kansas
//			"'lawrence'",
//			"'ksu'",
//			"'nwks'",
//			"'salina'",
//			"'seks'",
//			"'swks'",
//			"'topeka'",
//			"'wichita'",
//
//
//			//kentucky
//
//			"'bgky'",
//			"'eastky'",
//			"'lexington'",
//			"'louisville'",
//			"'owensboro'",
//			"'westky'",
//
//
//			//Lousiana
//			"'batonrouge'",
//			"'cenla'",
//			"'houma'",
//			"'lafayette'",
//			"'lakecharles'",
//			"'monroe'",
//			"'neworleans'",
//			"'shreveport'",
//
//
//			//maine
//
//			"'maine'",


//			//Maryland
//			"'annapolis'",
//			"'baltimore'",
//			"'easternshore'",
//			"'frederick'",
//			"'smd'",
//			"'westmd'",
//
//
//
//			//Massachusetts
//			"'boston'",
//			"'capecod'",
//			"'southcoast'",
//			"'westernmass'",
//			"'worcester'",
//
//
//
//			//Michigan
//			"'annarbor'",
//			"'battlecreek'",
//			"'centralmich'",
//			"'detroit'",
//			"'flint'",
//			"'grandrapids'",
//			"'holland'",
//			"'jxn'",
//			"'kalamazoo'",
//			"'lansing'",
//			"'monroemi'",
//			"'muskegon'",
//			"'nmi'",
//			"'porthuron'",
//			"'saginaw'",
//			"'swmi'",
//			"'thumb'",
//			"'up'",
//
//
//			//Minnesota
//
//
//			"'bemidji'",
//			"'brainerd'",
//			"'duluth'",
//			"'mankato'",
//			"'minneapolis'",
//			"'rmn'",
//			"'marshall'",
//			"'stcloud'",
//
//			//Missippi
//			"'gulfport'",
//			"'hattiesburg'",
//			"'jackson'",
//			"'meridian'",
//			"'northmiss'",
//			"'natchez'",
//			//missouri
//			"'columbiamo'",
//			"'joplin'",
//			"'kansascity'",
//			"'kirksville'",
//			"'loz'",
//			"'semo'",
//			"'springfield'",
//			"'stjoseph'",
//			"'stlouis'",
//			//montana
//			"'billings'",
//			"'bozeman'",
//			"'butte'",
//			"'greatfalls'",
//			"'helena'",
//			"'kalispell'",
//			"'missoula'",
//			"'montana'",
//			//nebraska
//			"'grandisland'",
//			"'lincoln'",
//			"'northplatte'",
//			"'omaha'",
//			"'scottsbluff'",
//			//nevada
//			"'elko'",
//			"'lasvegas'",
//			"'reno'",
//			//new hampshire
//			"'nh'",
//			//new jersey
//			"'cnj'",
//			"'jerseyshore'",
//			"'newjersey'",
//			"'southjersey'",
//
//			//new mexico
//			"'albuquerque'",
//			"'clovis'",
//			"'farmington'",
//			"'lascruces'",
//			"'roswell'",
//			"'santafe'",
//
//			//new york
//			"'albany'",
//			"'binghamton'",
//			"'buffalo'",
//			"'catskills'",
//			"'chautauqua'",
//			"'elmira'",
//			"'fingerlakes'",
//			"'glensfalls'",
//			"'hudsonvalley'",
//			"'ithaca'",
//			"'longisland'",
//			"'newyork'",
//			"'oneonta'",
//			"'plattsburgh'",
//			"'potsdam'",
//			"'rochester'",
//			"'syracuse'",
//			"'twintiers'",
//			"'utica'",
//			"'watertown'",
//
//			//north carolina
//			"'asheville'",
//			"'boone'",
//			"'charlotte'",
//			"'eastnc'",
//			"'fayetteville'",
//			"'greensboro'",
//			"'hickory'",
//			"'onslow'",
//			"'outerbanks'",
//			"'raleigh'",
//			"'wilmington'",
//			"'winstonsalem'",
//			//north dakota
//			"'bismarck'",
//			"'fargo'",
//			"'grandforks'",
//			"'nd'",
//			//ohio
//			"'akroncanton'",
//			"'ashtabula'",
//			"'athensohio'",
//			"'chillicothe'",
//			"'cincinnati'",
//			"'cleveland'",
//			"'columbus'",
//			"'dayton'",
//			"'limaohio'",
//			"'mansfield'",
//			"'sandusky'",
//			"'toledo'",
//			"'tuscarawas'",
//			"'youngstown'",
//			"'zanesville'",
//			//oklahoma
//			"'lawton'",
//			"'enid'",
//			"'oklahomacity'",
//			"'stillwater'",
//			"'tulsa'",
//			//oregon
//			"'bend'",
//			"'corvallis'",
//			"'eastoregon'",
//			"'eugene'",
//			"'klamath'",
//			"'medford'",
//			"'oregoncoast'",
//			"'portland'",
//			"'roseburg'",
//			"'salem'",
			
			//part 4
			//pennsylvania
//			"'altoona'",
//			"'chambersburg'",
//			"'erie'",
//			"'harrisburg'",
//			"'lancaster'",
//			"'allentown'",
//			"'meadville'",
//			"'philadelphia'",
//			"'pittsburgh'",
//			"'poconos'",
//			"'reading'",
//			"'scranton'",
//			"'pennstate'",
//			"'williamsport'",
//			"'york'",
//
//			//rhode island
//			"'providence'",
//			"'charleston'",
//			"'columbia'",
//			"'florencesc'",
//			"'greenville'",
//			"'hiltonhead'",
//			"'myrtlebeach'",
//			//south dakota
//			"'nesd'",
//			"'csd'",
//			"'rapidcity'",
//			"'siouxfalls'",
//			"'sd'",
//			//Tennessee
//			"'chattanooga'",
//			"'clarksville'",
//			"'cookeville'",
//			"'jacksontn'",
//			"'knoxville'",
//			"'memphis'",
//			"'nashville'",
//			"'tricities'",
//			//Texas
//			"'abilene'",
//			"'amarillo'",
//			"'austin'",
//			"'beaumont'",
//			"'brownsville'",
//			"'collegestation'",
//			"'corpuschristi'",
//			"'dallas'",
//			"'nacogdoches'",
//			"'delrio'",
//			"'elpaso'",
//			"'galveston'",
//			"'houston'",
//			"'killeen'",
//			"'laredo'",
//			"'lubbock'",
//			"'mcallen'",
//			"'odessa'",
//			"'sanangelo'",
//			"'sanantonio'",
//			"'sanmarcos'",
//			"'bigbend'",
//			"'texoma'",
//			"'easttexas'",
//			"'victoriatx'",
//			"'waco'",
//			"'wichitafalls'",
//			//utah
//			"'logan'",
//			"'ogden'",
//			"'provo'",
//			"'saltlakecity'",
//			"'stgeorge'",
//			//vermont
//			"'burlington'",
//			//virginia
//			"'charlottesville'",
//			"'danville'",
//			"'fredericksburg'",
//			"'norfolk'",
//			"'harrisonburg'",
//			"'lynchburg'",
//			"'blacksburg'",
//			"'richmond'",
//			"'roanoke'",
//			"'swva'",
//			"'winchester'",
//			//washington
//			"'bellingham'",
//			"'kpr'",
//			"'moseslake'",
//			"'olympic'",
//			"'pullman'",
//			"'seattle'",
//			"'skagit'",
//			"'spokane'",
//			"'wenatchee'",
//			"'yakima'",
//			//west virginia
//			"'charlestonwv'",
//			"'martinsburg'",
//			"'huntington'",
//			"'morgantown'",
//			"'wheeling'",
//			"'parkersburg'",
//			"'swv'",
//			"'wv'",
//			//wisconsin
//			"'appleton'",
//			"'eauclaire'",
//			"'greenbay'",
//			"'janesville'",
//			"'racine'",
//			"'lacrosse'",
//			"'madison'",
//			"'milwaukee'",
//			"'northernwi'",
//			"'sheboygan'",
//			"'wausau'",
//			//wyoming
//			"'wyoming'",
//			//terrortories
//			"'micronesia'",
//			"'puertorico'",
//			"'virgin'"
			);
	
	
	public static final List <String> allusa3 = Arrays.asList(

			//Maryland
			"'annapolis'",
			"'baltimore'",
			"'easternshore'",
			"'frederick'",
			"'smd'",
			"'westmd'",



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
			"'santafe'" 
			);
	
	
	public static final List <String> allusa4 = Arrays.asList(
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
			"'tricities'"
			);
	
	public static final List <String> allusa5 =Arrays.asList(		//Texas
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
	public static final List <String> lousiana = Arrays.asList(
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
	public static final List <String> massacheusetts = Arrays.asList(
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
	
	
	public static final List <String> missipi = Arrays.asList(

"'gulfport'",
"'hattiesburg'",
"'jackson'",
"'meridian'",
"'northmiss'",
"'natchez'"
			);
	
	private static final Logger l =  Logger.getLogger(CaliforniaServlet.class.getName());
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		l.info("inside california servlet");
		
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
        	
        	
        	String megastates = join(allmegausa,"%2C%0A");
        	String states = join(allusa,"%2C%0A");
        	String states2 = join(allusa2,"%2C%0A");
        	String states3 = join(allusa3,"%2C%0A");
        	String states4 = join(allusa4,"%2C%0A");
        	String states5 = join(allusa5,"%2C%0A");
        	//String states = join(allusa,"%2C%0A");
        	//http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table(5000)%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter')%20and%20type%20%3D%20'web'%20%20and%20query%20%3D%20'html'%20and%20addOne%20%3D%20'telecommuting'%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)&format=json&callback=cbfunc
        	if (query=="")
        	{
        		query = "%20";
        	}
        	if (offset.equals(""))
        		offset = "0";
        	String limit = req.getParameter("limit");
        	limit="100";
        	if (limit.equals(""))
        		limit = "100";
        	if (offset!=null && (!offset.equals("0")))
        	{
        		//item.date%3C'2012-04-18T20%3A19%3A06-07%3A00'
        		urlParams = urlParams +
        	        	"%20and%20item.date%3C'"+itemDate+"'" ;
        	}
        	
        	//2012-05-04T14:24:43-05:00
        	
        	
        	
//http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter'%2C'auburn'%2C'bham'%2C'dothan'%2C'shoals'%2C'gadsden'%2C'huntsville'%2C'mobile'%2C'montgomery'%2C'tuscaloosa')%20and%20type%20%3D%20'vol'%20and%20query%20%3D%20'%20'%20%20%20%7C%20sort(field%3D%22item.date%22)%20%20%7C%20truncate%20(100)&format=json&callback=cbfunc        	
        	
//http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20('sfbay'%2C'bakersfield'%2C'chico'%2C'fresno'%2C'goldcountry'%2C'hanford'%2C'humboldt'%2C'imperial'%2C'inlandempire'%2C'losangeles'%2C'mendocino'%2C'merced'%2C%0A'modesto'%2C%0A'monterey'%2C%0A'orangecounty'%2C%0A'palmsprings'%2C%0A'redding'%2C%0A'reno'%2C%0A'sacramento'%2C%0A'sandiego'%2C%0A'slo'%2C%0A'santabarbara'%2C%0A'santamaria'%2C%0A'siskiyou'%2C%0A'stockton'%2C%0A'susanville'%2C%0A'ventura'%2C%0A'visalia'%2C%0A'yubasutter'%2C'auburn'%2C'bham'%2C'dothan'%2C'shoals'%2C'gadsden'%2C'huntsville'%2C'mobile'%2C'montgomery'%2C'tuscaloosa'%2C'anchorage'%2C%0A'fairbanks'%2C%0A'kenai'%2C%0A'juneau'%2C%0A%0A'flagstaff'%2C%0A'mohave'%2C%0A'phoenix'%2C%0A'prescott'%2C%0A'showlow'%2C%0A'sierravista'%2C%0A'tucson'%2C%0A'yuma')%20and%20type%20%3D%20'vol'%20and%20query%20%3D%20'html'%20%20and%20item.date%3C'2012-04-18T20%3A19%3A06-07%3A00'%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate(100)&format=json&callback=cbfunc        	
        	
           // query = URLEncoder.encode(query, "UTF-8");
//            url = 
//            		new URL("http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fsearchdeck.appspot.com%2Fcraigslist.search.xml"
//            		+ "%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20("+megastates+")%20and%20type%20%3D%20'"+inType+"'%20and%20query%20%3D%20'"
//            		+query+ "'"+urlParams+ "%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate("+limit+")&format=json");
//            url = 
//   new URL("http://query.yahooapis.com/v1/public/yql/allcraigslist/allusavariable?format=json&insection="+inType+"&typedText="+query);
//           
            if (offset!=null && (!offset.equals("0")))
        	{
            	
            	 url = 
            			   new URL("http://query.yahooapis.com/v1/public/yql/allcraigslist/allusavariable2?format=json&insection="+inType+"&typedText="+query+"&lastdate="+itemDate);
        		//item.date%3C'2012-04-18T20%3A19%3A06-07%3A00'
//        		urlParams = urlParams +
//        	        	"%20and%20item.date%3C'"+itemDate+"'" ;
        	}
            else {
            	 url = 
            			   new URL("http://query.yahooapis.com/v1/public/yql/allcraigslist/allusavariable?format=json&insection="+inType+"&typedText="+query);
            }
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
            //url.
//            url = new URL("http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml"
//            		+ "%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20("+states2+")%20and%20type%20%3D%20'"+inType+"'%20and%20query%20%3D%20'"
//            		+query+ "'"+urlParams+ "%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate("+limit+")&format=json");
//           
//             connection = url.openConnection();
//            connection.setConnectTimeout(200000000);
//            connection.setReadTimeout(200000000);
//             in = new BufferedReader(new InputStreamReader(connection
//                    .getInputStream()));
//             inputLine = "";
//            String  s2 = "";
//            while ((inputLine = in.readLine()) != null) {
//                   // System.out.println( inputLine);
//                    s2 = inputLine ;
//                }
//            
//            url = new URL("http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml"
//            		+ "%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20("+states3+")%20and%20type%20%3D%20'"+inType+"'%20and%20query%20%3D%20'"
//            		+query+ "'"+urlParams+ "%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate("+limit+")&format=json");
//           
//             connection = url.openConnection();
//            connection.setConnectTimeout(200000000);
//            connection.setReadTimeout(200000000);
//             in = new BufferedReader(new InputStreamReader(connection
//                    .getInputStream()));
//             inputLine = "";
//            String  s3 = "";
//            while ((inputLine = in.readLine()) != null) {
//                   // System.out.println( inputLine);
//                    s3 = inputLine ;
//                }
//            
//            
//            url = new URL("http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml"
//            		+ "%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20("+states4+")%20and%20type%20%3D%20'"+inType+"'%20and%20query%20%3D%20'"
//            		+query+ "'"+urlParams+ "%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate("+limit+")&format=json");
//           
//             connection = url.openConnection();
//            connection.setConnectTimeout(200000000);
//            connection.setReadTimeout(200000000);
//             in = new BufferedReader(new InputStreamReader(connection
//                    .getInputStream()));
//             inputLine = "";
//            String  s4 = "";
//            while ((inputLine = in.readLine()) != null) {
//                   // System.out.println( inputLine);
//                    s4 = inputLine ;
//                }
//            
//            
//            url = new URL("http://query.yahooapis.com/v1/public/yql?q=USE%20%22http%3A%2F%2Fplanlongweekend.appspot.com%2Fcraigslist.search.xml"
//            		+ "%22%20AS%20craig_table%3B%20SELECT%20item%20FROM%20craig_table%20where%20location%20in%20("+states5+")%20and%20type%20%3D%20'"+inType+"'%20and%20query%20%3D%20'"
//            		+query+ "'"+urlParams+ "%20%7C%20sort(field%3D%22item.date%22%20%2Cdescending%3D%22true%22)%20%7Ctruncate("+limit+")&format=json");
//           
//             connection = url.openConnection();
//            connection.setConnectTimeout(200000000);
//            connection.setReadTimeout(200000000);
//             in = new BufferedReader(new InputStreamReader(connection
//                    .getInputStream()));
//             inputLine = "";
//            String  s5 = "";
//            while ((inputLine = in.readLine()) != null) {
//                   // System.out.println( inputLine);
//                    s5 = inputLine ;
//                }
//            
            List<String> aString = new ArrayList<String>();
            aString.add(s);
//            aString.add(s2);
//            aString.add(s3);
//            aString.add(s4);
//            aString.add(s5);
           //  s = s+s2+s3+s4+s5;
            
            resp.setContentType("application/json");
    		try {
    			
    			CraigsListReadjson aCraigsListReadjson = new CraigsListReadjson();
    			resp.getWriter().println( callback + '(' + aCraigsListReadjson.filterJson(aString,offset,limit) +')' );
    		} catch (Exception e) {
    			l.severe( e.getMessage());
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        } catch (Exception e) {
        	l.severe( e.getMessage());
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
