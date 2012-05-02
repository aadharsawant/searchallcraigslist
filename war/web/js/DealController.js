




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
                height:52
               ,
                html:'<span style="color:blue;padding:5 5 5 5"><div></div><div class="fb-like" style="width:30%; text-align:center; float:right; clear:both;" data-href="http://searchdeck.appspot.com/" data-send="true" data-width="450" data-show-faces="false"></div><i>&nbsp;&nbsp;&nbsp;Search All and Every CraigsList ; An Aadhar Sawant Creation .</i></span>'
            })
			,
			enterPanel
			,
			displayPanel
         ]
     });
	
	
});