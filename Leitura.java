package com.saulo.exercicioLeituraJson;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Leitura {
	
	public void lerArquivo() {
		
		try {
			System.out.println("Lendo o arquivo:");
			Object obj = new JSONParser().parse(new FileReader("./src/main/java/arquivoJson.json")); 
			JSONObject jsonObj = (JSONObject) obj;
			
			System.out.println("Estado da loja: " + jsonObj.get("estado"));
			System.out.println("Telefone da loja: " + jsonObj.get("telefone"));
			System.out.println("Gerente da loja: " + jsonObj.get("gerente"));
			
			JSONArray jsonArray = (JSONArray) jsonObj.get("guitarras");
			Iterator arrayGuitarras = jsonArray.iterator();
			Iterator<Map.Entry> modelos;
			
			System.out.println("Guitarras a venda:");
			while(arrayGuitarras.hasNext()) {
				modelos = ((Map) arrayGuitarras.next()).entrySet().iterator();
				
				while (modelos.hasNext()) {
					Map.Entry chaveValor = modelos.next();
					System.out.println(chaveValor.getKey() + " : " + chaveValor.getValue());
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			System.out.println("Erro ao ler o arquivo: " + e);
		}
	}
}
