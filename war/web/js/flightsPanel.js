

// pluggable renders
//    function stcCallback1001(data){
//        alert('hello');
//    };


flightsPanel = function() {
	
	
	
//	this.tipo_store = new Ext.data.Store({
//        reader: new Ext.data.JsonReader({
//            root: 'results',
//            totalProperty: 'total',
//            id: 0,
//            autoLoad: true,
//            fields: [
//                {name: 'id', mapping:'id'},
//                {name: 'name', mapping:'name'}
//            ]
//        }),
//        proxy: new Ext.data.HttpProxy({
//            url: '/accion/tipo/',
//            method: 'GET'
//        })
//    }); 
	
	
	// create the Data Store
    var Grid1Store = new Ext.data.JsonStore({
        root: 'airports',
       // totalProperty: 'totalCount',
        idProperty: 'code',
        remoteSort: true,

        fields: [
            'code', 'name', 'location'
        ],

        // load using script tags for cross domain, if the data in on the same domain as
        // this page, an HttpProxy would be better
        proxy: new Ext.data.ScriptTagProxy({
            url: 'http://localhost:8888/guestbook'
        })
    });
    
    
    var Grid2Store = new Ext.data.JsonStore({
        root: 'airports',
       // totalProperty: 'totalCount',
        idProperty: 'code',
        remoteSort: true,

        fields: [
            'code', 'name', 'location'
        ],

        // load using script tags for cross domain, if the data in on the same domain as
        // this page, an HttpProxy would be better
        proxy: new Ext.data.ScriptTagProxy({
            url: 'http://localhost:8888/guestbook'
        })
    });
   // Grid1Store.setDefaultSort('location', 'desc');
	
    
    
    
 // Custom rendering Template
    var resultTpl = new Ext.XTemplate(
        '<tpl for="."><div class="search-item">',
        
       
            '<i>{code} </i>&nbsp;&nbsp;    ',
        ' &nbsp;&nbsp;{location}',
            '<br></br>',
           
           
        '</div></tpl>'
    );

	
	
//test = new Ext.form.ComboBox({
//        store: ds,
//        displayField:'title',
//        typeAhead: false,
//        loadingText: 'Searching...',
//        minChars:2,
//        minHeight:25,
//        width: 300,
//        pageSize:0,
//        hideTrigger:true,
//        tpl: resultTpl,
//        applyTo: 'test',
//        itemSelector: 'div.search-item',
//        onSelect: function(record){ // override default onSelect to do redirect
//            window.location = String.format('');
//        }
//    });
	
//	Ext.define("Post", {
//        extend: 'Ext.data.Model',
//        proxy: {
//            type: 'jsonp',
//            url : 'http://www.sencha.com/forum/topics-remote.php',
//            reader: {
//                type: 'json',
//                root: 'topics',
//                totalProperty: 'totalCount'
//            }
//        },
//
//        fields: [
//            {name: 'id', mapping: 'post_id'},
//            {name: 'title', mapping: 'topic_title'},
//            {name: 'topicId', mapping: 'topic_id'},
//            {name: 'author', mapping: 'author'},
//            {name: 'lastPost', mapping: 'post_time', type: 'date', dateFormat: 'timestamp'},
//            {name: 'excerpt', mapping: 'post_text'}
//        ]
//    });
//
//    var ds = Ext.create('Ext.data.Store', {
//        pageSize: 10,
//        model: 'Post'
//    });



	
	
	//alert(Grid1Store.getCount());
	
	
	


//		 // private variables
//		  var Grid1Store = new Ext.data.JsonStore({
//		    root: 'users',
//		    fields: [ 'code', 'name', 'location' ],
//		    autoLoad: true,
//		    proxy: new Ext.data.HttpProxy({
//		    	 url:'http://airportcode.riobard.com/search?q=frankfurt&fmt=JSON',
//                method: 'POST'
//            })
//
//		   
//		  });
//		  
//		  
//		  
//		  alert(Grid1Store.getCount());

		  
		
		 
	
//	var rd_random_employee_data = new Ext.data.JsonReader({}, [ 'code', 'name','location']);
//	
//	
//	    var ds_random_employee_data_active = new Ext.data.Store({  
//		     proxy: new Ext.data.HttpProxy({  
//		         // this json data contains only employees where active is 'true'  
//		         url: 'airports.json'  
//		     }),  
//		     reader: rd_random_employee_data,  
//		     remoteSort: false  
//		 });  
//	    
	    
//	    
//	    var count =[ ['0'],
//	                 ['1'],
//	                 ['2'],
//	                 ['3'],
//	                 ['4'],
//	                 ['5'],
//	                 ['6'],
//	                 ['7'],
//	                 ['8'],
//	                 ['9']
//	                 ];

//	                 var from = new Ext.form.ComboBox({
//	                     fieldLabel: 'from',
//	                     hiddenName: 'from',
//	                     store: new Ext.data.SimpleStore({
//	                         fields: ['code','name','location'],
//	                         data : airportArr
//	                     }),
//	                 	width:50,
//	                     displayField: 'name',
//	                     typeAhead: true,
//	                     mode: 'local',
//	                     triggerAction: 'all',
//	                     emptyText:'mumbai',
//	                     selectOnFocus:true
//	                 });
	    
		var from = new Ext.form.ComboBox({
	    fieldLabel: 'From',
	    hiddenName: 'from',
	   
	    store: Grid2Store,
	    displayField: 'location',
	    valueField:'code',
	    typeAhead: false,
	    mode: 'remote',
	    triggerAction: 'all',
	    emptyText:'Choose From Airport...',
	    selectOnFocus:true,
	   
	        loadingText: 'Searching...',
	       // emptyText: 'No matching airports found.',

	        // Custom rendering template for each item
	        itemSelector: 'div.search-item',
	       tpl:resultTpl,
	      //  }
	    //},
	    pageSize: 10
	});
		
		
//		var from = new Ext.form.ComboBox({
//			 fieldLabel: 'From',
//			    hiddenName: 'from',
//	        store: Grid1Store,
//	        displayField:'location',
//	        typeAhead: false,
//	        loadingText: 'Searching...',
//	        width: 400,
//	        pageSize:10,
//	        hideTrigger:true,
//	        tpl: resultTpl,
//	       // applyTo: 'search',
//	        itemSelector: 'div.search-item',
////	        onSelect: function(record){ // override default onSelect to do redirect
////	            window.location =
////	                String.format('http://extjs.com/forum/showthread.php?t={0}&p={1}', record.data.topicId, record.id);
////	        }
//	    });


//var from = new Ext.form.ComboBox({
//    fieldLabel: 'From',
//    hiddenName: 'from',
//     store: new Ext.data.SimpleStore({
//         fields: ['code','name','location'],
//         data : 'airports.json'
//     }),
//    displayField: 'location',
//    typeAhead: true,
//    mode: 'local',
//    triggerAction: 'all',
//    emptyText:'Choose from Airport...',
//    selectOnFocus:true
//});


var to = new Ext.form.ComboBox({
    fieldLabel: 'To',
    hiddenName: 'to',
    store: Grid2Store,
    displayField: 'location',
    valueField:'code',
    typeAhead: false,
    mode: 'remote',
    triggerAction: 'all',
    emptyText:'Choose To Airport...',
    selectOnFocus:true,
   
        loadingText: 'Searching...',
       // emptyText: 'No matching airports found.',

        // Custom rendering template for each item
        itemSelector: 'div.search-item',
       tpl:resultTpl,
      //  }
    //},
    pageSize: 10
});

var today = new Date(); // get today date

var fromDate = new Ext.form.DateField({
    fieldLabel:'From Date',
    format: 'm/d/y',
    value: today // <-- you must put the date object here
});
	
	
	var startTimePicker = new Ext.form.TimeField({
	fieldLabel:'From Time',
	width:70,
name: 'starttime',
editable:false,
value:'Any Time',
format:"H:i:s"
});


var toDate = new Ext.form.DateField({
    fieldLabel:'To Date',
    format: 'm/d/y',
    value: today // <-- you must put the date object here
});
	
	
	var endTimePicker = new Ext.form.TimeField({
	fieldLabel:'End Time',
	width:70,
name: 'endtime',
editable:false,
value:'Any Time',
format:"H:i:s"
});


var count =[ ['0'],
['1'],
['2'],
['3'],
['4'],
['5'],
['6'],
['7'],
['8'],
['9']
];

var adult = new Ext.form.ComboBox({
    fieldLabel: 'Adults',
    hiddenName: 'adults',
    store: new Ext.data.SimpleStore({
        fields: ['adults'],
        data : count
    }),
	width:50,
    displayField: 'adults',
    typeAhead: true,
    mode: 'local',
    triggerAction: 'all',
    emptyText:'1',
    selectOnFocus:true
});

var child = new Ext.form.ComboBox({
    fieldLabel: 'Children[2-11]',
    hiddenName: 'children',
    store: new Ext.data.SimpleStore({
        fields: ['children'],
        data : count
    }),
	width:50,
    displayField: 'children',
    typeAhead: true,
    mode: 'local',
    triggerAction: 'all',
    emptyText:'0',
    selectOnFocus:true
});


var senior = new Ext.form.ComboBox({
    fieldLabel: 'Seniors [65+]',
    hiddenName: 'seniors',
	store: new Ext.data.SimpleStore({
        fields: ['seniors'],
        data : count
    }),
	width:50,
    displayField: 'seniors',
    typeAhead: true,
    mode: 'local',
    triggerAction: 'all',
    emptyText:'0',
    selectOnFocus:true
});



var infonseat = new Ext.form.ComboBox({
    fieldLabel: 'Infant on Seat',
    hiddenName: 'infonseat',
	store: new Ext.data.SimpleStore({
        fields: ['infonseat'],
        data : count
    }),
	width:50,
    displayField: 'infonseat',
    typeAhead: true,
    mode: 'local',
    triggerAction: 'all',
    emptyText:'0',
    selectOnFocus:true
});


var infonlap = new Ext.form.ComboBox({
    fieldLabel: 'Infant on lap',
    hiddenName: 'infonlap',
	store: new Ext.data.SimpleStore({
        fields: ['infonlap'],
        data : count
    }),
	width:50,
    displayField: 'infonlap',
    typeAhead: true,
    mode: 'local',
    triggerAction: 'all',
    emptyText:'0',
    selectOnFocus:true
});





var coach =[ ['Economy'],
['Buisness'],
['First']
];

var coachCombo = new Ext.form.ComboBox({
    fieldLabel: 'Coach',
    hiddenName: 'coach',
    store: new Ext.data.SimpleStore({
        fields: ['coach'],
        data : coach
    }),
	width:90,
    displayField: 'coach',
    typeAhead: true,
    mode: 'local',
    triggerAction: 'all',
    emptyText:'Economy',
    selectOnFocus:true
});
var button2= new Ext.Button(
                {
				//textAlign:'center',
				ui: 'blue-round',
                text:'Submit',
                 //icon:'key.gif',
                 //cls:'x-btn-text-icon',
                 handler:function(){ 
                	 
                	 Ext.getCmp('enterPanel').collapse(true);
				 
				 
				 
				 
				 var preview2 = new Ext.Panel({
           id: 'flightnetwork',
		 title:'Flight Network',
         region: 'center',
         cls:'summary',
        //listeners: entityViewer.previewProvider,
        autoScroll: false,
		
		 html:'<iframe width="100%" height="100%" src="http://www.flightnetwork.com/"></iframe>'
		 });
		 Ext.getCmp('displayPanel').add(preview2);
				 },
                 descriptionText:'Submit Flight Details'
                 });
				 
				 
				 var chinsen = new Ext.form.FieldSet({ 
	id:'chinsen',
	title:'Children Infants Seniors',
	collapsible:'true',
	collapsed:true,
	//layout:'hbox',
	
	//frame:true,
    buttonAlign: 'center',
   // bodyStyle:'align:center',
	//layout:'box',

	//labelAlign: 'top',
	align:'center',
	items:[	{xtype:'container',layout:'hbox',items:	[{xtype:'container',layout:'form',items:[child]},{xtype:'spacer',width:5},{xtype:'container',layout:'form',items:[senior]}]},
	{xtype:'container',layout:'hbox',items:[{xtype:'container',layout:'form',items:[infonseat]},{xtype:'spacer',width:5},{xtype:'container',layout:'form',items:[infonlap]}]}]
	});
	
	var flightfieldset = new Ext.form.FieldSet({ 
	id:'flightfieldset',
	title:'Enter Flight Details',
	collapsible:'false',
	//frame:true,
    buttonAlign: 'center',
  
	align:'center',
	items:[{
            xtype: 'radiogroup',
            cls: 'x-check-group-alt',
            items: [
                {boxLabel: 'One Way', name: 'rb-auto', inputValue: 1,
				listeners: {check:{fn:function(checkbox, checked){if (checked){Ext.getCmp('toCont').hide();}}}}},
                {boxLabel: 'Round Trip', name: 'rb-auto', inputValue: 2, 
				checked: true,
				listeners: {check:{fn:function(checkbox, checked){if (checked){Ext.getCmp('toCont').show();}}}}}
                
            ]
        },
		from,to,
		{xtype:'container',layout:'hbox',id:'fromCont',fieldLabel:'From Date',items:[fromDate,startTimePicker]},
	{xtype:'container',layout:'hbox',id:'toCont',fieldLabel:'To Date',items:[toDate,endTimePicker]},
	{xtype: "container",title: "Adult and Class",layout: "hbox" ,items: [{xtype:'container',layout:'form',items:[adult]},{xtype:'spacer',id:'hello',width:20},{xtype:'container',layout:'form',items:[coachCombo]}]},chinsen,button2]
	
	
	});
	
	
	
	
	
	var flightSites = new Ext.form.FieldSet({ 
	id:'flightSites',
	title:'Comparing Sites',
	collapsible:'true',
	collapsed:'true',
	//layout:'hbox',
	
	//frame:true,
    buttonAlign: 'center',
    bodyStyle:'align:center',
	//layout:'box',

	//labelAlign: 'top',
	align:'center',
	items:[{
             xtype: 'checkboxgroup',
           // fieldLabel: 'Multi-Column (vertical)',
            // Distribute controls across 3 even columns, filling each column
            // from top to bottom before starting the next column
            columns: 2,
            vertical: true,
			labelAlign:'left',
            items: [
                {boxLabel: 'Cheapoair',id:'cheapoair', name: 'cb-vert-1', checked: true},
                {boxLabel: 'OneTravel',id:'onetravel', name: 'cb-vert-2', checked: true},
                {boxLabel: 'FlightNetwork',id:'flightnetwork', name: 'cb-vert-3',checked: true},
                {boxLabel: 'WebJet',id:'webjet', name: 'cb-vert-4',checked: true},
                {boxLabel: 'Trip.com',id:'trip', name: 'cb-vert-5', checked: true}
            ]

        }]
	
	
	});
	
	
	// var flghtPanel = new Ext.FormPanel({ 
	// id:'flghtPanel',
	// title:'Flights',
	// labelAlign: 'top',
	// buttonAlign: 'center',
	// align:'center',
	// items:[flightfieldset]
	
	// });
	
	flightsPanel.superclass.constructor.call(this, {
        id:'flghtPanel',
	title:'Flights',
	labelAlign: 'top',
	buttonAlign: 'center',
	align:'center',
	autoScroll:true,
	 bodyStyle: 'background-image: url("../flights.jpg");',
	items:[flightfieldset,flightSites]
        
    });
	
    
  
};




Ext.extend(flightsPanel, Ext.FormPanel, {

   
    }

   
);

Ext.reg('flightsPanel', flightsPanel); 