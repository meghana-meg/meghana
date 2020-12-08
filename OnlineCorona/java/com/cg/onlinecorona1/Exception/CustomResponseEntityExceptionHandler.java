package com.cg.onlinecorona1.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



/**
 * @author meghana
 * This class handles the exception messages with respect to request mapping
 *
 */
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler
	public final ResponseEntity<Object> handleProjectIdException(DepartmentIdException ex,WebRequest request){
		DepartmentIdExceptionResponse exceptionResponse=new DepartmentIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<>(exceptionResponse,HttpStatus.BAD_REQUEST);
		
	}
}

