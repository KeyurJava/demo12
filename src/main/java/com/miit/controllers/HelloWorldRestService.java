package com.miit.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miit.model.RequestPayload;
import com.miit.model.ResponseTransfer;

@RestController
public class HelloWorldRestService {

	// @RestController = @Controller + @Responsebody

	@PostMapping(value = "/content", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseTransfer postResponseJsonContent(@RequestBody RequestPayload requestPayload) {
		ResponseTransfer responseTransfer = new ResponseTransfer();

		responseTransfer.setText(requestPayload.getFirstName() + "::" + requestPayload.getLastName() + "::"
				+ requestPayload.getAddress());
		return responseTransfer;
	}

	@GetMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseTransfer getResponseJsonContent(HttpServletRequest request) {
		ResponseTransfer responseTransfer = new ResponseTransfer();
		responseTransfer.setText("Test");
		return responseTransfer;
	}
}
