// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// LEITURA - ENTRADA DE DADOS

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura{

	public String entDados(String rotulo){

		System.out.println(rotulo);
		String resp = "";

	InputStreamReader teclado = new InputStreamReader(System.in);
	BufferedReader buff = new BufferedReader(teclado);

	try{
		resp = buff.readLine();
	}
	catch(IOException ioe){
		System.out.println("ERRO");
	}

	return resp;

	}

}