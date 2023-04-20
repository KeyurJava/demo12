package com.miit.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miit.entity.User;
import com.miit.model.RequestPayload;
import com.miit.model.ResponseTransfer;
import com.miit.service.UserService;

@Controller
public class UserController {

	final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping("/registerUser")
	public String registerUser(HttpServletRequest request) {
		// wwe will create a codee to ger request paramter
		// create an object user
		String uname = request.getParameter("uname");
		User user = new User();
		user.setUserName(uname);
		logger.info("Inside registerUser::::");
		userService.saveUser(user);
		
		return "success";
	}

	/*
	 * @ResponseBody
	 * 
	 * @PostMapping(value = "/content", produces = {
	 * MediaType.APPLICATION_JSON_VALUE }) public ResponseTransfer
	 * postResponseJsonContent(@RequestBody RequestPayload requestPayload) {
	 * ResponseTransfer responseTransfer = new ResponseTransfer();
	 * 
	 * responseTransfer.setText(requestPayload.getFirstName() + "::" +
	 * requestPayload.getLastName() + "::"+ requestPayload.getAddress()); return
	 * responseTransfer; }
	 * 
	 * @ResponseBody
	 * 
	 * @GetMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
	 * public ResponseTransfer getResponseJsonContent(HttpServletRequest request) {
	 * ResponseTransfer responseTransfer = new ResponseTransfer();
	 * responseTransfer.setText("Test"); return responseTransfer; }
	 */

}
