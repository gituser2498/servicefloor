var React = require('react');

var Dashboard = React.createClass({

	render: function() {
		return (
			<aside className="right-side">              
                <section className="content-header">
                    <h1>
                        
                        <small>Best Deals</small>
                    </h1>
                    <ol className="breadcrumb">
                        <li><a href="#"><i className="fa fa-dashboard"></i> Education</a></li>
                        <li className="active"></li>
                    </ol>
                </section>
               
                <section className="content">
                 <div className="col-xs-12">
                  <div className="col-xs-8 sectionmaindiv">
                    <div className="panel panel-primary">
                      <div className="panel-heading">
                        <h1 className="panel-title">Hot Deals</h1>
                      </div>
                      <div className="panel-body">Panel content…</div>                      
                     </div>
                    </div>
                 
                 <div className="col-xs-4 asideDiv">
                    <div className="panel panel-primary">
                        <div className="panel-body">Panel content…</div>                         
                       </div>
                    </div>   
                </div>
                </section>
                 </aside>
			);
	}

});

module.exports = Dashboard;