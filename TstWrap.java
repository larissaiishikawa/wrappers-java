// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// 3ª Lista de Exercícios: Pesquisa sobre Classes Wrappers

public class TstWrap {

	static Leitura l = new Leitura();

	public static void main(String arg[]) {
	
		int opcao;
	
		do {

			System.out.println("\nMENU DE WRAPPERS\n");
			System.out.println("1) INTEGER");
			System.out.println("2) BOOLEAN");
			System.out.println("3) CHARACTER");
			System.out.println("4) DOUBLE");
			System.out.println("5) BYTE");
			System.out.println("6) SHORT");
			System.out.println("7) FLOAT");
			System.out.println("8) LONG");
			System.out.println("0) SAIR");

			opcao = Integer.parseInt(l.entDados("\nESCOLHA UMA OPCAO: "));

			switch (opcao) {

				case 1:
					System.out.println("\nA opcão escolhida foi 1) INTEGER\n");
					TstInt.metodoInt("20", 15);
					break;

				case 2:
					System.out.println("\nA opcão escolhida foi 2) BOOLEAN\n");
					TstBool.metodoBool(false, "palavra");
					break;

				case 3:
					System.out.println("\nA opcão escolhida foi 3) CHARACTER\n");
					TstChar.metodoChar('a', 'b');
					break;
				case 4:
					System.out.println("\nA opcão escolhida foi 4) DOUBLE\n");
					TstDoub.metodoDoub(11.1, 99.9);
					break;

				case 5:
					System.out.println("\nA opcão escolhida foi 5) BYTE\n");
					TstByte.metodoByte("127", (byte) 18);					
					break;
				case 6:
					System.out.println("\nA opcão escolhida foi 6) SHORT\n");
					TstShort.metodoShort((short) 249);
					break;

				case 7:
					System.out.println("\nA opcão escolhida foi 7) FLOAT\n");
					TstFloat.metodoFloat(17.03F, 11.12F);
					break;
				case 8:
					System.out.println("\nA opcão escolhida foi 8) LONG\n");
					TstLong.metodoLong(17032005);
					break;

				case 0:
					System.out.println("\nA opcão escolhida foi 0) SAIR\n");
					System.out.println("---------------------------------------\n");
					System.out.println("Obrigada pela atencao! \nEspero que tenha gostado :)\n");
					System.out.println("\nFeito com <3 por LARISSA ISHIKAWA\n");
					System.out.println("---------------------------------------\n");
					System.out.println("\nEncerrando aplicacao...!");
					break;

				default:
					System.out.println("\nOPCAO INVALIDA! TENTE NOVAMENTE.");
					break;
			}
			

		} while (opcao != 0);
	
	}
	
}