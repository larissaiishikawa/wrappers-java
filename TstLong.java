// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe LONG - Metodos toBinaryString() e reverse()
// ii) metodoLong retorna o valor long em binario e retorna o valor com bits invertidos de um número long em binario.".
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstLong {

	public static void metodoLong(long l) {

		String binario = Long.toBinaryString(l);
		long inverso = Long.reverse(l);

		System.out.println("Valor binario de " + l + ": " + binario);
		System.out.println("Valor com bits invertidos de " + l + " em binario: " + inverso);

	}
}