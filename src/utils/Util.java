package utils;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

	public static String converteJsonEmString(BufferedReader br) throws IOException {
		String resposta, jsonEmString = "";
		while((resposta = br.readLine()) != null) {
			jsonEmString += resposta;
		}
		return jsonEmString;
	}
}
