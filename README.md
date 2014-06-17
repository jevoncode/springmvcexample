springmvcexample
================ 

This is an example of the Spring MVC framework. <br/>
<br/>
Spring MCV basically consists of:<br/>
<br/>
The <strong>Model</strong>, that encapsulates the application data<br/>
The <strong>View</strong>, which is responsible for rendering the model data and in general it generates HTML output that the client's browser can interpret.<br/>
The <strong>Controller</strong>, which processes user requests and builds appropriate model and passes it to the view for rendering.<br/>
The framework is designed around a <strong>DispatcherServlet</strong> that handles all the HTTP requests and responses. Basically, the sequence of events corresponding to an incoming HTTP request to <strong>DispatcherServlet</strong> is performed by the following steps:<br/>
 
<ul>
<li>The <strong>DispatcherServlet</strong> receives a request.</li>
<li>The <strong>DispatcherServlet</strong> uses the <strong>HandlerMapping</strong> so as to call the appropriate <strong>Controller</strong>.</li>
<li>The <strong>Controller</strong> takes the request and calls the appropriate service methods based on used GET or POST method. The service method will set model data based on defined business logic and returns view name to the <strong>DispatcherServlet</strong>.</li>
<li>The <strong>DispatcherServlet</strong> will take help from <strong>ViewResolver</strong> to pickup the defined view for the request.</li>
<li>The <strong>DispatcherServlet</strong> passes the model data to the <strong>view</strong> which is finally rendered on the browser.</li>
</ul>