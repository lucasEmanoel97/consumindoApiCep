package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import entities.Endereco;
import utils.Util;

public class ServicoDeCep {

	static String webService = "https://viacep.com.br/ws/";
	static int successCode = 200;
	
	public static Endereco buscaEndereco(String cep) throws Exception{
		String urlParaChamada = webService + cep + "/json";
		Gson gson = new Gson();
		
		try {
			URL url = new URL(urlParaChamada);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			
			if(conexao.getResponseCode() != successCode)
				throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
			
			BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
			String jsonEmString = Util.converteJsonEmString(resposta);
			
			Endereco endereco = gson.fromJson(jsonEmString, Endereco.class); //converte String JSON para objeto java
			
			return endereco;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
