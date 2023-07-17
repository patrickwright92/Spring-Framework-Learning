package com.pwright.springboot.myfirstwebapp.hello.SayHelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	// "say-hello" => "Hello! What are you learning today?"

	// say-hello
	// http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}

	// not a scalable approach at all
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("my first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	// JSP - Java Server Pages
	// sayHello.jsp
	// "say-hello-jsp" => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}

//<html> 
//	<head>
//		<title> My first HTML Page </title>
//	</head>
//	<body>
//		My first html page with body
//	</body>
//</html>