// LARISSA DE FATIMA ISHIKAWA CUNHA - 2564203
// i) Classe BYTE - Metodos decode() e hashCode()
// ii) metodoByte descodifica uma String em byte e retorna um Hash Code para um byte.
// iii) Referencia: https://docs.oracle.com/javase/8/docs/api/

public class TstByte {

	public static void metodoByte(String s, byte b) {

	byte qtd = Byte.decode(s);
        int valor = Byte.hashCode(b);

        System.out.println("A String \"" + s + "\" decodificada é igual a " + qtd + " bytes");
        System.out.println("O Hash Code de " + b + " é igual a " + valor);

	}

}