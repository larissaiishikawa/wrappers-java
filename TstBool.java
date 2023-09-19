// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe BOOLEAN - Metodos valueOf() e getBoolean()
// ii) metodoBool retorna uma instância Booleana representando o valor booleano especificado e retorna verdadeiro se a propriedade do sistema existe e tem o valor 'true'.
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstBool {

	public static void metodoBool(boolean b, String s) {
	
		boolean valor = Boolean.valueOf(b);
		boolean definido = Boolean.getBoolean(s);
	
		
		System.out.println("\"" + b + "\" tem o valor " + valor);
		if (definido == true) {
            		System.out.println("A propriedade \"" + s + "\" está definida como verdadeira");
        	} else {
            		System.out.println("A propriedade \"" + s + "\" não está definida ou não é verdadeira");
        	}
	

	}

}