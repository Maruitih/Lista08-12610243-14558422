package Controller;

public class Fatorial {
	public static long resultado(String Texto_numero) throws InvalidNumberException{
		double fatorial = Double.parseDouble(Texto_numero);
		if(fatorial < 0) {
			throw new InvalidNumberException("O número não pode ser negativo.");
		}
		long resultado = 1;
		for(int i = 1; i != fatorial + 1; i++) {
			resultado = resultado *i;
		}
		return resultado;
	}
}