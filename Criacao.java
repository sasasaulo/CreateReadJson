package com.saulo.exercicioLeituraJson;

import java.io.PrintWriter;

import org.json.CDL;
import org.json.JSONArray;
import org.json.simple.JSONObject;

public class Criacao {
	
public void criarArquivo() {
		
		String modelos = "type, brand, model, value \n" +
				"Soloist, Tagima, K1, 5410 \n" +
				"Soloist, Ibanez, jem, 5000 \n" +
				"Soloist, LTD, m200fm, 3000 \n" +
				"Strato, Fender, squier, 300 \n" +
				"Les Paul, Gibson, Studio, 7412";
		
		JSONArray jsonArray = CDL.toJSONArray(modelos);
		
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("estado", "SP");
		jsonObj.put("telefone", "999999999");
		jsonObj.put("gerente", "José da Silva");
		jsonObj.put("guitarras", jsonArray);
		
		
		try {
			System.out.println("Criando o arquivo");
			PrintWriter salvar = new PrintWriter("./src/main/java/arquivoJson.json");
			salvar.write(jsonObj.toString());
			salvar.flush();
			salvar.close();
			System.out.println("Arquivo criado\n");
		}
		catch (Exception e) {
			System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
		}
	}

}
