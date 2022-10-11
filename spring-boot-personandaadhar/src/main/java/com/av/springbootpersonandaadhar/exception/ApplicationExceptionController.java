package com.av.springbootpersonandaadhar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.av.springbootpersonandaadhar.dto.ResponseStructure;

@ControllerAdvice
public class ApplicationExceptionController {
	
	@ExceptionHandler(value = NoIdFoundExecption.class)
	public ResponseEntity<ResponseStructure<String>> noIdFoundExecption(NoIdFoundExecption ie){
		ResponseStructure<String> responseStracture = new ResponseStructure<String>();
		responseStracture.setStatuscode(HttpStatus.NOT_FOUND.value());
		responseStracture.setMsg("No data found");
		responseStracture.setData(ie.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(responseStracture, HttpStatus.NOT_FOUND);
	}
}
