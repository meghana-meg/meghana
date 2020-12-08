package com.cg.onlinecorona1.Exception;




import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DepartmentIdException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DepartmentIdException() {
		super();
	}
	public DepartmentIdException(String errMsg) {
		super(errMsg);
	}
}