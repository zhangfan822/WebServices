package com.mkyong.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

	@Override
	public String getABC(String name, int i) {
		// TODO Auto-generated method stub
		return "Name:"+name+" Age:"+i;
	}

	@Override
	public Object getTest(String name, int i) {
		// TODO Auto-generated method stub
		return "Ãû×Ö:"+name+"; ÄêÁä:"+i;
	}
 
}