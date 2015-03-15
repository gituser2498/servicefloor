var React = require('react');
var Router = require('react-router');
var Link = Router.Link;

var Category = React.createClass({

	render: function() {
		return (
			<div>
			 <aside className="left-side sidebar-offcanvas">              
                <section className="sidebar">                    
                    <ul className="sidebar-menu ">
                        <li className="treeview">
                            <a href="#">
                                <i className="fa fa-edit"></i> <span>Education</span>
                                <i className="fa fa-angle-right pull-right"></i>
                            </a>
                            <ul className="treeview-menu">
                                <li className="treeview">
                                  <a href=""><i className="fa fa-angle-double-right"></i> Java className</a>
                                    <ul class="treeview-menu" >
                                      <li>
                                        <Link to="services" style={{"margin-left" : "10px"}}><i class="fa fa-angle-double-right"></i>Frameworks</Link>
                                      </li>
                                    </ul>
                                   
                                </li>
                                <li><a href="#"><i className="fa fa-angle-double-right"></i> Testing</a></li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">
                                <i className="fa fa-group"></i> <span>Spa</span>
                            </a>
                        </li>
                        
                    </ul>
                </section>              
            </aside>
			</div>
		);
	}

});

module.exports = Category;