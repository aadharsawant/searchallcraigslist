
<!--
/*!
 * Ext JS Library 3.0.0
 * Copyright(c) 2006-2009 Ext JS, LLC
 * licensing@extjs.com
 * http://www.extjs.com/license
 */
-->
<html>
<head>
<title>Hello World Window</title>

 <link rel="stylesheet" type="text/css" href="../css/ext-all.css" />
      
    <script type="text/javascript" src="../js/ext-base.js"></script>
 	<script type="text/javascript" src="../js/ext-all.js"></script>

</head>

<!-- Revised from demo code in ext3.0.0 -->
<body>
<script type="text/javascript">
/*!
 * Ext JS Library 3.0.0
 * Copyright(c) 2006-2009 Ext JS, LLC
 * licensing@extjs.com
 * http://www.extjs.com/license
 */
Ext.onReady(function(){

    // create the Data Store
    var store = new Ext.data.JsonStore({
       // root: 'users',
       // totalProperty: 'totalCount',
       // idProperty: 'code',
        remoteSort: true,
        root:'items',
        totalProperty: 'totalProperty',

        fields: [
            
            {name: 'link', mapping: 'link'},
            {name: 'title', mapping: 'title'},
            {name: 'city', mapping: 'city'},
            {name: 'date', mapping: 'date'}
        ],

        // load using script tags for cross domain, if the data in on the same domain as
        // this page, an HttpProxy would be better
        proxy: new Ext.data.ScriptTagProxy({
            url: "http://localhost:8888/all-california-craigslist"
        })
    });
    store.setDefaultSort('location', 'desc');
alert(store.getCount());

function renderTopic(value, p, record){
    return String.format(
            '<b><a href="{0}" target="_blank">{1}</a></b>',
             record.data.link, record.data.title);
}
    function renderLast(value, p, r){
        return String.format( r.data['location']);
    }

    var grid = new Ext.grid.GridPanel({
        width:700,
        height:500,
        title:'ExtJS.com - Browse Forums',
        store: store,
        trackMouseOver:false,
        disableSelection:true,
        loadMask: true,

        // grid columns
        columns:[
         //        {
       //     id: 'item', // id assigned so we can apply custom css (e.g. .x-grid-col-topic b { color:#333 })
         //   header: "Topic",
           // dataIndex: 'link',
           // width: 420,
           // renderer: renderTopic,
           // sortable: true
       // },
     //   {
       //     header: "Author",
         //   dataIndex: 'link',
           // width: 100,
           // hidden: true,
           // sortable: true
       // }
       //,
       {
            header: "Titles",
            dataIndex: 'title',
           width:500,
            align: 'left',
            renderer:renderTopic,
            sortable: true
        },
       {
           header: "City",
           dataIndex: 'city',
          width:100,
           align: 'left',
         //  renderer:renderTopic,
           sortable: true
       },
       {
           header: "Date",
           dataIndex: 'date',
          width:100,
           align: 'left',
         //  renderer:renderTopic,
           sortable: true
       }
      //  ,{
        //    id: 'item',
          //  header: "Last Post",
            //dataIndex: 'item.about',
            //width: 150,
          //  renderer: renderLast,
           // sortable: true
       // }
        ],

        // customize view config
     //   viewConfig: {
       //     forceFit:true,
         //   enableRowBody:true,
          //  showPreview:true,
           // getRowClass : function(record, rowIndex, p, store){
            //    if(this.showPreview){
             //       p.body = '<p>'+record.data.title+'</p>';
              //      return 'x-grid3-row-expanded';
               // }
                //return 'x-grid3-row-collapsed';
           // }
       // }
   // ,

        // paging bar on the bottom
        bbar: new Ext.PagingToolbar({
            pageSize: 100,
            store: store,
            displayInfo: true,
            displayMsg: 'Displaying topics {0} - {1} of {2}',
            emptyMsg: "No topics to display",
            items:[
                '-', {
                pressed: true,
                enableToggle:true,
                text: 'Show Preview',
                cls: 'x-btn-text-icon details',
                toggleHandler: function(btn, pressed){
                    var view = grid.getView();
                    view.showPreview = pressed;
                    view.refresh();
                }
            }]
        })
    });

    // render it
    grid.render('topic-grid');

    // trigger the data store load
    store.load({params:{start:0, limit:100}});
});
</script>
<div id="topic-grid"></div>
</body>
</html>
