package com.miit.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

import com.miit.service.HelloWorldService;

@Controller
public class HelloWorldController implements ServletContextAware {
	private ServletContext context;
	@Autowired
	private HelloWorldService helloWorldService;

	@GetMapping("/helloworld.html")
	public ModelAndView helloWord(HttpServletRequest request, HttpServletResponse response) {
		// String message = "Hello World, Spring 3.0!";
		// context.getAttribute("connection");
		String message = helloWorldService.doSomneLogic();
		System.out.println("Hello");
		return new ModelAndView("helloworld", "message", message);

	}
	// WEB-INF/views/helloworld.jsp

	@RequestMapping("/helloworldTest")
	public ModelAndView helloWorld(HttpServletRequest request) {
		// String message = "Hello World, Spring 3.0!";
		// context.getAttribute("connection");
		String message = helloWorldService.doSomneLogic();
		return new ModelAndView("helloworld", "message", message);
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.context = servletContext;

	}

}
