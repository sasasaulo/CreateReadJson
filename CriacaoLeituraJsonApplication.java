package com.saulo.exercicioLeituraJson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CriacaoLeituraJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriacaoLeituraJsonApplication.class, args);
		
		Criacao criaArquivo = new Criacao();
		criaArquivo.criarArquivo();
		
		Leitura leArquivo = new Leitura();
		leArquivo.lerArquivo();
	}
}
