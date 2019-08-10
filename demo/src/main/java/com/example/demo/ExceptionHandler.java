package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler{
	
	private ResponseEntity<String> error(HttpStatus status, Exception e) {
        //log.error("Exception : ", e);
        return ResponseEntity.status(status).body(e.getMessage()+"fuckrimmy");
    }
	@org.springframework.web.bind.annotation.ExceptionHandler({RuntimeException.class})
    public ResponseEntity<String> handleRunTimeException(RuntimeException e) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, e);
    }
}
