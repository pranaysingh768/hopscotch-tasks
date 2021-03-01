package in.hopscotch.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.hopscotch.entity.ErrorResponse;

@ControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleCustomException(NotFoundException cnf) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		
		errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		errorResponse.setMessage(cnf.getMessage());
		
		return new ResponseEntity<ErrorResponse>  (errorResponse,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleCustomException(Exception ex) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		
		errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		errorResponse.setMessage(ex.getMessage());
		
		
		return new ResponseEntity<ErrorResponse>  (errorResponse,HttpStatus.BAD_REQUEST);
		
	}
}
