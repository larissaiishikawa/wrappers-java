// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe SHORT - Metodos toUnsignedInt() e reverseBytes()
// ii) metodoShort converte o argumento em um int em convencao nao assinada e em inverte a ordem dos bytes do short em complemento de dois.
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstShort {

	public static void metodoShort(short s) {

		int naoAssinada = Short.toUnsignedInt(s);
		short inverso = Short.reverseBytes(s);

		System.out.println("Convencao nao assinada de " + s + ": " + naoAssinada);
		System.out.println("Conversao de " + s + " em bytes invertidos: " + inverso);

	}
}