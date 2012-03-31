




DealController = {};

//function onPositionUpdate(position)
//{
//     lat = position.coords.latitude;
//     lng = position.coords.longitude;
//    //alert("Current position: " + lat + " " + lng);
//   
//	
//	//mapwin.show();
//}



Ext.onReady(function(){
	
//	function onPositionUpdate(position)
//	{
//	     lat = position.coords.latitude;
//	     lng = position.coords.longitude;
//	    //alert("Current position: " + lat + " " + lng);
//	   
//		
//		//mapwin.show();
//	}
	
	if(navigator.geolocation)
			
	navigator.geolocation.getCurrentPosition(onPositionUpdate);
	

//    if(navigator.geolocation)
//        navigator.geolocation.getCurrentPosition(onPositionUpdate);
//    else
//        alert("navigator.geolocation is not available");
//    
    
  //  var mapwin;
   

   
  


	
	
    var enterPanel = new EnterPanel();
    var displayPanel = new DisplayPanel();
	
	


    var viewport = new Ext.Viewport({
        layout:'border',
        items:[
            new Ext.BoxComponent({ // raw element
                region:'north',
                el: 'header',
                height:32
            })
			,
			enterPanel
			,
			displayPanel
         ]
     });
	
	
//	var viewport = new Ext.Viewport({
//        layout:'border'
//       
//    });


		/*
    Ext.get('header').on('click', function() {
        viewport.focus();
    });
    */
});

/*
// This is a custom event handler passed to preview panels so link open in a new windw
CatalogDeployer.LinkInterceptor = {
    render: function(p){
        p.body.on({
            'mousedown': function(e, t){ // try to intercept the easy way
                t.target = '_blank';
            },
            'click': function(e, t){ // if they tab + enter a link, need to do it old fashioned way
                if(String(t.target).toLowerCase() != '_blank'){
                    e.stopEvent();
                    window.open(t.href);
                }
            },
            delegate:'a'
        });
    }
};
*/