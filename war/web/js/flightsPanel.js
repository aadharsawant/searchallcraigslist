



flightsPanel = function() {
	
	
	

	
	
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
            url: 'http://planlongweekend.appspot.com/guestbook'
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
            url: 'http://planlongweekend.appspot.com/guestbook'
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

	
	

	    
		var from = new Ext.form.ComboBox({
	    fieldLabel: 'From',
	    hiddenName: 'from',
	    id:'fromCombo',
	    store: Grid2Store,
	    displayField: 'location',
	    valueField:'code',
	    typeAhead: false,
	    mode: 'remote',
	    triggerAction: 'all',
	    emptyText:'Choose From Airport...',
	    selectOnFocus:true,
	    forceSelection:true,

	   minChars:3,
	        loadingText: 'Searching...',
	  
	        itemSelector: 'div.search-item',
	       tpl:resultTpl,
	    pageSize: 10
	});
		
		

var to = new Ext.form.ComboBox({
    fieldLabel: 'To',
    hiddenName: 'to',
    id:'toCombo',
    store: Grid2Store,
    displayField: 'location',
    valueField:'code',
    typeAhead: false,
    mode: 'remote',
    triggerAction: 'all',
    emptyText:'Choose To Airport...',
    selectOnFocus:true,
    minChars:3,
   
        loadingText: 'Searching...',
        itemSelector: 'div.search-item',
       tpl:resultTpl,
    pageSize: 10
});

var today = new Date(); // get today date

var fromDate = new Ext.form.DateField({
	id:'fromDate',
    fieldLabel:'From Date',
    format: 'm/d/y',
    value: today // <-- you must put the date object here
});
	
	
	var startTimePicker = new Ext.form.TimeField({
		id:'startTime',
	fieldLabel:'From Time',
	width:70,
name: 'starttime',
editable:false,
value:'Any Time',
format:"H:i:s"
});


var toDate = new Ext.form.DateField({
	id:'toDate',
    fieldLabel:'To Date',
    format: 'm/d/y',
    value: today // <-- you must put the date object here
});
	
	
	var endTimePicker = new Ext.form.TimeField({
		id:'endTime',
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
	id:'adult',
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
	id:'child',
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
	id:'senior',
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
	id:'infantseat',
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
	id:'infantlap',
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
	id:'coachCombo',
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
                 
                 handler:function(){ 
                	 
                	 
                	 
                	 var cheapoairUrl =
                		 ['http://www.tripmama.com/default.aspx?tabid=110&adtype=1&addetails=84-474-1&rdr=1&extended=8-2-2-bd55eb088f4f44a1a4cc2a7922f5a1fc',
                		  ""
                		 
                		 ].join();
                	 
                	// var cheapoairUrl = (<r><![CDATA[http://www.tripmama.com/default.aspx?tabid=110&adtype=1&addetails=84-474-1&rdr=1&extended=8-2-2-bd55eb088f4f44a1a4cc2a7922f5a1fc]]></r>).toString();

                	 
                	 
                	
                	 
                	 
                	 var fromCombo =  Ext.getCmp('fromCombo').getValue();
                	 
                	 if (fromCombo=='')
                		 {
                	 
                	 Ext.MessageBox.alert('Error Message',"Please Enter From Value"); 
                	 return;
                		 }
                	 
                	 
                	 
                	 cheapoairUrl +=  "&fc=" +fromCombo;
                	//alert( Ext.getCmp('fromCombo').getValue());
                	
                	var toCombo =  Ext.getCmp('toCombo').getValue();
                	if (toCombo=='')
           		 {
           	 
           	 Ext.MessageBox.alert('Error Message',"Please Enter To Value"); 
           	 return;
           		 }
                	cheapoairUrl +=  "&tc=" +toCombo;
                	//alert( Ext.getCmp('toCombo').getValue());
                	
//                	alert (Ext.getCmp('radioGrp').getValue());
//                	alert (Ext.getCmp('oneWay').getValue());
                	
                	//alert (Ext.getCmp('return').getValue());
                	var fromDate =  Ext.getCmp('fromDate').getValue();
                	cheapoairUrl +=  "&dd=" +fromDate.format("m/d/y");
                	//alert(Ext.getCmp('fromDate').getValue().format("m/d/y"))
                	//alert( );
                	var toDate =  Ext.getCmp('toDate').getValue();
                	if(Ext.getCmp('return').getValue())
                		{
                		if (fromDate>toDate)
                			{
                			 Ext.MessageBox.alert('Error Message',"From Date has to be before To date"); 
                           	 return;
                			}
                	cheapoairUrl +=  "&rd=" +toDate.format("m/d/y");
                	cheapoairUrl +=  "&tt="+ 2;
                		}
                	else {
                		cheapoairUrl +=  "&tt="+ 1;
                	}
                	//alert( Ext.getCmp('toDate').getValue());
                	var startTime =  Ext.getCmp('startTime').getValue();
                	//alert( Ext.getCmp('startTime').getValue());
                	var endTime =  Ext.getCmp('endTime').getValue();
                	//alert( Ext.getCmp('endTime').getValue());
                	var adult =  Ext.getCmp('adult').getValue();
                	if (adult=='')
                		{
                		adult = '1';
                		}
                	cheapoairUrl +=  "&at=" +adult;
                	//alert( Ext.getCmp('adult').getValue());
                	var child =  Ext.getCmp('child').getValue();
                	if (child == '')
                		{
                		child='0';
                		}
                	cheapoairUrl +=  "&ct=" +child;
                	//alert( Ext.getCmp('child').getValue());
                	var senior =  Ext.getCmp('senior').getValue();
                	//alert( Ext.getCmp('senior').getValue());
                	var infantseat =  Ext.getCmp('infantseat').getValue();
                	//alert( Ext.getCmp('infantseat').getValue());
                	var infantlap =  Ext.getCmp('infantlap').getValue();
                	//alert( Ext.getCmp('infantlap').getValue());
                	var coachCombo =  Ext.getCmp('coachCombo').getValue();
                	if(coachCombo==''||coachCombo=='Economy')
                		{
                		cheapoairUrl +=  "&cb=" +1;
                		}
                	else if (coachCombo=='Buisness')
                		{
                		cheapoairUrl +=  "&cb=" +2;
                		}
                	else if (coachCombo=='First')
            		{
            		cheapoairUrl +=  "&cb=" +3;
            		}
                	//alert( Ext.getCmp('coachCombo').getValue());
                	
                

				 
				 
				 var preview2 = new Ext.Panel({
           id: 'cheapoair',
		 title:'Cheapoair',
         region: 'center',
         cls:'summary',
        //listeners: entityViewer.previewProvider,
        autoScroll: false,
		tabid:0,
		closable:true,
		 html:'<iframe width="100%" height="100%" src='+cheapoairUrl+'></iframe>'
		 });
		 Ext.getCmp('displayPanel').add(preview2);
		 Ext.getCmp('displayPanel').setActiveTab(preview2);

		 Ext.getCmp('enterPanel').collapse(true);
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
            id:'radioGrp',
            items: [
                {boxLabel: 'One Way', name: 'rb-auto', inputValue: 1,id:'oneWay',
				listeners: {check:{fn:function(checkbox, checked){if (checked){Ext.getCmp('toCont').hide();}}}}},
                {boxLabel: 'Round Trip', name: 'rb-auto', inputValue: 2,id:'return', 
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
	 bodyStyle: 'background-image: url("/web/image/flights.png");',
	items:[flightfieldset,flightSites]
        
    });
	
    
  
};




Ext.extend(flightsPanel, Ext.FormPanel, {

   
    }

   
);

Ext.reg('flightsPanel', flightsPanel); 