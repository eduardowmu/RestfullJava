package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/*Esta classe é para quando queremos fazer um download de um arquivos
 *que não existe ou não existe mais.*/
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileNotFoundException extends RuntimeException
{	private static final long serialVersionUID = 1L;
	
	public MyFileNotFoundException(String exception) {super(exception);}
	
	public MyFileNotFoundException(String exception, Throwable cause) 
	{super(exception, cause);}	
}