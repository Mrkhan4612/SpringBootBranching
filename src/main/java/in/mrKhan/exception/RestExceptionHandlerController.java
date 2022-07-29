package in.mrKhan.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandlerController {

	@ExceptionHandler(value = NoProductFoundException.class)
	public ResponseEntity<APIError> handleNoProductFoundException()
	{
		APIError error = new APIError(400, "no product found..", new Date());
		return new ResponseEntity<APIError>(error,HttpStatus.BAD_REQUEST);
	}
}
