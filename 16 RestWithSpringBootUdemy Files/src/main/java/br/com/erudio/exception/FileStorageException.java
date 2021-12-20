package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/*Na hora que a aplicação inicializar o spring vai ler a propriedade file adicionada 
 *no arquivo de properties e vai setar no atributo uploadDir automaticamente. Caso
 *Ocorra um problema na rede, o que é muito comum, a aplicação nos indicará um erro
 *interno no servidor.*/
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class FileStorageException extends RuntimeException
{	private static final long serialVersionUID = 1L;
	
	public FileStorageException(String exception) {super(exception);}
	public FileStorageException(String exception, Throwable cause) 
	{super(exception, cause);}	
}