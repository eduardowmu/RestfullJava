package br.com.erudio.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
/*Definindo a classe que será responsável pelo upload/export de arquivos.*/
@ConfigurationProperties(prefix= "file")
public class FileStorageConfig 
{	private String uploadDir;

	public String getUploadDir() {return uploadDir;}

	public void setUploadDir(String uploadDir) 
	{this.uploadDir = uploadDir;}
}