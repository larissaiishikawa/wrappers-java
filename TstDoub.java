// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe DOUBLE - Metodos sum() e toHexString()
// ii) metodoDoub soma dois valores double e retorna uma representação em string hexadecimal do argumento double.
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstDoub {

	public static void metodoDoub(double d1, double d2) {
	
		double sum = Double.sum(d1, d2);
		String hex = Double.toHexString(d1);

		System.out.println("A soma de " + d1 + " e " + d2 + " e igual a " + sum);
		System.out.println("A representacao hexadecimal de " + d1 + " e igual a " + hex);

	}

}