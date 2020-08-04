/**
 * 
 */
package com.cesarmata.ws15restfulwebservicesbean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarmata.ws15restfulwebservicesbean.bean.HelloWorldBean;

/**
 * @author Cesar Mata
 *
 */
@RestController
public class HelloWorldController {
	
	// GET
	// URI: /hello-world
	// Method - "Hello world".
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorld(){
		return new HelloWorldBean("Hello World"); 
	}
}