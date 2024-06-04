# springboot-ondemand-beanInjection
This is springboot demo to demonstrate runtime bean injection based on some condition


here We have TestService interface with its two implementation classes 
* TestServiceA
* TestServiceB 

and we'll  be getting some condition in request based on that we need to inject that dependency at runtime .

 
@Primary : to avoid initialization error 

APPLICATION FAILED TO START
Description:

Parameter 0 of method setTestService in com.coditas.socket.socket_client.Controller required a single bean, but 2 were found:
	- testServiceA: defined in file [C:\coditas-repo\socket.io\socket-client\target\classes\com\coditas\socket\socket_client\TestServiceA.class]
	- testServiceB: defined in file [C:\coditas-repo\socket.io\socket-client\target\classes\com\coditas\socket\socket_client\TestServiceB.class]
 
@Bean : for creating spring bean of our classes

Factory Pattern for making decision for bean based on request .
