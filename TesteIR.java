package sintaxe_variaveis_e_fluxo;

public class TesteIR {
	public static void main(String[] args) {
		double salario = 1900.02;

		if (salario >= 1900.01 && salario <= 2800.01) {
			System.out.println("O IR é de 7.5% e pode deduzir o valor de até R$142,00");
		} else if (salario >= 2800.01 && salario <= 3751.01) {
			System.out.println("Seu IR é de 15%, portanto pode deduzir o valor de até R$636,00");
		} else if (salario >= 3751.02 && salario <= 4664.04) {
			System.out.println("Seu IR é de 22.5% e e pode deduzir então o valor" + " de até R$636,00 ");
		}
	}
}
