


Ext.Ajax.timeout = 240000;
var backpagestore;
var connObj = new Ext.data.Connection({
    timeout : 240000,
    url : '../all-backpage',
    //url : 'http://localhost:8888/all-california-craigslist',
    method : 'GET'
});


function renderTopic(value, p,record ){
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

Bpgrid = function() {
	
	
	 // create the Data Store
     backpagestore = new Ext.data.JsonStore({
       // root: 'users',
       // totalProperty: 'totalCount',
       // idProperty: 'code',
    	id:'backpagestore',
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
        proxy: new Ext.data.HttpProxy(connObj), 
//        	new Ext.data.ScriptTagProxy(
        	//new Ext.data.HttpProxy(
//        		{
//             url: 'http://searchdeck.appspot.com/all-california-craigslist',
//             timeout:1200000
            	//,
          //  conn :{ timeout: 120000 }
//        }),
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
        		  store.baseParams.region = region ;
        		  bgrid.getEl().mask('Loading...', 'x-mask-loading');
        		  
        		},
     
     load:function(store,records,opts){                    
         //console.log(store.getRange());
    	 if (records[records.length-1])
    		 byDate = records[records.length-1].data.date;
    	// byDate = encodeURIComponent(records[records.length-1].data.date);
        // alert(encodeURIComponent(records[records.length-1].data.date));
     }
        }}
     );
   // store.setDefaultSort('city', 'date');
//alert(store.getCount());



     bgrid = new Ext.grid.GridPanel({
       layout:'fit',
      // height:500,
        title:'BackPage Search Results', 
        store: store,
        trackMouseOver:false,
        disableSelection:true,
        loadMask: true,
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
            store: backpagestore,
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
	
	
	
	
	
	
	
	
	
	
	
	Bpgrid.superclass.constructor.call(this, {
    id:'bpgrid',
	title:'All BackPage Search',
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
	items:[bgrid]
//        
    });
	
    
  
};




Ext.extend(Bpgrid, Ext.Panel, {

   
    }

   
);

Ext.reg('Bpgrid', Bpgrid); 