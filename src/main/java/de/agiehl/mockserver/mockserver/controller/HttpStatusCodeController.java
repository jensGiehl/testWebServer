package de.agiehl.mockserver.mockserver.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/httpStatus")
public class HttpStatusCodeController {

	@RequestMapping(value = "/{statusCode}", produces = APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> returnAnyStatusCode(@PathVariable int statusCode) {
		String resultObject = null;
		if (statusCode == HttpStatus.OK.value()) {
			resultObject = "{\"msg\": \"Imagine some results\"}";
		}
		return new ResponseEntity<String>(resultObject, HttpStatus.valueOf(statusCode));
	}

}
