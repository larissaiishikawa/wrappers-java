// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe FLOAT - Metodos max() e min()
// ii) metodoFloat retorna o maior e menor valor entre duas variaveis em float.
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstFloat {

	public static void metodoFloat(float f1, float f2) {
	
		float maior = Float.max(f1, f2);
		float menor = Float.min(f1, f2);

		System.out.println("Maior valor entre " + f1 + " e " + f2 + " - " + maior);
		System.out.println("Menor valor entre " + f1 + " e " + f2 + " - " + menor);

	}

}
