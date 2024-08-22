package itst.ws;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.NoSuchElementException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	
	@ExceptionHandler(NoSuchElementException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleException(NoSuchElementException e) {
		return "Registro no encontrado";
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	public String handleExceptionMethon(HttpRequestMethodNotSupportedException e) {
		return "Acción no permitida";
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	public String handleExceptionAn(MethodArgumentTypeMismatchException e) {
		return "No se puede actualizar ya que no existe el registro";
	}
	
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleExceptionSQL(SQLIntegrityConstraintViolationException e) {
		return "Error del servidor";
	}
	
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleExceptionErrorDato(EmptyResultDataAccessException e) {
		return "No se puede eliminar el dato solicitado ya que no existe";
	}
	
	//HttpMessageNotReadableException:
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleExceptionPostMal(HttpMessageNotReadableException e) {
		return "No se puede registrar envio incorrecto de datos, verifique JSON";
	}
	
	
	//org.springframework.dao.DataIntegrityViolationException
	@ExceptionHandler(DataIntegrityViolationException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleExceptionPostMal(DataIntegrityViolationException e) {
		return "El registro de algun dato es incorrecto o duplicado";
	}
	
	
	
	
	
	
	
	
	
	
	
}
