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

The files that we must configure in the application are the <strong>web.xml</strong> file and the <strong>mvc-dispatcher-servlet.xml</strong> file.

The <strong>web.xml</strong> file is the file that defines everything about the application that a server needs to know. It is placed in the <strong>/WEB-INF/</strong> directory of the application. The <strong>&lt;servlet&gt;</strong> element declares the <strong>DispatcherServlet</strong>. When the <strong>DispatcherServlet</strong> is initialized, the framework will try to load the application context from a file named <strong>[servlet-name]-servlet.xml</strong> located in <strong>/WEB-INF/</strong> directory. So, we have created a file named <strong>mvc-dispatcher-servlet.xml</strong> which is placed in <strong>WebContent/WEB-INF directory</strong>. The <strong>&lt;servlet-mapping&gt;</strong> element of <strong>web.xml</strong> file specifies what URLs will be handled by the <strong>DispatcherServlet</strong>.

In <strong>[servlet-name]-servlet.xml</strong>. The <strong>org.springframework.web.servlet.view.InternalResourceViewResolver</strong> bean is used as internal resource views resolver, meaning that it will find the jsp and html files in the <strong>WebContent/WEB-INF/</strong> folder. We can also set properties such as <strong>prefix</strong> or <strong>suffix</strong> to the view name to generate the final view page URL. This is the file where all beans created, such as Controllers, will be placed and defined, as shown below: