var React = require('react');
var Router = require('react-router');
var Category = require('./components/category');
var Dashboard = require('./components/dashboard');
var Services = require('./components/services');

var DefaultRoute = Router.DefaultRoute;
var Link = Router.Link;
var Route = Router.Route;
var RouteHandler = Router.RouteHandler;

var App = React.createClass({
	render: function() {
		return (
		<div class="wrapper row-offcanvas row-offcanvas-left">  
			<Category/>			
			<RouteHandler/>
		</div>
		);
	}

});

var routes = (
    <Route name="app" path="/" handler={App}>
    <Route name="services" handler={Services}/>    
    <DefaultRoute handler={Dashboard}/>
  </Route>
);


Router.run(routes, function (Handler) {
  React.render(<Handler/>, document.getElementById('main'));
});