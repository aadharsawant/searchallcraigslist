



onPositionUpdate = function(position) {
	
	
	
         lat = position.coords.latitude;
         lng = position.coords.longitude;
        //alert("Current position2: " + lat + " " + lng);
        var mapwin = new Ext.Panel({
             layout: 'border',
             title: 'GMap Window',
             closeAction: 'hide',
             region:'center',
             collapsible:'true',
             width:400,
             height:400,
           //  x: 100,
          //   y: 60,
             border:true,
             margins:'50 50 50 50',
             closable:true,
             items: {
                 xtype: 'gmappanel',
                 
                 zoomLevel: 14,
                 width:400,
                 height:400,
                 gmapType: 'map',
                 mapConfOpts: ['enableScrollWheelZoom','enableDoubleClickZoom','enableDragging'],
                 mapControls: ['GSmallMapControl','GMapTypeControl','NonExistantControl'],
                 setCenter: {
                	 lat: lat,
                     lng: lng,
                     marker: {title: 'Current Location'}
                 }
             }
         });
        
        
        if (Ext.getCmp('gMapWin')!=null)
        	{
        Ext.getCmp('gMapWin').add(mapwin);
        Ext.getCmp('gMapWin').doLayout();
        	}
//    	
//    	//mapwin.show();
   

};


