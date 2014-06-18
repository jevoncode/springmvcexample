Spring MVC Handler Interceptors
===============================
A custom interceptor must implement this interface <strong>org.springframework.web.servlet.HandlerInterceptor</strong>. The <strong>HandlerInterceptor</strong> defines three methods that can be used for preprocessing and postprocessing requests:
<ul>
<li><strong>preHandle(..)</strong> is called before the actual handler is executed. It returns a boolean value. When it returns true, the handler execution chain continues, whereas when it returns false, the DispatcherServlet assumes the interceptor itself has taken care of requests (and, for example, rendered an appropriate view) and does not continue executing the other interceptors and the actual handler in the execution chain.</li>
<li><strong>postHandle()</strong> is called after the handler is executed.</li>
<li><strong>afterCompletion()</strong> is called after the complete request has finished.</li>
</ul>