// To play in Firebug uncomment next line
// Ext.get(document.body).update('<div id="ext-test"></div>');

// reference local blank image
Ext.BLANK_IMAGE_URL = '/extjs/lib/resources/images/default/s.gif';

// create namespace
Ext.namespace('Test');

// create application
Test.app = function() {
 // do NOT access DOM from here; elements don't exist yet

 // private variables
	
	 var flightPanel = new flightsPanel();

// var myStore = new Ext.data.JsonStore({
// url: '/examples/data1',
// root: 'rows',
// fields: ['alpha2code','name']
// });

 // private functions

 //myStore.load();

 // public space
 return {
 // public properties, e.g. strings to translate

 // public methods
 init: function() {
 myForm = new Ext.TabPanel({
	 activeTab:0,
 labelWidth: 125, // label settings here cascade unless overridden
 frame:true,
 renderTo: 'ext-test',
 title: 'Test panel',
 bodyStyle:'padding:5px 5px 0',
 width: 300,
// layout:'form',
 items: [
         flightPanel,
//         {
// xtype: 'combo',
// id: 'countryCmb',
// fieldLabel: 'Country',
// hiddenName: 'ddi_country',
// emptyText: 'Select a country...',
// store:
// new Ext.data.SimpleStore({
// fields: ['alpha2code','name'],
// data: [
// ["BE","Belgium"],["BR","Brazil"],["BG","Bulgaria"],["CA","Canada"],["CL","Chile"],["CY","Cyprus"],["CZ","Czech Republic"],["FI","Finland"],["FR","France"],["DE","Germany"],["HU","Hungary"],["IE","Ireland"],["IL","Israel"],["IT","Italy"],["LV","Latvia"],["LT","Lithuania"],["MX","Mexico"],["NL","Netherlands"],["NZ","New Zealand"],["NO","Norway"],["PK","Pakistan"],["PL","Poland"],["RO","Romania"],["SK","Slovakia"],["SI","Slovenia"],["ES","Spain"],["SE","Sweden"],["CH","Switzerland"],["GB","United Kingdom"]
// ]
// }), // end of Ext.data.SimpleStore
// displayField: 'name',
// valueField: 'alpha2code',
// selectOnFocus: true,
// mode: 'local',
// typeAhead: true,
// editable: false,
// triggerAction: 'all',
// value: 'GB',
// listeners:
// { select: { fn:function(combo, value)
// {
// Ext.getCmp('cityCmb').clearValue();
// myStore.load({params:{ddi_country: this.value}});
// }
// } }
// },{
// xtype: 'combo',
// id: 'cityCmb',
// fieldLabel: "City",
// hiddenName: 'ddi_city',
// name: "city",
// triggerAction: "all",
// loadingText: "Loading...",
// emptyText: "Select country first...",
// selectOnFocus:true,
// store: myStore,
// mode:'local',
// displayField: "name",
// valueField: "alpha2code",
// forceSelection: true,
// editable: false
// }
 ] //items
 }); // end of Ext.FormPanel

 // not sure if it is the right place for this?
// myStore.load({params:{ddi_country: 'GB'}});

 } // end of init
 };
}(); // end of app

Ext.onReady(Test.app.init, Test.app); 