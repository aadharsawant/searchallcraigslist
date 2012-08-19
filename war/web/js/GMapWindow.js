
var lat =42.339419;
var lng = -71.09077;

var store ;
var reachoostore;
var text = "";
var typeIn = "";
var addOne = "";
var addTwo = "";
var addThree = "";
var addFour = "";
var addFive = "";
var hasPic = "";
var byDate="";
var grid = "";
var amazon;
var amazonurl= '<iframe width="100%" height="100%" src="web/html/amazon.html?query='+text+'"></iframe>';
Ext.Ajax.timeout = 240000;
var connObjBP = new Ext.data.Connection({
    timeout : 240000,
    url : '../all-backpage',
   // url : 'http://searchdeck.appspot.com/all-california-craigslist',
    method : 'GET'
});





function renderTopic(value, p, record){
    return String.format(
            '<b><a href="{0}" target="_blank">{1}</a></b>',
             record.data.link, record.data.title);
}
    function renderLast(value, p, r){
        return String.format( r.data['location']);
    }
    
    function renderDate(value, p, r){
    	
    	var date = new Date(r.data['date']);
    	
    	 var curr_date = date.getDate();
    	  var curr_month = date.getMonth() + 1; //months are zero based
    	  var curr_year = date.getFullYear();
    	  return curr_date + "-" + curr_month + "-" + curr_year;

       // return date.toString('yyyy-MM-dd'); ;
    }

GMapWindow = function() {
	
	
	 // create the Data Store
     store = new Ext.data.JsonStore({
       // root: 'users',
       // totalProperty: 'totalCount',
       // idProperty: 'code',
    	id:'craigsStore',
        remoteSort: true,
        root:'items',
        totalProperty: 'totalProperty',

        fields: [
            
            {name: 'link', mapping: 'link'},
            {name: 'title', mapping: 'title'},
            {name: 'city', mapping: 'city'},
            {name: 'date', mapping: 'date'}
        ],

        // load using script tags for cross domain, if the data in on the same domain as
        // this page, an HttpProxy would be better
        proxy:
        	new Ext.data.HttpProxy(connObjBP), 
        	//new Ext.data.ScriptTagProxy(connObjBP), 
        	
        
        listeners: {
        	beforeload: function(store) {
        		  store.baseParams.query = text;
        		  store.baseParams.inType = typeIn;
        		  store.baseParams.addOne = addOne ;
        		  store.baseParams.addTwo = addTwo ;
        		  store.baseParams.addThree = addThree ;
        		  store.baseParams.addFour = addFour ;
        		  store.baseParams.addFive = addFive ;
        		  store.baseParams.hasPic = hasPic ;
        		  store.baseParams.byDate = byDate ;
        		  store.baseParams.region = region ;
        		  
        		
        		
        		},
     
     load:function(store,records,opts){                    
         //console.log(store.getRange());
    	 if (records[records.length-1])
    		 byDate = records[records.length-1].data.date;
    	
    	  amazon.update('<iframe width="100%" height="100%" src="web/html/amazon.html?query='+text+'"></iframe>');
    	 
     }
        }}
     );
  
     
  

     grid = new Ext.grid.GridPanel({
       layout:'vBox',
     width:700,
      // height:800,
        title:'CraigsList Search Results', 
        region:'west',
        store: store,
        trackMouseOver:false,
        disableSelection:true,
        loadMask: true,
        flex:1,
//autoLoad:true,
        // grid columns
        columns:[
         //        {
       //     id: 'item', // id assigned so we can apply custom css (e.g. .x-grid-col-topic b { color:#333 })
         //   header: "Topic",
           // dataIndex: 'link',
           // width: 420,
           // renderer: renderTopic,
           // sortable: true
       // },
     //   {
       //     header: "Author",
         //   dataIndex: 'link',
           // width: 100,
           // hidden: true,
           // sortable: true
       // }
       //,
       {
            header: "Titles",
            dataIndex: 'title',
           width:500,
            align: 'left',
            renderer:renderTopic,
            sortable: true
        },
       {
           header: "City",
           dataIndex: 'city',
          width:100,
           align: 'left',
         //  renderer:renderTopic,
           sortable: true
       },
       {
           header: "Date",
           dataIndex: 'date',
          width:100,
           align: 'left',
           renderer:renderDate,
           sortable: true
       }
      //  ,{
        //    id: 'item',
          //  header: "Last Post",
            //dataIndex: 'item.about',
            //width: 150,
          //  renderer: renderLast,
           // sortable: true
       // }
        ],

        // customize view config
     //   viewConfig: {
       //     forceFit:true,
         //   enableRowBody:true,
          //  showPreview:true,
           // getRowClass : function(record, rowIndex, p, store){
            //    if(this.showPreview){
             //       p.body = '<p>'+record.data.title+'</p>';
              //      return 'x-grid3-row-expanded';
               // }
                //return 'x-grid3-row-collapsed';
           // }
       // }
   // ,

        // paging bar on the bottom
        bbar: new Ext.PagingToolbar({
            pageSize: 100,
            store: store,
            displayInfo: true,
            displayMsg: 'Displaying topics {0} - {1} of {2}',
            emptyMsg: "No topics to display",
            items:[
                '-', {
                pressed: true,
                enableToggle:true,
                text: 'Show Preview',
                cls: 'x-btn-text-icon details',
                toggleHandler: function(btn, pressed){
                    var view = grid.getView();
                    view.showPreview = pressed;
                    view.refresh();
                }
            }]
        })
    });

    // render it
    //grid.render('topic-grid');

    // trigger the data store load
  //  store.load({params:{start:0, limit:100}});
	
	
	
	
    
	
	
	
	
     amazon = new Ext.Panel({
         // region:'h',
         // el: 'header1',
  	 
        //  height:52
         //,
  	  title:'All Amazon Results',
  	 layout:'fit'
  		  ,
  		//  region:'right',
  		 // width:100,
  		 // height:100,
  	 //html: amazonurl,
  		 flex:1
//          html:
//          	
//          	
//          	'<span style="color:blue;padding:5 5 5 5"><div></div><div class="fb-like" style="width:30%; text-align:center; float:right; clear:both;" data-href="http://searchdeck.appspot.com/" data-send="true" data-width="450" data-show-faces="false"></div>&nbsp;&nbsp;&nbsp;&nbsp;<img border="0" src="../web/image/a0l.gif"><i>&nbsp;&nbsp;&nbsp;Search All and Every CraigsList ; SearchDeck is not affiliated to CraigsList in any way.</i>'
//          	+
//          	'&nbsp;&nbsp;&nbsp;&nbsp;<a href="mailto:searchdeck.appspot@gmail.com?Subject=Hello%20again">Send Mail</a>'
//          	+
//          	'</span>'
      });
	
	GMapWindow.superclass.constructor.call(this, {
    id:'gMapWin',
	title:'All Backpage Search',
	layout:'hBox',
	//height:100,
	layoutConfig: {
	    align : 'stretch',
	    pack  : 'start'
	},

	
	//layout:'border',
//	labelAlign: 'top',
//	buttonAlign: 'center',
	align:'center',
	region:'center',
	autoScroll:true,
	//width:400,
	//height:400,
	//layout:'form',
	closable:true,
	frame:true,
//	border:true,
//	margins:'5 5 5 5',
	 bodyStyle: 'background-image: url("/web/image/flights.png");'
		 ,
	items:[
	       grid
	       ,
	       amazon
	    //  ,
	    // new Ext.BoxComponent({ // raw element
	     
	       ]
//        
    });
	
    
  
};




Ext.extend(GMapWindow, Ext.Panel, {

   
    }

   
);

Ext.reg('GMapWindow', GMapWindow); 