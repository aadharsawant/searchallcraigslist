EnterPanel = function() {



	
	 var flightPanel = new flightsPanel();
	 
	 var craigListPanel = new craigsListPanel();
	 
	 
	
	
	EnterPanel.superclass.constructor.call(this, {
        id:'enterPanel',
        region:'west',
        
        title:'Cruises',
        split:true,
        width: 300,
        minSize: 175,
        maxSize: 400,
        collapsible: true,
        margins:'0 0 5 5',
        cmargins:'0 5 5 5',
        rootVisible:false,
        lines:false,
        autoScroll:true,
        activeTab:0,
        collapseFirst:false
        ,
		items:[craigListPanel,
		       flightPanel		
		]
        
    });

  
}












Ext.reg('enterPanel', EnterPanel); 
Ext.extend(EnterPanel, Ext.TabPanel, {

		}
	);