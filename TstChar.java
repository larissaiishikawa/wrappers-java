// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe CHARACTER- Metodos compare() e getName()
// ii) metodoChar compara dois valores em char numericamente (posicao) e retorna o nome do Unicode do char.
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstChar {
	
	public static void metodoChar(char x, char y) {

		int pos = Character.compare(x, y);
		String uni = Character.getName(x);

		if (pos < 0) {
            		System.out.println("A letra '" + x + "' vem antes de '" + y + "' na ordem alfabética");
        	} else if (pos > 0) {
            		System.out.println("A letra '" + x + "' vem depois de '" + y + "' na ordem alfabética.");
        	} else {
            		System.out.println("As letras '" + x + "' e '" + y + "' são iguais na ordem alfabética.");
        	}
		System.out.println("Unicode de '" + x + "': " + uni);

	}
	
}