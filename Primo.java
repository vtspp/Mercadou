import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("D�gite um n�mero para saber se � primo: ");

		int dividendo = sc.nextInt();
		int divisor;
		int controle = 0;

		for (divisor = 1; divisor <= dividendo; divisor++) {

			if (dividendo % divisor == 0) {

				controle++;
			}
		}

		if (controle == 2) {
			System.out.println("O n�mero " + dividendo + " � primo.");
		} else {
			System.out.print("O n�mero " + dividendo + " n�o � primo.");
		}

	}
}
