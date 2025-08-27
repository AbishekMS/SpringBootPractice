package com.example.PracticeTwo;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), 
				ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public final ResponseEntity<ErrorDetails> handleValidationExceptions(
	        MethodArgumentNotValidException ex, WebRequest request) {
	    
	    String errorMessage = ex.getBindingResult()
	            .getFieldErrors()
	            .stream()
	            .map(err -> err.getField() + " : " + err.getDefaultMessage())
	            .findFirst()
	            .orElse(ex.getMessage());

	    ErrorDetails errorDetails = new ErrorDetails(
	            LocalDateTime.now(),
	            errorMessage,
	            request.getDescription(false)
	    );

	    return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

}
