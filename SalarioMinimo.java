import java.util.Scanner;

public class SalarioMinimo {
		public static void main (String[] args) {
			Scanner leitor = new Scanner(System.in);
			double salario = 0;
			double qtdSalariosMinimos = 0;
			
			System.out.print("Digite o seu salário: ");
			salario = leitor.nextDouble();
			leitor.close();
			qtdSalariosMinimos = (salario / 1518);
			System.out.println("A quantidade de salários mínimos é; " + qtdSalariosMinimos);
			
			
					
		}
}
