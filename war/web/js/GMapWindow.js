
var lat =42.339419;
var lng = -71.09077;

var store ;
var text = "";
var typeIn = "";
var addOne = "";
var addTwo = "";
var addThree = "";
var addFour = "";
var addFive = "";
var hasPic = "";
var byDate="";

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
        proxy: new Ext.data.ScriptTagProxy({
            url: "http://localhost:8888/all-california-craigslist",
            conn :{ timeout: 200000000 }
        }),
      //  proxy.conn = { timeout: 200000000 },
        
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
        		  
        		},
     
     load:function(store,records,opts){                    
         //console.log(store.getRange());
    	 if (records[records.length-1])
    	 byDate = encodeURIComponent(records[records.length-1].data.date);
        // alert(encodeURIComponent(records[records.length-1].data.date));
     }
    


        }
    });
   // store.setDefaultSort('city', 'date');
//alert(store.getCount());

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

    var grid = new Ext.grid.GridPanel({
       layout:'fit',
      // height:500,
        title:'CraigsList Search Results', 
        store: store,
        trackMouseOver:false,
        disableSelection:true,
        loadMask: true,

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
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////
	 var mapwin = new Ext.Panel({
         layout: 'hbox',
         title: 'GMap Window',
         closeAction: 'hide',
         //align:'right',
        // region:'center',
         collapsible:'true',
         width:400,
         height:400,
       //  x: 100,
      //   y: 60,
         frame:true,
         border:true,
         margins:'5 5 5 100',
        // padding:'10 10 10 10',
         closable:true
         //,
      //   html:'<div id="get">Please Enable Browser for GeoLocation</div>'
       //  ,
     //    items: [grid]
     });
    
	
	
	
	GMapWindow.superclass.constructor.call(this, {
    id:'gMapWin',
	title:'All CraigsList Search',
	layout:'fit',
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
	items:[grid]
//        
    });
	
    
  
};




Ext.extend(GMapWindow, Ext.Panel, {

   
    }

   
);

Ext.reg('GMapWindow', GMapWindow); 