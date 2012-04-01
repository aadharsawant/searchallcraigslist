




DealController = {};




Ext.onReady(function(){
	

	
//	if(navigator.geolocation)
//			
//	navigator.geolocation.getCurrentPosition(onPositionUpdate);
//	


   

   
  


	
	
    var enterPanel = new EnterPanel();
    var displayPanel = new DisplayPanel();
	
	


    var viewport = new Ext.Viewport({
        layout:'border',
        items:[
            new Ext.BoxComponent({ // raw element
                region:'north',
                el: 'header',
                height:32
//                ,
//                html:'<div id="planlongweekend" style="color:yellow"><i><b>       &nbsp;&nbsp;          Plan Long Weekend !</b> <i></div>'
            })
			,
			enterPanel
			,
			displayPanel
         ]
     });
	
	
});