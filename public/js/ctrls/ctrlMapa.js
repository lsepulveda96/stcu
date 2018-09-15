app.controller('controladorMapa', ['$scope','ngDialog','servicioMapa', function($scope, ngDialog, servicio) {



//
//   var options = {
//       position: 'topleft', // toolbar position, options are 'topleft', 'topright', 'bottomleft', 'bottomright'
//       drawMarker: true, // adds button to draw markers
//       drawPolyline: true, // adds button to draw a polyline
//       drawRectangle: true, // adds button to draw a rectangle
//       drawPolygon: true, // adds button to draw a polygon
//       drawCircle: true, // adds button to draw a cricle
//       cutPolygon: true, // adds button to cut a hole in a polygon
//       editMode: true, // adds button to toggle edit mode for all layers
//       removalMode: true, // adds a button to remove layers
//   };
//
//   // add leaflet.pm controls to the map
//   map.pm.addControls(options);
//
//   // make markers not snappable during marker draw
//   map.pm.enableDraw('Marker', { snappable: false });
//   map.pm.disableDraw('Marker');
//
//   // let polygons finish their shape on double click
//   map.pm.enableDraw('Poly', { finishOn: 'dblclick' });
//   map.pm.disableDraw('Poly');
//
//   // optional options for line style during draw. These are the defaults
// var options = {
//   // snapping
//   snappable: true,
//   snapDistance: 20,
//
//   // allow snapping to the middle of segments
//   snapMiddle: false,
//
//   // self intersection
//   allowSelfIntersection: true,
//
//   // the lines between coordinates/markers
//   templineStyle: {
//       color: 'red',
//   },
//
//   // the line from the last marker to the mouse cursor
//   hintlineStyle: {
//       color: 'red',
//       dashArray: [5, 5],
//   },
//
//   // show a marker at the cursor
//   cursorMarker: false,
//
//   // finish drawing on double click
//   // DEPRECATED: use finishOn: 'dblclick' instead
//   finishOnDoubleClick: false,
//
//   // specify type of layer event to finish the drawn shape
//   // example events: 'mouseout', 'dblclick', 'contextmenu'
//   // List: http://leafletjs.com/reference-1.2.0.html#interactive-layer-click
//   finishOn: 'contextmenu',
//
//   // custom marker style (only for Marker draw)
//   markerStyle: {
//       opacity: 0.5,
//       draggable: true,
//   },
// };
//
// // enable drawing mode for shape - e.g. Poly, Line, etc
// map.pm.enableDraw('Poly', options);
// map.pm.enableDraw('Rectangle', options);
// map.pm.enableDraw('Line', options);
// map.pm.enableDraw('Marker', options);
// map.pm.enableDraw('Circle', options);
//
// // get array of all available shapes
// map.pm.Draw.getShapes();
//
// // listen to when drawing mode gets enabled
// map.on('pm:drawstart', function(e) {
//   e.shape; // the name of the shape being drawn (i.e. 'Circle')
//   e.workingLayer; // the leaflet layer displayed while drawing
// });
//
// // disable drawing mode
// map.pm.disableDraw('Poly');
//
// // listen to when drawing mode gets disabled
// map.on('pm:drawend', function(e) {
//   e.shape; // the name of the shape being drawn (i.e. 'Circle')
// });
//
// // listen to when a new layer is created
// map.on('pm:create', function(e) {
//   e.shape; // the name of the shape being drawn (i.e. 'Circle')
//   e.layer; // the leaflet layer created
// });
//
// // listen to vertexes being added to the workingLayer (works only on polylines & polygons)
// map.on('pm:drawstart', function(e) {
//   var layer = e.workingLayer;
//   layer.on('pm:vertexadded', function(e) {
//       // e includes the new vertex, it's marker
//       // the index in the coordinates array
//       // the working layer and shape
//   });
//
//   // check self intersection
//   layer.pm.hasSelfIntersection();
// });
//
// // listen to the center of a circle being added
// map.on('pm:drawstart', function(e) {
//   var circle = e.workingLayer;
//
//   // this fires only for circles
//   circle.on('pm:centerplaced', function(e) {
//       console.log(e);
//   });
// });
//
// // listen to when the center of a circle is moved
// map.on('pm:create', function(e) {
//   var circle = e.layer;
//
//   // this fires only for circles
//   circle.on('pm:centerplaced', function(e) {
//       console.log(e);
//   });
// });


  // import 'leaflet.pm';
  // import 'leaflet.pm/dist/leaflet.pm.css';
  //
  // require('js/leaflet.pm');
  // require('js/leaflet.pm/dist/leaflet.pm.css');

//   new LeafletToolbar.DrawToolbar({
//   position: 'topleft'
// }).addTo(map);
//
//     new LeafletToolbar.EditToolbar.Control({
//         position: 'topleft'
//     }).addTo(map, drawnItems);
//
// map.on('draw:created', function(evt) {
//   var type = evt.layerType,
//     layer = evt.layer;
//
//   drawnItems.addLayer(layer);
// });


  // import LeafletToolbar from 'js/leaflet.toolbar/dist/leaflet.toolbar';
  // import * as LeafletToolbar from 'js/leaflet.toolbar/dist/leaflet.toolbar';
  // const LeafletToolbar = require('js/leaflet.toolbar/dist/leaflet.toolbar.js');

//   new LeafletToolbar.DrawToolbar({
//       position: 'topright'
//   }).addTo(map);
//
//   new LeafletToolbar.EditToolbar.Control({
//     position: 'topright'
// }).addTo(map, drawnItems);
//
// new LeafletToolbar.EditToolbar.Popup({
//     position: 'topright'
// }).addTo(map, drawnItems);




//   new LeafletToolbar.DrawToolbar({
//     position: 'topleft'
//   }).addTo(map);
//
//   new LeafletToolbar.EditToolbar.Control({
// position: 'topleft'
// }).addTo(map, drawnItems);
//
// new LeafletToolbar.EditToolbar.Popup({
// position: 'topleft'
// }).addTo(map, drawnItems);

//   // import 'leaflet.pm';
//   // import 'leaflet.pm/dist/leaflet.pm.css';
//   // require('leaflet.pm');
//   // require('leaflet.pm/dist/leaflet.pm.css');
//
//   L.marker([51.50915, -0.096112], { pmIgnore: true }).addTo(map);
//
//   // define toolbar options
//   var options = {
//       position: 'topleft', // toolbar position, options are 'topleft', 'topright', 'bottomleft', 'bottomright'
//       drawMarker: true, // adds button to draw markers
//       drawPolyline: true, // adds button to draw a polyline
//       drawRectangle: true, // adds button to draw a rectangle
//       drawPolygon: true, // adds button to draw a polygon
//       drawCircle: true, // adds button to draw a cricle
//       cutPolygon: true, // adds button to cut a hole in a polygon
//       editMode: true, // adds button to toggle edit mode for all layers
//       removalMode: true, // adds a button to remove layers
//   };
//
//   // add leaflet.pm controls to the map
//   map.pm.addControls(options);
//
//   // make markers not snappable during marker draw
//   map.pm.enableDraw('Marker', { snappable: false });
//   map.pm.disableDraw('Marker');
//
//   // let polygons finish their shape on double click
//   map.pm.enableDraw('Poly', { finishOn: 'dblclick' });
//   map.pm.disableDraw('Poly');
//
//   // optional options for line style during draw. These are the defaults
//   var options = {
//       // snapping
//       snappable: true,
//       snapDistance: 20,
//
//       // allow snapping to the middle of segments
//       snapMiddle: false,
//
//       // self intersection
//       allowSelfIntersection: true,
//
//       // the lines between coordinates/markers
//       templineStyle: {
//           color: 'red',
//       },
//
//       // the line from the last marker to the mouse cursor
//       hintlineStyle: {
//           color: 'red',
//           dashArray: [5, 5],
//       },
//
//       // show a marker at the cursor
//       cursorMarker: false,
//
//       // finish drawing on double click
//       // DEPRECATED: use finishOn: 'dblclick' instead
//       finishOnDoubleClick: false,
//
//       // specify type of layer event to finish the drawn shape
//       // example events: 'mouseout', 'dblclick', 'contextmenu'
//       // List: http://leafletjs.com/reference-1.2.0.html#interactive-layer-click
//       finishOn: 'contextmenu',
//
//       // custom marker style (only for Marker draw)
//       markerStyle: {
//           opacity: 0.5,
//           draggable: true,
//       },
//   };
//
//   // enable drawing mode for shape - e.g. Poly, Line, etc
//   map.pm.enableDraw('Poly', options);
//   map.pm.enableDraw('Rectangle', options);
//   map.pm.enableDraw('Line', options);
//   map.pm.enableDraw('Marker', options);
//   map.pm.enableDraw('Circle', options);
//
//   // get array of all available shapes
//   map.pm.Draw.getShapes();
//
//   // listen to when drawing mode gets enabled
//   map.on('pm:drawstart', function(e) {
//       e.shape; // the name of the shape being drawn (i.e. 'Circle')
//       e.workingLayer; // the leaflet layer displayed while drawing
//   });
//
//   // disable drawing mode
//   map.pm.disableDraw('Poly');
//
//   // listen to when drawing mode gets disabled
//   map.on('pm:drawend', function(e) {
//       e.shape; // the name of the shape being drawn (i.e. 'Circle')
//   });
//
//   // listen to when a new layer is created
//   map.on('pm:create', function(e) {
//       e.shape; // the name of the shape being drawn (i.e. 'Circle')
//       e.layer; // the leaflet layer created
//   });
//
//   // listen to vertexes being added to the workingLayer (works only on polylines & polygons)
//   map.on('pm:drawstart', function(e) {
//       var layer = e.workingLayer;
//       layer.on('pm:vertexadded', function(e) {
//           // e includes the new vertex, it's marker
//           // the index in the coordinates array
//           // the working layer and shape
//       });
//
//       // check self intersection
//       layer.pm.hasSelfIntersection();
//   });
//
//   // listen to the center of a circle being added
//   map.on('pm:drawstart', function(e) {
//       var circle = e.workingLayer;
//
//       // this fires only for circles
//       circle.on('pm:centerplaced', function(e) {
//           console.log(e);
//       });
//   });
//
//   // listen to when the center of a circle is moved
//   map.on('pm:create', function(e) {
//       var circle = e.layer;
//
//       // this fires only for circles
//       circle.on('pm:centerplaced', function(e) {
//           console.log(e);
//       });
//   });
//
//   // recommended options (used when enabled via toolbar)
// var options = { snappable: false, cursorMarker: false };
//
// // enable cutting
// map.pm.Draw.Cut.enable(options);
//
// // disable cutting
// map.pm.Draw.Cut.disable(options);
//
// // toggle cutting
// map.pm.Draw.Cut.toggle(options);
//
// // listen to when a specific layer gets cut
// layer.on('pm:cut', function(e) {});
//
// // listen to when any layer on the map gets cut
// map.on('pm:cut', function(e) {});
//
// var polygonLayer = L.geoJson(data).addTo(map);
//
// // optional options
// var options = {
//     // makes the layer draggable
//     draggable: true,
//
//     // makes the vertices snappable to other layers
//     // temporarily disable snapping during drag by pressing ALT
//     snappable: true,
//
//     // distance in pixels that needs to be undercut to trigger snapping
//     // default: 30
//     snapDistance: 30,
//
//     // self intersection allowed?
//     allowSelfIntersection: true,
//
//     // disable the removal of markers/vertexes via right click
//     preventMarkerRemoval: false,
//
//     // disable the possibility to edit vertexes
//     preventVertexEdit: false,
// };
//
// // enable edit mode
// polygonLayer.pm.enable(options);
// marker.pm.enable(options);
//
// // disable edit mode
// polygonLayer.pm.disable();
//
// // toggle edit mode
// polygonLayer.pm.toggleEdit(options);
//
// // check if edit mode is enabled
// polygonLayer.pm.enabled(); // returns true/false
//
// // listen to changes
// polygonLayer.on('pm:edit', function(e) {});
// polygonLayer.on('pm:dragstart', function(e) {});
// polygonLayer.on('pm:drag', function(e) {});
// polygonLayer.on('pm:dragend', function(e) {});
//
// // listen to when vertexes are being added or removed from the layer
// polygonLayer.on('pm:vertexadded', function(e) {});
// polygonLayer.on('pm:vertexremoved', function(e) {});
//
// // listen to when a marker of a polygon-vertex is being dragged
// polygonLayer.on('pm:markerdragstart', function(e) {
//     // the property e.ringIndex refers to the coordinate ring inside the polygon the marker belongs to
//     // if it's undefined, there are no rings
//     // e.index is the index of the marker inside the coordinate ring / array it belongs to
// });
// polygonLayer.on('pm:markerdragend', function(e) {});
//
// // listen to when snapping occurs
// // pm:snap and pm:unsnap are, in addition to the layer, also fired on the markers of the polygon
// // if you'd need it for some advanced behaviour
// polygonLayer.on('pm:snap', function(e) {});
// polygonLayer.on('pm:unsnap', function(e) {});
//
// // if allowSelfIntersection is false: listen to when a self-intersection is detected
// // e.intersection includes a geoJSON of the intersection
// polygonLayer.on('pm:intersect', function(e) {});
//
// // toggle global edit mode (edit mode for all layers on the map)
// map.pm.toggleGlobalEditMode(options);
//
// // listen to when global edit mode is toggled
// map.on('pm:globaleditmodetoggled', function(e) {});
//
// // check self intersection
// polygonLayer.pm.hasSelfIntersection(); // true/false
//
// // toggle global removal mode
// map.pm.toggleGlobalRemovalMode();
//
// // listen to removal of layers that are NOT ignored and NOT helpers by leaflet.pm
// map.on('pm:remove', function(e) {});
//
// // optional options for line style during draw. These are the defaults
// var options = {
//     // the lines between coordinates/markers
//     templineStyle: {
//         color: 'red',
//     },
//
//     // the line from the last marker to the mouse cursor
//     hintlineStyle: {
//         color: 'red',
//         dashArray: [5, 5],
//     },
// };
//
// // enable drawing mode for shape - e.g. Poly, Line, Circle, etc
// map.pm.enableDraw('Poly', options);
//
// // optional options for line style during draw. These are the defaults
// var options = {
//     templineStyle: {},
//     hintlineStyle: {},
//     pathOptions: {
//         // add leaflet options for polylines/polygons
//         color: 'orange',
//         fillColor: 'green',
//     },
// };
//
// // enable drawing mode for shape - e.g. Poly or Line
// map.pm.enableDraw('Poly', options);
//
// map.pm.setPathOptions({
//     color: 'orange',
//     fillColor: 'green',
//     fillOpacity: 0.4,
// });
//
}]);
