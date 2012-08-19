




DealController = {};




Ext.onReady(function(){
	
	
	
    var enterPanel = new EnterPanel();
    var displayPanel = new DisplayPanel();
	
	
var bottombar =  new Ext.Toolbar({
   
    height: 160,
    html:'email :searchdeck@gmail.com'
    
   })
;
    var viewport = new Ext.Viewport({
        layout:'border',
        items:[
            new Ext.BoxComponent({ // raw element
                region:'north',
                el: 'header',
                height:52
               ,
                html:
                	
                	
                	'<span style="color:blue;padding:5 5 5 5"><div></div><div class="fb-like" style="width:30%; text-align:center; float:right; clear:both;" data-href="http://searchdeck.appspot.com/" data-send="true" data-width="450" data-show-faces="false"></div>&nbsp;&nbsp;&nbsp;&nbsp;<img border="0" src="../web/image/a0l.gif"><i>&nbsp;&nbsp;&nbsp;Search All and Every Classified Site ; SearchDeck is not affiliated to any Classified site.</i>'
                	+
                	'&nbsp;&nbsp;&nbsp;&nbsp;<a href="mailto:searchdeck.appspot@gmail.com?Subject=Hello%20again">Send Mail</a>'
                	+
                	'</span>'
            })
			,
			enterPanel
			,
			displayPanel
//			,
//			amazon
			
         ]

     });
	
	
});