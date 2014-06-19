This an example making use of <strong>MultiActionController</strong> and <strong>ParameterizableViewController</strong>, two controller implementations provided by Spring. 

<strong>MultiActionController</strong> is an implementation of Spring, that allows multiple request types to be handled by the same class. Subclasses of this class can handle several different types of request with methods of the form :
  
	<code>public (ModelAndView | Map | String | void) actionName(HttpServletRequest request, HttpServletResponse response);</code>

A <strong>Map</strong> return value indicates a model that is supposed to be passed to a default view, whereas a String return value indicates the name of a view to be rendered without a specific model.

Which making use of <strong>MultiActionController</strong> as controller, there will be 4 way to configure it. Three of them are XML configuration, and the other is annotation configuration.
XML configuration includes <strong>InternalPathMethodNameResolver</strong>, <strong>ParameterMethodNameResolver</strong>, <strong>PropertiesMethodNameResolver</strong>.
annotation configuration, see the concrete file(HelloWorldController.java,web.xml) it will be better to learn it.

<strong>ParameterizableViewController</strong> is a Controller implementation that always returns a named view. This controller offers an alternative to sending a request straight to a view such as a JSP. The advantage here is that the client is not exposed to the concrete view technology but rather just to the controller URL.