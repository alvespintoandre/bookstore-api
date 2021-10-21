
public class Carro {

	public static void main(String[] args) {

		String cor = "preto";
		int ano = 1990;
		boolean parametroAcelerar = false;
		
		String retornoMetodo = acelerar(cor);
		
		System.out.println(retornoMetodo);

	}
	
	public static String acelerar(String cor) {
		
		if(cor.equals("preto")) {
			return "está acelerando";
		} else {
			return "não está acelerando";
		}
		
	}

}
