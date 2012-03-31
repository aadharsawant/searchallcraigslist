
var lat =42.339419;
var lng = -71.09077;

    

GMapWindow = function() {
	
	
	
	
	
	
	
	GMapWindow.superclass.constructor.call(this, {
    id:'gMapWin',
	title:'Map',
	layout:'border',
	labelAlign: 'top',
	buttonAlign: 'center',
	align:'center',
	autoScroll:true,
	width:400,
	height:400,
	layout:'form',
	closable:true,
	border:true,
	margins:'5 5 5 5',
	 bodyStyle: 'background-image: url("/web/image/flights.png");'
//		 ,
//	items:[{
//           xtype : 'space'
//    }]
//        
    });
	
    
  
};




Ext.extend(GMapWindow, Ext.Panel, {

   
    }

   
);

Ext.reg('GMapWindow', GMapWindow); 