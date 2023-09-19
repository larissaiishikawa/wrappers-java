// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe INTEGER - Metodos ToString() e parseInt()
// ii) metodoInt converte uma variavel do tipo int para uma String e o valor de uma String para o tipo primitivo int.
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstInt {
	
	public static void metodoInt(String valS, int valI) {

		int i = Integer.parseInt(valS);
		String s = Integer.toString(valI);
		
		System.out.println("\"" + valS + "\" (string) convertido para " + i + " (int)");
		System.out.println(valI + " (int) convertido para \"" + s + "\" (string)");

	}
	
}