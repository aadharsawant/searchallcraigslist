DisplayPanel = function() {
    
	 var gMapWin = new GMapWindow();
	 
	 var reachooWin = new ReachooWindow();
	 
	 var craigListPanel = new craigsListPanel();
	 
	// var bpGrid = new Bpgrid();
	 
	 
	
	// var flightPanel = new flightsPanel();
	
	DisplayPanel.superclass.constructor.call(this, {
        id:'displayPanel',
        activeTab:0,
        region:'center',
      //  margins:'0 5 5 0',
        resizeTabs:true,
        tabWidth:150,
        minTabWidth: 120,
        bodyStyle: 'background-image: url("/web/image/flights.png");',
       // enableTabScroll: true,
        plugins: new Ext.ux.TabCloseMenu(),
        items: [craigListPanel,gMapWin,reachooWin
                //,bpGrid
                ]

        
       // }
    });
};

Ext.extend(DisplayPanel, Ext.TabPanel, {

   
});

Ext.reg('displayPanel', DisplayPanel);