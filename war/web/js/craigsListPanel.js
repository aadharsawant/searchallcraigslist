
// some data used in the examples
Ext.namespace('Ext.example');

var region ="USA";

Ext.example.states = [
        ['AL', 'Alabama', 'The Heart of Dixie'],
        ['AK', 'Alaska', 'The Land of the Midnight Sun'],
        ['AZ', 'Arizona', 'The Grand Canyon State'],
        ['AR', 'Arkansas', 'The Natural State'],
        ['CA', 'California', 'The Golden State'],
        ['CO', 'Colorado', 'The Mountain State'],
        ['CT', 'Connecticut', 'The Constitution State'],
        ['DE', 'Delaware', 'The First State'],
        ['DC', 'District of Columbia', "The Nation's Capital"],
        ['FL', 'Florida', 'The Sunshine State'],
        ['GA', 'Georgia', 'The Peach State'],
        ['HI', 'Hawaii', 'The Aloha State'],
        ['ID', 'Idaho', 'Famous Potatoes'],
        ['IL', 'Illinois', 'The Prairie State'],
        ['IN', 'Indiana', 'The Hospitality State'],
        ['IA', 'Iowa', 'The Corn State'],
        ['KS', 'Kansas', 'The Sunflower State'],
        ['KY', 'Kentucky', 'The Bluegrass State'],
        ['LA', 'Louisiana', 'The Bayou State'],
        ['ME', 'Maine', 'The Pine Tree State'],
        ['MD', 'Maryland', 'Chesapeake State'],
        ['MA', 'Massachusetts', 'The Spirit of America'],
        ['MI', 'Michigan', 'Great Lakes State'],
        ['MN', 'Minnesota', 'North Star State'],
        ['MS', 'Mississippi', 'Magnolia State'],
        ['MO', 'Missouri', 'Show Me State'],
        ['MT', 'Montana', 'Big Sky Country'],
        ['NE', 'Nebraska', 'Beef State'],
        ['NV', 'Nevada', 'Silver State'],
        ['NH', 'New Hampshire', 'Granite State'],
        ['NJ', 'New Jersey', 'Garden State'],
        ['NM', 'New Mexico', 'Land of Enchantment'],
        ['NY', 'New York', 'Empire State'],
        ['NC', 'North Carolina', 'First in Freedom'],
        ['ND', 'North Dakota', 'Peace Garden State'],
        ['OH', 'Ohio', 'The Heart of it All'],
        ['OK', 'Oklahoma', 'Oklahoma is OK'],
        ['OR', 'Oregon', 'Pacific Wonderland'],
        ['PA', 'Pennsylvania', 'Keystone State'],
        ['RI', 'Rhode Island', 'Ocean State'],
        ['SC', 'South Carolina', 'Nothing Could be Finer'],
        ['SD', 'South Dakota', 'Great Faces, Great Places'],
        ['TN', 'Tennessee', 'Volunteer State'],
        ['TX', 'Texas', 'Lone Star State'],
        ['UT', 'Utah', 'Salt Lake State'],
        ['VT', 'Vermont', 'Green Mountain State'],
        ['VA', 'Virginia', 'Mother of States'],
        ['WA', 'Washington', 'Green Tree State'],
        ['WV', 'West Virginia', 'Mountain State'],
        ['WI', 'Wisconsin', "America's Dairyland"],
        ['WY', 'Wyoming', 'Like No Place on Earth']
    ];


var statestore = new Ext.data.ArrayStore({
    fields: ['abbr', 'state'],
    data : Ext.example.states // from states.js
});

var combo = new Ext.form.ComboBox({
    store: statestore,
    displayField: 'state',
    typeAhead: true,
    mode: 'local',
    triggerAction: 'all',
    emptyText: 'Select a state...',
    selectOnFocus: true,
    width: 135,
    getListParent: function() {
        return this.el.up('.x-menu');
    },
    listeners: {
        select: function(record) {
        	
        	region = record.lastSelectionText ;
        	var par = Ext.getCmp("usachecked");
        	par.checked=false;
        	
        }
      },
    iconCls: 'no-icon'
});
var sectionNode = "";

craigsListPanel = function() {
	
	
	
	var search = new Ext.form.TextField({
	    fieldLabel: 'Search Text',
	    hiddenName: 'search',
	    labelStyle: 'font-weight:bold;',
	    id:'searchCombo',
	   // store: Grid2Store,
	  //  displayField: 'location',
	  //  valueField:'code',
	    typeAhead: false,
	    mode: 'remote',
	   // triggerAction: 'all',
	    hideTrigger:true,
	    emptyText:'Search All USA Classifieds',
	    selectOnFocus:true,
	    forceSelection:true,

	   minChars:3,
	        loadingText: 'Searching...',
	  
	        itemSelector: 'div.search-item',
	     ///  tpl:resultTpl,
	    pageSize: 10
	});
	
	
	
	
	var craigsStore = new Ext.data.JsonStore({
        root: 'craigslist',
        totalProperty: 'totalCount',
        idProperty: 'code',
        remoteSort: true,

        fields: [
            'code', 'name', 'location'
        ],

        // load using script tags for cross domain, if the data in on the same domain as
        // this page, an HttpProxy would be better
        proxy: new Ext.data.ScriptTagProxy({
          //  url: 'http://searchdeck.appspot.com/guestbook'
        	 url: '../guestbook'
        }),
        
        listeners: {
        	beforeload: function(store) {
        		store.baseParams.from = "craigslist";
        		 
        		  
        		}

        }
    });
	
	

	// Custom rendering Template
    var resultTpl = new Ext.XTemplate(
        '<tpl for="."><div class="search-item" >',
          
        ' &nbsp;&nbsp;{name}',
            '<br></br>',
           
          
        '</div></tpl>'
    );
	
	
	
	var insection = new Ext.form.ComboBox({
	    fieldLabel: 'In Section',
	    hiddenName: 'insection',
	    labelStyle: 'font-weight:bold;',
	    id:'insection',
	    store: craigsStore,
	    displayField: 'name',
	    valueField:'code',
	    typeAhead: false,
	    mode: 'remote',
	   // triggerAction: 'all',
	    hideTrigger:true,
	    emptyText:'Type Section Like : Jobs',
	    selectOnFocus:true,
	    forceSelection:true,

	   minChars:3,
	        loadingText: 'Searching...',
	  
	        itemSelector: 'div.search-item',
	      tpl:resultTpl,
	    pageSize: 10
	});
	

	
	
	
	
	
	 // shorthand
    var Tree = Ext.tree;
    
    var selmodel =new Ext.tree.DefaultSelectionModel();
	
	
	 var tree = new Tree.TreePanel({
		 fieldLabel:"Select in Section",
		 labelStyle: 'font-weight:bold;',
         animate:true, 
         autoScroll:true,
         loader: new Tree.TreeLoader(
        		 {
        	    dataUrl: '../sections?section=jobs'
        		 }
        		 ),
         enableDD:true,
         containerScroll: true,
         border: false,
         width: 250,
         height: 750,
         rootVisible:false,

         selModel: selmodel,
         listeners: {
        	 click: function(n){
        		 sectionNode=n.id;
             }
,
        	 change: function(node,event) {
        		 
        	 alert(node.id);
        	 }
         },
         dropConfig: {appendOnly:true}
     });
	
	// add a tree sorter in folder mode
     new Tree.TreeSorter(tree, {folderSort:true});
     
     // set the root node
     var root = new Tree.AsyncTreeNode({
         text: 'All Jobs', 
         draggable:false, // disable root node dragging
         id:'jjj'
     });
     tree.setRootNode(root);
     
     // render the tree
   //  tree.render('tree');
     
  //   root.expand(false, /*no anim*/ false);
	
	//tree.setRootNode(root);

	//tree.render();
	root.expand(true);
	
	
	
	//commnity tree
	

	 var commtree = new Tree.TreePanel({
		 fieldLabel:"Select in Community Section",
		 labelStyle: 'font-weight:bold;',
        animate:true, 
        autoScroll:true,
        loader: new Tree.TreeLoader(
       		 {
       	    dataUrl: '../sections?section=community&section2=housing&section3=gigs'
       		 }
       		 ),
        enableDD:true,
        containerScroll: true,
        border: false,
        width: 250,
        height: 750,
        rootVisible:false,

        selModel: selmodel,
        listeners: {
       	 click: function(n){
       		 sectionNode=n.id;
            }
,
       	 change: function(node,event) {
       		 
       	 alert(node.id);
       	 }
        },
        dropConfig: {appendOnly:true}
    });
	
	// add a tree sorter in folder mode
    new Tree.TreeSorter(commtree, {folderSort:true});
    
    // set the root node
    var commroot = new Tree.AsyncTreeNode({
        text: 'All Community', 
        draggable:false, // disable root node dragging
        id:'ccc'
    });
    commtree.setRootNode(commroot);
    
    // render the tree
  //  tree.render('tree');
    
 //   root.expand(false, /*no anim*/ false);
	
	//tree.setRootNode(root);

	//tree.render();
	commroot.expand(true);
	
	
	//commnity tree
	

	
	
	//end community
   
   
   
   var saletree = new Tree.TreePanel({
		 fieldLabel:"Select in Sales Section",
		 labelStyle: 'font-weight:bold;',
     animate:true, 
     autoScroll:true,
     loader: new Tree.TreeLoader(
    		 {
    	    dataUrl: '../sections?section=sale'
    		 }
    		 ),
     enableDD:true,
     containerScroll: true,
     border: false,
     width: 250,
     height: 750,
     rootVisible:false,

     selModel: selmodel,
     listeners: {
    	 click: function(n){
    		 sectionNode=n.id;
         }
,
    	 change: function(node,event) {
    		 
    	 alert(node.id);
    	 }
     },
     dropConfig: {appendOnly:true}
 });
	
	// add a tree sorter in folder mode
 new Tree.TreeSorter(saletree, {folderSort:true});
 
 // set the root node
 var saleroot = new Tree.AsyncTreeNode({
     text: 'All Sale', 
     draggable:false, // disable root node dragging
     id:'sss'
 });
 saletree.setRootNode(saleroot);
 
 // render the tree
//  tree.render('tree');
 
// root.expand(false, /*no anim*/ false);
	
	//tree.setRootNode(root);

	//tree.render();
 saleroot.expand(true);
 
 
 
 
 
 
 var servtree = new Tree.TreePanel({
		 fieldLabel:"Select in Services Section",
		 labelStyle: 'font-weight:bold;',
   animate:true, 
   autoScroll:true,
   loader: new Tree.TreeLoader(
  		 {
  	    dataUrl: '../sections?section=services'
  		 }
  		 ),
   enableDD:true,
   containerScroll: true,
   border: false,
   width: 250,
   height: 750,
   rootVisible:false,

   selModel: selmodel,
   listeners: {
  	 click: function(n){
  		 sectionNode=n.id;
       }
,
  	 change: function(node,event) {
  		 
  	 alert(node.id);
  	 }
   },
   dropConfig: {appendOnly:true}
});
	
	// add a tree sorter in folder mode
new Tree.TreeSorter(servtree, {folderSort:true});

// set the root node
var servroot = new Tree.AsyncTreeNode({
   text: 'All Service', 
   draggable:false, // disable root node dragging
   id:'bbb'
});
servtree.setRootNode(servroot);

// render the tree
//tree.render('tree');

//root.expand(false, /*no anim*/ false);
	
	//tree.setRootNode(root);

	//tree.render();
servroot.expand(true);
	
	
	//end community
	
	var searchIn = new Ext.form.TextField({
	    fieldLabel: 'In',
	    hiddenName: 'in',
	    labelStyle: 'font-weight:bold;',
	    id:'inCombo',
	   // store: Grid2Store,
	  //  displayField: 'location',
	  //  valueField:'code',
	    typeAhead: false,
	    mode: 'remote',
	   // triggerAction: 'all',
	    hideTrigger:true,
	    emptyText:'Search This section',
	    selectOnFocus:true,
	    forceSelection:true,

	   minChars:3,
	        loadingText: 'Searching...',
	  
	        itemSelector: 'div.search-item',
	     ///  tpl:resultTpl,
	    pageSize: 10
	});
	
	var button2 = new Ext.Button(
                {
				//textAlign:'center',
				ui: 'blue-round',
                text:'Submit',
                 
                 handler:function(){
                	  text = Ext.getCmp('searchCombo').getValue();
                	  typeIn = sectionNode;
                	  if(Ext.getCmp('telecommute').getValue())
                		 
                		  addOne = 'telecommuting';
                		 
                	  else 
                		  addOne = '';
                	 
                		  if(Ext.getCmp('contract').getValue())
                		  {
                		  addTwo = 'contract';
                		  }
                		  else {
                			  addTwo = '';
                    	  }
                		  if(Ext.getCmp('internship').getValue())
                		  {
                		  addThree = 'internship';
                		  }
                		  else {
                			  addThree = '';
                    	  }
                		  if(Ext.getCmp('part-time').getValue())
                		  {
                		  addFour = 'part-time';
                		  }
                		  else {
                			  addFour = '';
                    	  }
                		  if(Ext.getCmp('non-profit').getValue())
                		  {
                		  addFive = 'non-profit';
                		  }
                		  else {
                			  addFive = '';
                    	  }
                		  if(Ext.getCmp('has-image').getValue())
                		  {
                		  hasPic = '1';
                		  }
                		  else {
                			  hasPic = '';
                    	  }
                	// alert(Ext.getCmp('searchCombo').getValue());
                		// grid.getStore().load({params:{start:0, limit:100 }});
                		  if (typeIn=="")
                			  {
                			  Ext.MessageBox.alert('Error', 'Please select a section!');
                			  return ;
                			  }
                		  Ext.getCmp('displayPanel').setActiveTab(Ext.getCmp('reachooWin'));
                		 // grid.getEl().mask('Loading...', 'x-mask-loading');
                		  reachoostore.load({params:{start:0, limit:100 }});
                	 store.load({params:{start:0, limit:100 }});
                	 amazon.update('<iframe width="100%" height="100%" src="web/html/amazon.html?query='+text+'"></iframe>');
                	
                	// backpagestore.load({params:{start:0, limit:100 }});
                 },
                 descriptionText:'Submit  Search Details'
                 });
	
	
	var craigsFieldSet = new Ext.form.FieldSet({ 
		id:'craigsFieldSet',
		title:'Enter  Details',
		collapsible:'false',
		//frame:true,
	    buttonAlign: 'center',
	  
		align:'center',
		items:[search,
		      // tree,
		      // commtree,
		      // insection,
		       {xtype:'panel', fieldLabel: 'In Section', labelStyle: 'font-weight:bold;',layout:'hBox',items:[tree,commtree,saletree,servtree]},
		       {
            xtype: 'checkboxgroup',
          // fieldLabel: 'Multi-Column (vertical)',
           // Distribute controls across 3 even columns, filling each column
           // from top to bottom before starting the next column
           columns: 2,
           vertical: true,
			labelAlign:'left',
           items: [
               {boxLabel: 'telecommute',id:'telecommute', name: 'cb-vert-1', checked: false},
               {boxLabel: 'contract',id:'contract', name: 'contract', checked: false},
               {boxLabel: 'internship',id:'internship', name: 'internship',checked: false},
               {boxLabel: 'part-time',id:'part-time', name: 'part-time',checked: false},
               {boxLabel: 'non-profit',id:'non-profit', name: 'non-profit', checked: false},
               {boxLabel: 'has image',id:'has-image', name: 'has-image', checked: false}
           ]

       },button2
		]
		
		
		});
	
	
	

	var menu = new Ext.menu.Menu({
	    id: 'mainMenu',
	    style: {
	        overflow: 'visible'     // For the Combo popup
	    },
	    items: [
	       '-', {
	            text: 'Countries',
	            menu: {        // <-- submenu by nested config object
	                items: [
	                    // stick any markup in a menu
	                    '<b class="menu-title">Choose a Country</b>',
	                    {
	                        text: 'USA',
	                        id:'usachecked',
	                        checked: true,
	                        group: 'theme',
	                        listeners: {
	                            click: onItemClick 
	                          },
	                        menu:{
	                        	items:[combo]
	                        }
	                    }
	                    , {
	                        text: 'Canada',
	                        checked: false,
	                        group: 'theme',
	                        listeners: {
	                            click: onItemClick 
	                          }
	                    }
	                    , {
	                        text: 'India',
	                        checked: false,
	                        group: 'theme',
	                        listeners: {
	                            click: onItemClick 
	                          }
	                    }
	                    , {
	                        text: 'Australia',
	                        checked: false,
	                        group: 'theme',
	                        listeners: {
	                            click: onItemClick 
	                          }
	                    }
	                    , {
	                        text: 'Japan',
	                        checked: false,
	                        group: 'theme',
	                        listeners: {
	                            click: onItemClick 
	                          }
	                    }
	                    , {
	                        text: 'Mexico',
	                        checked: false,
	                        group: 'theme',
	                        listeners: {
	                            click: onItemClick 
	                          }
	                    }
	                    , {
	                        text: 'UK',
	                        checked: false,
	                        group: 'theme',
	                        listeners: {
	                            click: onItemClick 
	                          }
	                    }
	//                    , {
//	                        text: 'Africa',
//	                        checked: false,
//	                        group: 'theme',
//	                        listeners: {
//	                            click: onItemClick 
//	                          }
//	                    }
	                ]
	            }
	        },
	        {
                text: 'Euro',
                checked: false,
                group: 'theme',
                listeners: {
                    click: onItemClick 
                  }
            },
            {
                text: 'SouthAmerica',
                checked: false,
                group: 'theme',
                listeners: {
                    click: onItemClick 
                  }
            },
            
            {
                text: 'AsiaPac',
                checked: false,
                group: 'theme',
                listeners: {
                    click: onItemClick 
                  }
            }
            ,
            {
                text: 'AfricaMEAsia',
                checked: false,
                group: 'theme',
                listeners: {
                    click: onItemClick 
                  }
            }
	    ]
	});
	
	craigsListPanel.superclass.constructor.call(this, {
        id:'craigsListPanel',
     // layout:'form',
	title:'Classifieds Search',
	labelAlign: 'top',
	buttonAlign: 'center',
	align:'center',
	autoScroll:true,
	 bodyStyle: 'background-image: url("/web/image/flights.png");'
		 ,
		 tbar: [{
	            text:'Select a Region',
	            iconCls: 'bmenu',  // <-- icon
	            menu: menu  // assign menu by instance
	        }
        ],
	items:[{xtype:'box',
		height:50},craigsFieldSet]
        
    });
	
    
  
};










Ext.extend(craigsListPanel, Ext.FormPanel, {

   
    }

   
);


function onItemClick(item){
	
		region=item.text;
		
  //  Ext.example.msg('Item Check', 'You {1} the "{0}" menu item.', item.text, checked ? 'checked' : 'unchecked');
}

function onItemCheck(item, checked){
	if(checked!=undefined && checked==true)
		{
		region=item.text;
		}
	
  //  Ext.example.msg('Item Check', 'You {1} the "{0}" menu item.', item.text, checked ? 'checked' : 'unchecked');
}

Ext.reg('craigsListPanel', craigsListPanel); 