
var lat =42.339419;
var lng = -71.09077;

    

GMapWindow = function() {
	
	
	
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
         closable:true,
      //   html:'<div id="get">Please Enable Browser for GeoLocation</div>'
       //  ,
         items: {                 
        	 xtype: 'gmappanel',
             zoomLevel: 14,
             gmapType: 'map',
             mapConfOpts: ['enableScrollWheelZoom','enableDoubleClickZoom','enableDragging'],
             mapControls: ['GSmallMapControl','GMapTypeControl','NonExistantControl'],
             setCenter: {
                geoCodeAddr: 'sfo',
                 marker: {title: 'san fransisco airport'}
//	 lat: 42.339419,
//     lng: -71.09077,
//     marker: {title: 'Northeastern University'}
             }
//	 ,
//             markers: [{
//                 lat: 42.339641,
//                 lng: -71.094224,
//                 marker: {title: 'Boston Museum of Fine Arts'},
//                 listeners: {
//                     click: function(e){
//                         Ext.Msg.alert('Its fine', 'and its art.');
//                     }
//                 }
//             },{
//                 lat: 42.339419,
//                 lng: -71.09077,
//                 marker: {title: 'Northeastern University'}
//             }]

         }
     });
    
	
	
	
	GMapWindow.superclass.constructor.call(this, {
    id:'gMapWin',
	title:'Map',
	layout:'hbox',
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
	items:[mapwin]
//        
    });
	
    
  
};




Ext.extend(GMapWindow, Ext.Panel, {

   
    }

   
);

Ext.reg('GMapWindow', GMapWindow); 